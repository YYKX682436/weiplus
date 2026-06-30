package wr;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f530273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.j f530274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, wr.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530273d = interfaceC4987x84e327cb;
        this.f530274e = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wr.f(this.f530273d, this.f530274e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wr.f fVar = (wr.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        wr.j jVar = this.f530274e;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f530273d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6 t6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class);
            java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            java.lang.String Ri = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) t6Var).Ri(mo42933xb5885648);
            android.graphics.Bitmap m43678x46823488 = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43678x46823488((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb);
            if (m43678x46823488 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(m43678x46823488, 100, android.graphics.Bitmap.CompressFormat.PNG, Ri, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "thumb local gen success. md5: " + ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).mo42933xb5885648());
            jVar.getClass();
            pm0.v.X(new wr.e(jVar, Ri));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EmoticonThumbImageMgr", e17, "failed to generate thumb image for md5: " + interfaceC4987x84e327cb.mo42933xb5885648(), new java.lang.Object[0]);
            jVar.b();
        }
        return jz5.f0.f384359a;
    }
}
