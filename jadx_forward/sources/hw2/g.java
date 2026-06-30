package hw2;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f367062d;

    public g(hw2.t tVar) {
        this.f367062d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hw2.t tVar = this.f367062d;
        if (!tVar.f367100o) {
            tVar.e().findViewById(com.p314xaae8f345.mm.R.id.epk).setOnClickListener(new hw2.l(tVar));
            android.view.KeyEvent.Callback findViewById = tVar.e().findViewById(com.p314xaae8f345.mm.R.id.ept);
            os5.p pVar = findViewById instanceof os5.p ? (os5.p) findViewById : null;
            android.view.KeyEvent.Callback findViewById2 = tVar.e().findViewById(com.p314xaae8f345.mm.R.id.epl);
            os5.o oVar = findViewById2 instanceof os5.o ? (os5.o) findViewById2 : null;
            if (pVar != null) {
                pVar.mo57264xb275c378(new hw2.m(oVar));
            }
            if (pVar != null) {
                pVar.mo57265x6ac5d62(new hw2.n(oVar, tVar));
            }
            if (pVar != null) {
                pVar.mo57266x76503a8f(tVar.f367102q);
            }
            if (oVar != null) {
                oVar.mo57256x3c3ee922(new hw2.o(tVar, pVar));
            }
            if (oVar != null) {
                oVar.mo57254x605d433d(new hw2.p(tVar, pVar));
            }
            if (oVar != null) {
                oVar.mo57257x11a7ff86(new hw2.q(tVar));
            }
            if (oVar != null) {
                oVar.mo57258xfcd9931b(hw2.r.f367083d);
            }
            if (oVar != null) {
                oVar.mo57255x78c13c81(new hw2.s(pVar, tVar, oVar));
            }
            if (oVar != null) {
                oVar.mo57253xd20a4aed((java.util.List) ((jz5.n) tVar.f367105t).mo141623x754a37bb());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = tVar.f367099n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17043x8103c103, "access$getSettingHolder$p(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103.k(c17043x8103c103, tVar.e(), null, 2, null);
            tVar.f367100o = true;
        }
        tVar.f367099n.m68236x76500a7f(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
