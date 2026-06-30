package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class ah implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f187826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f187827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f187829d;

    public ah(r45.v71 v71Var, zy2.i5 i5Var, java.lang.String str, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f187826a = v71Var;
        this.f187827b = i5Var;
        this.f187828c = str;
        this.f187829d = abstractActivityC21394xb3d2c0cf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        zy2.i5 i5Var = this.f187827b;
        if (!z17) {
            i5Var.a(1);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        y4Var.getClass();
        y4Var.f409819a = "temp_13";
        java.lang.String Gj = ((c61.l7) i95.n0.c(c61.l7.class)).Gj(15, 2, 65);
        r45.aa2 aa2Var = (r45.aa2) this.f187826a.m75936x14adae67(2);
        if (aa2Var != null) {
            long m75942xfb822ef2 = aa2Var.m75942xfb822ef2(0);
            long m75942xfb822ef22 = aa2Var.m75942xfb822ef2(2);
            java.lang.String m75945x2fec8307 = aa2Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(m75942xfb822ef2));
            m84Var.set(1, java.lang.Long.valueOf(m75942xfb822ef22));
            m84Var.set(2, m75945x2fec8307);
            m84Var.set(3, "");
            m84Var.set(4, "");
            m84Var.set(5, "");
            m84Var.set(6, null);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, Gj);
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            java.lang.String str2 = this.f187828c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            if (str2.length() > 0) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent, str2, null);
            }
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f187829d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ((vd2.f1) e0Var).Ri(mo55332x76847179, intent, m84Var, true, wk0Var, null);
        }
        i5Var.a(2);
    }
}
