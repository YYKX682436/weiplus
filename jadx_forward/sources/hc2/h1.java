package hc2;

/* loaded from: classes2.dex */
public final class h1 extends android.widget.Scroller {

    /* renamed from: a, reason: collision with root package name */
    public final int f361862a;

    public h1(android.content.Context context, int i17) {
        super(context);
        this.f361862a = i17;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i17, int i18, int i19, int i27, int i28) {
        super.startScroll(i17, i18, i19, i27, this.f361862a);
    }
}
