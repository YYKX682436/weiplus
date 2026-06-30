package x;

/* loaded from: classes16.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lm f532389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f532390e;

    public u(df2.lm lmVar, int i17) {
        this.f532389d = lmVar;
        this.f532390e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveHonorVisitorGuideController$realShowCard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f532389d.Z6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 5);
        jSONObject.put("click_soure", this.f532390e);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.S1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveHonorVisitorGuideController$realShowCard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
