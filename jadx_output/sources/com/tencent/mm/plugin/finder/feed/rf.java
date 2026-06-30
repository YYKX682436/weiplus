package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class rf implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f108906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uf f108907e;

    public rf(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.feed.uf ufVar) {
        this.f108906d = viewGroup;
        this.f108907e = ufVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewGroup viewGroup = this.f108906d;
        android.view.ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.tencent.mm.plugin.finder.feed.uf ufVar = this.f108907e;
        com.tencent.mm.plugin.finder.feed.kf kfVar = ufVar.f109168n;
        android.graphics.Point point = new android.graphics.Point(viewGroup.getWidth(), viewGroup.getHeight());
        kfVar.getClass();
        kfVar.f107206t = point;
        com.tencent.mars.xlog.Log.i(kfVar.f107191e, "setWindowSize: " + point);
        android.graphics.Point point2 = new android.graphics.Point(viewGroup.getWidth(), viewGroup.getHeight());
        com.tencent.mm.plugin.finder.feed.kf kfVar2 = ufVar.f109168n;
        kfVar2.getClass();
        kfVar2.f107207u = point2;
        com.tencent.mars.xlog.Log.i(kfVar2.f107191e, "parentSize: " + point2);
        if (ufVar.f109179y) {
            ufVar.t(true);
        }
        return true;
    }
}
