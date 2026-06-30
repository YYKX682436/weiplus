package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes7.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34771x366c91de = 472;

    /* renamed from: NAME */
    public static final java.lang.String f34772x24728b = "enableDeviceOrientationChangeListening";

    /* renamed from: g, reason: collision with root package name */
    public boolean f164578g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 f164579h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        if (jSONObject.optBoolean("enable", false)) {
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0.f164515h;
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0.a(lVar.mo48798x74292566(), true);
            java.util.Objects.requireNonNull(a17);
            a17.f164517b = lVar.mo48798x74292566();
            a17.f164518c = lVar;
            a17.f164516a = true;
            a17.f164519d.p(lVar);
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.sensor.b0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0.this;
                    b0Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
                    if (lVar2.mo50352x76847179() != null) {
                        int i17 = lVar2.mo50352x76847179().getResources().getConfiguration().orientation;
                        if (i17 == 2) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var2 = b0Var.f164520e;
                            f4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.REVERSE_LANDSCAPE;
                            if (f4Var2 != f4Var) {
                                f4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.LANDSCAPE;
                            }
                        } else {
                            f4Var = i17 == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.PORTRAIT : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE;
                        }
                        b0Var.f164521f = f4Var;
                        b0Var.c(f4Var);
                    }
                }
            });
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OrientationConfigListenerHelper", "startListen appId:%s", a17.f164517b);
            if (!this.f164578g) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 h4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4(lVar.mo50352x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.t(lVar.mo48798x74292566()));
                this.f164579h = h4Var;
                h4Var.enable();
                this.f164578g = true;
                p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = lVar.mo50358x95c7fa5f();
                if (mo50358x95c7fa5f != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.r(this, mo50358x95c7fa5f));
                }
            }
        } else {
            java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0.f164515h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0.a(lVar.mo48798x74292566(), false);
            if (a18 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OrientationConfigListenerHelper", "stopListen appId:%s", a18.f164517b);
                a18.f164517b = "";
                a18.f164518c = null;
                a18.f164516a = false;
                a18.f164521f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE;
            }
            if (this.f164578g) {
                this.f164579h.disable();
                this.f164579h = null;
                this.f164578g = false;
            }
        }
        return o("ok");
    }
}
