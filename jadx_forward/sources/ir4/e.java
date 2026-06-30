package ir4;

/* loaded from: classes10.dex */
public final class e implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f375797d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f375798e;

    public e(java.lang.String str) {
        this.f375797d = str;
        str = str == null ? "" : str;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        this.f375798e = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
    }

    /* renamed from: getPath */
    public final java.lang.String m139759xfb83cc9b() {
        return gm0.j1.u().d() + "w1w_personal_msg/avatar/" + n();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "w1w_avatar_" + this.f375798e;
    }
}
