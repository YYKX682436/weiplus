package gu1;

/* loaded from: classes15.dex */
public class l implements tt1.i {

    /* renamed from: a, reason: collision with root package name */
    public gu1.k f357430a;

    public l(gu1.k kVar) {
        this.f357430a = kVar;
    }

    @Override // tt1.i
    /* renamed from: getItem */
    public tt1.j mo54455xfb80e389(int i17) {
        gu1.k kVar = this.f357430a;
        if (kVar != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) kVar.getItem(i17);
        }
        return null;
    }

    @Override // tt1.i
    /* renamed from: onCreate */
    public void mo54456x3e5a77bb() {
        if (this.f357430a != null) {
            xt1.t0.cj().add(this.f357430a);
        }
    }

    @Override // tt1.i
    /* renamed from: onDestroy */
    public void mo54457xac79a11b() {
        if (this.f357430a != null) {
            xt1.t0.cj().mo49775xc84af884(this.f357430a);
            gu1.k kVar = this.f357430a;
            ((gu1.u) kVar.f357426p).mo54459x41012807();
            kVar.f357426p = null;
            kVar.c();
            int i17 = (int) (kVar.f357429s - kVar.f357428r);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(281);
            c4582x424c344.m40331x936762bd(24);
            c4582x424c344.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(281);
            c4582x424c3442.m40331x936762bd(25);
            c4582x424c3442.m40332x57b2b64f(i17);
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
            this.f357430a = null;
        }
    }

    @Override // tt1.i
    /* renamed from: onNotify */
    public void mo54458x50fc6e08() {
        gu1.k kVar = this.f357430a;
        if (kVar != null) {
            kVar.f();
        }
    }
}
