package a43;

/* loaded from: classes8.dex */
public final class a implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1208d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f1209e;

    public a(java.lang.String str) {
        this.f1208d = str;
        str = str == null ? "" : str;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        this.f1209e = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
    }

    public final java.lang.String getPath() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        s33.j0 j0Var = (s33.j0) i95.n0.c(s33.j0.class);
        if (j0Var.f402512d == null && gm0.j1.a()) {
            j0Var.f402512d = gm0.j1.u().d() + "gamechatroom/avatar/";
        }
        sb6.append(j0Var.f402512d);
        sb6.append(n());
        return sb6.toString();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "gamechatroom_avatar_" + this.f1209e;
    }
}
