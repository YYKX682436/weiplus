package bg2;

/* loaded from: classes3.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f101490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f101491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(bg2.d0 d0Var, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101490d = d0Var;
        this.f101491e = linkedList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.c0(this.f101490d, this.f101491e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.c0 c0Var = (bg2.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.d0 d0Var = this.f101490d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = d0Var.f101535i;
        java.util.LinkedList linkedList = this.f101491e;
        synchronized (concurrentLinkedQueue) {
            d0Var.f101535i.addAll(linkedList);
        }
        return jz5.f0.f384359a;
    }
}
