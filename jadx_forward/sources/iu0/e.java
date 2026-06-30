package iu0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f376340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.io.File f376342g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, int i17, java.lang.String str2, java.io.File file, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376339d = str;
        this.f376340e = i17;
        this.f376341f = str2;
        this.f376342g = file;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iu0.e(this.f376339d, this.f376340e, this.f376341f, this.f376342g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((iu0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f376339d);
        sb6.append('_');
        sb6.append(this.f376340e);
        sb6.append('_');
        java.lang.String str = this.f376341f;
        sb6.append(str.hashCode());
        return iu0.k.a(iu0.k.f376363a, str, this.f376342g.getAbsolutePath() + '/' + sb6.toString());
    }
}
