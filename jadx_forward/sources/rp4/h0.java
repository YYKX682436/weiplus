package rp4;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f480197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.ActivityC18823xd24cb2c2 f480198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f480199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f480200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer[] f480201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.ActivityC18823xd24cb2c2 activityC18823xd24cb2c2, java.util.List list, java.util.List list2, java.lang.Integer[] numArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480198e = activityC18823xd24cb2c2;
        this.f480199f = list;
        this.f480200g = list2;
        this.f480201h = numArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rp4.h0(this.f480198e, this.f480199f, this.f480200g, this.f480201h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp4.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f480197d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.ActivityC18823xd24cb2c2 activityC18823xd24cb2c2 = this.f480198e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC18823xd24cb2c2.f257634e, "in IO to init MediaModel");
            activityC18823xd24cb2c2.f257636g.f(this.f480199f, this.f480200g, kz5.z.z0(this.f480201h));
            activityC18823xd24cb2c2.f257636g.e(rp4.w.f480227d);
            activityC18823xd24cb2c2.f257636g.b();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            rp4.g0 g0Var = new rp4.g0(activityC18823xd24cb2c2, null);
            this.f480197d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, g0Var, this) == aVar) {
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
