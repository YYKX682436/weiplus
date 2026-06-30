package um2;

/* loaded from: classes3.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f510376d = x5Var;
        this.f510377e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        um2.x5 x5Var = this.f510376d;
        pe2.h hVar = x5Var.B;
        if (hVar != null) {
            return hVar;
        }
        fm2.c cVar = this.f510377e;
        return new pe2.h((android.view.ViewGroup) x5Var.e(com.p314xaae8f345.mm.R.id.euu, cVar), cVar);
    }
}
