package bt3;

/* loaded from: classes9.dex */
public class f2 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.q f24260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f24261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f24262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f24263f;

    public f2(int i17, long j17, ot0.q qVar, java.lang.String str, r45.bq0 bq0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f24258a = i17;
        this.f24259b = j17;
        this.f24260c = qVar;
        this.f24261d = str;
        this.f24262e = bq0Var;
        this.f24263f = f9Var;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        r45.bq0 bq0Var;
        if (i17 == 0) {
            int i18 = this.f24258a;
            long j17 = this.f24259b;
            ot0.q qVar = this.f24260c;
            bt3.g2.d(i18, j17, qVar.m(), qVar.k(), this.f24261d, this.f24262e);
            return;
        }
        java.lang.String str3 = this.f24261d;
        long j18 = this.f24259b;
        com.tencent.mm.storage.f9 f9Var = this.f24263f;
        if (-3200 != i17) {
            f9Var.r1(5);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j18, f9Var, true);
            bt3.g2.b(str3, str);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "errcode equals %s, errMsg:%s, msgId:%s, toUser:%s", java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(j18), str3);
        bt3.g2.a(j18, f9Var);
        int i19 = this.f24258a;
        long j19 = this.f24259b;
        java.lang.String str4 = this.f24261d;
        ot0.q v17 = ot0.q.v(f9Var.j());
        bt3.b0 x17 = bt3.g2.x(v17);
        if (x17 != null) {
            java.lang.String str5 = x17.f24205a;
            bq0Var = x17.f24207c;
            str2 = str5;
        } else {
            str2 = "";
            bq0Var = null;
        }
        bt3.g2.d(i19, j19, v17.m(), str2, str4, bq0Var);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).f24428d.put(java.lang.Long.valueOf(j18), str3);
    }
}
