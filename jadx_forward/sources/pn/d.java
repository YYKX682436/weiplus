package pn;

/* loaded from: classes11.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn.m f438450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o65.d f438451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f438452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f438453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f438454h;

    public d(pn.m mVar, o65.d dVar, java.util.List list, java.util.List list2, java.util.List list3) {
        this.f438450d = mVar;
        this.f438451e = dVar;
        this.f438452f = list;
        this.f438453g = list2;
        this.f438454h = list3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        pn.m mVar = this.f438450d;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(mVar.f438464b)) {
            java.lang.String str = this.f438451e.f424751i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getChatroomName(...)");
            mVar.e(str, this.f438452f);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f438453g);
        arrayList.addAll(this.f438454h);
        mVar.getClass();
        fd0.e eVar = (fd0.e) ((gd0.e) i95.n0.c(gd0.e.class));
        java.lang.String str2 = mVar.f438464b;
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a a17 = eVar.wi(str2).a(str2, arrayList, 0, mVar.f438466d);
        a17.f273779b = new pn.h(mVar);
        a17.f273780c = new pn.i(mVar);
        a17.c(mVar.f438463a, mVar.c(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), mVar.c(com.p314xaae8f345.mm.R.C30867xcad56011.i4z), true, true, new pn.j(a17));
        ((y04.e) ((vg3.j4) i95.n0.c(vg3.j4.class))).wi(1);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Bi(mVar.f438467e, mVar.f438464b);
    }
}
