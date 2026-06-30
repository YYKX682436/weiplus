package yx0;

/* loaded from: classes5.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f549035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(boolean z17, java.lang.String str, yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549035e = z17;
        this.f549036f = str;
        this.f549037g = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.o3(this.f549035e, this.f549036f, this.f549037g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.o3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549034d;
        java.lang.String str = this.f549036f;
        yx0.b8 b8Var = this.f549037g;
        boolean z17 = this.f549035e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = z17 ? 1 : 2;
            if (!(str.length() > 0)) {
                ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) b8Var.f548710d).H0(str, z17, false);
                return jz5.f0.f384359a;
            }
            rt3.j jVar = rt3.j.f481073a;
            java.lang.String str2 = this.f549036f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r45.h53 h53Var = r45.h53.FromScene_PostPage;
            java.lang.String mo47331x9464277e = b8Var.f548710d.mo47331x9464277e();
            this.f549034d = 1;
            obj = jVar.a(str2, i18, currentTimeMillis, h53Var, mo47331x9464277e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) b8Var.f548710d).H0(str, z17, ((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f384359a;
    }
}
