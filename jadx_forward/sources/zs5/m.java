package zs5;

/* loaded from: classes15.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f556980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zs5.y yVar) {
        super(0);
        this.f556980d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInitQBar inited: ");
        zs5.y yVar = this.f556980d;
        sb6.append(yVar.f557038f);
        sb6.append(", initStatus: ");
        sb6.append(yVar.f557039g);
        sb6.append(", qbarId: ");
        sb6.append(yVar.f557040h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        if (yVar.f557039g != zs5.b.f556854f) {
            et5.e eVar = yVar.f557050r;
            if (eVar != null) {
                eVar.a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a0.InitFromNative);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ry3.s wi6 = ((jd0.l2) ((kd0.w2) i95.n0.c(kd0.w2.class))).wi(0, false);
            zs5.e0 e0Var = yVar.f557034b;
            wi6.f483090c = e0Var.f556878a;
            wi6.f483095h = e0Var.f556879b;
            wi6.f483091d = e0Var.f556880c;
            wi6.f483093f = zs5.f0.a();
            wi6.f483094g = zs5.f0.f556890d;
            zs5.e0 e0Var2 = yVar.f557034b;
            wi6.f483096i = e0Var2.f556883f;
            wi6.f483097j = e0Var2.f556882e;
            int[] readers = e0Var2.f556881d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readers, "readers");
            if (!(readers.length == 0)) {
                wi6.f483092e = yVar.f557034b.f556881d;
            } else {
                wi6.f483092e = new int[]{0};
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.b1 a17 = et5.f.a(wi6);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0 h0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b;
            h0Var.c(yVar.f557040h, a17, new zs5.k(currentTimeMillis, yVar));
            h0Var.h(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi());
        }
        return jz5.f0.f384359a;
    }
}
