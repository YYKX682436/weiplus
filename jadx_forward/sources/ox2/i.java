package ox2;

/* loaded from: classes2.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e f431201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f431202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f431203f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e, int i17, int i18) {
        this.f431201d = c15408x626e05e;
        this.f431202e = i17;
        this.f431203f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f431201d;
        android.view.View view2 = c15408x626e05e.f213907i;
        if (view2 == null || (view = c15408x626e05e.f213904f) == null) {
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.getLocationInWindow(c15408x626e05e.f213919x);
        float t17 = (this.f431202e - c15408x626e05e.f213919x[0]) - (hc2.f1.t(view2) / 2);
        int i17 = c15408x626e05e.f213919x[1];
        float n17 = (this.f431203f - i17) - (hc2.f1.n(view2) / 2);
        view.setTranslationX(t17);
        view.setTranslationY(n17);
        android.view.View view3 = c15408x626e05e.f213909n;
        if (view3 == null) {
            return;
        }
        view3.setTranslationY(0.0f);
        view3.getLocationInWindow(c15408x626e05e.f213919x);
        view3.setTranslationY((r7 - c15408x626e05e.f213919x[1]) - (hc2.f1.n(view3) / 2));
    }
}
