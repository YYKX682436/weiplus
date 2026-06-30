package cu3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f303999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f304000b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f304001c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f304002d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f304003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f304004f;

    public d(android.view.View effectLayout, int i17, java.lang.String effectName, yz5.l onSelect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effectLayout, "effectLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effectName, "effectName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelect, "onSelect");
        this.f303999a = effectLayout;
        this.f304000b = i17;
        this.f304001c = onSelect;
        android.view.View findViewById = effectLayout.findViewById(com.p314xaae8f345.mm.R.id.kv6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f304002d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = effectLayout.findViewById(com.p314xaae8f345.mm.R.id.kv8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f304003e = findViewById2;
        android.view.View findViewById3 = effectLayout.findViewById(com.p314xaae8f345.mm.R.id.kv9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        effectLayout.setOnClickListener(new cu3.c(this));
        ((android.widget.TextView) findViewById3).setText(effectName);
    }

    public final void a() {
        android.view.View view = this.f304003e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f304001c.mo146xb9724478(java.lang.Integer.valueOf(this.f304000b));
    }
}
