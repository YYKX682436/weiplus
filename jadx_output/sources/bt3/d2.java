package bt3;

/* loaded from: classes9.dex */
public class d2 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f24222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.q f24223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f24224c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DoFavoriteEvent f24225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f24226e;

    public d2(long j17, ot0.q qVar, java.lang.String str, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var) {
        this.f24222a = j17;
        this.f24223b = qVar;
        this.f24224c = str;
        this.f24225d = doFavoriteEvent;
        this.f24226e = f9Var;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        r45.bq0 bq0Var;
        if (i17 == 0) {
            long j17 = this.f24222a;
            ot0.q qVar = this.f24223b;
            bt3.g2.c(j17, qVar.m(), qVar.k(), this.f24224c, this.f24225d.f54090g.f6315a);
            return;
        }
        java.lang.String str3 = this.f24224c;
        long j18 = this.f24222a;
        com.tencent.mm.storage.f9 f9Var = this.f24226e;
        if (-3200 != i17) {
            f9Var.r1(5);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j18, f9Var, true);
            if (bt3.g2.I(str3, j18, false, str)) {
                return;
            }
            bt3.g2.b(str3, str);
            return;
        }
        bt3.g2.a(j18, f9Var);
        long j19 = this.f24222a;
        java.lang.String str4 = this.f24224c;
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
        bt3.g2.c(j19, v17.m(), str2, str4, bq0Var);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).f24428d.put(java.lang.Long.valueOf(j18), str3);
    }
}
