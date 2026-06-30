package pk2;

/* loaded from: classes.dex */
public final class e2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f437233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f437235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437233d = hVar;
        this.f437234e = str;
        this.f437235f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk2.e2(this.f437233d, interfaceC29045xdcb5ca57, this.f437234e, this.f437235f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pk2.e2 e2Var = (pk2.e2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.v71 v71Var = (r45.v71) ((xg2.i) this.f437233d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveNotice: cgi success, source=");
        sb6.append(this.f437234e);
        sb6.append("， noticeSize=");
        r45.j32 j32Var = (r45.j32) v71Var.m75936x14adae67(4);
        sb6.append((j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) ? null : new java.lang.Integer(m75941xfb821914.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMoreLiveNoticeOption", sb6.toString());
        this.f437235f.f391656d = v71Var;
        return jz5.f0.f384359a;
    }
}
