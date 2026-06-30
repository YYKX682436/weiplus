package mq4;

/* loaded from: classes14.dex */
public class i extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f412333h;

    public i(int i17, long j17, java.lang.String str, java.lang.String str2, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.h27();
        lVar.f152198b = new r45.i27();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipcancelinvite";
        lVar.f152200d = 171;
        lVar.f152201e = 64;
        lVar.f152202f = 1000000064;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.h27 h27Var = (r45.h27) a17.f152243a.f152217a;
        h27Var.f457327e = i17;
        h27Var.f457328f = j17;
        h27Var.f457329g = str;
        h27Var.f457333n = i18;
        h27Var.f457326d = c01.z1.r();
        h27Var.f457331i = i28;
        r45.s37 s37Var = new r45.s37();
        r45.du5 du5Var = new r45.du5();
        du5Var.c(str2);
        s37Var.f467018d = du5Var;
        h27Var.f457330h = s37Var;
        h27Var.f457332m = java.lang.System.currentTimeMillis();
        h27Var.f457334o = i19;
        h27Var.f457335p = i27;
        this.f412333h = i19;
    }

    @Override // mq4.e0
    public int H() {
        r45.h27 h27Var = (r45.h27) this.f412326d.f152243a.f152217a;
        return (h27Var.f457327e == 0 && h27Var.f457333n == 0) ? -1 : 0;
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.h(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 171;
    }
}
