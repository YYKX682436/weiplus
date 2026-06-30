package v46;

/* loaded from: classes13.dex */
public abstract class e implements java.io.Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final v46.e f514791o = new v46.b();

    /* renamed from: p, reason: collision with root package name */
    public static final v46.e f514792p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.ThreadLocal f514793q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f514794d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f514795e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f514796f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f514797g = true;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f514798h = "[";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f514799i = "]";

    /* renamed from: m, reason: collision with root package name */
    public boolean f514800m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f514801n = ",";

    static {
        new v46.c();
        f514792p = new v46.d();
        f514793q = new java.lang.ThreadLocal();
    }

    public static void d(java.lang.Object obj) {
        if (obj != null) {
            java.lang.ThreadLocal threadLocal = f514793q;
            java.util.Map map = (java.util.Map) threadLocal.get();
            if (map == null) {
                map = new java.util.WeakHashMap();
                threadLocal.set(map);
            }
            map.put(obj, null);
        }
    }

    public static void e(java.lang.Object obj) {
        if (obj != null) {
            java.lang.ThreadLocal threadLocal = f514793q;
            java.util.Map map = (java.util.Map) threadLocal.get();
            if (map != null) {
                map.remove(obj);
                if (map.isEmpty()) {
                    threadLocal.set(null);
                }
            }
        }
    }

    public void a(java.lang.StringBuffer stringBuffer, java.lang.String str, java.lang.Object obj, boolean z17) {
        java.util.Map map = (java.util.Map) f514793q.get();
        int i17 = 0;
        if ((map != null && map.containsKey(obj)) && !(obj instanceof java.lang.Number) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Character)) {
            if (obj == null) {
                throw new java.lang.NullPointerException("Cannot get the toString of a null identity");
            }
            stringBuffer.append(obj.getClass().getName());
            stringBuffer.append('@');
            stringBuffer.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
            return;
        }
        d(obj);
        try {
            if (obj instanceof java.util.Collection) {
                if (z17) {
                    stringBuffer.append((java.util.Collection) obj);
                } else {
                    b(stringBuffer, str, ((java.util.Collection) obj).size());
                }
            } else if (obj instanceof java.util.Map) {
                if (z17) {
                    stringBuffer.append((java.util.Map) obj);
                } else {
                    b(stringBuffer, str, ((java.util.Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z17) {
                    long[] jArr = (long[]) obj;
                    stringBuffer.append("{");
                    while (i17 < jArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(jArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((long[]) obj).length);
                }
            } else if (obj instanceof int[]) {
                if (z17) {
                    int[] iArr = (int[]) obj;
                    stringBuffer.append("{");
                    while (i17 < iArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(iArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((int[]) obj).length);
                }
            } else if (obj instanceof short[]) {
                if (z17) {
                    short[] sArr = (short[]) obj;
                    stringBuffer.append("{");
                    while (i17 < sArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) sArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((short[]) obj).length);
                }
            } else if (obj instanceof byte[]) {
                if (z17) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer.append("{");
                    while (i17 < bArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) bArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((byte[]) obj).length);
                }
            } else if (obj instanceof char[]) {
                if (z17) {
                    char[] cArr = (char[]) obj;
                    stringBuffer.append("{");
                    while (i17 < cArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(cArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((char[]) obj).length);
                }
            } else if (obj instanceof double[]) {
                if (z17) {
                    double[] dArr = (double[]) obj;
                    stringBuffer.append("{");
                    while (i17 < dArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(dArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((double[]) obj).length);
                }
            } else if (obj instanceof float[]) {
                if (z17) {
                    float[] fArr = (float[]) obj;
                    stringBuffer.append("{");
                    while (i17 < fArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(fArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((float[]) obj).length);
                }
            } else if (obj instanceof boolean[]) {
                if (z17) {
                    boolean[] zArr = (boolean[]) obj;
                    stringBuffer.append("{");
                    while (i17 < zArr.length) {
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(zArr[i17]);
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((boolean[]) obj).length);
                }
            } else if (obj.getClass().isArray()) {
                if (z17) {
                    java.lang.Object[] objArr = (java.lang.Object[]) obj;
                    stringBuffer.append("{");
                    while (i17 < objArr.length) {
                        java.lang.Object obj2 = objArr[i17];
                        if (i17 > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj2 == null) {
                            stringBuffer.append("<null>");
                        } else {
                            a(stringBuffer, str, obj2, true);
                        }
                        i17++;
                    }
                    stringBuffer.append("}");
                } else {
                    b(stringBuffer, str, ((java.lang.Object[]) obj).length);
                }
            } else if (z17) {
                stringBuffer.append(obj);
            } else {
                stringBuffer.append("<");
                stringBuffer.append(c(obj.getClass()));
                stringBuffer.append(">");
            }
        } finally {
            e(obj);
        }
    }

    public void b(java.lang.StringBuffer stringBuffer, java.lang.String str, int i17) {
        stringBuffer.append("<size=");
        stringBuffer.append(i17);
        stringBuffer.append(">");
    }

    public java.lang.String c(java.lang.Class cls) {
        java.util.Map map = u46.b.f506192a;
        if (cls == null) {
            return "";
        }
        java.lang.String name = cls.getName();
        if (name.length() == 0) {
            return "";
        }
        x46.a aVar = new x46.a();
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                aVar.c("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
        }
        java.util.HashMap hashMap = (java.util.HashMap) u46.b.f506195d;
        if (hashMap.containsKey(name)) {
            name = (java.lang.String) hashMap.get(name);
        }
        int lastIndexOf = name.lastIndexOf(46);
        int indexOf = name.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        java.lang.String substring = name.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(substring);
        stringBuffer.append(aVar);
        return stringBuffer.toString();
    }
}
