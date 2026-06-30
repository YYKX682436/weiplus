package tz;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.io.InputStream inputStream;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        if (r2Var.f89292a == 47 && r2Var.f89293b == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckRegionCodeListener", "going to update region code.");
            java.lang.String str = c5255x5f3208fd.f135586g.f89294c;
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.io.InputStream inputStream2 = null;
                java.lang.String str2 = null;
                inputStream2 = null;
                try {
                    try {
                        inputStream = com.p314xaae8f345.mm.vfs.w6.C(r6Var);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream = inputStream2;
                }
                try {
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        java.lang.String[] split = readLine.trim().split("\\|");
                        if (split.length >= 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[0]) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[1])) {
                            java.io.BufferedWriter bufferedWriter = (java.io.BufferedWriter) hashMap.get(split[0]);
                            if (bufferedWriter == null) {
                                str2 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().c(split[0]);
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str2);
                                    if (!r6Var2.m()) {
                                        r6Var2.k();
                                    }
                                    java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new com.p314xaae8f345.mm.vfs.a7(r6Var2));
                                    hashMap.put(split[0], bufferedWriter2);
                                    bufferedWriter = bufferedWriter2;
                                }
                            }
                            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                            stringBuffer.append(split[1]);
                            stringBuffer.append('|');
                            stringBuffer.append(split[2]);
                            stringBuffer.append('\n');
                            bufferedWriter.write(stringBuffer.toString());
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCorePacakge", "dispatch regioncode, error line = " + readLine);
                    }
                    for (java.io.BufferedWriter bufferedWriter3 : hashMap.values()) {
                        if (bufferedWriter3 != null) {
                            bufferedWriter3.flush();
                        }
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        for (com.p314xaae8f345.mm.vfs.r6 r6Var3 : new com.p314xaae8f345.mm.vfs.r6(str2).s().H(new f21.q0())) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().d(r6Var3, r6Var3.s());
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().a();
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    r6Var.l();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCorePacakge", e18, "", new java.lang.Object[0]);
                        }
                    }
                    for (java.io.BufferedWriter bufferedWriter4 : hashMap.values()) {
                        if (bufferedWriter4 != null) {
                            bufferedWriter4.close();
                        }
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    inputStream2 = inputStream;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCorePacakge", e, "", new java.lang.Object[0]);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (java.io.IOException e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCorePacakge", e27, "", new java.lang.Object[0]);
                        }
                    }
                    for (java.io.BufferedWriter bufferedWriter5 : hashMap.values()) {
                        if (bufferedWriter5 != null) {
                            bufferedWriter5.close();
                        }
                    }
                    return false;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCorePacakge", e28, "", new java.lang.Object[0]);
                            throw th;
                        }
                    }
                    for (java.io.BufferedWriter bufferedWriter6 : hashMap.values()) {
                        if (bufferedWriter6 != null) {
                            bufferedWriter6.close();
                        }
                    }
                    throw th;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCorePacakge", "update regioncode failed, file not exist, packagePath:".concat(str));
            }
        }
        return false;
    }
}
