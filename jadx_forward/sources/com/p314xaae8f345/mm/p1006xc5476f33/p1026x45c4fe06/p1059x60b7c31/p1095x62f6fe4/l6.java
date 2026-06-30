package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class l6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m6 f163456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6 f163457c;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6 n6Var, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m6 m6Var) {
        this.f163457c = n6Var;
        this.f163455a = arrayList;
        this.f163456b = m6Var;
    }

    public void a(final java.lang.String str, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y yVar) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        final java.util.ArrayList arrayList = this.f163455a;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m6 m6Var = this.f163456b;
        ((ku5.t0) u0Var).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.l6$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.nio.ByteBuffer byteBuffer;
                byte[] bArr;
                int i17;
                int i18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6 l6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6.this;
                java.lang.String str2 = str;
                java.util.ArrayList arrayList2 = arrayList;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y yVar2 = yVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m6 m6Var2 = m6Var;
                l6Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "onGetImageFromDiskCache url:%s", str2);
                synchronized (l6Var.f163457c.f163487m) {
                    arrayList2.remove(str2);
                }
                if (yVar2 != null && (byteBuffer = yVar2.f168794a) != null) {
                    if (byteBuffer.hasArray()) {
                        bArr = byteBuffer.array();
                        i17 = byteBuffer.arrayOffset() + byteBuffer.position();
                        i18 = byteBuffer.remaining();
                    } else {
                        bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        i17 = 0;
                        i18 = 0;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataConvert", "buffer length: " + bArr.length);
                    java.lang.String str3 = "";
                    if (bArr.length != 0) {
                        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), "preview_" + java.lang.System.currentTimeMillis() + "_" + java.util.Arrays.hashCode(bArr));
                        java.io.OutputStream outputStream = null;
                        try {
                            java.io.OutputStream H = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                            if (byteBuffer.hasArray()) {
                                H.write(bArr, i17, i18);
                            } else {
                                H.write(bArr);
                            }
                            if (H != null) {
                                try {
                                    H.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            str3 = r6Var.o();
                        } catch (java.lang.Exception unused2) {
                            if (0 != 0) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException unused3) {
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            if (0 != 0) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException unused4) {
                                }
                            }
                            throw th6;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "write to file, origin url:%s, localUrl:%s", str2, str3);
                    yVar2.mo52156x41012807();
                    synchronized (l6Var.f163457c.f163487m) {
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            l6Var.f163457c.f163485h.add(str3);
                            l6Var.f163457c.f163486i.put(str2, str3);
                        }
                    }
                } else if (yVar2 != null) {
                    yVar2.mo52156x41012807();
                }
                synchronized (l6Var.f163457c.f163487m) {
                    if (arrayList2.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "all image get from disk cache");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j6) m6Var2).a();
                    }
                }
            }
        });
    }
}
