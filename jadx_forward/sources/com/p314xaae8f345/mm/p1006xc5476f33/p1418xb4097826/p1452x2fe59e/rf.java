package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class rf implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f190439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf f190440e;

    public rf(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf ufVar) {
        this.f190439d = viewGroup;
        this.f190440e = ufVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewGroup viewGroup = this.f190439d;
        android.view.ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf ufVar = this.f190440e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = ufVar.f190701n;
        android.graphics.Point point = new android.graphics.Point(viewGroup.getWidth(), viewGroup.getHeight());
        kfVar.getClass();
        kfVar.f188739t = point;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kfVar.f188724e, "setWindowSize: " + point);
        android.graphics.Point point2 = new android.graphics.Point(viewGroup.getWidth(), viewGroup.getHeight());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar2 = ufVar.f190701n;
        kfVar2.getClass();
        kfVar2.f188740u = point2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kfVar2.f188724e, "parentSize: " + point2);
        if (ufVar.f190712y) {
            ufVar.t(true);
        }
        return true;
    }
}
