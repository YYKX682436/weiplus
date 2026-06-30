package sp2;

/* loaded from: classes2.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f492731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f492732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f492733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f492734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, sp2.x3 x3Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492731e = hVar;
        this.f492732f = x3Var;
        this.f492733g = arrayList;
        this.f492734h = arrayList2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.r3(this.f492731e, interfaceC29045xdcb5ca57, this.f492732f, this.f492733g, this.f492734h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.r3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492730d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.ja2 ja2Var = (r45.ja2) ((xg2.i) this.f492731e).f535926b;
            sp2.x3 x3Var = this.f492732f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(x3Var.f492806d, "requestCgi success " + ((r45.ha2) ja2Var.m75936x14adae67(5)));
            x3Var.Z6((r45.ha2) ja2Var.m75936x14adae67(5));
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            sp2.t3 t3Var = new sp2.t3(this.f492732f, this.f492733g, this.f492734h, ja2Var, null);
            this.f492730d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, t3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
