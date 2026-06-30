package in5;

/* loaded from: classes10.dex */
public final class p0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.q0 f374645d;

    public p0(in5.q0 q0Var) {
        this.f374645d = q0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        in5.q0 q0Var = this.f374645d;
        if (q0Var.f374650f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onViewAttachedToWindow-detachedFromWindow, id:");
            in5.d dVar = in5.d.f374552a;
            try {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getResourceEntryName(view.getId());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            } catch (java.lang.Exception unused) {
                str = "";
            }
            sb6.append(str);
            sb6.append(", parent:");
            sb6.append(dVar.a(view));
            sb6.append(", root:");
            sb6.append(dVar.b(view));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(q0Var.f374648d, sb6.toString(), new java.lang.Object[0]);
            q0Var.m8146xced61ae5();
            q0Var.f374650f = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        in5.q0 q0Var = this.f374645d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f374648d, "rvnotify-test-onViewDetachedFromWindow, clear scopeSet:" + q0Var.f374649e.size());
        if (q0Var.f374649e.size() > 0) {
            q0Var.f374650f = true;
        }
        java.util.Iterator it = q0Var.f374649e.iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.z0.e((p3325xe03a0797.p3326xc267989b.y0) it.next(), null, 1, null);
        }
        q0Var.f374649e.clear();
    }
}
