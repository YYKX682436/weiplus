package go;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f355238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        super(0);
        this.f355238d = f9Var;
        this.f355239e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f355238d;
        f9Var.j1(2);
        java.lang.String str = this.f355239e;
        f9Var.u1(str);
        f9Var.r1(4);
        f9Var.f1(8388608);
        f9Var.m124850x7650bebc(10002);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        f9Var.d1(r26.b0.b("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"tmpl_type_auto_translation_sys_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[" + string + "]]></template>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        "));
        f9Var.e1(c01.id.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertEnabledSysTip() insertSysTip talker:" + str);
        c01.w9.x(f9Var);
        return jz5.f0.f384359a;
    }
}
