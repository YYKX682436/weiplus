package zl2;

/* loaded from: classes15.dex */
public final class b5 extends android.widget.Scroller {

    /* renamed from: a, reason: collision with root package name */
    public final int f555212a;

    public b5(android.content.Context context, int i17) {
        super(context);
        this.f555212a = i17;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i17, int i18, int i19, int i27, int i28) {
        super.startScroll(i17, i18, i19, i27, this.f555212a);
    }
}
