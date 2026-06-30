package ud2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.o f508146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ud2.o oVar) {
        super(0);
        this.f508146d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        ud2.o oVar = this.f508146d;
        ud2.a aVar = oVar.f508168b;
        android.content.Context context = aVar.f508109d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = oVar.f508170d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = c14994x9b99c079 != null ? c14994x9b99c079.m59240x7c94657b() : null;
        java.lang.String str2 = oVar.f508169c;
        if (m59240x7c94657b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "try enter live when finder object is null");
        } else {
            long m76784x5db1b11 = m59240x7c94657b.m76784x5db1b11();
            java.lang.String m76803x6c285d75 = m59240x7c94657b.m76803x6c285d75();
            r45.nw1 m76794xd0557130 = m59240x7c94657b.m76794xd0557130();
            long m75942xfb822ef2 = m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "enter live with feedId:" + pm0.v.u(m76784x5db1b11) + ", nonceId:" + m76803x6c285d75 + ", contextId:" + context);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
            intent.putExtra("LAUNCH_WITH_ANIM", true);
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(m76784x5db1b11));
            m84Var.set(1, java.lang.Long.valueOf(m75942xfb822ef2));
            m84Var.set(2, m76803x6c285d75);
            m84Var.set(3, aVar.f508111f);
            m84Var.set(4, m59240x7c94657b.m76829x97edf6c0());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666();
            if (m76802x2dd01666 == null || (str = m76802x2dd01666.m76944x730bcac6()) == null) {
                str = "";
            }
            m84Var.set(5, str);
            m84Var.set(6, null);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((vd2.f1) e0Var).Ri(context2, intent, m84Var, true, wk0Var, null);
        }
        return jz5.f0.f384359a;
    }
}
