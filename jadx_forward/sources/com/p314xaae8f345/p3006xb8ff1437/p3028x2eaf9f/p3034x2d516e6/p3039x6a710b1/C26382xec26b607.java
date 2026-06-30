package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils */
/* loaded from: classes13.dex */
public class C26382xec26b607 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f53055x59634b6e = "TPDLProxyUtils";

    /* renamed from: byteArrayToString */
    public static java.lang.String m102494xdb3a7bbd(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "byteArrayToString failed, error:" + th6.toString());
            return "";
        }
    }

    /* renamed from: losePackageCheck */
    public static java.lang.String m102495x485aa017(int i17) {
        java.lang.String str;
        java.lang.String str2 = "";
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("ping -c " + i17 + " www.qq.com").getInputStream()));
            str = "";
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.contains(" packet loss")) {
                        str2 = readLine.substring(10 + readLine.indexOf("received, "), readLine.indexOf("%") + 1);
                    }
                    if (readLine.contains("avg")) {
                        int indexOf = readLine.indexOf("/", 20);
                        str = readLine.substring(indexOf + 1, readLine.indexOf(".", indexOf));
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Throwable unused2) {
            str = "";
        }
        return str2 + ";" + str;
    }

    /* renamed from: objectToInt */
    public static int m102496xb341d775(java.lang.Object obj, int i17) {
        if (obj == null) {
            return i17;
        }
        try {
            return ((java.lang.Integer) obj).intValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "object to int failed, error:" + th6.toString());
            return i17;
        }
    }

    /* renamed from: objectToLong */
    public static long m102497xb4fa77b6(java.lang.Object obj, long j17) {
        if (obj == null) {
            return j17;
        }
        try {
            return ((java.lang.Long) obj).longValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "object to long failed, error:" + th6.toString());
            return j17;
        }
    }

    /* renamed from: serialize */
    public static java.lang.String m102498xddd166e0(java.lang.Object obj) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ObjectOutputStream objectOutputStream = null;
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(obj);
                    java.lang.String byteArrayOutputStream2 = byteArrayOutputStream.toString(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
                    try {
                        objectOutputStream2.close();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "obj serialize to string  objectOutputStream close, error:" + th6.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "obj serialize to string byteArrayOutputStream close, error:" + th7.toString());
                    }
                    return byteArrayOutputStream2;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    objectOutputStream = objectOutputStream2;
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "serialize obj, error:" + th.toString());
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (java.lang.Throwable th9) {
                                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "obj serialize to string  objectOutputStream close, error:" + th9.toString());
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            return "";
                        } catch (java.lang.Throwable th10) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "obj serialize to string byteArrayOutputStream close, error:" + th10.toString());
                            return "";
                        }
                    } finally {
                    }
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
            }
        } catch (java.lang.Throwable th12) {
            th = th12;
            byteArrayOutputStream = null;
        }
    }

    /* renamed from: serializeToObject */
    public static java.lang.Object m102499xf08809a(java.lang.String str) {
        java.io.ObjectInputStream objectInputStream;
        java.io.ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new java.io.ByteArrayInputStream(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            try {
                objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                try {
                    java.lang.Object readObject = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "serialize to obj objectInputStream close, error:" + th6.toString());
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "serialize to obj byteArrayInputStream close, error:" + th7.toString());
                    }
                    return readObject;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "serialize to obj , error:" + th.toString());
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.lang.Throwable th9) {
                                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "serialize to obj objectInputStream close, error:" + th9.toString());
                            }
                        }
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (java.lang.Throwable th10) {
                                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53055x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "serialize to obj byteArrayInputStream close, error:" + th10.toString());
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
                objectInputStream = null;
            }
        } catch (java.lang.Throwable th12) {
            th = th12;
            objectInputStream = null;
            byteArrayInputStream = null;
        }
    }
}
