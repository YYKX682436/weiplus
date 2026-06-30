package to1;

/* loaded from: classes15.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to1.k f502450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f502452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(to1.k kVar, java.lang.String str, boolean z17) {
        super(0);
        this.f502450d = kVar;
        this.f502451e = str;
        this.f502452f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        to1.r c17;
        to1.k kVar = this.f502450d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = kVar.f502455c;
        java.lang.String str = this.f502451e;
        to1.r rVar = (to1.r) r2Var.get(str);
        if (rVar != null) {
            return rVar;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = kVar.f502455c;
        if (!this.f502452f) {
            c17 = kVar.f502453a.c(str);
            if (c17 != null) {
                r2Var2.put(str, c17);
                return c17;
            }
            return null;
        }
        java.io.File file = new java.io.File(str);
        to1.r b17 = kVar.b(file.getParent());
        if (b17 != null) {
            java.lang.String name = file.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
            c17 = b17.d(name, true);
            if (c17 != null) {
                r2Var2.put(str, c17);
                return c17;
            }
        }
        return null;
    }
}
