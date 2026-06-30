package sj3;

/* loaded from: classes13.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f490330a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f490331b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f490332c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f490333d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f490334e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f490335f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f490336g;

    public x1(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f490330a = rootView;
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.jw7);
        this.f490334e = findViewById;
        if (findViewById != null) {
            findViewById.setClipToOutline(true);
        }
        if (findViewById != null) {
            findViewById.setOutlineProvider(new sj3.f5(b17));
        }
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.pm8);
        this.f490336g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setClipToOutline(true);
        }
        if (findViewById2 != null) {
            findViewById2.setOutlineProvider(new sj3.f5(b17));
        }
        this.f490331b = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jxh);
        this.f490332c = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jxi);
        android.content.Context context = rootView.getContext();
        this.f490333d = context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.jwi);
        this.f490335f = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79543xa8cb7202, android.graphics.Color.parseColor("#07C160")));
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#07C160"));
        }
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setVisibility(0);
    }
}
