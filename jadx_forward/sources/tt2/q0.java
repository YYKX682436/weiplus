package tt2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503518f;

    public q0(tt2.e1 e1Var, ut2.s3 s3Var, int i17) {
        this.f503516d = e1Var;
        this.f503517e = s3Var;
        this.f503518f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.y23 y23Var;
        r45.rt3 rt3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt2.e1 e1Var = this.f503516d;
        e1Var.getClass();
        android.content.Context context = e1Var.f503413h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.t(false);
        int i17 = this.f503518f;
        so2.j5 P = e1Var.P(i17);
        cm2.m0 m0Var = P instanceof cm2.m0 ? (cm2.m0) P : null;
        k0Var.f293405n = new tt2.s0(e1Var, (m0Var == null || (y23Var = m0Var.f124901v) == null || (rt3Var = (r45.rt3) y23Var.m75936x14adae67(69)) == null || !rt3Var.m75933x41a8a7f2(0)) ? false : true, m0Var);
        k0Var.f293414s = new tt2.t0(e1Var, this.f503517e, i17, m0Var);
        k0Var.q(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nur), 17);
        k0Var.v();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.t2[] t2VarArr = ml2.t2.f409547d;
        jSONObject.put("type", 35);
        jSONObject.put("productid", m0Var != null ? java.lang.Long.valueOf(m0Var.f124902w) : "");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
