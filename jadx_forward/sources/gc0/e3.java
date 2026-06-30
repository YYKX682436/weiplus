package gc0;

/* loaded from: classes5.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f351690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f351691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f351693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351694h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351695i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351696m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.nl5 f351697n;

    public e3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.nl5 nl5Var) {
        this.f351690d = c0Var;
        this.f351691e = h0Var;
        this.f351692f = str;
        this.f351693g = j17;
        this.f351694h = str2;
        this.f351695i = str3;
        this.f351696m = str4;
        this.f351697n = nl5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f351690d;
        boolean z17 = c0Var.f391645d;
        java.lang.String str = this.f351692f;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f351691e;
        if (!z17) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d).j1(2);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d).u1(str);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d).r1(4);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d).f1(8388608);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d).m124850x7650bebc(10002);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d;
        r45.nl5 nl5Var = this.f351697n;
        long m75942xfb822ef2 = nl5Var.m75942xfb822ef2(2);
        r45.kl5 kl5Var = (r45.kl5) nl5Var.m75936x14adae67(0);
        java.lang.String m75945x2fec8307 = kl5Var != null ? kl5Var.m75945x2fec8307(0) : null;
        r45.kl5 kl5Var2 = (r45.kl5) nl5Var.m75936x14adae67(1);
        java.lang.String m75945x2fec83072 = kl5Var2 != null ? kl5Var2.m75945x2fec8307(1) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"tmpl_type_recommend_remark_sys_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[");
        sb6.append(this.f351694h);
        sb6.append(" $remark_msg_native_url$]]></template>\n                  <link_list>\n\t\t\t\t\t<link name=\"remark_msg_native_open_image_url\" type=\"link_recommend_remark_open_image\">\n                      <title>");
        sb6.append(this.f351696m);
        sb6.append("</title>\n                      <remarksend_newxml_info>\n                        <talker>");
        sb6.append(str);
        sb6.append("</talker>\n\t\t\t\t\t\t<img_msg_id>");
        sb6.append(m75942xfb822ef2);
        sb6.append("</img_msg_id>\n                      </remarksend_newxml_info>\n                    </link>\n                    <link name=\"remark_msg_native_url\" type=\"link_recommend_remark_url\">\n                      <title>");
        sb6.append(this.f351695i);
        sb6.append("</title>\n                      <remarksend_newxml_info>\n                        <msgid>");
        long j17 = this.f351693g;
        sb6.append(j17);
        sb6.append("</msgid>\n                        <talker>");
        sb6.append(str);
        sb6.append("</talker>\n                        <remark>");
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        sb6.append("</remark>\n\t\t\t\t\t\t<phone>");
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        sb6.append(m75945x2fec83072);
        sb6.append("</phone>\n\t\t\t\t\t\t<img_msg_id>");
        sb6.append(m75942xfb822ef2);
        sb6.append("</img_msg_id>\n                      </remarksend_newxml_info>\n                    </link>\n                  </link_list>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        ");
        f9Var.d1(r26.b0.b(sb6.toString()));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d).e1(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().G2(str, j17) + 2);
        if (c0Var.f391645d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkSysTipHelper", "updateSysTip masMsgId:" + j17 + ", talker:" + str + ", svrId: null");
            c01.w9.C((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkSysTipHelper", "insertSysTip masMsgId:" + j17 + ", talker:" + str + ", svrId: null");
        c01.w9.x((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d);
    }
}
