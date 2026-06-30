package qn2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f446749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f446750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f446751i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str, java.lang.String str2, qn2.l1 l1Var, r45.h32 h32Var, tx2.i0 i0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446747e = str;
        this.f446748f = str2;
        this.f446749g = l1Var;
        this.f446750h = h32Var;
        this.f446751i = i0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qn2.y0(this.f446747e, this.f446748f, this.f446749g, this.f446750h, this.f446751i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f446746d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p944x882e457a.i mj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mj(this.f446747e, this.f446748f, 1, null, 9999999);
            this.f446746d = 1;
            obj = rm0.h.b(mj6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        qn2.l1 l1Var = this.f446749g;
        if (b17) {
            r45.h32 h32Var = this.f446750h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
            h32Var.set(1, 0);
            this.f446751i.z(this.f446747e, h32Var, null);
            qo0.c.a(l1Var.f446624a.A, qo0.b.f446945s3, null, 2, null);
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(l1Var.f446628e, "reserve notice fail " + this.f446748f + ' ' + fVar.f152148a + ' ' + fVar.f152149b);
        android.view.ViewGroup viewGroup = l1Var.f446625b;
        android.content.Context context = viewGroup.getContext();
        java.lang.String str = fVar.f152150c;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oss);
        }
        db5.t7.m(context, str);
        return f0Var;
    }
}
