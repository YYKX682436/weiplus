package ya2;

/* loaded from: classes8.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f542071a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f542072b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f542073c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f542074d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f542075e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qt2 f542076f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f542077g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f542078h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f542079i;

    /* renamed from: j, reason: collision with root package name */
    public int f542080j;

    public t1(java.lang.String finderEntranceTipsId, java.util.LinkedList finderCtrlInfoList, java.lang.String nearbyEntranceTipsId, java.util.LinkedList nearbyCtrlInfoList, java.util.LinkedList snsCtrlInfoList, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        finderEntranceTipsId = (i17 & 1) != 0 ? "" : finderEntranceTipsId;
        finderCtrlInfoList = (i17 & 2) != 0 ? new java.util.LinkedList() : finderCtrlInfoList;
        nearbyEntranceTipsId = (i17 & 4) != 0 ? "" : nearbyEntranceTipsId;
        nearbyCtrlInfoList = (i17 & 8) != 0 ? new java.util.LinkedList() : nearbyCtrlInfoList;
        snsCtrlInfoList = (i17 & 16) != 0 ? new java.util.LinkedList() : snsCtrlInfoList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderEntranceTipsId, "finderEntranceTipsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderCtrlInfoList, "finderCtrlInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nearbyEntranceTipsId, "nearbyEntranceTipsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nearbyCtrlInfoList, "nearbyCtrlInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsCtrlInfoList, "snsCtrlInfoList");
        this.f542071a = finderEntranceTipsId;
        this.f542072b = finderCtrlInfoList;
        this.f542073c = nearbyEntranceTipsId;
        this.f542074d = nearbyCtrlInfoList;
        this.f542075e = snsCtrlInfoList;
    }

    /* renamed from: equals */
    public boolean m176716xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya2.t1)) {
            return false;
        }
        ya2.t1 t1Var = (ya2.t1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542071a, t1Var.f542071a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542072b, t1Var.f542072b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542073c, t1Var.f542073c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542074d, t1Var.f542074d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542075e, t1Var.f542075e);
    }

    /* renamed from: hashCode */
    public int m176717x8cdac1b() {
        return (((((((this.f542071a.hashCode() * 31) + this.f542072b.hashCode()) * 31) + this.f542073c.hashCode()) * 31) + this.f542074d.hashCode()) * 31) + this.f542075e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176718x9616526c() {
        return "SyncArgs(finderEntranceTipsId=" + this.f542071a + ", finderCtrlInfoList=" + this.f542072b + ", nearbyEntranceTipsId=" + this.f542073c + ", nearbyCtrlInfoList=" + this.f542074d + ", snsCtrlInfoList=" + this.f542075e + ')';
    }
}
