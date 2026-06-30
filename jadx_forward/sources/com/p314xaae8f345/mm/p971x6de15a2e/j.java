package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p971x6de15a2e.j f153559e = new com.p314xaae8f345.mm.p971x6de15a2e.j();

    /* renamed from: a, reason: collision with root package name */
    public final r45.ye5 f153560a = new r45.ye5();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f153561b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f153562c = "";

    /* renamed from: d, reason: collision with root package name */
    public long f153563d = 0;

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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.j.a():java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a0 -> B:17:0x00b6). Please report as a decompilation issue!!! */
    public final void b() {
        r45.ye5 ye5Var = this.f153560a;
        if (android.text.TextUtils.isEmpty(this.f153561b) || android.text.TextUtils.isEmpty(this.f153562c)) {
            try {
                java.lang.String[] K = gm0.j1.n().f354821b.f152297d.K();
                boolean z17 = true;
                if (K == null || K.length != 2 || android.text.TextUtils.isEmpty(K[0]) || android.text.TextUtils.isEmpty(K[1])) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("backup key is empty ");
                    if (K != null) {
                        z17 = false;
                    }
                    sb6.append(z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CgiSignerPublicAndPrivateKey", sb6.toString());
                    jx3.f.INSTANCE.mo68477x336bdfd8(226L, 40L, 1L, false);
                } else {
                    this.f153562c = K[0];
                    this.f153561b = K[1];
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CgiSignerPublicAndPrivateKey", "origin key is empty, use backup key " + this.f153562c.length() + " " + this.f153561b.length());
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.d(this.f153562c.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
                    ye5Var.f472549e = cu5Var;
                    ye5Var.f472548d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60864x51861c8c;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiSignerPublicAndPrivateKey", "try restore key from push failed " + e17.getLocalizedMessage());
            }
        }
    }

    public java.lang.String c(java.lang.String str) {
        b();
        try {
            byte[] m46310x1e1b3c96 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46310x1e1b3c96(this.f153561b.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            if (m46310x1e1b3c96 != null) {
                return new java.lang.String(m46310x1e1b3c96, java.nio.charset.StandardCharsets.ISO_8859_1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiSignerPublicAndPrivateKey", "sign result is null ");
            return "";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiSignerPublicAndPrivateKey", "sign data failed " + e17.getLocalizedMessage());
            return "";
        }
    }

    public byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        b();
        try {
            byte[] m46310x1e1b3c96 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46310x1e1b3c96(this.f153561b.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), bArr);
            if (m46310x1e1b3c96 != null) {
                return m46310x1e1b3c96;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiSignerPublicAndPrivateKey", "sign result is null ");
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiSignerPublicAndPrivateKey", "sign data byte failed " + e17.getLocalizedMessage());
            return null;
        }
    }
}
