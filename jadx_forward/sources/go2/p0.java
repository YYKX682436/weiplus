package go2;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f355578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f355580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355581g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f355582h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355583i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355584m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f355585n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355586o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f355587p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f355588q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f355589r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.l f355590s;

    public p0(int i17, go2.a1 a1Var, android.widget.CheckBox checkBox, android.view.View view, android.widget.Button button, android.view.View view2, android.view.View view3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i18, yz5.l lVar) {
        this.f355578d = i17;
        this.f355579e = a1Var;
        this.f355580f = checkBox;
        this.f355581g = view;
        this.f355582h = button;
        this.f355583i = view2;
        this.f355584m = view3;
        this.f355585n = y1Var;
        this.f355586o = str;
        this.f355587p = num;
        this.f355588q = num2;
        this.f355589r = i18;
        this.f355590s = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f355578d;
        go2.a1 a1Var = this.f355579e;
        if (i17 == 1) {
            db5.t7.m(a1Var.m80379x76847179(), a1Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573435m42));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!this.f355580f.isChecked()) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(a1Var.m158354x19263085().getApplicationContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559320bg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadAnimation, "loadAnimation(...)");
            this.f355581g.startAnimation(loadAnimation);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f355582h.setClickable(false);
        this.f355583i.setClickable(false);
        this.f355584m.setClickable(false);
        boolean z17 = a1Var.f355480d;
        this.f355585n.q();
        a1Var.f355483g = true;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new go2.o0(z17, this.f355579e, this.f355586o, this.f355587p, this.f355588q, this.f355589r, this.f355582h, this.f355583i, this.f355584m, this.f355590s, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
