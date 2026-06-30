package h4;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f360239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.y f360240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.w f360241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h4.y yVar, u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f360240e = yVar;
        this.f360241f = wVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k create = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(create, "$this$create");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        return new h4.x(this.f360240e, this.f360241f, continuation).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360239d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h4.r rVar = (h4.r) this.f360240e.f360244f.f360245a.mo141623x754a37bb();
            this.f360239d = 1;
            rVar.getClass();
            java.lang.Object t17 = ((u26.o) rVar.f360219a.f360211a).t(new h4.p(this.f360241f), this);
            if (t17 != aVar) {
                t17 = f0Var;
            }
            if (t17 != aVar) {
                t17 = f0Var;
            }
            if (t17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
