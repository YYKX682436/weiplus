package ks3;

/* loaded from: classes8.dex */
public class j0 extends android.os.AsyncTask implements hs3.m {

    /* renamed from: d, reason: collision with root package name */
    public hs3.q f393232d;

    /* renamed from: e, reason: collision with root package name */
    public hs3.l f393233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ks3.k0 f393234f;

    public j0(ks3.k0 k0Var, ks3.h0 h0Var) {
        this.f393234f = k0Var;
    }

    public void a() {
        publishProgress(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks3.j0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        gm0.j1.i();
        gm0.j1.e().j(new ks3.i0(this));
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        byte[] bArr;
        java.util.Map map;
        hs3.l lVar = (hs3.l) obj;
        if (lVar == null) {
            return;
        }
        hs3.n nVar = lVar.f366119d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) nVar.f366125c.get("xm_skey"));
        ks3.k0 k0Var = this.f393234f;
        hs3.j jVar = lVar.f366122g;
        if (K0) {
            jVar.b(-5, "");
        } else {
            hs3.o oVar = lVar.f366120e;
            int i17 = oVar.f366126a;
            if (i17 == 304) {
                ks3.k0.a(k0Var, lVar);
            } else if (i17 == 200) {
                java.util.Map map2 = k0Var.f393238a;
                if (map2 != null && (map = oVar.f366127b) != null) {
                    for (java.lang.String str : map.keySet()) {
                        ((java.util.HashMap) map2).put(str, (java.lang.String) map.get(str));
                    }
                }
                if (ks3.k0.a(k0Var, lVar) == 0 && lVar.f366118c.f366114b) {
                    ks3.s sVar = k0Var.f393241d;
                    byte[] bytes = lVar.f366120e.f366128c.getBytes();
                    sVar.getClass();
                    java.lang.String str2 = lVar.f366117b;
                    if (str2 == null || str2.length() == 0 || bytes == null || bytes.length == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Msg.Plugin.HttpRequestCache", "setCache, invalid argument");
                    } else {
                        sVar.a();
                        java.lang.String b17 = sVar.b(str2, nVar.f366124b);
                        try {
                            javax.crypto.SecretKey generateSecret = javax.crypto.SecretKeyFactory.getInstance("DES").generateSecret(new javax.crypto.spec.DESKeySpec(kk.k.g(b17.toString().getBytes()).substring(8, 16).getBytes()));
                            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding");
                            cipher.init(1, generateSecret, new javax.crypto.spec.IvParameterSpec("12345678".getBytes()));
                            bArr = cipher.doFinal(bytes);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Msg.Plugin.HttpRequestCache", e17, "", new java.lang.Object[0]);
                            bArr = null;
                        }
                        if (bArr == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Msg.Plugin.HttpRequestCache", "encrypt fail, cipherText is null");
                        } else {
                            com.p314xaae8f345.mm.vfs.w6.S(sVar.f393279a + b17, bArr, 0, bArr.length);
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        }
                    }
                }
            } else {
                java.lang.String str3 = ks3.k0.f393236g;
                k0Var.getClass();
                if (ks3.k0.f393237h == null) {
                    ks3.k0.f393237h = new android.util.SparseArray();
                    for (java.lang.reflect.Field field : java.net.HttpURLConnection.class.getDeclaredFields()) {
                        int modifiers = field.getModifiers();
                        java.lang.String name = field.getName();
                        if (name != null && name.startsWith("HTTP_") && java.lang.reflect.Modifier.isPublic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers) && java.lang.reflect.Modifier.isStatic(modifiers)) {
                            try {
                                int i18 = field.getInt(0);
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                java.lang.String[] split = name.split("_");
                                if (split != null) {
                                    for (int i19 = 1; i19 < split.length; i19++) {
                                        sb6.append(split[i19]);
                                        sb6.append(' ');
                                    }
                                    sb6.append("error");
                                }
                                ks3.k0.f393237h.put(i18, sb6.toString().toLowerCase());
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    }
                }
                java.lang.String str4 = (java.lang.String) ks3.k0.f393237h.get(i17);
                if (str4 == null) {
                    str4 = k0Var.e(i17, "request error");
                }
                jVar.b(i17, str4);
            }
        }
        jVar.a();
        java.util.Map map3 = k0Var.f393242e;
        long j17 = lVar.f366116a;
        ((java.util.HashMap) map3).remove(java.lang.Long.valueOf(j17));
        ((java.util.HashMap) k0Var.f393243f).remove(java.lang.Long.valueOf(j17));
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(java.lang.Object[] objArr) {
        hs3.j jVar = this.f393233e.f366122g;
        ((java.lang.Integer[]) objArr)[0].intValue();
        jVar.getClass();
    }
}
