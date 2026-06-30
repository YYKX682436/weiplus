package go2;

/* loaded from: classes8.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f355545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355547h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355548i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355549m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355550n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355551o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355552p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f355553q;

    public m0(go2.a1 a1Var, android.widget.TextView textView, android.widget.Button button, android.view.View view, android.widget.TextView textView2, android.widget.TextView textView3, android.view.View view2, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.CheckBox checkBox) {
        this.f355543d = a1Var;
        this.f355544e = textView;
        this.f355545f = button;
        this.f355546g = view;
        this.f355547h = textView2;
        this.f355548i = textView3;
        this.f355549m = view2;
        this.f355550n = textView4;
        this.f355551o = textView5;
        this.f355552p = textView6;
        this.f355553q = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.a1 a1Var = this.f355543d;
        a1Var.f355480d = true;
        this.f355544e.setVisibility(0);
        this.f355545f.setText(a1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573438em2));
        android.view.View payMonthlyLayout = this.f355546g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payMonthlyLayout, "$payMonthlyLayout");
        android.widget.TextView payMonthlyType = this.f355547h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payMonthlyType, "$payMonthlyType");
        android.widget.TextView payMonthlyPrice = this.f355548i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payMonthlyPrice, "$payMonthlyPrice");
        a1Var.T6(true, payMonthlyLayout, payMonthlyType, payMonthlyPrice);
        android.view.View payOneLayout = this.f355549m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payOneLayout, "$payOneLayout");
        android.widget.TextView payOneType = this.f355550n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payOneType, "$payOneType");
        android.widget.TextView payOnePrice = this.f355551o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payOnePrice, "$payOnePrice");
        a1Var.T6(false, payOneLayout, payOneType, payOnePrice);
        android.widget.TextView agreement = this.f355552p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(agreement, "$agreement");
        android.widget.CheckBox checkbox = this.f355553q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(checkbox, "$checkbox");
        a1Var.S6(agreement, checkbox, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
