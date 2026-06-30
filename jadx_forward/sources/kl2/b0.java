package kl2;

/* loaded from: classes3.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f390285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kl2.e0 e0Var) {
        super(1);
        this.f390285d = e0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ql1 ql1Var;
        long longValue = ((java.lang.Number) obj).longValue();
        kl2.e0 e0Var = this.f390285d;
        r45.f82 f82Var = e0Var.f390299i;
        if (f82Var != null && (ql1Var = (r45.ql1) f82Var.m75936x14adae67(2)) != null) {
            ql1Var.set(1, java.lang.Long.valueOf(longValue));
            e0Var.f390298h.setText(e0Var.f390291a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebm, java.lang.Long.valueOf(longValue)));
            ((il2.r) e0Var.f390292b).u1(ql1Var, false);
            e0Var.f390294d.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
