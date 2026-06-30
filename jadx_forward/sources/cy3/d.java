package cy3;

/* loaded from: classes10.dex */
public final class d implements cy3.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f306292a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f306293b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f306294c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f306295d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f306296e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.C17242xd917d577 f306297f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f306298g;

    /* renamed from: h, reason: collision with root package name */
    public vx3.i f306299h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f306300i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f306301j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f306302k;

    public d(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f306292a = rootView;
        android.content.Context context = rootView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f306298g = context;
        this.f306300i = new p012xc85e97e9.p093xedfae76a.j0();
        this.f306293b = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.c8n);
        this.f306294c = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) rootView.findViewById(com.p314xaae8f345.mm.R.id.m4s);
        this.f306295d = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.m4p);
        this.f306296e = rootView.findViewById(com.p314xaae8f345.mm.R.id.m4q);
        this.f306297f = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.C17242xd917d577) rootView.findViewById(com.p314xaae8f345.mm.R.id.m4x);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.m5p);
        this.f306301j = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new cy3.a(this));
        }
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.m5q);
        this.f306302k = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new cy3.b(this));
        }
    }

    public final void b(boolean z17) {
        vx3.i iVar = this.f306299h;
        if (iVar != null && iVar.f522830n) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = this.f306294c;
        if (z17) {
            if (!(c16077xb54fe366 != null && c16077xb54fe366.r())) {
                if (c16077xb54fe366 != null) {
                    c16077xb54fe366.m64938x75cc54fa(mx3.f0.f(true));
                }
                if (c16077xb54fe366 != null) {
                    c16077xb54fe366.x();
                }
            }
        } else if (c16077xb54fe366 != null) {
            android.content.Context context = this.f306298g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
            android.graphics.drawable.Drawable mutate = i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80264x8f433126).mutate();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate, "mutate(...)");
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d17), android.graphics.Color.red(d17), android.graphics.Color.green(d17), android.graphics.Color.blue(d17)), android.graphics.PorterDuff.Mode.SRC_ATOP));
            mutate.setAlpha(android.graphics.Color.alpha(d17));
            c16077xb54fe366.setImageDrawable(mutate);
        }
        android.view.View view = this.f306296e;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "responseRingtonePlay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "responseRingtonePlay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
