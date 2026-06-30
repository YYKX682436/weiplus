package zk3;

/* loaded from: classes8.dex */
public final class p implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555020a;

    public p(zk3.g0 g0Var) {
        this.f555020a = g0Var;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 data) {
        java.util.Iterator it;
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.Iterator it6 = data.f374689i.iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.x0 x0Var = (in5.x0) next;
            if (x0Var.f374691a instanceof uk3.a) {
                zk3.g0 g0Var = this.f555020a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = g0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).Y6()) {
                    in5.c cVar = x0Var.f374691a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.minusscreen.data.RVMultiTaskData");
                    nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                    android.content.Context context = recyclerView.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = ((uk3.a) cVar).f510057d;
                    long a76 = g0Var.a7(c16601x7ed0e40c.f66791xc8a07680, c16601x7ed0e40c.f66793x2262335f);
                    if (kr4Var != null) {
                        java.lang.String m75945x2fec8307 = kr4Var.m75945x2fec8307(4);
                        int i19 = c16601x7ed0e40c.f66793x2262335f;
                        if (i19 == 2 || i19 == 26) {
                            r45.k97 k97Var = new r45.k97();
                            try {
                                k97Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
                            } catch (java.lang.Exception unused) {
                            }
                            m75945x2fec8307 = k97Var.m75945x2fec8307(1);
                        }
                        java.lang.String str = m75945x2fec8307;
                        nk3.f fVar = nk3.f.f419574a;
                        java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
                        nk3.f.f419575b.put(field_id, java.lang.Long.valueOf(c01.id.c()));
                        it = it6;
                        j17 = a76;
                        fVar.c(c16601x7ed0e40c, a76, 1L, str, kr4Var);
                    } else {
                        it = it6;
                        j17 = a76;
                    }
                    zk3.h hVar = g0Var.f554992q;
                    if (hVar != null) {
                        pm0.v.X(new yk3.f((yk3.i) hVar, c16601x7ed0e40c, (int) j17));
                    }
                    it6 = it;
                    i17 = i18;
                }
            }
            it = it6;
            it6 = it;
            i17 = i18;
        }
    }
}
