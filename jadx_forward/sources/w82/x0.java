package w82;

/* loaded from: classes3.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 f525478e;

    public x0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504) {
        this.f525477d = view;
        this.f525478e = c13624x28778504;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable i17 = i65.a.i(this.f525478e.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f563010tz);
        android.view.View view = this.f525477d;
        view.setBackground(i17);
        view.invalidate();
    }
}
