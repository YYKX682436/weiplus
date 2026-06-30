package yd5;

/* loaded from: classes4.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Chatting.ChatTagSearchSpanClickReportFlow", "bindDataToWidget widget:" + view);
        if (view != null) {
            r45.ek6 ek6Var = new r45.ek6();
            ek6Var.f455117d = msg.I0();
            ek6Var.f455118e = z17 ? 2 : 1;
            if (z17) {
                str = msg.Q0();
            }
            ek6Var.f455119f = str;
            ek6Var.f455120g = msg.mo78012x3fdd41df();
            ek6Var.f455121h = 0;
            ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).getClass();
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            t04.a aVar = context instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8 ? (t04.a) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(t04.a.class) : null;
            o04.n O6 = aVar != null ? aVar.O6(1) : null;
            if (O6 == null) {
                O6 = new o04.g(1);
                android.content.Context context2 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                t04.a aVar2 = context2 instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8 ? (t04.a) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(t04.a.class) : null;
                if (aVar2 != null) {
                    aVar2.S6(O6);
                }
            }
            ((o04.g) O6).b(java.lang.String.valueOf(view.hashCode()), ek6Var);
        }
    }
}
