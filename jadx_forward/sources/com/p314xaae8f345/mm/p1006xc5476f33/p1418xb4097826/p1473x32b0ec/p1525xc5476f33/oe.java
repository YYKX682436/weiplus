package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class oe implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.SoftReference f195278d;

    public oe(java.lang.ref.SoftReference softReference) {
        this.f195278d = softReference;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar;
        java.lang.String content = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.ref.SoftReference softReference = this.f195278d;
        if (softReference != null && (mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) softReference.get()) != null) {
            fk2.k1 k1Var = new fk2.k1(((we2.s) mgVar.S0().a(we2.s.class)).f526788g.d());
            android.content.Context context = mgVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            bm2.h1 h1Var = new bm2.h1(mgVar.f195040t);
            java.lang.Object obj3 = mgVar.D.f103713m.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            k1Var.u(context, h1Var, (dk2.zf) obj3, intValue, true);
            android.view.View view = mgVar.f195040t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "doDescSticky", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "doDescSticky", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mgVar.C1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uf(intValue, mgVar));
        }
        return jz5.f0.f384359a;
    }
}
