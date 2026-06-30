package s50;

/* loaded from: classes12.dex */
public final class h1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f484596b;

    public h1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference) {
        this.f484595a = l1Var;
        this.f484596b = weakReference;
    }

    @Override // k23.v2
    public void a() {
        s50.x0 x0Var = s50.x0.f484671e;
        s50.l1 l1Var = this.f484595a;
        l1Var.getClass();
        l1Var.f484618i = x0Var;
        l1Var.aj(this.f484596b);
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceID, "voiceID");
        s50.l1 l1Var = this.f484595a;
        s50.l1.wi(l1Var, this.f484596b, result, true, voiceID);
        k23.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219737f;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219739h;
        p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = weakReference != null ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) weakReference.get() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95 activityC15617x8cb23e95 = activityC0053x3d3f670c instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95) activityC0053x3d3f670c : null;
        if (activityC15617x8cb23e95 != null) {
            k23.v0 v0Var = activityC15617x8cb23e95.f219745d;
            v0Var.w(8, "", result);
            v0Var.w(9, "", result);
        }
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219739h;
        if (weakReference2 != null && (abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) weakReference2.get()) != null) {
            abstractActivityC21394xb3d2c0cf.finish();
        }
        l1Var.f484618i = s50.x0.f484670d;
    }

    @Override // k23.v2
    /* renamed from: onCancel */
    public void mo63604x3d6f0539() {
        s50.x0 x0Var = s50.x0.f484675i;
        s50.l1 l1Var = this.f484595a;
        l1Var.getClass();
        l1Var.f484618i = x0Var;
        l1Var.Vi(this.f484596b);
        s50.x0 x0Var2 = s50.x0.f484670d;
        l1Var.getClass();
        l1Var.f484618i = x0Var2;
    }
}
