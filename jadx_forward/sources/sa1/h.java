package sa1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f486818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f486819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f486820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f486821g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sa1.i f486822h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f486823i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f486824m;

    public h(int i17, int i18, int i19, int i27, sa1.i iVar, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2, int i28) {
        this.f486818d = i17;
        this.f486819e = i18;
        this.f486820f = i19;
        this.f486821g = i27;
        this.f486822h = iVar;
        this.f486823i = c4216x654bedf2;
        this.f486824m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f486818d, this.f486819e);
        layoutParams.setMargins(this.f486820f, this.f486821g, 0, 0);
        sa1.i iVar = this.f486822h;
        hh.g gVar = iVar.f486826f;
        android.widget.FrameLayout frameLayout = iVar.f486825e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        int i17 = this.f486824m;
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f486823i;
        int a17 = gVar.a(frameLayout, c4216x654bedf2, i17);
        if (a17 == -2) {
            c4216x654bedf2.setLayoutParams(layoutParams);
            c4216x654bedf2.requestLayout();
        } else {
            android.widget.FrameLayout frameLayout2 = iVar.f486825e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
            frameLayout2.removeView(c4216x654bedf2);
            android.widget.FrameLayout frameLayout3 = iVar.f486825e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout3);
            frameLayout3.addView(c4216x654bedf2, a17, layoutParams);
        }
        c4216x654bedf2.m34868x1c0e5b23(false);
    }
}
