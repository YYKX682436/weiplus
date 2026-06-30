package vv0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f521931a;

    /* renamed from: b, reason: collision with root package name */
    public final dx0.p f521932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f521933c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f521934d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f521935e;

    public n(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, dx0.p pVar, int i17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        this.f521931a = segmentID;
        this.f521932b = pVar;
        this.f521933c = i17;
        this.f521934d = z17;
        this.f521935e = z18;
    }

    public static vv0.n a(vv0.n nVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, dx0.p pVar, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            segmentID = nVar.f521931a;
        }
        if ((i18 & 2) != 0) {
            pVar = nVar.f521932b;
        }
        dx0.p pVar2 = pVar;
        if ((i18 & 4) != 0) {
            i17 = nVar.f521933c;
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            z17 = nVar.f521934d;
        }
        boolean z19 = z17;
        if ((i18 & 16) != 0) {
            z18 = nVar.f521935e;
        }
        nVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return new vv0.n(segmentID, pVar2, i19, z19, z18);
    }

    /* renamed from: equals */
    public boolean m172707xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.n)) {
            return false;
        }
        vv0.n nVar = (vv0.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521931a, nVar.f521931a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521932b, nVar.f521932b) && this.f521933c == nVar.f521933c && this.f521934d == nVar.f521934d && this.f521935e == nVar.f521935e;
    }

    /* renamed from: hashCode */
    public int m172708x8cdac1b() {
        int m32423x8cdac1b = this.f521931a.m32423x8cdac1b() * 31;
        dx0.p pVar = this.f521932b;
        return ((((((m32423x8cdac1b + (pVar == null ? 0 : pVar.m126406x8cdac1b())) * 31) + java.lang.Integer.hashCode(this.f521933c)) * 31) + java.lang.Boolean.hashCode(this.f521934d)) * 31) + java.lang.Boolean.hashCode(this.f521935e);
    }

    /* renamed from: toString */
    public java.lang.String m172709x9616526c() {
        return "SegmentData(segmentID=" + this.f521931a + ", img=" + this.f521932b + ", order=" + this.f521933c + ", selected=" + this.f521934d + ", hasContentDesc=" + this.f521935e + ')';
    }

    public /* synthetic */ n(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, dx0.p pVar, int i17, boolean z17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(c3971x241f78, pVar, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? false : z18);
    }
}
