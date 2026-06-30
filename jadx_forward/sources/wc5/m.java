package wc5;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f526137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f526138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f526139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wc5.q qVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526137d = qVar;
        this.f526138e = j17;
        this.f526139f = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wc5.m(this.f526137d, this.f526138e, this.f526139f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wc5.m mVar = (wc5.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        wc5.q qVar = this.f526137d;
        qVar.V6();
        long j17 = this.f526138e;
        int W6 = qVar.W6(j17);
        if (W6 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "startLocateLoad: targetMsgId=" + j17 + " found in final check at position=" + W6);
            qVar.Z6(W6);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startLocateLoad: targetMsgId=");
            sb6.append(j17);
            sb6.append(" not found, pages=");
            sb6.append(this.f526139f.f391649d);
            sb6.append(", itemCount=");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = qVar.m173460x4905e9fa().mo7946xf939df19();
            sb6.append(mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHistoryGalleryInitialLoadUIC", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
