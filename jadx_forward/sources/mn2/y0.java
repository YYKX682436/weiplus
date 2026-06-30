package mn2;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411698d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f411700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f411701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cp0.n f411702h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.graphics.Bitmap bitmap, cp0.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f411700f = h0Var;
        this.f411701g = bitmap;
        this.f411702h = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mn2.y0 y0Var = new mn2.y0(this.f411700f, this.f411701g, this.f411702h, interfaceC29045xdcb5ca57);
        y0Var.f411699e = obj;
        return y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mn2.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f411698d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f411699e;
            u26.w a17 = u26.z.a(0, null, null, 7, null);
            um5.p pVar = new um5.p();
            android.graphics.Bitmap bitmap = this.f411701g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            pVar.l(bitmap);
            this.f411702h.getClass();
            int width = bitmap.getWidth();
            pVar.j(width, a06.d.b(((width * 1.0f) * bitmap.getHeight()) / bitmap.getWidth()));
            pVar.d();
            pVar.f510741q = new mn2.v0(pVar);
            pVar.f510726b.d();
            pVar.i(new mn2.x0(y0Var, a17, bitmap));
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f411700f;
            this.f411699e = h0Var2;
            this.f411698d = 1;
            java.lang.Object r17 = ((u26.k) a17).r(this);
            if (r17 == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            obj = r17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f411699e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        h0Var.f391656d = obj;
        return jz5.f0.f384359a;
    }
}
