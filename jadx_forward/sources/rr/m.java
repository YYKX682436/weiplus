package rr;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.n f480666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f480667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rr.n nVar, boolean z17) {
        super(0);
        this.f480666d = nVar;
        this.f480667e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        rr.n nVar = this.f480666d;
        nVar.getClass();
        if (this.f480667e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f480671d, "dealSaveSuccess");
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = nVar.f480670c;
            int i17 = c21053xdbf1e5f4.f68653x95b20dd4;
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            if (i17 != 81) {
                c21053xdbf1e5f4.f68653x95b20dd4 = 81;
                wq.a.f().d(c21053xdbf1e5f4, false);
                z17 = true;
                c21053xdbf1e5f4.f68677x13320506 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().z1() + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10431, 0, c21053xdbf1e5f4.mo42933xb5885648(), c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, 0, 0, java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426), nVar.f480669b, c21053xdbf1e5f4.f68641x3342accf);
            } else {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(c21053xdbf1e5f4);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String mo42933xb5885648 = c21053xdbf1e5f4.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            arrayList.add(mo42933xb5885648);
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().y2(0, arrayList);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ai()) {
                if (c21053xdbf1e5f4.f68667x6bf90bff == 0) {
                    com.p314xaae8f345.mm.p2614xca6eae71.c0 c0Var = com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "restart");
                    c0Var.e(com.p314xaae8f345.mm.p2614xca6eae71.v.f274931d);
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j.g();
                }
            } else if (!android.text.TextUtils.isEmpty(c21053xdbf1e5f4.f68672xe33e17bb)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z4 z4Var = com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j;
                if (z4Var.e()) {
                    z4Var.g();
                }
            }
            al5.u4 u4Var = nVar.f480673f;
            if (u4Var != null) {
                al5.t4 t4Var = u4Var.f87592d;
                t4Var.b(false);
                t4Var.f(false);
                t4Var.f87575e = u4Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.byc);
                t4Var.e(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                if (n22.m.p(c21053xdbf1e5f4)) {
                    al5.t4 t4Var2 = u4Var.f87592d;
                    t4Var2.a(u4Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574067gv4));
                    t4Var2.f87571a.f87547b = new rr.l(nVar);
                }
                u4Var.f87592d.i();
            }
        } else {
            al5.u4 u4Var2 = nVar.f480673f;
            if (u4Var2 != null) {
                al5.t4 t4Var3 = u4Var2.f87592d;
                t4Var3.b(false);
                t4Var3.f(false);
                t4Var3.f87575e = u4Var2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.byf);
                t4Var3.i();
            }
        }
        return jz5.f0.f384359a;
    }
}
