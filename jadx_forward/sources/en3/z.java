package en3;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f336864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f336865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.jv4 f336866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ en3.b0 f336867h;

    public z(java.lang.String str, long j17, long j18, r45.jv4 jv4Var, en3.b0 b0Var) {
        this.f336863d = str;
        this.f336864e = j17;
        this.f336865f = j18;
        this.f336866g = jv4Var;
        this.f336867h = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.iv4 iv4Var;
        r45.iv4 iv4Var2 = new r45.iv4();
        java.lang.String str = this.f336863d;
        iv4Var2.set(0, str);
        iv4Var2.set(1, java.lang.Long.valueOf(this.f336864e));
        iv4Var2.set(2, java.lang.Long.valueOf(this.f336865f));
        long m75942xfb822ef2 = iv4Var2.m75942xfb822ef2(2);
        r45.jv4 jv4Var = this.f336866g;
        iv4Var2.set(3, java.lang.Long.valueOf(m75942xfb822ef2 - jv4Var.m75942xfb822ef2(2)));
        long m75942xfb822ef22 = iv4Var2.m75942xfb822ef2(2);
        java.util.LinkedList m75941xfb821914 = jv4Var.m75941xfb821914(7);
        iv4Var2.set(4, java.lang.Long.valueOf(m75942xfb822ef22 - ((m75941xfb821914 == null || (iv4Var = (r45.iv4) kz5.n0.k0(m75941xfb821914)) == null) ? jv4Var.m75942xfb822ef2(2) : iv4Var.m75942xfb822ef2(2))));
        jv4Var.m75941xfb821914(7).add(iv4Var2);
        jz5.l[] lVarArr = new jz5.l[13];
        lVarArr[0] = new jz5.l("contextid", jv4Var.m75945x2fec8307(0));
        java.lang.String m75945x2fec8307 = jv4Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        lVarArr[1] = new jz5.l("reddotuuid", m75945x2fec8307);
        lVarArr[2] = new jz5.l("cachetype", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(4)));
        lVarArr[3] = new jz5.l("action", iv4Var2.m75945x2fec8307(0));
        lVarArr[4] = new jz5.l(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(iv4Var2.m75942xfb822ef2(1)));
        lVarArr[5] = new jz5.l("uptime", java.lang.Long.valueOf(iv4Var2.m75942xfb822ef2(2)));
        lVarArr[6] = new jz5.l("timefromfirstaction", java.lang.Long.valueOf(iv4Var2.m75942xfb822ef2(3)));
        lVarArr[7] = new jz5.l("timefrompreaction", java.lang.Long.valueOf(iv4Var2.m75942xfb822ef2(4)));
        lVarArr[8] = new jz5.l("isnewlifetab", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(5)));
        lVarArr[9] = new jz5.l("openbyview", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(9)));
        lVarArr[10] = new jz5.l("useinstancecache", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(6)));
        lVarArr[11] = new jz5.l("fromfindmoretabresume", java.lang.Long.valueOf(jv4Var.m75942xfb822ef2(8)));
        lVarArr[12] = new jz5.l("innerversion", 10);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("newlife_enter", null, k17, 30923);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "OnBackBtnClick") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "HomeUIOnDestroy") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FirstItemExpose") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SwitchToOtherTab")) {
            int m75939xb282bd08 = jv4Var.m75939xb282bd08(6);
            en3.b0 b0Var = this.f336867h;
            long wi6 = m75939xb282bd08 == 0 ? en3.b0.wi(b0Var, jv4Var, "StartNewLife", "InitFlutterHomePage") : en3.b0.wi(b0Var, jv4Var, "StartNewLife", "InitNewLifeFlutterInstance");
            long m75942xfb822ef23 = iv4Var2.m75942xfb822ef2(3) - wi6;
            jz5.l[] lVarArr2 = new jz5.l[15];
            lVarArr2[0] = new jz5.l("contextid", jv4Var.m75945x2fec8307(0));
            java.lang.String m75945x2fec83072 = jv4Var.m75945x2fec8307(3);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            lVarArr2[1] = new jz5.l("reddotuuid", m75945x2fec83072);
            lVarArr2[2] = new jz5.l("cachetype", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(4)));
            lVarArr2[3] = new jz5.l("action", str);
            lVarArr2[4] = new jz5.l(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(iv4Var2.m75942xfb822ef2(1)));
            lVarArr2[5] = new jz5.l("uptime", java.lang.Long.valueOf(iv4Var2.m75942xfb822ef2(2)));
            lVarArr2[6] = new jz5.l("totalcost", java.lang.Long.valueOf(iv4Var2.m75942xfb822ef2(3)));
            lVarArr2[7] = new jz5.l("isnewlifetab", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(5)));
            lVarArr2[8] = new jz5.l("openbyview", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(9)));
            lVarArr2[9] = new jz5.l("useinstancecache", java.lang.Integer.valueOf(jv4Var.m75939xb282bd08(6)));
            lVarArr2[10] = new jz5.l(ya.b.f77504xbb80cbe3, java.lang.Integer.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FirstItemExpose") ? 1 : 0));
            lVarArr2[11] = new jz5.l("nativecost", java.lang.Long.valueOf(wi6));
            lVarArr2[12] = new jz5.l("fluttercost", java.lang.Long.valueOf(m75942xfb822ef23));
            lVarArr2[13] = new jz5.l("fromfindmoretabresume", java.lang.Long.valueOf(jv4Var.m75942xfb822ef2(8)));
            lVarArr2[14] = new jz5.l("innerversion", 10);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("newlife_end", null, kz5.c1.k(lVarArr2), 30923);
            b0Var.f336822d = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeDataFeatureService", "newlife_enter " + k17);
    }
}
