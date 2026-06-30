package bt3;

/* loaded from: classes9.dex */
public class e2 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f24245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f24246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f24247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f24248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ul5 f24249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f24250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f24251g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f24252h;

    public e2(long j17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, ot0.q qVar, r45.ul5 ul5Var, r45.bq0 bq0Var, boolean z17, com.tencent.mm.storage.f9 f9Var2) {
        this.f24245a = j17;
        this.f24246b = f9Var;
        this.f24247c = str;
        this.f24248d = qVar;
        this.f24249e = ul5Var;
        this.f24250f = bq0Var;
        this.f24251g = z17;
        this.f24252h = f9Var2;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        r45.bq0 bq0Var;
        java.lang.String str3;
        com.tencent.mm.storage.f9 f9Var = this.f24246b;
        if (i17 == 0) {
            bt3.g2.e(this.f24245a, f9Var.Q0(), f9Var.getMsgId(), this.f24247c, this.f24248d, this.f24249e, this.f24250f, this.f24251g);
            return;
        }
        java.lang.String str4 = this.f24247c;
        com.tencent.mm.storage.f9 f9Var2 = this.f24252h;
        long j17 = this.f24245a;
        if (-3200 != i17) {
            f9Var2.r1(5);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, f9Var2, true);
            bt3.g2.b(str4, str);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "errcode equals %s, errMsg:%s, msgId:%s, toUser:%s", java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(j17), str4);
        bt3.g2.a(j17, f9Var2);
        java.lang.String Q0 = f9Var.Q0();
        long msgId = f9Var.getMsgId();
        ot0.q v17 = ot0.q.v(f9Var2.j());
        bt3.b0 x17 = bt3.g2.x(v17);
        if (x17 != null) {
            str2 = x17.f24205a;
            str3 = x17.f24206b;
            bq0Var = x17.f24207c;
        } else {
            str2 = "";
            bq0Var = null;
            str3 = "";
        }
        zs3.b0 b0Var = new zs3.b0();
        b0Var.field_msgId = j17;
        b0Var.field_oriMsgId = msgId;
        b0Var.field_oriMsgTalker = Q0;
        b0Var.field_toUser = str4;
        b0Var.field_title = v17.f348654f;
        b0Var.field_desc = str2;
        b0Var.field_dataProto = bq0Var;
        b0Var.field_type = 0;
        b0Var.field_favFrom = str3;
        b0Var.field_localId = new java.util.Random().nextInt(2147483645) + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Normal RecordMsgStorage insert ret:%b, id:%d, oriMsgId:%d localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).insert(b0Var)), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(msgId), java.lang.Integer.valueOf(b0Var.field_localId));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, this.f24251g);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).f24428d.put(java.lang.Long.valueOf(j17), str4);
    }
}
