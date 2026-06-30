package mx0;

/* loaded from: classes5.dex */
public final class l extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f413640g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f413641h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f413642i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f413643m;

    /* renamed from: n, reason: collision with root package name */
    public final yo0.i f413644n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f413645o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f413646p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f413647q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View favoriteView, yx0.b8 templateCorePlugin) {
        super(favoriteView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favoriteView, "favoriteView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateCorePlugin, "templateCorePlugin");
        jz5.i iVar = jz5.i.f384364f;
        jz5.g a17 = jz5.h.a(iVar, new mx0.g(this));
        jz5.g a18 = jz5.h.a(iVar, new mx0.f(this));
        this.f413640g = a18;
        this.f413641h = jz5.h.a(iVar, new mx0.e(this));
        jz5.g a19 = jz5.h.a(iVar, new mx0.h(this));
        jz5.g a27 = jz5.h.a(iVar, new mx0.j(this));
        this.f413642i = a27;
        jz5.g a28 = jz5.h.a(iVar, new mx0.i(this));
        this.f413643m = a28;
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f413644n = fVar.a();
        this.f413646p = "";
        java.lang.Object mo141623x754a37bb = a27.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb).m82037xa10c26f6(false);
        java.lang.Object mo141623x754a37bb2 = a19.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.view.View) mo141623x754a37bb2).setOnClickListener(new mx0.d(this, templateCorePlugin));
        mo9067x901b6914(8);
        java.lang.Object mo141623x754a37bb3 = a17.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) mo141623x754a37bb3);
        java.lang.Object mo141623x754a37bb4 = a18.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) mo141623x754a37bb4);
        java.lang.Object mo141623x754a37bb5 = a28.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) mo141623x754a37bb5);
    }

    public final void b() {
        if (this.f413349f) {
            android.view.View view = this.f413347d;
            view.setTag(java.lang.Integer.valueOf(view.getVisibility()));
            android.view.View view2 = this.f413347d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "clearVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "clearVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void c() {
        if (this.f413349f) {
            android.view.View view = this.f413347d;
            java.lang.Object tag = view.getTag();
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            if (num != null) {
                int intValue = num.intValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "resumeVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "resumeVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f413347d.setTag(null);
            }
        }
    }

    public final void d(float f17) {
        android.view.View view = this.f413347d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void e(boolean z17) {
        android.view.View view = this.f413347d;
        view.setEnabled(z17);
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(view, new mx0.k(z17));
        android.view.View view2 = this.f413347d;
        float f17 = z17 ? 1.0f : 0.7f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void f() {
        boolean z17 = this.f413645o;
        jz5.g gVar = this.f413643m;
        jz5.g gVar2 = this.f413642i;
        if (z17) {
            java.lang.Object mo141623x754a37bb = gVar2.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwl);
            java.lang.Object mo141623x754a37bb2 = gVar.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb2).setText(com.p314xaae8f345.mm.R.C30867xcad56011.n27);
            return;
        }
        java.lang.Object mo141623x754a37bb3 = gVar2.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb3).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cwm);
        java.lang.Object mo141623x754a37bb4 = gVar.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb4).setText(com.p314xaae8f345.mm.R.C30867xcad56011.n28);
    }
}
