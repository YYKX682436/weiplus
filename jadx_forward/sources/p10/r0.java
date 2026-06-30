package p10;

/* loaded from: classes9.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10543x200c8f1c f432519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 f432520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f432521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f432522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f432523h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f432524i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10543x200c8f1c activityC10543x200c8f1c, com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197, n0.v2 v2Var, n0.v2 v2Var2, n0.v2 v2Var3, n0.v2 v2Var4) {
        super(0);
        this.f432519d = activityC10543x200c8f1c;
        this.f432520e = c11098x3efa6197;
        this.f432521f = v2Var;
        this.f432522g = v2Var2;
        this.f432523h = v2Var3;
        this.f432524i = v2Var4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10543x200c8f1c activityC10543x200c8f1c = this.f432519d;
        android.widget.Toast.makeText(activityC10543x200c8f1c, "预载biz", 0).show();
        java.lang.String T6 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10543x200c8f1c.T6(activityC10543x200c8f1c, (java.lang.String) this.f432521f.mo128745x754a37bb());
        bw5.x7 x7Var = new bw5.x7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("mbapp");
        x7Var.j(linkedList);
        bw5.s7 s7Var = new bw5.s7();
        s7Var.f114358d = (java.lang.String) this.f432522g.mo128745x754a37bb();
        boolean[] zArr = s7Var.f114372u;
        zArr[1] = true;
        s7Var.f114363i = true;
        zArr[6] = true;
        org.json.JSONObject a17 = ri.l0.a(kz5.c1.k(new jz5.l("routeName", (java.lang.String) this.f432523h.mo128745x754a37bb()), new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, T6), new jz5.l("sessionid", java.util.UUID.randomUUID().toString()), new jz5.l("enterTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        s7Var.e(a17 != null ? a17.toString() : null);
        java.lang.Integer h17 = r26.h0.h((java.lang.String) this.f432524i.mo128745x754a37bb());
        s7Var.f114369r = h17 != null ? h17.intValue() : 1;
        zArr[12] = true;
        x7Var.f116515p = s7Var;
        x7Var.f116517r[10] = true;
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f432520e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pq.q.h6(qVar, new pq.a(context), x7Var, null, null, 12, null);
        return jz5.f0.f384359a;
    }
}
