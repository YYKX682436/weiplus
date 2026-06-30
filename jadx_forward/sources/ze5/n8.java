package ze5;

/* loaded from: classes9.dex */
public final class n8 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f553643b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f553644c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f553645d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f553646e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f553647f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f553648g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f553649h;

    public final ze5.n8 a(android.view.View view, com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo80050xaf65a0fc(view);
        this.f553643b = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.a1l);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ott);
        this.f39501x4004bbf3 = findViewById instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) findViewById : null;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.bqx);
        this.f39499x8eebed7e = findViewById2 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById2 : null;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f39502xce2b2f8d = findViewById3 instanceof android.widget.TextView ? (android.widget.TextView) findViewById3 : null;
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39492x5b9aa3a3 = findViewById4 instanceof android.widget.CheckBox ? (android.widget.CheckBox) findViewById4 : null;
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f553645d = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.v_s);
        this.f553646e = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567540ui5);
        this.f553647f = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567531ui2);
        this.f553648g = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ve7);
        this.f553649h = view.findViewById(com.p314xaae8f345.mm.R.id.bjy);
        android.widget.FrameLayout frameLayout = this.f553643b;
        if (frameLayout != null && abstractC11172x705e5905 != null) {
            this.f553644c = abstractC11172x705e5905;
            frameLayout.addView(abstractC11172x705e5905);
        }
        return this;
    }
}
