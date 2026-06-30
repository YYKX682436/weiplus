package df2;

/* loaded from: classes3.dex */
public final class xm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f313321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.i62 f313322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(df2.cn cnVar, r45.i62 i62Var) {
        super(0);
        this.f313321d = cnVar;
        this.f313322e = i62Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        df2.cn cnVar = this.f313321d;
        if (currentTimeMillis - cnVar.f311429t < cnVar.f311428s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cnVar.f311425p, "can not double click");
            cnVar.f311429t = java.lang.System.currentTimeMillis();
        } else {
            cnVar.t7(121, 10, java.lang.Integer.valueOf(!cnVar.p7() ? 1 : 2));
            cnVar.f311429t = java.lang.System.currentTimeMillis();
            boolean p76 = cnVar.p7();
            r45.wg7 wg7Var = r45.wg7.MMFinderLiveLikeSource_RealnameLikeBubble;
            r45.i62 i62Var = this.f313322e;
            if (p76) {
                cnVar.s7(8, java.lang.Integer.valueOf(i62Var.m75939xb282bd08(2)));
                cnVar.r7(false, wg7Var, true);
            } else {
                cnVar.s7(2, java.lang.Integer.valueOf(i62Var.m75939xb282bd08(2)));
                cnVar.r7(true, wg7Var, true);
            }
        }
        return jz5.f0.f384359a;
    }
}
