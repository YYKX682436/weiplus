package f93;

/* loaded from: classes11.dex */
public final class v4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.b5 f342023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.u4 f342024e;

    public v4(f93.b5 b5Var, f93.u4 u4Var) {
        this.f342023d = b5Var;
        this.f342024e = u4Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int c17;
        f93.u4 u4Var = this.f342024e;
        if (editable == null) {
            android.widget.ImageView imageView = u4Var.f342013b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteBtn");
                throw null;
            }
        }
        java.lang.String obj = editable.toString();
        android.widget.ImageView imageView2 = u4Var.f342013b;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteBtn");
            throw null;
        }
        imageView2.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) ? 8 : 0);
        u4Var.a().removeTextChangedListener(this);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj);
        f93.b5 b5Var = this.f342023d;
        if (!K0) {
            int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(obj);
            com.p314xaae8f345.mm.ui.p2740x696c9db.v4.d(b5Var.E, obj);
            int i17 = b5Var.E;
            if (f17 > i17 && (c17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.c(i17, obj)) > 0 && c17 < i17 && c17 < obj.length()) {
                java.lang.String substring = obj.substring(0, c17 + 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                u4Var.a().setText(substring);
                u4Var.a().mo81549xf579a34a(u4Var.a().getText().length());
                com.p314xaae8f345.mm.ui.jk.f290544a.a();
                android.content.Context context = u4Var.a().getContext();
                android.content.Context context2 = u4Var.a().getContext();
                dp.a.m125854x26a183b(context, context2 != null ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9t, java.lang.Integer.valueOf(i17 / 2)) : null, 0).show();
            }
        }
        int i18 = f93.b5.I;
        b5Var.getClass();
        u4Var.a().addTextChangedListener(this);
        u4Var.a().mo81549xf579a34a(u4Var.a().getText().length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        f93.a5 a5Var = this.f342023d.G;
        if (a5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textListener");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = ((f93.x) a5Var).f342032a;
        activityC16165x57283aea.f224728h = valueOf;
        activityC16165x57283aea.m78501x43e00957(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(valueOf));
    }
}
