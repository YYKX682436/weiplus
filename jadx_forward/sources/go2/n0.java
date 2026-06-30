package go2;

/* loaded from: classes8.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f355557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355559h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355560i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355562n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355563o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f355564p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f355565q;

    public n0(go2.a1 a1Var, android.widget.TextView textView, android.widget.Button button, android.view.View view, android.widget.TextView textView2, android.widget.TextView textView3, android.view.View view2, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.CheckBox checkBox) {
        this.f355555d = a1Var;
        this.f355556e = textView;
        this.f355557f = button;
        this.f355558g = view;
        this.f355559h = textView2;
        this.f355560i = textView3;
        this.f355561m = view2;
        this.f355562n = textView4;
        this.f355563o = textView5;
        this.f355564p = textView6;
        this.f355565q = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.a1 a1Var = this.f355555d;
        a1Var.f355480d = false;
        this.f355556e.setVisibility(4);
        this.f355557f.setText(a1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.em_));
        android.view.View payMonthlyLayout = this.f355558g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payMonthlyLayout, "$payMonthlyLayout");
        android.widget.TextView payMonthlyType = this.f355559h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payMonthlyType, "$payMonthlyType");
        android.widget.TextView payMonthlyPrice = this.f355560i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payMonthlyPrice, "$payMonthlyPrice");
        a1Var.T6(false, payMonthlyLayout, payMonthlyType, payMonthlyPrice);
        android.view.View payOneLayout = this.f355561m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payOneLayout, "$payOneLayout");
        android.widget.TextView payOneType = this.f355562n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payOneType, "$payOneType");
        android.widget.TextView payOnePrice = this.f355563o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payOnePrice, "$payOnePrice");
        a1Var.T6(true, payOneLayout, payOneType, payOnePrice);
        android.widget.TextView agreement = this.f355564p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(agreement, "$agreement");
        android.widget.CheckBox checkbox = this.f355565q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(checkbox, "$checkbox");
        a1Var.S6(agreement, checkbox, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
