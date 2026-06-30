package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f285600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.c f285601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f285602h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yb5.d dVar, long j17, zy2.c cVar, android.widget.ImageView imageView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f285599e = dVar;
        this.f285600f = j17;
        this.f285601g = cVar;
        this.f285602h = imageView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h(this.f285599e, this.f285600f, this.f285601g, this.f285602h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f285598d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.app.Activity g17 = this.f285599e.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            long j17 = this.f285600f;
            java.lang.String m75945x2fec8307 = this.f285601g.f558892b.m75945x2fec8307(12);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            android.widget.ImageView imageView = this.f285602h;
            this.f285598d = 1;
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).wj(g17, j17, m75945x2fec8307, imageView, 2, this) == aVar) {
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
