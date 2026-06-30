package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes15.dex */
public final class d4 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f242465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 f242466b;

    public d4(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activityC17397x56ca4f48) {
        this.f242465a = z17;
        this.f242466b = activityC17397x56ca4f48;
    }

    @Override // wd0.p1
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activity = this.f242466b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(w24.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        w24.l T6 = ((w24.k) a17).T6("ITEM_KEY_IS_SHOW");
        w24.w wVar = T6 instanceof w24.w ? (w24.w) T6 : null;
        boolean z17 = this.f242465a;
        if (wVar != null) {
            wVar.b(!z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48.U6(activity, !z17);
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        c01.z1.j();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activityC17397x56ca4f48 = this.f242466b;
        boolean z17 = this.f242465a;
        activityC17397x56ca4f48.a7(z17, 34359738368L, 57);
        activityC17397x56ca4f48.f241763p.put(11, java.lang.Integer.valueOf(z17 ? 1 : 0));
    }
}
