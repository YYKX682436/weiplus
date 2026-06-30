package pk2;

/* loaded from: classes3.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f437675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437679i;

    public p3(r45.t62 t62Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, pk2.o9 o9Var, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2) {
        this.f437674d = t62Var;
        this.f437675e = c19786x6a1e2862;
        this.f437676f = o9Var;
        this.f437677g = q3Var;
        this.f437678h = view;
        this.f437679i = t62Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        r45.t62 t62Var = this.f437674d;
        java.util.LinkedList m75941xfb821914 = t62Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRecommend_city_list(...)");
        int i17 = 0;
        for (java.lang.Object obj : m75941xfb821914) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            java.util.LinkedList m75941xfb8219142 = t62Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getTranslate_recommend_city_list(...)");
            java.lang.String str = (java.lang.String) kz5.n0.a0(m75941xfb8219142, i17);
            if (str == null) {
                str = "";
            }
            arrayList2.add(new jz5.l(str, num));
            i17 = i18;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo = this.f437675e;
        r45.k74 m76504xa819f0c7 = jumpInfo.m76504xa819f0c7();
        if (m76504xa819f0c7 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.LinkedList<java.lang.Integer> m75941xfb8219143 = t62Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getRecommend_city_list(...)");
            for (java.lang.Integer num2 : m75941xfb8219143) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                jSONArray.put(num2.intValue());
            }
            jSONObject.put("area_ids", jSONArray);
            m76504xa819f0c7.set(2, jSONObject.toString());
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f437676f.f437611d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfo, "$jumpInfo");
        zy2.ta.g(e1Var, abstractActivityC21394xb3d2c0cf, jumpInfo, new pk2.o3(t62Var, this.f437677g, this.f437678h, this.f437679i), null, true, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
