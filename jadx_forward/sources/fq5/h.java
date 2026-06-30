package fq5;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f347201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f347202e = c22927xe8447aa8;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fq5.h(this.f347202e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fq5.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f347201d;
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347202e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aq5.p0 p0Var = aq5.p0.f94806a;
            bw5.wd0 wd0Var = c22927xe8447aa8.f295811g;
            this.f347201d = 1;
            obj = p0Var.b(wd0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        aq5.w0 w0Var = (aq5.w0) obj;
        c22927xe8447aa8.f295813i = w0Var.f94863b;
        byte[] bArr = w0Var.f94862a;
        if (bArr != null) {
            int f17 = i65.a.f(c22927xe8447aa8.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561216ci);
            android.graphics.Bitmap I = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr, f17, f17, null);
            if (I != null) {
                android.graphics.Bitmap o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o(I, android.graphics.Color.parseColor("#FF2394C5"), android.graphics.Color.parseColor("#FF4372D4"));
                em.j4 j4Var = c22927xe8447aa8.f295809e;
                if (j4Var != null) {
                    if (j4Var.f336020l == null) {
                        j4Var.f336020l = (android.widget.ImageView) j4Var.f336009a.findViewById(com.p314xaae8f345.mm.R.id.uvr);
                    }
                    android.widget.ImageView imageView = j4Var.f336020l;
                    if (imageView != null) {
                        imageView.post(new fq5.g(c22927xe8447aa8, o17));
                    }
                }
            }
        } else {
            c22927xe8447aa8.V6(5);
        }
        return jz5.f0.f384359a;
    }
}
