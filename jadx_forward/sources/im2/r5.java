package im2;

/* loaded from: classes.dex */
public final class r5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f374051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f374052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f374051d = hVar;
        this.f374052e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new im2.r5(this.f374051d, interfaceC29045xdcb5ca57, this.f374052e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        im2.r5 r5Var = (im2.r5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.gp1 gp1Var = (r45.gp1) ((xg2.i) this.f374051d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestFinderLiveEndNav good size=");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f374052e;
        r45.gp1 gp1Var2 = (r45.gp1) h0Var.f391656d;
        sb6.append((gp1Var2 == null || (m75941xfb821914 = gp1Var2.m75941xfb821914(1)) == null) ? null : new java.lang.Integer(m75941xfb821914.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", sb6.toString());
        h0Var.f391656d = gp1Var;
        return jz5.f0.f384359a;
    }
}
