package yx0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548823e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.f(this.f548823e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548822d;
        yx0.b8 this_run = this.f548823e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this_run, "$this_run");
            this.f548822d = 1;
            if (yx0.b8.b(this_run, "ImportPreviewAIGCReachMaxDuration", true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this_run, "$this_run");
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
        this_run.f0("APP_AIGCRequestTimeout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this_run, "$this_run");
        this_run.n0();
        return jz5.f0.f384359a;
    }
}
