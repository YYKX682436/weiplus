package qv;

@j95.b
/* loaded from: classes8.dex */
public class i extends i95.w implements rv.q2 {
    public void Ai(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.content.Intent intent) {
        if (abstractActivityC21394xb3d2c0cf == null || intent == null) {
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 wi6 = ((vw.o) ((rv.a3) i95.n0.c(rv.a3.class))).wi(abstractActivityC21394xb3d2c0cf, intent, null, 0, true);
        wi6.m7571x41119ed3(false);
        wi6.mo7414x35dafd(abstractActivityC21394xb3d2c0cf.mo7595x9cdc264(), "BizContactInfoDialogFragment");
    }

    public void Bi(android.content.Context context, java.lang.String params, int i17) {
        eq1.x xVar = eq1.x.f337408a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        xVar.a(context, params, i17, false, null, null, null, null);
    }

    public boolean wi() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_send_private_msg_scope_enable_android, 0) == 1;
    }
}
