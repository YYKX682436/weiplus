package yy0;

/* loaded from: classes5.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f549626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f549628f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(yy0.m7 m7Var, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549626d = m7Var;
        this.f549627e = str;
        this.f549628f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.f7(this.f549626d, this.f549627e, this.f549628f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yy0.f7 f7Var = (yy0.f7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        f7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549626d.f549758d, "notifySCTouchFavoriteButton, templateID=" + this.f549627e + ", isFavorite=" + this.f549628f);
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c c4082xa6fd740c = this.f549626d.f549761g;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (c4082xa6fd740c != null) {
            c4082xa6fd740c.l2(this.f549627e, this.f549628f);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f549626d.f549758d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
