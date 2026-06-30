package ht4;

/* loaded from: classes.dex */
public class f implements com.p314xaae8f345.mm.p2802xd031a825.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae f366495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht4.g f366496b;

    public f(ht4.g gVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae c5314x8b748bae) {
        this.f366496b = gVar;
        this.f366495a = c5314x8b748bae;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.g
    /* renamed from: onProcessEnd */
    public android.content.Intent mo14634xe047072b(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreECard", "open process end: %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae c5314x8b748bae = this.f366495a;
        if (i17 == -1) {
            c5314x8b748bae.f135630h.f88542a = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "openEcard:ok");
        } else {
            c5314x8b748bae.f135630h.f88542a = -1;
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "openEcard:fail");
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m4) c5314x8b748bae.f135629g.f88444l).run();
        if (!h45.y.c()) {
            h45.y.f360501a = null;
        }
        this.f366496b.f366497d = null;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        return intent;
    }
}
