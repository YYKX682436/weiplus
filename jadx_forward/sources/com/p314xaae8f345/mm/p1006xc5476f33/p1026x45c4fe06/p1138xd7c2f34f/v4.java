package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class v4 implements k91.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f166786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f166787c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4 f166788d;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4 x4Var, java.lang.String str, int i17, long j17) {
        this.f166788d = x4Var;
        this.f166785a = str;
        this.f166786b = i17;
        this.f166787c = j17;
    }

    @Override // k91.c5
    public void a(k91.b5 b5Var, java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        ne1.j jVar = ne1.j.NO_UPDATE;
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "onGetContact with username(%s) maybeNew == NULL", this.f166785a);
            try {
                this.f166788d.f166937h.a(jVar, 0, null, null, null);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", e17, "onGetContact with username(%s) maybeNew == NULL", this.f166785a);
                return;
            }
        }
        if (v5Var.w0() == null) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "onGetContact with username(%s), maybeNew.versionInfo == NULL", this.f166785a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", format);
            try {
                this.f166788d.f166937h.a(jVar, 0, null, null, null);
                return;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", e18, format, new java.lang.Object[0]);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "[appversion] onGetContact(%s), result %s, old.version %d, maybeNew.ver %d", this.f166785a, b5Var, java.lang.Integer.valueOf(this.f166786b), java.lang.Integer.valueOf(v5Var.w0().f158977d));
        cm.i0 i0Var = b5Var.ordinal() != 3 ? cm.i0.ok : cm.i0.common_fail;
        k91.b5 b5Var2 = k91.b5.RET_HIT_FREQUENCY_LIMIT;
        if (b5Var2 != b5Var) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7108xda6a1515 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.a(this.f166788d.f166938i);
            long j17 = this.f166787c;
            a17.f144263k = j17;
            a17.f144264l = currentTimeMillis;
            a17.f144261i = currentTimeMillis - j17;
            a17.f144265m = i0Var;
            a17.f144266n = cm.h0.async;
            a17.f144267o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
            a17.f144269q = a17.b("NetworkTypeStr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
            a17.k();
            va1.b bVar = va1.b.f515762a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4 x4Var = this.f166788d;
            bVar.a(x4Var.f166938i.f169667d, x4Var.f166931b, "ContactCGI", this.f166787c, currentTimeMillis, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = this.f166788d.f166936g;
        if (b5Var2 == b5Var && v5Var.w0().f158977d <= c11829x68027553.f158977d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4 x4Var2 = this.f166788d;
            if (x4Var2.f166942m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "skip dispatch noUpdate for username:%s, appId:%s", this.f166785a, x4Var2.f166931b);
                return;
            }
        }
        if (v5Var.w0().f158979f != 0) {
            this.f166788d.f166937h.a(jVar, 0, null, null, null);
            return;
        }
        if (c11829x68027553.f158977d >= v5Var.w0().f158977d) {
            this.f166788d.f166937h.a(jVar, c11829x68027553.f158977d, c11829x68027553.f158978e, v5Var.f68914xdb18fafd, v5Var.f68921x18e8b202);
            return;
        }
        this.f166788d.f166937h.a(ne1.j.UPDATING, v5Var.w0().f158977d, v5Var.w0().f158978e, v5Var.f68914xdb18fafd, v5Var.f68921x18e8b202);
        ku5.u0 u0Var = ku5.t0.f394148d;
        ((ku5.t0) u0Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u4(this, v5Var), "MicroMsg.AppBrand.Launching.ContactSilentSyncProcess|download|" + this.f166785a);
    }
}
