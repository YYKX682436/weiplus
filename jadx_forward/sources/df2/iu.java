package df2;

/* loaded from: classes3.dex */
public final class iu extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.ju f311962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(df2.ju juVar, java.lang.Class cls) {
        super(cls);
        this.f311962b = juVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.da4 da4Var;
        r45.lu1 result = (r45.lu1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.LinkedList<r45.yd5> m75941xfb821914 = result.m75941xfb821914(0);
        if (m75941xfb821914 != null) {
            for (r45.yd5 yd5Var : m75941xfb821914) {
                if (yd5Var.m75942xfb822ef2(0) == 1) {
                    r45.w30 w30Var = (r45.w30) yd5Var.m75936x14adae67(4);
                    if (w30Var != null && w30Var.m75942xfb822ef2(0) == 1) {
                        r45.w30 w30Var2 = (r45.w30) yd5Var.m75936x14adae67(4);
                        boolean z17 = (w30Var2 == null || (da4Var = (r45.da4) w30Var2.m75936x14adae67(1)) == null || da4Var.m75942xfb822ef2(0) != 1) ? false : true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSharePromptTipsController", "#startPolling wording=" + yd5Var.m75945x2fec8307(1) + " duration=" + yd5Var.m75939xb282bd08(3) + ", needRedDot=" + z17);
                        pm0.v.X(new df2.hu(this.f311962b, z17, yd5Var));
                    }
                }
            }
        }
    }
}
