package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes15.dex */
public final class e4 implements v24.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 f242508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f242509b;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activityC17397x56ca4f48, boolean z17) {
        this.f242508a = activityC17397x56ca4f48;
        this.f242509b = z17;
    }

    @Override // v24.n0
    public boolean a() {
        return this.f242509b;
    }

    @Override // v24.n0
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activity = this.f242508a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(w24.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        w24.l T6 = ((w24.k) a17).T6("ITEM_KEY_IS_SHOW");
        w24.w wVar = T6 instanceof w24.w ? (w24.w) T6 : null;
        if (wVar != null) {
            wVar.b(z17);
        }
    }
}
