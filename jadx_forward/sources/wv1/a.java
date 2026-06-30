package wv1;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w f531462a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f531463b;

    /* renamed from: c, reason: collision with root package name */
    public long f531464c;

    /* renamed from: d, reason: collision with root package name */
    public long f531465d;

    /* renamed from: e, reason: collision with root package name */
    public int f531466e = 0;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w wVar) {
        this.f531462a = wVar;
    }

    public xv1.b a() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) this.f531462a).f177056d.f6();
    }

    public android.content.Context b() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) this.f531462a).f177056d.mo54478x76847179();
    }

    public java.lang.String c() {
        return "";
    }

    public java.lang.String d() {
        return "";
    }

    public long e() {
        return 0L;
    }

    /* renamed from: equals */
    public boolean m174531xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f531463b;
        return (f9Var == null || !(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f9) || obj == null) ? super.equals(obj) : f9Var.m124847x74d37ac6() == ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).m124847x74d37ac6();
    }

    public long f() {
        return this.f531463b.m124847x74d37ac6();
    }

    public long g() {
        return this.f531463b.mo78012x3fdd41df();
    }

    public abstract int h();

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            r5 = this;
            com.tencent.mm.plugin.choosemsgfile.logic.ui.w r0 = r5.f531462a
            com.tencent.mm.plugin.choosemsgfile.logic.ui.a r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) r0
            com.tencent.mm.plugin.choosemsgfile.ui.f0 r1 = r0.f177056d
            xv1.b r1 = r1.f6()
            java.util.Map r2 = r1.f538921b
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L18
            java.lang.String r1 = "MicroMsg.ChooseMsgFileHelper"
            java.lang.String r2 = "isInvalid() msgIdToMsgFile is null, return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)
            goto L24
        L18:
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            int r2 = r2.size()
            int r1 = r1.f538920a
            if (r2 < r1) goto L24
            r1 = r3
            goto L25
        L24:
            r1 = r4
        L25:
            if (r1 == 0) goto L47
            com.tencent.mm.plugin.choosemsgfile.ui.f0 r0 = r0.f177056d
            xv1.b r0 = r0.f6()
            com.tencent.mm.storage.f9 r1 = r5.f531463b
            long r1 = r1.m124847x74d37ac6()
            java.util.Map r0 = r0.f538921b
            if (r0 != 0) goto L39
            r0 = r4
            goto L43
        L39:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
        L43:
            if (r0 == 0) goto L46
            goto L47
        L46:
            r3 = r4
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wv1.a.i():boolean");
    }

    public abstract void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, wv1.a aVar);

    public void k(android.view.View view, wv1.a aVar) {
    }

    public void l(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    /* renamed from: toString */
    public java.lang.String m174532x9616526c() {
        return "MsgItem{msgInfo=" + this.f531463b.m124847x74d37ac6() + '}';
    }

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w wVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f531462a = wVar;
        this.f531463b = f9Var;
    }
}
