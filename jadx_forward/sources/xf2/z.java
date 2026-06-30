package xf2;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f535859d;

    public z(yz5.a aVar) {
        this.f535859d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$render$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f535859d.mo152xb9724478();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$render$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
