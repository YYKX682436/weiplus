package df2;

/* loaded from: classes3.dex */
public final class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f312785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.hm f312786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f312787f;

    public rl(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, df2.hm hmVar, android.view.ViewGroup viewGroup) {
        this.f312785d = c19786x6a1e2862;
        this.f312786e = hmVar;
        this.f312787f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveHeatController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.hm hmVar = this.f312786e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = this.f312785d;
        if (info != null) {
            if (zl2.r4.f555483a.w1()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.z4 z4Var = ml2.z4.I1;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 2);
                zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c18;
                ml2.b4 b4Var = ml2.b4.T1;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", 2);
                ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
            }
            boolean U6 = hmVar.U6();
            android.view.ViewGroup viewGroup = this.f312787f;
            if (U6) {
                hmVar.W6(new df2.ql(viewGroup, info));
            } else {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
                xc2.y2 y2Var = xc2.y2.f534876a;
                xc2.p0 p0Var = new xc2.p0(info);
                p0Var.f534785n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(hmVar.f311868m, "jumpinfo is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
