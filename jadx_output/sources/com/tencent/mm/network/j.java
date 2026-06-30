package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.network.j f72026e = new com.tencent.mm.network.j();

    /* renamed from: a, reason: collision with root package name */
    public final r45.ye5 f72027a = new r45.ye5();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f72028b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f72029c = "";

    /* renamed from: d, reason: collision with root package name */
    public long f72030d = 0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.j.a():java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a0 -> B:17:0x00b6). Please report as a decompilation issue!!! */
    public final void b() {
        r45.ye5 ye5Var = this.f72027a;
        if (android.text.TextUtils.isEmpty(this.f72028b) || android.text.TextUtils.isEmpty(this.f72029c)) {
            try {
                java.lang.String[] K = gm0.j1.n().f273288b.f70764d.K();
                boolean z17 = true;
                if (K == null || K.length != 2 || android.text.TextUtils.isEmpty(K[0]) || android.text.TextUtils.isEmpty(K[1])) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("backup key is empty ");
                    if (K != null) {
                        z17 = false;
                    }
                    sb6.append(z17);
                    com.tencent.mars.xlog.Log.w("CgiSignerPublicAndPrivateKey", sb6.toString());
                    jx3.f.INSTANCE.idkeyStat(226L, 40L, 1L, false);
                } else {
                    this.f72029c = K[0];
                    this.f72028b = K[1];
                    com.tencent.mars.xlog.Log.w("CgiSignerPublicAndPrivateKey", "origin key is empty, use backup key " + this.f72029c.length() + " " + this.f72028b.length());
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.d(this.f72029c.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
                    ye5Var.f391016e = cu5Var;
                    ye5Var.f391015d = com.tencent.wxmm.v2helper.EMethodOutputVolumeScaleEnable;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("CgiSignerPublicAndPrivateKey", "try restore key from push failed " + e17.getLocalizedMessage());
            }
        }
    }

    public java.lang.String c(java.lang.String str) {
        b();
        try {
            byte[] ecdsaSignWithOctKey = com.tencent.mm.jni.utils.UtilsJni.ecdsaSignWithOctKey(this.f72028b.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            if (ecdsaSignWithOctKey != null) {
                return new java.lang.String(ecdsaSignWithOctKey, java.nio.charset.StandardCharsets.ISO_8859_1);
            }
            com.tencent.mars.xlog.Log.e("CgiSignerPublicAndPrivateKey", "sign result is null ");
            return "";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CgiSignerPublicAndPrivateKey", "sign data failed " + e17.getLocalizedMessage());
            return "";
        }
    }

    public byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        b();
        try {
            byte[] ecdsaSignWithOctKey = com.tencent.mm.jni.utils.UtilsJni.ecdsaSignWithOctKey(this.f72028b.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), bArr);
            if (ecdsaSignWithOctKey != null) {
                return ecdsaSignWithOctKey;
            }
            com.tencent.mars.xlog.Log.e("CgiSignerPublicAndPrivateKey", "sign result is null ");
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CgiSignerPublicAndPrivateKey", "sign data byte failed " + e17.getLocalizedMessage());
            return null;
        }
    }
}
