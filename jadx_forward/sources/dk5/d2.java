package dk5;

/* loaded from: classes9.dex */
public class d2 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f316113d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f316114e;

    /* renamed from: f, reason: collision with root package name */
    public final int f316115f;

    /* renamed from: g, reason: collision with root package name */
    public final int f316116g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f316117h;

    /* renamed from: i, reason: collision with root package name */
    public final long f316118i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f316119m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f316120n;

    public d2(java.util.List list, java.lang.String str, int i17, int i18, int i19, boolean z17, long j17, boolean z18, java.lang.String str2) {
        this.f316113d = list;
        this.f316114e = str;
        this.f316115f = i17;
        this.f316116g = i18;
        this.f316117h = z17;
        this.f316118i = j17;
        this.f316119m = z18;
        this.f316120n = str2;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        r45.uf6 uf6Var;
        java.lang.String str = r1Var.f527062a;
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 != null && h17.f496544i == 199 && str.equals(this.f316114e)) {
            dk5.e2 e2Var = new dk5.e2(null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            e2Var.f316133a = linkedList;
            java.util.List<java.lang.String> list = this.f316113d;
            linkedList.addAll(list);
            for (java.lang.String str2 : list) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "copy video after download %s", str2);
                int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.H1;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MsgRetransmitUI", "start copy video", new java.lang.Object[0]);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                dk5.c2 c2Var = new dk5.c2();
                c2Var.f316075b = context;
                c2Var.f316079f = str;
                c2Var.f316077d = this.f316115f;
                c2Var.f316078e = this.f316116g;
                c2Var.f316083j = false;
                c2Var.f316081h = str2;
                c2Var.f316084k = true;
                c2Var.f316085l = this.f316117h;
                c2Var.f316088o = e2Var;
                t21.v2 h18 = t21.d3.h(str);
                if (h18 != null && (uf6Var = h18.E) != null) {
                    c2Var.f316087n = uf6Var;
                    c2Var.f316089p = h18.h();
                    c2Var.f316090q = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(h18.f496549n, h18.f496553r);
                }
                if (h18 != null) {
                    c2Var.f316092s = h18.N;
                }
                c2Var.execute(new java.lang.Object[0]);
                c01.sc.d().a(c01.sc.f118994d, null);
                long j17 = this.f316118i;
                if (j17 != -1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f316120n, j17);
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(R4 ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Chatroom : com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Chat, this.f316119m ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Full : com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, Li, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) : 0);
                }
            }
        }
    }
}
