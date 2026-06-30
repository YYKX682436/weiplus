package ix3;

/* loaded from: classes.dex */
public final class h3 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.j3 f376964d;

    public h3(ix3.j3 j3Var) {
        this.f376964d = j3Var;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        ex3.e item = (ex3.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        event.getRawX();
        this.f376964d.getClass();
        event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        ex3.e dataItem = (ex3.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        ix3.j3 j3Var = this.f376964d;
        r45.dp5 dp5Var = dataItem.f338742f;
        int i18 = dataItem.f338741e;
        if (i18 != 3) {
            if (i18 == 2) {
                j3Var.getClass();
                q55.e eVar = (q55.e) ix3.y0.f377145e.get(dp5Var.m75945x2fec8307(0));
                if (eVar != null) {
                    int m17 = bm5.o1.f104252a.m(eVar);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) j3Var.m158354x19263085(), 2, false);
                    k0Var.f293405n = new ix3.c3(k0Var, m17);
                    k0Var.f293414s = new ix3.d3(eVar, dataItem, j3Var);
                    k0Var.v();
                    return;
                }
                return;
            }
            return;
        }
        j3Var.getClass();
        java.lang.String m75945x2fec8307 = dp5Var.m75945x2fec8307(0);
        java.util.List f07 = m75945x2fec8307 != null ? r26.n0.f0(m75945x2fec8307, new java.lang.String[]{"_"}, false, 0, 6, null) : null;
        java.util.LinkedList m75941xfb821914 = dp5Var.m75941xfb821914(3);
        if (!(m75941xfb821914.size() > 0)) {
            m75941xfb821914 = null;
        }
        if (m75941xfb821914 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) j3Var.m158354x19263085(), 2, false);
            k0Var2.f293405n = new ix3.e3(m75941xfb821914, dp5Var, j3Var, dataItem, k0Var2);
            k0Var2.f293414s = new ix3.f3(dp5Var, f07, dataItem, j3Var);
            k0Var2.v();
            return;
        }
        vw3.q5 q5Var = new vw3.q5(j3Var.m158354x19263085(), dp5Var.m75945x2fec8307(1), dataItem.f338743g, new ix3.g3(f07, dataItem, j3Var, dp5Var));
        q5Var.show();
        android.view.Window window = q5Var.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
