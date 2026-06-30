package in5;

/* loaded from: classes10.dex */
public final class a0 extends in5.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374537e;

    public a0(android.view.View view, int i17) {
        this.f374536d = view;
        this.f374537e = i17;
    }

    @Override // in5.w
    public int a() {
        return 0;
    }

    @Override // in5.w
    public android.view.View b() {
        return this.f374536d;
    }

    /* renamed from: equals */
    public boolean m136779xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof in5.w) && mo2128x1ed62e84() == ((in5.w) obj).mo2128x1ed62e84();
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f374536d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f374537e;
    }
}
