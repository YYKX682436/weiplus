package hw2;

/* loaded from: classes5.dex */
public final class g0 implements yt3.r2, hw2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f367063d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f367064e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f367065f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f367066g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f367067h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f367068i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f367069m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f367070n;

    public g0(android.view.ViewGroup layout, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f367063d = layout;
        this.f367064e = status;
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.loe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f367065f = findViewById;
        android.view.View findViewById2 = layout.findViewById(com.p314xaae8f345.mm.R.id.log);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = layout.findViewById(com.p314xaae8f345.mm.R.id.loi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f367066g = textView;
        android.view.View findViewById4 = layout.findViewById(com.p314xaae8f345.mm.R.id.loh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f367067h = findViewById4;
        android.view.View findViewById5 = layout.findViewById(com.p314xaae8f345.mm.R.id.lof);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f367068i = (android.widget.TextView) findViewById5;
        this.f367070n = true;
        findViewById.setOnClickListener(new hw2.f0(this));
        textView.setSelected(true);
        b(false);
    }

    public final void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f367069m;
        android.widget.TextView textView = this.f367068i;
        if (c16997xb0aa383a == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f367063d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1i, java.lang.Integer.valueOf(a06.d.b(((float) j17) / 1000.0f))));
        }
    }

    public final void b(boolean z17) {
        if (this.f367070n != z17) {
            this.f367070n = z17;
            android.view.View view = this.f367067h;
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "enableAddMusic", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "enableAddMusic", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f367069m;
        android.widget.TextView textView = this.f367066g;
        if (c16997xb0aa383a == null) {
            textView.setText(i65.a.r(this.f367063d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f1j));
            a(60000L);
        } else {
            java.util.ArrayList arrayList = c16997xb0aa383a != null ? c16997xb0aa383a.f237247h : null;
            if (arrayList == null || arrayList.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = this.f367069m;
                if (c16997xb0aa383a2 != null) {
                    r2 = c16997xb0aa383a2.f237256t;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a3 = this.f367069m;
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c16997xb0aa383a3 != null ? c16997xb0aa383a3.f237247h : null, ",");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a4 = this.f367069m;
                sb6.append(c16997xb0aa383a4 != null ? c16997xb0aa383a4.f237256t : null);
                sb6.append(" - ");
                sb6.append(c17);
                r2 = sb6.toString();
            }
            textView.setText(r2);
        }
        textView.requestLayout();
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View view = this.f367065f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            c();
        }
    }
}
