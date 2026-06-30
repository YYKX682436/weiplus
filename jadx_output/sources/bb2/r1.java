package bb2;

/* loaded from: classes10.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f18974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18975h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18976i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(long j17, bb2.w1 w1Var, long j18, boolean z17, int i17, java.lang.String str) {
        super(1);
        this.f18971d = j17;
        this.f18972e = w1Var;
        this.f18973f = j18;
        this.f18974g = z17;
        this.f18975h = i17;
        this.f18976i = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<bb2.o> arrayList;
        r45.oo ooVar;
        int i17;
        r45.kp2 resp = (r45.kp2) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        bb2.w1 w1Var = this.f18972e;
        if (this.f18971d == w1Var.e().getFeedObject().getId()) {
            boolean z17 = true;
            r45.oo ooVar2 = (r45.oo) resp.getCustom(1);
            java.lang.Long l17 = null;
            bb2.o oVar = ooVar2 != null ? new bb2.o(ooVar2) : null;
            java.util.LinkedList<r45.oo> list = resp.getList(2);
            if (list != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.oo ooVar3 : list) {
                    kotlin.jvm.internal.o.d(ooVar3);
                    arrayList.add(new bb2.o(ooVar3));
                }
            } else {
                arrayList = null;
            }
            if (oVar != null) {
                w1Var.e().k2(kz5.b0.c(oVar));
                long j17 = this.f18973f;
                r45.oo ooVar4 = oVar.f18926a;
                wp.a f57 = w1Var.d().f5(j17 > 0 ? -2147483645 : ooVar4.getInteger(12) == 1 ? -2147483646 : 0, oVar);
                f57.f448348s = true;
                cq.k1.a();
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.P().r()).booleanValue()) {
                    cq.k1.a();
                    i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127839n6).getValue()).r()).intValue();
                } else {
                    i17 = 3000;
                }
                f57.f448345p = i17;
                f57.f448335f = ooVar4.getLong(3);
                boolean z18 = w1Var.f19048m;
                f57.A = z18;
                if (z18) {
                    f57.a();
                }
                if (j17 == 0) {
                    w1Var.d().f438852d.k0(f57, false);
                }
                pm0.v.X(new bb2.p1(this.f18972e, oVar, this.f18974g, this.f18975h, this.f18976i));
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                w1Var.e().k2(arrayList);
                for (bb2.o oVar2 : arrayList) {
                    bb2.m0 m0Var = bb2.m0.f18918a;
                    android.content.Context context = w1Var.f19036a.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    m0Var.c(context, oVar2.f18926a, w1Var.e(), (int) (w1Var.f19039d / 1000), true);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postBullet onSceneEnd: addDanmaku ");
            sb6.append(pm0.v.u(w1Var.e().getFeedObject().getId()));
            sb6.append(", addTime=");
            if (oVar != null && (ooVar = oVar.f18926a) != null) {
                l17 = java.lang.Long.valueOf(ooVar.getLong(3));
            }
            sb6.append(l17);
            com.tencent.mars.xlog.Log.i("FinderBulletManager", sb6.toString());
            pm0.v.X(new bb2.q1(w1Var));
        }
        return jz5.f0.f302826a;
    }
}
