package zd5;

/* loaded from: classes9.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f553207d;

    /* renamed from: e, reason: collision with root package name */
    public int f553208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f553209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ae5.j f553210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, ae5.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553209f = k3Var;
        this.f553210g = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zd5.e(this.f553209f, this.f553210g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zd5.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f553208e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f553209f;
        ae5.j jVar = this.f553210g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
                zd5.d dVar = new zd5.d(jVar, h0Var2, k3Var, null);
                this.f553207d = h0Var2;
                this.f553208e = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, dVar, this) == aVar) {
                    return aVar;
                }
                h0Var = h0Var2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f553207d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            java.lang.Object obj2 = h0Var.f391656d;
            if (obj2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                if (!((android.graphics.Bitmap) obj2).isRecycled() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((zd5.r) k3Var).f553242i.getTag(), jVar.f85950g)) {
                    ((zd5.r) k3Var).f553242i.setImageBitmap((android.graphics.Bitmap) h0Var.f391656d);
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSMultiAllResultAdapter", "decode failed " + jVar.f85950g);
        }
        return jz5.f0.f384359a;
    }
}
