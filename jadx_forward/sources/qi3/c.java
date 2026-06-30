package qi3;

/* loaded from: classes12.dex */
public abstract class c implements qi3.b0, java.lang.Comparable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f445207h = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f445208d = jz5.h.b(qi3.b.f445206d);

    /* renamed from: e, reason: collision with root package name */
    public final long f445209e;

    /* renamed from: f, reason: collision with root package name */
    public qi3.g0 f445210f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f445211g;

    public c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " init ");
        this.f445209e = android.os.SystemClock.elapsedRealtime();
        this.f445210f = qi3.g0.f445238d;
    }

    public static /* synthetic */ java.lang.Integer e(qi3.c cVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkMsgSendStop");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return cVar.d(z17);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        qi3.c other = (qi3.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return i().compareTo(other.i());
    }

    public java.lang.Integer d(boolean z17) {
        if (!z17 || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return this.f445210f == qi3.g0.f445246o ? -510001 : null;
        }
        return -520007;
    }

    /* renamed from: equals */
    public boolean m160181xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof qi3.c) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i(), ((qi3.c) obj).i());
        }
        return false;
    }

    public void f1() {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52;
        qi3.e0 h17 = h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", "submitTaskEvent " + h17);
        qi3.g0 g0Var = h17.f445224a;
        qi3.g0 g0Var2 = qi3.g0.f445245n;
        qi3.x xVar = qi3.x.f445294a;
        if (g0Var == g0Var2 && (c16564xb55e1d52 = h17.f445230g) != null) {
            xVar.c(c16564xb55e1d52);
        }
        if (h17.f445224a == qi3.g0.f445246o && (c16564xb55e1d5 = h17.f445230g) != null) {
            xVar.c(c16564xb55e1d5);
        }
        v65.i.b(((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).bj(), null, new qi3.a(this, h17, null), 1, null);
        jm.y yVar = (jm.y) ((qi3.y) i95.n0.c(qi3.y.class));
        yVar.getClass();
        v65.i.b(yVar.bj(), null, new jm.s(h17, yVar, null), 1, null);
    }

    public abstract qi3.e0 h();

    /* renamed from: hashCode */
    public int m160182x8cdac1b() {
        return super.hashCode();
    }

    public final java.lang.String i() {
        return (java.lang.String) this.f445208d.mo141623x754a37bb();
    }

    @Override // qi3.b0
    public java.lang.String id() {
        return i();
    }

    public abstract boolean j();

    public abstract java.lang.Object k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public java.lang.Object l(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " start to sendCgi, isBypSession=" + j());
        return j() ? k(interfaceC29045xdcb5ca57) : m(interfaceC29045xdcb5ca57);
    }

    public abstract java.lang.Object m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public final java.lang.Object n(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " finish");
        r(qi3.g0.f445245n);
        java.lang.Object A = A(interfaceC29045xdcb5ca57);
        return A == pz5.a.f440719d ? A : jz5.f0.f384359a;
    }

    public final void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " prepare");
        r(qi3.g0.f445239e);
    }

    public final void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " sendCgi");
        r(qi3.g0.f445243i);
    }

    public void r(qi3.g0 sendStatus) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendStatus, "sendStatus");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " setSendState current:" + this.f445210f + " target:" + sendStatus);
        this.f445210f = sendStatus;
    }

    public final void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " updateMsg");
        r(qi3.g0.f445244m);
    }

    public void t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " uploadAttach");
        r(qi3.g0.f445242h);
    }

    @Override // qi3.b0
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend", i() + " cancel");
        r(qi3.g0.f445246o);
    }
}
