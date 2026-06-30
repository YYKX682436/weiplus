package vk2;

/* loaded from: classes3.dex */
public final class b implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vk2.h f519289d;

    public b(vk2.h hVar) {
        this.f519289d = hVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vk2.h hVar = this.f519289d;
        int i18 = hVar.f519301q;
        java.util.ArrayList arrayList = hVar.f519299o;
        arrayList.size();
        hVar.a();
        if (hVar.f519301q < arrayList.size() && i17 < arrayList.size()) {
            rk2.r.f478018a.a(5, ((sk2.a) arrayList.get(i17)).f490484d.f510055b.f460807e, ((sk2.a) arrayList.get(hVar.f519301q)).f490484d.f510055b.f460807e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) hVar.f519295h;
        zzVar.getClass();
        rk2.q w17 = zzVar.w1();
        int size = (w17.f478005c.size() * 10000) + i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "notifySelected position: " + i17 + " pos: " + size);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d c14259xb044a81d = w17.f478004b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(size));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c14259xb044a81d, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "notifySelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        c14259xb044a81d.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c14259xb044a81d, "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "notifySelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        w17.f478017o = true;
    }
}
