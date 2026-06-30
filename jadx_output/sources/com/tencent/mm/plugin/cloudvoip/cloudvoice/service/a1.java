package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class a1 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95823a;

    public a1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f95823a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        final r45.r70 r70Var = (r45.r70) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: on receive cmd msg");
        this.f95823a.n(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a1$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a1.this.f95823a;
                if (p0Var.G != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    r45.r70 r70Var2 = r70Var;
                    hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, com.tencent.mm.plugin.appbrand.utils.v3.e(r70Var2.f384583d.g()));
                    hashMap.put("from_member_id", java.lang.Integer.valueOf(r70Var2.f384584e));
                    p0Var.G.a(0, 0, "", hashMap);
                }
            }
        });
        return "";
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object b(byte[] bArr) {
        r45.r70 r70Var = new r45.r70();
        try {
            r70Var.parseFrom(bArr);
            return r70Var;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", e17, "hy: unable to parse from data", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public byte[] c(java.lang.Object obj) {
        return new byte[0];
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public boolean d() {
        return true;
    }
}
