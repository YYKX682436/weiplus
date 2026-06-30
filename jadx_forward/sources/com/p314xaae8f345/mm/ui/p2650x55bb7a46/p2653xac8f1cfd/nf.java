package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class nf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe f281123d;

    public nf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar) {
        this.f281123d = peVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HeaderComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = this.f281123d;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(peVar.f280113d.x())) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", peVar.f280113d.x());
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 2);
            intent.putExtra("chat_from_scene", peVar.f280113d.k());
            j45.l.n(peVar.f280113d.g(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 213);
            q41.f.a(peVar.f280113d.x(), 4, 0);
            c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
            java.lang.String x17 = peVar.f280113d.x();
            b00.a0 a0Var = (b00.a0) u3Var;
            a0Var.cj(x17, "ecs_kf_session_shop_title", "view_clk", a0Var.Ni(x17));
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(peVar.f280113d.x())) {
            bi4.w0 w0Var = (bi4.w0) i95.n0.c(bi4.w0.class);
            android.app.Activity context = peVar.f280113d.g();
            java.lang.String x18 = peVar.f280113d.x();
            ki4.x xVar = (ki4.x) w0Var;
            xVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            hi4.m.f363088f.d(x18, 160);
            mj4.w Ai = xVar.Ai(x18);
            if (Ai != null) {
                if (ai4.m0.f86706a.M(x18) != null) {
                    ki4.x.wi(xVar, new jz5.l(Ai.f76642xbed8694c, Ai.f76648xdde069b), null, null, false, 8, null);
                    ki4.g0.f389665a.b(context, Ai.f76648xdde069b, "chat", null);
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe.m0(peVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
