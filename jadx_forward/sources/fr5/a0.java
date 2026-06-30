package fr5;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f347423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f347424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f347425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ er5.g f347426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f347427h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f347428i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f347429m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(fr5.f0 f0Var, long j17, er5.g gVar, int i17, float f17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f347424e = f0Var;
        this.f347425f = j17;
        this.f347426g = gVar;
        this.f347427h = i17;
        this.f347428i = f17;
        this.f347429m = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fr5.a0(this.f347424e, this.f347425f, this.f347426g, this.f347427h, this.f347428i, this.f347429m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr5.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        fr5.f0 f0Var;
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f347423d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        float f17 = this.f347428i;
        int i19 = this.f347427h;
        fr5.f0 f0Var3 = this.f347424e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = f0Var3.f347475g;
            long j18 = this.f347425f;
            f0Var3.f347475g = zq5.l.e(j17, zq5.m.a(java.lang.Math.abs(zq5.l.b(j18)), java.lang.Math.abs(zq5.l.c(j18))));
            boolean z19 = f0Var3.f347470b;
            zq5.l lVar = f0Var3.f347472d;
            er5.g gVar = this.f347426g;
            boolean b17 = gVar.b(4);
            boolean b18 = gVar.b(2);
            boolean b19 = gVar.b(1);
            gVar.f337773a.d(new fr5.z(z19, this.f347427h, lVar, b17, b18, b19));
            if (z19) {
                return f0Var2;
            }
            hr5.a1 a1Var = gVar.f337775c;
            if (b17 && i19 == 1 && lVar != null) {
                f0Var3.f347473e = true;
                float c17 = (zq5.l.c(j18) / ((gr5.t) ((gr5.y) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) gVar.f337792t).mo144003x754a37bb()).f356488a).f356480b) + 1.0f;
                a1Var.f(8);
                er5.g gVar2 = this.f347426g;
                long j19 = lVar.f556613a;
                long j27 = zq5.l.f556610b;
                this.f347423d = 1;
                z17 = true;
                f0Var = f0Var3;
                if (gVar2.c(j19, j27, c17, 0.0f, this) == aVar) {
                    return aVar;
                }
                i17 = 2;
                z18 = false;
            } else {
                z17 = true;
                f0Var3.f347473e = false;
                if (b18 || b19) {
                    long j28 = b19 ? j18 : zq5.l.f556610b;
                    float f18 = b18 ? f17 : 1.0f;
                    a1Var.f(8);
                    er5.g gVar3 = this.f347426g;
                    long j29 = this.f347429m;
                    this.f347423d = 2;
                    z18 = false;
                    f0Var = f0Var3;
                    if (gVar3.c(j29, j28, f18, 0.0f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    z18 = false;
                    f0Var = f0Var3;
                }
                i17 = 2;
            }
        } else if (i18 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z17 = true;
            f0Var = f0Var3;
            i17 = 2;
            z18 = false;
        } else {
            if (i18 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z17 = true;
            f0Var = f0Var3;
            z18 = false;
            i17 = 2;
        }
        if (i19 == i17) {
            if (f17 != 1.0f) {
                z17 = z18;
            }
            if (!z17) {
                f0Var.f347474f = new zq5.l(this.f347429m);
            }
        }
        return f0Var2;
    }
}
