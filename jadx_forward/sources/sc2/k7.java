package sc2;

/* loaded from: classes2.dex */
public final class k7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f487557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(ad2.h hVar, sc2.r7 r7Var, in5.s0 s0Var) {
        super(0);
        this.f487556d = hVar;
        this.f487557e = r7Var;
        this.f487558f = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var;
        xc2.p0 p0Var;
        android.view.View view;
        ad2.h hVar = this.f487556d;
        if (hVar != null && (s0Var = hVar.f84681i) != null && (p0Var = hVar.f84680h) != null && (view = hVar.f84676d) != null) {
            ad2.k.b(hVar, s0Var, view, p0Var, true, null, 16, null);
            yz5.l lVar = this.f487557e.f487748n;
            if (lVar != null) {
                lVar.mo146xb9724478(this.f487558f);
            }
        }
        return jz5.f0.f384359a;
    }
}
