package in5;

/* loaded from: classes2.dex */
public final class b0 extends in5.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374544e;

    public b0(android.view.View view, int i17) {
        this.f374543d = view;
        this.f374544e = i17;
    }

    @Override // in5.w
    public int a() {
        return 0;
    }

    @Override // in5.w
    public android.view.View b() {
        return this.f374543d;
    }

    @Override // in5.w
    public boolean c() {
        return true;
    }

    /* renamed from: equals */
    public boolean m136780xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof in5.w) && mo2128x1ed62e84() == ((in5.w) obj).mo2128x1ed62e84();
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f374543d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f374544e;
    }
}
