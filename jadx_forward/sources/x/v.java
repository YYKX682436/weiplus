package x;

/* loaded from: classes16.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lm f532391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f532392e;

    public v(df2.lm lmVar, int i17) {
        this.f532391d = lmVar;
        this.f532392e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveHonorVisitorGuideController$realShowCard$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.lm lmVar = this.f532391d;
        lmVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var2.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var2.f391656d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(lmVar.O6(), lmVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, new x.r(h0Var));
        ek2.r1 r1Var = new ek2.r1(((mm2.e1) lmVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) lmVar.m56788xbba4bfc0(mm2.e1.class)).f410516m, 1, ek2.r1.f335057u.e(true));
        pq5.g l17 = r1Var.l();
        l17.K(new x.q(lmVar, h0Var2));
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) lmVar.O6());
        h0Var.f391656d = r1Var;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 4);
        jSONObject.put("click_soure", this.f532392e);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.S1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveHonorVisitorGuideController$realShowCard$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
