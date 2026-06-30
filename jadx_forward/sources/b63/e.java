package b63;

/* loaded from: classes8.dex */
public final class e implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f99679d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f99680e;

    public e(java.lang.String str) {
        this.f99679d = str;
        str = str == null ? "" : str;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        this.f99680e = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
    }

    /* renamed from: getPath */
    public final java.lang.String m9889xfb83cc9b() {
        return ((java.lang.String) ((jz5.n) ((t53.m0) i95.n0.c(t53.m0.class)).f497331f).mo141623x754a37bb()) + n();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "gamelife_avatar_" + this.f99680e;
    }
}
