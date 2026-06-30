package uq0;

/* loaded from: classes4.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f511730e = {l75.n0.m145250x3fdc6f77(uq0.e.f511729t, "MagicSclFrameSetInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f511731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, uq0.e.f511729t, "MagicSclFrameSetInfo", dm.a8.f317197i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = uq0.e.f511729t;
        this.f511731d = db6;
    }

    public final uq0.e y0(java.lang.String bizName, java.lang.String frameSetId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        uq0.e eVar = new uq0.e();
        eVar.f65900x6ebe57f9 = bizName;
        eVar.f65902xf11f4305 = vq0.a.b(frameSetId);
        java.lang.String q07 = r26.n0.q0(frameSetId, "-", frameSetId);
        eVar.f65903x828b13a1 = r26.n0.s0(q07, "_", q07);
        if (get(eVar, "bizName", "frameSetName", "frameSetRootPath")) {
            return eVar;
        }
        return null;
    }
}
