package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f176937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f176938f;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar) {
        this.f176936d = activityC13072x745567c8;
        this.f176937e = h0Var;
        this.f176938f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f176937e;
        int height = ((android.view.ViewGroup) h0Var.f391656d).getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176936d;
        activityC13072x745567c8.H = height;
        activityC13072x745567c8.I = ((android.view.ViewGroup) h0Var.f391656d).getWidth();
        this.f176938f.mo152xb9724478();
    }
}
