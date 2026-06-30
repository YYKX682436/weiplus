package go;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f355240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f355242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, long j17) {
        super(0);
        this.f355240d = f9Var;
        this.f355241e = str;
        this.f355242f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f355240d;
        f9Var.j1(2);
        java.lang.String talker = this.f355241e;
        f9Var.u1(talker);
        f9Var.r1(4);
        f9Var.f1(8388608);
        f9Var.m124850x7650bebc(10002);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talker, "$talker");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o57);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        f9Var.d1(r26.b0.b("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"tmpl_type_auto_translation_sys_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[" + string2 + " $go_to_enable_native_url$]]></template>\n                  <link_list>\n\t\t\t\t\t<link name=\"go_to_enable_native_url\" type=\"link_auto_translation_url\">\n                      <title>" + string + "</title>\n                      <talker>" + talker + "</talker>\n                    </link>\n                  </link_list>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        "));
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        long j17 = this.f355242f;
        f9Var.e1(cj6.G2(talker, j17) + 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertSysTipAfter() insertSysTip msgId:" + j17 + ", talker:" + talker + ", svrId: null");
        c01.w9.x(f9Var);
        return jz5.f0.f384359a;
    }
}
