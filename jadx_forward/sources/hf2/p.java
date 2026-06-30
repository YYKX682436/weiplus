package hf2;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hf2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362667e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.p(this.f362667e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f362666d;
        hf2.x xVar = this.f362667e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).getClass();
            r45.h84 h84Var = xVar.f362719r;
            if (h84Var == null || (str = h84Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            java.io.File Q6 = ((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).Q6(str);
            if (Q6 == null || !Q6.exists()) {
                xVar.f362723v = true;
            } else {
                this.f362666d = 2;
                if (hf2.x.Z6(xVar, "setTextBitmap", this) == aVar) {
                    return aVar;
                }
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap != null) {
                d75.b.g(new hf2.o(xVar, bitmap));
            }
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
