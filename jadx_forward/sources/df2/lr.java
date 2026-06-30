package df2;

/* loaded from: classes10.dex */
public final class lr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(df2.lt ltVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312226d = ltVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.lr(this.f312226d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.lr lrVar = (df2.lr) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lrVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.lt ltVar = this.f312226d;
        synchronized (ltVar.f312246u) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410341g3;
            if (c19786x6a1e2862 != null) {
                int size = ltVar.f312250y.size() == 0 ? 0 : (ltVar.f312245t % ltVar.f312250y.size()) + 1;
                if2.d0 d0Var = ltVar.K;
                if (d0Var != null) {
                    d0Var.d(0);
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = ltVar.B;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                ltVar.f312250y.add(size, new dk2.h(c19786x6a1e2862));
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = ltVar.f312240o;
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
                ltVar.u7();
                java.lang.String str = df2.lt.W;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "[checkInsertNotifyBanner] index = " + size);
                if (size == 0) {
                    pm0.v.V(ltVar.f312248w ? 2000L : 5000L, new df2.kr(ltVar));
                }
                ltVar.x7();
            }
            ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410341g3 = null;
        }
        return jz5.f0.f384359a;
    }
}
