package in5;

/* loaded from: classes10.dex */
public final class d1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f374554d;

    public d1(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        this.f374554d = c22848x6ddd90cf;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f374554d;
        if (c22848x6ddd90cf.f295252x) {
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("RecyclerViewAdapterEx", sb6.toString(), new java.lang.Object[0]);
            c22848x6ddd90cf.m8146xced61ae5();
            c22848x6ddd90cf.f295252x = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onViewDetachedFromWindow, clear scopeSet:");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f374554d;
        sb6.append(c22848x6ddd90cf.f295251w.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", sb6.toString());
        if (c22848x6ddd90cf.f295251w.size() > 0) {
            c22848x6ddd90cf.f295252x = true;
        }
        java.util.Iterator it = c22848x6ddd90cf.f295251w.entrySet().iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.z0.e((p3325xe03a0797.p3326xc267989b.y0) ((java.util.Map.Entry) it.next()).getKey(), null, 1, null);
        }
        c22848x6ddd90cf.f295251w.clear();
    }
}
