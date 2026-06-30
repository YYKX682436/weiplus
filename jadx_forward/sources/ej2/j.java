package ej2;

/* loaded from: classes10.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f334831a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f334832b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f334833c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f334834d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f334835e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f334836f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f334837g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f334838h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f334839i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f334840j;

    /* renamed from: k, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f334841k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f334842l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f334843m;

    /* renamed from: n, reason: collision with root package name */
    public yh2.k f334844n;

    public j(android.view.View root, gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f334831a = root;
        this.f334832b = liveData;
        this.f334833c = "FinderLiveVisitorApplySearchWidget";
        new java.util.HashMap();
        this.f334842l = new java.util.ArrayList();
        this.f334843m = new java.util.ArrayList();
        ej2.n nVar = (ej2.n) this;
        android.view.View view = nVar.f334831a;
        nVar.f334834d = view.findViewById(com.p314xaae8f345.mm.R.id.fkv);
        nVar.c();
        android.view.View view2 = nVar.f334834d;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = ((com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y * 2) / 3) + com.p314xaae8f345.mm.ui.zk.a(view.getContext(), 68);
        }
        android.view.View view3 = nVar.f334834d;
        if (view3 != null) {
            view3.setOnClickListener(ej2.m.f334850d);
        }
        android.view.View view4 = nVar.f334834d;
        nVar.f334835e = view4 != null ? (android.widget.EditText) view4.findViewById(com.p314xaae8f345.mm.R.id.eko) : null;
        android.view.View view5 = nVar.f334834d;
        nVar.f334836f = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.f4z) : null;
        android.view.View view6 = nVar.f334834d;
        nVar.f334837g = view6 != null ? view6.findViewById(com.p314xaae8f345.mm.R.id.ekq) : null;
        android.view.View view7 = nVar.f334834d;
        nVar.f334838h = view7 != null ? view7.findViewById(com.p314xaae8f345.mm.R.id.ekp) : null;
        android.view.View view8 = nVar.f334834d;
        nVar.f334839i = view8 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view8.findViewById(com.p314xaae8f345.mm.R.id.ekg) : null;
        android.view.View view9 = nVar.f334834d;
        nVar.f334840j = view9 != null ? (android.widget.TextView) view9.findViewById(com.p314xaae8f345.mm.R.id.ekn) : null;
        android.view.View view10 = nVar.f334834d;
        nVar.f334841k = view10 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view10.findViewById(com.p314xaae8f345.mm.R.id.fq9) : null;
        android.widget.TextView textView = this.f334840j;
        if (textView != null) {
            textView.setOnClickListener(new ej2.b(this));
        }
        android.view.View view11 = this.f334836f;
        if (view11 != null) {
            view11.setOnClickListener(new ej2.c(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f334839i;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new ej2.d(this));
        }
        android.widget.EditText editText = this.f334835e;
        if (editText != null) {
            editText.addTextChangedListener(new ej2.e(this));
        }
    }

    public final yh2.k a() {
        yh2.k kVar = this.f334844n;
        if (kVar != null) {
            return kVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchAdapter");
        throw null;
    }

    public final void b() {
        android.widget.EditText editText = this.f334835e;
        android.view.View view = this.f334834d;
        if (editText == null || view == null) {
            return;
        }
        this.f334843m.clear();
        a().m8146xced61ae5();
        android.widget.EditText editText2 = this.f334835e;
        if (editText2 != null) {
            editText2.setText("");
            editText2.clearFocus();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(editText2);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(editText);
        android.view.View view2 = ((ej2.n) this).f334834d;
        if (view2 != null) {
            float f17 = com.p314xaae8f345.mm.ui.bl.b(view2.getContext()).x;
            view2.animate().translationX(f17).setListener(new ej2.k(view2, f17)).setDuration(200L).start();
        }
    }

    public final void c() {
        android.view.View view = this.f334834d;
        if (view != null) {
            view.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(this.f334831a.getContext()).x);
        }
        android.view.View view2 = this.f334834d;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget", "resetSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget", "resetSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
