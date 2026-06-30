package mc4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final mc4.c f407178a = new mc4.c();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f407179b;

    /* renamed from: c, reason: collision with root package name */
    public static mc4.e f407180c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f407181d;

    public static final void a(mc4.c cVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", "postAgainBySecurityPass >> " + str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f c6091xb432a48f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6091xb432a48f();
        c6091xb432a48f.f136370g.f89571a = str;
        c6091xb432a48f.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [android.view.View] */
    public final android.view.View b(android.content.Context context, java.lang.String localId, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealSpanText", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", "dealSpanText >> " + context + ' ' + localId);
        android.view.ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            viewGroup2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwz, (android.view.ViewGroup) null);
        }
        android.view.View findViewById = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.s6x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        textView.setText("");
        textView.append(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.n2c));
        java.lang.String r17 = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.n2a);
        android.text.SpannableString spannableString = new android.text.SpannableString(r17);
        spannableString.setSpan(((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Di("", i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), false, new mc4.a(localId, viewGroup2)), 0, r17.length(), 17);
        textView.append(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealSpanText", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        return viewGroup2;
    }

    public final void c(android.content.Context context, mc4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showRetryPostAlert", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showRetryPostAlert ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = f407179b;
        sb6.append(c17933xe8d1b226 != null ? c17933xe8d1b226.m70363x51f8f990() : null);
        sb6.append(' ');
        sb6.append(f407181d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = f407179b;
        if (f407181d && c17933xe8d1b2262 != null) {
            db5.e1.B(context, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.n2b), "", i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.n2a), i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new mc4.b(c17933xe8d1b2262, dVar), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp);
        }
        f407179b = null;
        f407181d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showRetryPostAlert", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
    }
}
