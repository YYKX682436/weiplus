package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class a4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq.b f282315e;

    public a4(android.view.View view, fq.b bVar) {
        this.f282314d = view;
        this.f282315e = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f282314d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = view.getWidth();
        fq.b bVar = this.f282315e;
        android.widget.RelativeLayout relativeLayout = bVar.f346925c;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = width;
        relativeLayout.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout = bVar.f346926d;
        android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        layoutParams2.width = width;
        linearLayout.setLayoutParams(layoutParams2);
        return true;
    }
}
