package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 f166983d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var) {
        this.f166983d = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var = this.f166983d;
            x2Var.h(x2Var.a());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f166983d.f166908r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35241xdd905466);
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.c(this.f166983d.f166908r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35241xdd905466, th6.getLocalizedMessage());
                this.f166983d.l(56);
                if (th6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fc) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var2 = this.f166983d;
                    x2Var2.B1 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i3 i3Var = x2Var2.f166898h;
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = x2Var2.f166907q;
                    objArr[1] = x2Var2.f166908r;
                    objArr[2] = java.lang.Boolean.valueOf(i3Var == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyRestartOnLaunchRequested username[%s] appId[%s] null==callback[%b]", objArr);
                    if (i3Var != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) i3Var).C();
                    }
                } else if (th6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.gc) {
                    this.f166983d.b("RestartOtherAppErrorOnMigrateRequested", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h3() { // from class: com.tencent.mm.plugin.appbrand.launching.z2$$a
                        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h3
                        public final boolean a() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z2 z2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z2.this;
                            java.lang.Throwable th7 = th6;
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) z2Var.f166983d.f166898h).a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.gc) th7).f166164d);
                            return true;
                        }
                    });
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", th6, "call() exp ", new java.lang.Object[0]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ib.a(com.p314xaae8f345.mm.R.C30867xcad56011.f571723nf, this.f166983d);
                    this.f166983d.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.G1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f166983d.f166920z;
                if (interfaceC11702x4ae7c33 == null) {
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c332 = this.f166983d.f166920z;
                if (interfaceC11702x4ae7c332 != null) {
                    s46.d.a(interfaceC11702x4ae7c332);
                }
            }
        }
    }
}
