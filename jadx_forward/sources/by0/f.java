package by0;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f117862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f117863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, com.p314xaae8f345.mm.vfs.r6 r6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f117862d = interfaceC4987x84e327cb;
        this.f117863e = r6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new by0.f(this.f117862d, this.f117863e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((by0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        byte[] z17;
        int S;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.vfs.r6 r6Var = by0.g.f117864a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f117862d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interfaceC4987x84e327cb, "<this>");
        com.p314xaae8f345.mm.vfs.r6 tempFile = this.f117863e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempFile, "tempFile");
        if (interfaceC4987x84e327cb.mo42929x747e9cc9() == 17) {
            z17 = kk.f.b(h12.e.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, interfaceC4987x84e327cb.mo42934xfb82e301()));
        } else if (interfaceC4987x84e327cb.I1()) {
            android.graphics.Bitmap W = interfaceC4987x84e327cb.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getStaticBitmap(...)");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            W.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            z17 = byteArrayOutputStream.toByteArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "toByteArray(...)");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6.class))).getClass();
            z17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb);
        }
        if (z17 == null) {
            S = -100;
        } else {
            S = z17.length == 0 ? -101 : com.p314xaae8f345.mm.vfs.w6.S(tempFile.o(), z17, 0, z17.length);
        }
        return new java.lang.Integer(S);
    }
}
