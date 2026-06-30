package a43;

/* loaded from: classes8.dex */
public final class a implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82741d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82742e;

    public a(java.lang.String str) {
        this.f82741d = str;
        str = str == null ? "" : str;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        this.f82742e = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
    }

    /* renamed from: getPath */
    public final java.lang.String m559xfb83cc9b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        s33.j0 j0Var = (s33.j0) i95.n0.c(s33.j0.class);
        if (j0Var.f484045d == null && gm0.j1.a()) {
            j0Var.f484045d = gm0.j1.u().d() + "gamechatroom/avatar/";
        }
        sb6.append(j0Var.f484045d);
        sb6.append(n());
        return sb6.toString();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "gamechatroom_avatar_" + this.f82742e;
    }
}
