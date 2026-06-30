package uo1;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f511098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f511099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f511100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f511101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f511102h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f511103i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f511104m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f511105n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, android.widget.TextView textView, android.app.Activity activity, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83) {
        super(0);
        this.f511098d = f0Var;
        this.f511099e = linearLayout;
        this.f511100f = viewOnClickListenerC22631x1cc07cc8;
        this.f511101g = g0Var;
        this.f511102h = textView;
        this.f511103i = activity;
        this.f511104m = viewOnClickListenerC22631x1cc07cc82;
        this.f511105n = viewOnClickListenerC22631x1cc07cc83;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f511098d;
        int i17 = f0Var.f391649d & 1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f511100f;
        android.widget.LinearLayout linearLayout = this.f511099e;
        if (i17 != 0) {
            linearLayout.setVisibility(0);
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
        } else {
            linearLayout.setVisibility(8);
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f511101g;
        long j17 = g0Var.f391654d;
        android.widget.TextView textView = this.f511102h;
        if (j17 > 0) {
            textView.setVisibility(0);
            textView.setText(this.f511103i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxx, fo1.r.a(g0Var.f391654d)));
        } else {
            textView.setVisibility(8);
        }
        this.f511104m.m81392x52cfa5c6((f0Var.f391649d & 2) != 0);
        this.f511105n.m81392x52cfa5c6((f0Var.f391649d & 4) != 0);
        return jz5.f0.f384359a;
    }
}
