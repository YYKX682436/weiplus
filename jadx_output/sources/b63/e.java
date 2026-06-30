package b63;

/* loaded from: classes8.dex */
public final class e implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f18146d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f18147e;

    public e(java.lang.String str) {
        this.f18146d = str;
        str = str == null ? "" : str;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        this.f18147e = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
    }

    public final java.lang.String getPath() {
        return ((java.lang.String) ((jz5.n) ((t53.m0) i95.n0.c(t53.m0.class)).f415798f).getValue()) + n();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "gamelife_avatar_" + this.f18147e;
    }
}
