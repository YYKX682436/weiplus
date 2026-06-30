package pk2;

/* loaded from: classes3.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.w0 f437831e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, pk2.w0 w0Var) {
        this.f437830d = e3Var;
        this.f437831e = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pk2.g8 g8Var;
        df2.v0 v0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorEditCoverOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f437830d.h();
        pk2.d9 d9Var = this.f437831e.f445960a.f437615f;
        if (d9Var != null && (g8Var = d9Var.f437191a) != null && (v0Var = (df2.v0) ((pk2.k9) g8Var).f437457a.m56789x25fe639c(df2.v0.class)) != null) {
            v0Var.f7("");
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 6);
        jSONObject.put("type", 1);
        jSONObject.put("sub_element", 7);
        jSONObject.put("sub_type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditCoverOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
