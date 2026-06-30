package g4;

/* loaded from: classes5.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f350129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f350130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f350131f;

    /* renamed from: g, reason: collision with root package name */
    public int f350132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f350133h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(g4.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350133h = y2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        return new g4.w2(this.f350133h, completion);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.w2) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        g4.y2 y2Var;
        g4.z2 z2Var;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350132g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                y2Var = this.f350133h;
                z2Var = y2Var.f350167e;
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = z2Var.f350184a;
                this.f350129d = z2Var;
                this.f350130e = dVar;
                this.f350131f = y2Var;
                this.f350132g = 1;
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
                java.lang.Object b17 = kVar.b(null, this);
                obj2 = kVar;
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    return jz5.f0.f384359a;
                }
                y2Var = (g4.y2) this.f350131f;
                java.lang.Object obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f350130e;
                z2Var = (g4.z2) this.f350129d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                obj2 = obj3;
            }
            g4.c3 c3Var = z2Var.f350185b;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i0 i0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.i0(new g4.b3(c3Var, null), p3325xe03a0797.p3326xc267989b.p3328x30012e.l.g(c3Var.f349769h));
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            g4.a1 a1Var = g4.a1.PREPEND;
            this.f350129d = null;
            this.f350130e = null;
            this.f350131f = null;
            this.f350132g = 2;
            if (y2Var.b(i0Var, a1Var, this) == aVar) {
                return aVar;
            }
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            throw th6;
        }
    }
}
