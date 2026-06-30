package g4;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350092d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350093e;

    /* renamed from: f, reason: collision with root package name */
    public int f350094f;

    public t(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        g4.d1 prev = (g4.d1) obj;
        g4.d1 next = (g4.d1) obj2;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prev, "prev");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(next, "next");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        g4.t tVar = new g4.t(continuation);
        tVar.f350092d = prev;
        tVar.f350093e = next;
        return tVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350094f;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g4.d1 d1Var = (g4.d1) this.f350092d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return d1Var;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        g4.d1 d1Var2 = (g4.d1) this.f350092d;
        g4.d1 d1Var3 = (g4.d1) this.f350093e;
        this.f350092d = d1Var3;
        this.f350094f = 1;
        java.lang.Object b17 = ((h4.r) d1Var2.f349784a.f349945c.f360245a.mo141623x754a37bb()).f360219a.b(this);
        java.lang.Object obj2 = jz5.f0.f384359a;
        if (b17 != aVar) {
            b17 = obj2;
        }
        if (b17 != aVar) {
            b17 = obj2;
        }
        if (b17 != aVar) {
            b17 = obj2;
        }
        if (b17 == aVar) {
            obj2 = b17;
        }
        return obj2 == aVar ? aVar : d1Var3;
    }
}
