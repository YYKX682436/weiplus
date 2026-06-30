package xf2;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 f535831d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 abstractC14206xe2e594d5) {
        this.f535831d = abstractC14206xe2e594d5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 5);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 abstractC14206xe2e594d5 = this.f535831d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 = abstractC14206xe2e594d5.f193155h;
        if (abstractC14196xf9d9d703 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(abstractC14196xf9d9d703, null, null, new xf2.r(abstractC14206xe2e594d5, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
