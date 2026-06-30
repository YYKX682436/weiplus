package aa2;

/* loaded from: classes2.dex */
public final class j extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final r45.r03 f2504c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.e21 f2505d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f2506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.r03 r03Var, androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f2504c = r03Var;
        this.f2505d = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
    }

    public final r45.ht0 A() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.CharSequence text;
        r45.h21 h21Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.ht0 ht0Var = new r45.ht0();
        r45.e21 e21Var = this.f2505d;
        ht0Var.set(0, pm0.v.u(e21Var != null ? e21Var.getLong(0) : 0L));
        if (e21Var == null || (str = e21Var.getString(2)) == null) {
            str = "";
        }
        ht0Var.set(1, str);
        if (e21Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str2 = finderContact.getNickname()) == null) {
            str2 = "";
        }
        ht0Var.set(2, str2);
        ht0Var.set(4, java.lang.Long.valueOf(e21Var != null ? e21Var.getLong(17) : 0L));
        if (e21Var == null || (h21Var = (r45.h21) e21Var.getCustom(18)) == null || (text = h21Var.getString(8)) == null) {
            text = com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.cmu);
        }
        java.lang.String str3 = (java.lang.String) text;
        ht0Var.set(5, str3 != null ? str3 : "");
        return ht0Var;
    }

    @Override // v92.g
    public void c(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f211874o = new aa2.d(this);
        bottomSheet.f211884v = new aa2.e(this);
    }

    @Override // v92.g
    public android.view.View d() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        android.view.View inflate = com.tencent.mm.ui.id.b(appCompatActivity).inflate(com.tencent.mm.R.layout.adw, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482561ht);
        java.lang.String string = appCompatActivity.getResources().getString(com.tencent.mm.R.string.ci_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f4k, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2.concat(" "));
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(appCompatActivity, com.tencent.mm.R.raw.icons_outlined_arrow, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.FG_1));
        e17.setBounds(0, 0, (int) appCompatActivity.getResources().getDimension(com.tencent.mm.R.dimen.f480422xh), (int) appCompatActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9));
        spannableString.setSpan(new al5.w(e17, 1), spannableString.length() - 1, spannableString.length(), 17);
        spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string2, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.f479263uf), appCompatActivity.getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new aa2.f(this)), string2.length() - 6, string2.length(), 17);
        textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(appCompatActivity));
        textView.setText(spannableString);
        return inflate;
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        s92.g.d(s92.g.f405006a, this.f434158a, menuView, "finder_forward_share_to_chat", 0, 8, null);
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        s92.g.d(s92.g.f405006a, this.f434158a, menuView, "finder_forward_share_to_sns", 0, 8, null);
    }

    @Override // v92.g
    public boolean p() {
        r45.e21 e21Var = this.f2505d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(e21Var != null ? e21Var.getString(2) : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notShare ");
        sb6.append(K0);
        sb6.append(", ");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(e21Var != null ? e21Var.getString(2) : null));
        com.tencent.mars.xlog.Log.i("FinderActivityShareHandler", sb6.toString());
        return K0;
    }

    @Override // v92.g
    public void r() {
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        r45.e21 e21Var = this.f2505d;
        java.lang.String string = e21Var != null ? e21Var.getString(2) : null;
        long integer = e21Var != null ? e21Var.getInteger(4) : 0L;
        java.lang.String string2 = e21Var != null ? e21Var.getString(5) : null;
        if (string2 == null) {
            string2 = "";
        }
        com.tencent.mm.plugin.finder.assist.n7.J(n7Var, mMActivity, string, 7, integer, string2, z(), null, 9, "", A(), null, null, 3072, null);
    }

    @Override // v92.g
    public void t() {
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        r45.e21 e21Var = this.f2505d;
        java.lang.String string = e21Var != null ? e21Var.getString(2) : null;
        long integer = e21Var != null ? e21Var.getInteger(4) : 0L;
        java.lang.String string2 = e21Var != null ? e21Var.getString(5) : null;
        if (string2 == null) {
            string2 = "";
        }
        com.tencent.mm.plugin.finder.assist.n7.K(n7Var, mMActivity, string, 7, integer, string2, z(), null, 9, "", A(), null, null, 3072, null);
    }

    @Override // v92.g
    public boolean w() {
        r45.h21 h21Var;
        boolean z17 = false;
        r45.e21 e21Var = this.f2505d;
        if (e21Var != null && (h21Var = (r45.h21) e21Var.getCustom(18)) != null && !h21Var.getBoolean(6)) {
            z17 = true;
        }
        return true ^ z17;
    }

    public final java.lang.String z() {
        androidx.appcompat.app.AppCompatActivity activity = this.f434158a;
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = ((com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.class)).f101821r;
        r45.e21 e21Var = this.f2505d;
        return hc2.a0.a(e21Var != null ? (r45.h21) e21Var.getCustom(18) : null, activity, i17);
    }
}
