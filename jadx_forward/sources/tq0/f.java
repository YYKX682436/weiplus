package tq0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f502743a;

    /* renamed from: b, reason: collision with root package name */
    public int f502744b;

    public f(java.lang.String coverPath, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        coverPath = (i18 & 1) != 0 ? "" : coverPath;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverPath, "coverPath");
        this.f502743a = coverPath;
        this.f502744b = i17;
    }

    /* renamed from: toString */
    public java.lang.String m166951x9616526c() {
        return "MagicSclPlaceHolder( cachedHeight: " + this.f502744b + ", coverPath: " + this.f502743a + " )";
    }
}
