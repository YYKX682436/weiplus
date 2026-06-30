package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f225139a;

    /* renamed from: b, reason: collision with root package name */
    public final long f225140b;

    /* renamed from: c, reason: collision with root package name */
    public final long f225141c;

    public i(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 emoticonPanel, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoticonPanel, "emoticonPanel");
        this.f225139a = emoticonPanel;
        this.f225140b = j17;
        this.f225141c = j18;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i iVar, java.lang.String str, cl0.g gVar) {
        iVar.getClass();
        cl0.g gVar2 = new cl0.g();
        gVar2.h("type", str);
        gVar2.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, gVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(iVar.f225140b, iVar.f225141c, "emoticon.itemSelect", gVar2);
    }

    public final android.content.Context b() {
        java.lang.Object m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f225140b);
        if (m65361xd4eb96cf == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            return context;
        }
        if (m65361xd4eb96cf instanceof android.app.Activity) {
            return (android.content.Context) m65361xd4eb96cf;
        }
        if (m65361xd4eb96cf instanceof android.app.Fragment) {
            android.app.Activity activity = ((android.app.Fragment) m65361xd4eb96cf).getActivity();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
            return activity;
        }
        android.content.Context context2 = ((android.view.View) m65361xd4eb96cf).getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        return context2;
    }

    public final void c(double d17, double d18, double d19) {
        cl0.g gVar = new cl0.g();
        gVar.n("originHeight", d17);
        gVar.n("nextHeight", d18);
        gVar.n("animateDuration", d19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(this.f225140b, this.f225141c, "emoticon.heightAnimateChange", gVar);
    }

    public final void d() {
        this.f225139a.animate().translationY(r0.getHeight()).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e(this)).setDuration(300L).start();
        c(i65.a.c(b(), r0.getHeight()), 0.0d, 0.3d);
    }
}
