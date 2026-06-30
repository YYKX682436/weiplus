package e23;

/* loaded from: classes11.dex */
public class s1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f328491q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f328492r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f328493s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f328494t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f328495u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f328496v;

    /* renamed from: w, reason: collision with root package name */
    public final e23.r1 f328497w;

    /* renamed from: x, reason: collision with root package name */
    public final e23.q1 f328498x;

    public s1(int i17) {
        super(2, i17);
        this.f328497w = new e23.r1(this);
        this.f328498x = new e23.q1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f328493s = this.f328491q.f432720e;
        this.f328492r = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f328493s, true);
        try {
            o(context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSWXChatroomDataItem", e17, "format text exception", new java.lang.Object[0]);
            if (this.f328494t == null) {
                this.f328494t = o13.n.d(this.f328492r.d1());
            }
        }
    }

    @Override // u13.g
    public int g() {
        java.util.List list;
        p13.y yVar = this.f328491q;
        if (yVar.f432718c != 38 || (list = yVar.f432729n) == null || list.size() <= 0) {
            return 0;
        }
        return ((p13.l) list.get(0)).f432644b;
    }

    @Override // u13.g
    public int j() {
        return this.f328491q.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328497w;
    }

    @Override // u13.g
    public boolean m() {
        return this.f328491q.f432734s;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e23.s1.o(android.content.Context):void");
    }
}
