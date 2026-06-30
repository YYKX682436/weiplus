package hx0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final hx0.b f367147a;

    /* renamed from: b, reason: collision with root package name */
    public final jx0.k f367148b;

    /* renamed from: c, reason: collision with root package name */
    public volatile hx0.c f367149c;

    public e(android.content.Context context, hx0.b exportListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportListener, "exportListener");
        this.f367147a = exportListener;
        jx0.k kVar = new jx0.k(context);
        kVar.b().setOnClickListener(new jx0.j(kVar, new hx0.d(this)));
        this.f367148b = kVar;
        this.f367149c = hx0.c.f367137d;
    }

    public final void a(hx0.c cVar) {
        if (this.f367149c == cVar) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExportManager", "exportState: " + this.f367149c + " -> " + cVar);
        this.f367149c = cVar;
        jx0.k kVar = this.f367148b;
        if (!kVar.f383916i || kVar.f383917m) {
            return;
        }
        c("state change");
    }

    public final void b(boolean z17) {
        jx0.k kVar = this.f367148b;
        android.view.View b17 = kVar.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "<get-cancel>(...)");
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = (android.view.View) ((jz5.n) kVar.f383913f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-cancelBg>(...)");
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean c(java.lang.String str) {
        boolean b17 = this.f367147a.b();
        java.util.Objects.toString(this.f367149c);
        if (!b17) {
            return false;
        }
        if (this.f367149c != hx0.c.f367140g && this.f367149c != hx0.c.f367138e && this.f367149c != hx0.c.f367141h) {
            return false;
        }
        a(hx0.c.f367142i);
        this.f367147a.a();
        return true;
    }

    public final void d(int i17) {
        jx0.k kVar = this.f367148b;
        if (kVar.isShowing() && kVar.b().isEnabled()) {
            ((android.widget.ProgressBar) ((jz5.n) kVar.f383914g).mo141623x754a37bb()).setProgress(i17);
            android.widget.TextView textView = (android.widget.TextView) ((jz5.n) kVar.f383915h).mo141623x754a37bb();
            java.lang.String r17 = i65.a.r(kVar.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.o8l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
            java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
        }
    }
}
