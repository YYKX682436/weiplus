package z51;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f551757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.w f551758e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z51.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551758e = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z51.t(this.f551758e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap L;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f551757d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            z51.w wVar = this.f551758e;
            java.lang.String str = wVar.f551763h;
            wVar.getClass();
            wVar.f("safeGetBitmap >> thumbPath: " + str);
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
                float f17 = options.outWidth;
                float f18 = options.outHeight;
                wVar.f("safeGetBitmap >> bmWidth: " + f17 + " bmHeight: " + f18);
                while (f17 * f18 > 5242880.0f) {
                    wVar.g("thumbSize is to big, need to compress");
                    f18 *= 0.9f;
                    f17 *= 0.9f;
                }
                wVar.f("safeGetBitmap final >> bmWidth: " + f17 + " bmHeight: " + f18);
                L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str, (int) f17, (int) f18);
            } else {
                wVar.e(str + " is no exist");
                L = null;
            }
            h0Var.f391656d = L;
            if (L == null) {
                wVar.e("bitmap is null");
                return f0Var;
            }
            int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(wVar.f551763h).m43592x7a249f0b();
            wVar.f("degree : " + m43592x7a249f0b);
            h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0((android.graphics.Bitmap) h0Var.f391656d, (float) m43592x7a249f0b);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            z51.s sVar = new z51.s(wVar, h0Var, null);
            this.f551757d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
