package ze2;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f553304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18) {
        super(0);
        this.f553304d = i17;
        this.f553305e = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errCode:");
        sb6.append(this.f553304d);
        sb6.append(" errType:");
        sb6.append(this.f553305e);
        sb6.append(" localId:");
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        sb6.append((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)));
        return sb6.toString();
    }
}
