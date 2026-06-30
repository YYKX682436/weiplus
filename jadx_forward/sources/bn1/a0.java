package bn1;

/* loaded from: classes14.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn1.w f104316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn1.c0 f104317e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(bn1.w wVar, bn1.c0 c0Var) {
        super(0);
        this.f104316d = wVar;
        this.f104317e = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        bn1.w wVar = bn1.w.f104367d;
        bn1.w wVar2 = this.f104316d;
        bn1.c0 c0Var = this.f104317e;
        if (wVar2 == wVar) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = c0Var.f104322d;
            java.lang.Object obj = c22584xf7d97e83 != null ? c22584xf7d97e83.f292654p : null;
            m40.p0 p0Var = obj instanceof m40.p0 ? (m40.p0) obj : null;
            if (p0Var != null) {
                z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) p0Var).d7();
            }
            z17 = true;
        } else {
            if (c0Var.f104328m != 0) {
                z17 = false;
            }
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
