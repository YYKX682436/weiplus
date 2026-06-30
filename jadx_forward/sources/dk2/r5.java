package dk2;

/* loaded from: classes3.dex */
public final class r5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.t5 f315546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(dk2.t5 t5Var) {
        super(0);
        this.f315546d = t5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentStickyHelper", "checkSticky undo sticky");
        dk2.t5 t5Var = this.f315546d;
        t5Var.f315639e = false;
        yz5.p pVar = t5Var.f315642h;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(t5Var.f315637c), java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
