package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes15.dex */
public final class sa implements xq.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta f281465b;

    public sa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar) {
        this.f281465b = taVar;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a(android.view.View itemView, java.lang.String animKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animKey, "animKey");
        if (!r26.n0.B(animKey, "_", false)) {
            return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) itemView.findViewById(com.p314xaae8f345.mm.R.id.bkl);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) itemView.findViewById(com.p314xaae8f345.mm.R.id.kpw);
        int parseInt = java.lang.Integer.parseInt((java.lang.String) r26.n0.f0(animKey, new java.lang.String[]{"_"}, false, 0, 6, null).get(1));
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        android.view.View childAt = viewGroup.getChildAt(parseInt);
        if (childAt instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) {
            return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) childAt;
        }
        return null;
    }

    public android.view.View b(long j17) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f281465b.f280113d.f542241c.a(sb5.z.class))).O0(j17);
    }
}
