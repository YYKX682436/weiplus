package zl2;

/* loaded from: classes4.dex */
public final class q1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h92 f555460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f555461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555462c;

    public q1(r45.h92 h92Var, cm2.m0 m0Var, android.content.Context context) {
        this.f555460a = h92Var;
        this.f555461b = m0Var;
        this.f555462c = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public final void a(k91.v5 v5Var) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        r45.h92 h92Var = this.f555460a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(h92Var.m75945x2fec8307(1), true);
        java.lang.String str3 = "";
        if (n17 == null || n17.E2 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveUtil", "weapp contact not found, mock and insert: " + h92Var.m75945x2fec8307(1) + ' ' + v5Var.f68913x21f9b213);
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.X1(h92Var.m75945x2fec8307(1));
            java.lang.String str4 = v5Var.f68913x21f9b213;
            if (str4 == null) {
                str4 = "";
            }
            z3Var.M1(str4);
            try {
                z3Var.R1(x51.k.b(z3Var.P0()));
                z3Var.S1(x51.k.a(z3Var.P0()));
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
            Bi2.m0(z3Var);
        }
        r45.c33 c33Var = (r45.c33) h92Var.m75936x14adae67(2);
        if (c33Var == null || (str = c33Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", h92Var.m75945x2fec8307(1));
        intent.putExtra("app_brand_chatting_from_scene", 4);
        intent.putExtra("key_temp_session_from", str);
        intent.putExtra("finish_direct", true);
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            intent.putExtra("key_need_send_video", false);
        }
        intent.putExtra("enableAnimation", true);
        intent.putExtra("app_brand_chatting_from_scene_new", 6);
        k91.z5 z5Var = new k91.z5();
        z5Var.f387396a = str;
        z5Var.f387399d = h92Var.m75945x2fec8307(1);
        z5Var.f387403h = 0;
        intent.putExtra("app_brand_chatting_expose_params", z5Var.a());
        cm2.m0 m0Var = this.f555461b;
        if (m0Var != null) {
            intent.putExtra("sendMessageTitle", m0Var.f124903x);
            r45.c33 c33Var2 = (r45.c33) h92Var.m75936x14adae67(2);
            if (c33Var2 == null || (str2 = c33Var2.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            intent.putExtra("sendMessagePath", str2);
            java.util.LinkedList linkedList = m0Var.f124904y;
            java.lang.String str6 = linkedList != null ? (java.lang.String) linkedList.getFirst() : null;
            if (str6 == null) {
                str6 = "";
            }
            intent.putExtra("sendMessageImg", str6);
            intent.putExtra("showMessageCard", true);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enter wxa shop service with: ");
        sb6.append(h92Var.m75945x2fec8307(1));
        sb6.append(' ');
        sb6.append(str);
        sb6.append(' ');
        sb6.append(m0Var != null ? m0Var.f124903x : null);
        sb6.append(' ');
        r45.c33 c33Var3 = (r45.c33) h92Var.m75936x14adae67(2);
        if (c33Var3 != null && (m75945x2fec8307 = c33Var3.m75945x2fec8307(1)) != null) {
            str3 = m75945x2fec8307;
        }
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        j45.l.v(this.f555462c, ".ui.chatting.AppBrandServiceChattingUI", intent, 0);
    }
}
