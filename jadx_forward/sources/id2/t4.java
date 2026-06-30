package id2;

/* loaded from: classes3.dex */
public final class t4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f372343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(id2.f5 f5Var) {
        super(3);
        this.f372343d = f5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.ql1 ql1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String id6 = (java.lang.String) obj2;
        java.lang.String url = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRemindRestric", "checkRestrictConsume: " + booleanValue + " id: " + id6 + " url: " + url);
        if (booleanValue) {
            if (!(url.length() == 0)) {
                id2.f5 f5Var = this.f372343d;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = f5Var.f372100d;
                if (viewOnClickListenerC22631x1cc07cc8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                    throw null;
                }
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
                id2.f5.O6(f5Var, true);
                r45.f82 f82Var = f5Var.f372106m;
                f5Var.f372108o.y(id6, url, (f82Var == null || (ql1Var = (r45.ql1) f82Var.m75936x14adae67(2)) == null) ? 0L : ql1Var.m75942xfb822ef2(1));
            }
        }
        return jz5.f0.f384359a;
    }
}
