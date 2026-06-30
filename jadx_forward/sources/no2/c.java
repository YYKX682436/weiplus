package no2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f420274a;

    /* renamed from: b, reason: collision with root package name */
    public final ir2.a1 f420275b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f420276c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f420277d;

    public c(int i17, ir2.a1 a1Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f420274a = i17;
        this.f420275b = a1Var;
        this.f420276c = activity;
        this.f420277d = c22801x87cbdc00;
    }

    public final void a(java.util.List data, java.util.List local, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(local, "local");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            linkedList.add(java.lang.Long.valueOf(((so2.i) it.next()).f491944d.f66124x65f321b));
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f420276c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        pq5.g l17 = new db2.t(linkedList, i18, nyVar != null ? nyVar.V6() : null).l();
        l17.f(context);
        l17.K(new no2.b(this, i17, local));
    }
}
