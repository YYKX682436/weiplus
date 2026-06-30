package qn2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f446570f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String str, qn2.l1 l1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446569e = str;
        this.f446570f = l1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qn2.a1(this.f446569e, this.f446570f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f446568d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            db2.b1 b1Var = new db2.b1(this.f446569e, null, null, 0, null, null, null, null, 0, null, null, 2046, null);
            this.f446568d = 1;
            b17 = rm0.h.b(b1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        r45.h32 h32Var = (r45.h32) ((r45.v71) fVar.f152151d).m75936x14adae67(1);
        boolean b18 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        qn2.l1 l1Var = this.f446570f;
        if (b18) {
            if (!(h32Var == null)) {
                if (zl2.t.e(h32Var)) {
                    qo0.c.a(l1Var.f446624a.A, qo0.b.f446945s3, null, 2, null);
                } else {
                    java.lang.String str = ((mm2.c1) l1Var.f446624a.P0(mm2.c1.class)).f410385o;
                    android.content.Context context = l1Var.f446625b.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    tx2.i0 i0Var = new tx2.i0(context, zl2.u4.f555523f, 0, 4, null);
                    qn2.l1 l1Var2 = this.f446570f;
                    java.lang.String str2 = this.f446569e;
                    i0Var.z(str, h32Var, null);
                    i0Var.A(new qn2.z0(l1Var2, str, str2, h32Var, i0Var));
                    i0Var.w();
                }
                return f0Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(l1Var.f446628e, "get notice fail " + this.f446569e + ' ' + fVar.f152148a + ' ' + fVar.f152149b);
        return f0Var;
    }
}
