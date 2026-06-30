package zk3;

/* loaded from: classes8.dex */
public final class o implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555018d;

    public o(zk3.g0 g0Var) {
        this.f555018d = g0Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View findViewById;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        android.view.View view2;
        r45.er4 er4Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        zk3.g0 g0Var = this.f555018d;
        g0Var.getClass();
        boolean z17 = java.lang.System.currentTimeMillis() - g0Var.f554983e < g0Var.f554982d;
        g0Var.f554983e = java.lang.System.currentTimeMillis();
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "onItemClick: double click check");
            return;
        }
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            java.util.ArrayList arrayList = g0Var.f554985g;
            if (a07 < arrayList.size()) {
                java.lang.Object obj = arrayList.get(a07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                uk3.a aVar = (uk3.a) obj;
                if (arrayList.size() > 2) {
                    findViewById = g0Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jv9);
                } else {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = g0Var.f554987i;
                    findViewById = (c22849x81a93d25 == null || (p07 = c22849x81a93d25.p0(1)) == null || (view2 = p07.f3639x46306858) == null) ? null : view2.findViewById(com.p314xaae8f345.mm.R.id.jvd);
                }
                android.view.View view3 = findViewById;
                zk3.h hVar = g0Var.f554992q;
                if (hVar != null) {
                    ((yk3.i) hVar).h(view3, view, a07, aVar.f510057d, true);
                }
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                if (kr4Var == null || (er4Var = (r45.er4) kr4Var.m75936x14adae67(6)) == null) {
                    return;
                }
                java.lang.String str = aVar.f510057d.f66791xc8a07680;
                java.lang.String m75945x2fec8307 = er4Var.m75945x2fec8307(2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = aVar.f510057d;
                int i18 = c16601x7ed0e40c.f66793x2262335f;
                if (i18 == 2 || i18 == 26) {
                    r45.k97 k97Var = new r45.k97();
                    try {
                        k97Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
                    } catch (java.lang.Exception unused) {
                    }
                    m75945x2fec8307 = k97Var.m75945x2fec8307(1);
                }
                nk3.f.f419574a.c(aVar.f510057d, a07, 2L, m75945x2fec8307, kr4Var);
            }
        }
    }
}
