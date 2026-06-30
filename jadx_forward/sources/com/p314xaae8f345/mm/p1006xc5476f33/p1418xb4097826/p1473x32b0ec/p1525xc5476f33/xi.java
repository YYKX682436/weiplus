package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class xi implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj f196620d;

    public xi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj cjVar) {
        this.f196620d = cjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj cjVar = this.f196620d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cjVar.f193693h, "container onViewAttachedToWindow");
        if (cjVar.f193699q) {
            cjVar.f193699q = false;
            cm2.t tVar = cjVar.f193692g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.PromoteGameItem");
            cm2.u uVar = (cm2.u) tVar;
            hq0.e0 e0Var = cjVar.f193697o;
            if (e0Var != null) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = cjVar.f193698p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "access$getContainer$p(...)");
                cjVar.a(c1073x7e08a787, uVar.f124933v, e0Var);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj cjVar = this.f196620d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cjVar.f193693h, "container onViewDetachedFromWindow");
        cjVar.f193699q = true;
        cjVar.f193698p.removeAllViews();
    }
}
