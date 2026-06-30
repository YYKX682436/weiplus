package ut2;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f512375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a56 f512376e;

    public c0(ut2.k0 k0Var, gk2.e eVar, r45.a56 a56Var) {
        this.f512375d = k0Var;
        this.f512376e = a56Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveCouponListEntranceViewHolder$setupVipItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.k0 k0Var = this.f512375d;
        k0Var.getClass();
        r45.a56 a56Var = this.f512376e;
        k91.z3 z3Var = a56Var.m75939xb282bd08(4) == 1 ? k91.z3.UNKNOWN : k91.z3.TRANSPARENT;
        l81.b1 b1Var = new l81.b1();
        b1Var.f398565k = 1177;
        b1Var.H = z3Var;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = k0Var.f512491b.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) a56Var.m75936x14adae67(6));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ac4Var.set(5, bool);
        ac4Var.set(7, bool);
        ((c61.p2) ybVar).Bi(context, ac4Var, b1Var, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408797s;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("commerceAction", 1076);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "live");
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var2 = (ml2.r0) c18;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("commerceAction", 1035);
        r45.c33 c33Var = (r45.c33) a56Var.m75936x14adae67(3);
        if (c33Var == null || (str = c33Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        jSONObject2.put("url", str);
        ml2.r0.hj(r0Var2, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveCouponListEntranceViewHolder$setupVipItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
