package p012xc85e97e9.p117xd10bdbf0.p120x31aa22.p121xbddafb2a;

@qz5.f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45665x7309a58f}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1 */
/* loaded from: classes14.dex */
public final class C1226x9cfd029b extends qz5.l implements yz5.p {

    /* renamed from: $consumer */
    final /* synthetic */ m3.a f3855xb7c8201a;

    /* renamed from: $flow */
    final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f3856x22b4f52;

    /* renamed from: label */
    int f3857x61f7ef4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226x9cfd029b(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, m3.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super p012xc85e97e9.p117xd10bdbf0.p120x31aa22.p121xbddafb2a.C1226x9cfd029b> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f3856x22b4f52 = jVar;
        this.f3855xb7c8201a = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        return new p012xc85e97e9.p117xd10bdbf0.p120x31aa22.p121xbddafb2a.C1226x9cfd029b(this.f3856x22b4f52, this.f3855xb7c8201a, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f3857x61f7ef4;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = this.f3856x22b4f52;
            final m3.a aVar2 = this.f3855xb7c8201a;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = new p3325xe03a0797.p3326xc267989b.p3328x30012e.k() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
                /* renamed from: emit */
                public java.lang.Object mo771x2f8fd3(T t17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
                    m3.a.this.mo3938xab27b508(t17);
                    return jz5.f0.f384359a;
                }
            };
            this.f3857x61f7ef4 = 1;
            if (jVar.a(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
        return ((p012xc85e97e9.p117xd10bdbf0.p120x31aa22.p121xbddafb2a.C1226x9cfd029b) mo148xaf65a0fc(y0Var, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}
