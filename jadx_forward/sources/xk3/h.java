package xk3;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk3.i f536569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uk3.a f536570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f536571f;

    public h(xk3.i iVar, uk3.a aVar, in5.s0 s0Var) {
        this.f536569d = iVar;
        this.f536570e = aVar;
        this.f536571f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vk3.a aVar = this.f536569d.f536573f;
        if (aVar != null) {
            zk3.x xVar = (zk3.x) aVar;
            in5.s0 holder = this.f536571f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            uk3.a aVar2 = this.f536570e;
            if (aVar2 != null && (c16601x7ed0e40c = aVar2.f510057d) != null) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.We((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) c17, c16601x7ed0e40c.f66791xc8a07680, c16601x7ed0e40c.f66793x2262335f, false, 4, null);
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                zk3.g0 g0Var = xVar.f555055a;
                if (kr4Var != null) {
                    long a76 = g0Var.a7(c16601x7ed0e40c.f66791xc8a07680, c16601x7ed0e40c.f66793x2262335f);
                    java.lang.String m75945x2fec83072 = kr4Var.m75945x2fec8307(4);
                    int i17 = c16601x7ed0e40c.f66793x2262335f;
                    if (i17 == 2 || i17 == 26) {
                        r45.k97 k97Var = new r45.k97();
                        try {
                            k97Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
                        } catch (java.lang.Exception unused) {
                        }
                        m75945x2fec8307 = k97Var.m75945x2fec8307(1);
                    } else {
                        m75945x2fec8307 = m75945x2fec83072;
                    }
                    nk3.f.f419574a.c(aVar2.f510057d, a76, 3L, m75945x2fec8307, kr4Var);
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di()) {
                    android.app.Activity m80379x76847179 = g0Var.m80379x76847179();
                    int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
                    e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.o9v);
                    e4Var.c();
                }
            }
            if (holder.m8183xf806b362() <= 1 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di()) {
                i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.Ff((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) c18, 6, null, 0, 6, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = aVar2 != null ? aVar2.f510057d : null;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) j0Var).getClass();
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231977x.iterator();
            while (it.hasNext()) {
                ((jk3.d) it.next()).a(1, c16601x7ed0e40c2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
