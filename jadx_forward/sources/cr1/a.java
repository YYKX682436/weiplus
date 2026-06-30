package cr1;

/* loaded from: classes10.dex */
public final class a implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f303365d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303366e;

    public a(java.lang.String str) {
        this.f303365d = str;
        str = str == null ? "" : str;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        this.f303366e = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
    }

    /* renamed from: getPath */
    public final java.lang.String m122590xfb83cc9b() {
        return gm0.j1.u().d() + "bizfans/avatar/" + n();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "bizfans_avatar_" + this.f303366e;
    }
}
