package on2;

/* loaded from: classes.dex */
public final class h3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f428464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f428465c;

    public h3(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, android.content.Context context) {
        this.f428463a = str;
        this.f428464b = interfaceC29045xdcb5ca57;
        this.f428465c = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean e17 = xg2.g.e(fVar);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        java.lang.String str = this.f428463a;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f428464b;
        if (e17) {
            r45.ul4 ul4Var = (r45.ul4) ((r45.bz1) fVar.f152151d).m75936x14adae67(2);
            if (ul4Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LotteryUtil", str + " success!");
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(ul4Var));
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LotteryUtil", "postClaim suc but after_status is null!");
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
        } else {
            java.lang.String str2 = fVar.f152150c;
            if (!(str2 == null || str2.length() == 0)) {
                pm0.v.X(new on2.g3(this.f428465c, str2));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LotteryUtil", str + " fail,errMsg:" + str2 + '!');
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        return f0Var2;
    }
}
