package ut2;

/* loaded from: classes3.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512370g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(ut2.s3 s3Var, gk2.e eVar, cm2.m0 m0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512368e = s3Var;
        this.f512369f = eVar;
        this.f512370g = m0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut2.b3(this.f512368e, this.f512369f, this.f512370g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.b3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512367d;
        ut2.s3 s3Var = this.f512368e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j18 = this.f512370g.f124902w;
            this.f512367d = 1;
            int i18 = ut2.s3.f512602l1;
            s3Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            r45.ld2 ld2Var = new r45.ld2();
            gk2.e eVar = this.f512369f;
            ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
            r45.r32 r32Var = new r45.r32();
            r32Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
            r32Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            r32Var.set(3, pm0.b0.h(((mm2.e1) eVar.a(mm2.e1.class)).f410518o));
            r32Var.set(4, java.lang.Long.valueOf(j18));
            ke2.o0 o0Var = new ke2.o0("/cgi-bin/mmbiz-bin/finderliveopenprehotproductprice", 7247, r32Var, ld2Var, null);
            android.content.Context context = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            az2.j.u(o0Var, context, null, 0L, 6, null);
            o0Var.l().K(new ut2.n1(nVar));
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
        }
        if (((java.lang.Boolean) j17).booleanValue()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s3Var.L;
            tt2.e1 e1Var = f2Var instanceof tt2.e1 ? (tt2.e1) f2Var : null;
            if (e1Var != null) {
                e1Var.Z(false);
            }
        } else {
            db5.t7.g(s3Var.f3639x46306858.getContext(), s3Var.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3w));
        }
        return jz5.f0.f384359a;
    }
}
