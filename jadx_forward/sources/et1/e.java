package et1;

/* loaded from: classes8.dex */
public abstract class e extends ct1.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f338100h = "BasePrivateMsgReceiveHandler";

    /* renamed from: i, reason: collision with root package name */
    public final et1.d f338101i = new et1.d(this);

    @Override // ct1.c
    public boolean b(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        if (u(rawBypMsg)) {
            return false;
        }
        java.lang.String str = rawBypMsg.f470360e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.Object q17 = q(str);
        if (!x(q17, rawBypMsg)) {
            return true;
        }
        java.lang.String msg_session_id = rawBypMsg.f470360e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_session_id, "msg_session_id");
        v(q17, msg_session_id);
        return true;
    }

    @Override // ct1.c
    public vg3.z4 k() {
        return this.f338101i;
    }

    public abstract java.lang.Object q(java.lang.String str);

    public java.lang.String r(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String g17 = x51.j1.g(rawBypMsg.f470359d.f459091e);
        java.lang.String g18 = x51.j1.g(rawBypMsg.f470359d.f459092f);
        if (rawBypMsg.f470363h) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            return g17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g18);
        return g18;
    }

    public java.lang.String s(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String g17 = x51.j1.g(rawBypMsg.f470359d.f459091e);
        java.lang.String g18 = x51.j1.g(rawBypMsg.f470359d.f459092f);
        if (rawBypMsg.f470363h) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g18);
            return g18;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        return g17;
    }

    public java.lang.String t() {
        return this.f338100h;
    }

    public boolean u(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(rawBypMsg.f470360e, rawBypMsg.f470359d.f459101r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o27, "getBySvrId(...)");
        if (o27.m124847x74d37ac6() == 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t(), "msg already exist");
        return true;
    }

    public abstract void v(java.lang.Object obj, java.lang.String str);

    public abstract boolean x(java.lang.Object obj, r45.w3 w3Var);
}
