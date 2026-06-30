package yw2;

/* loaded from: classes5.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f548206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yw2.a0 a0Var) {
        super(0);
        this.f548206d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ux2.f fVar = this.f548206d.C;
        if (fVar != null) {
            yw2.a0 a0Var = ((yw2.t) fVar.f513386c).f548203a;
            if (a0Var.k().getShowFooter() && !a0Var.k().getCloseComment()) {
                pm0.v.K(null, new ux2.c(fVar));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderCommentRecentImageBubble", "isSupportRecentImageHelper is false");
            }
        }
        return jz5.f0.f384359a;
    }
}
