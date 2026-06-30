package zw;

/* loaded from: classes7.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f558038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f558039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f558040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558038d = h0Var;
        this.f558039e = lVar;
        this.f558040f = linkedList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zw.f(this.f558038d, this.f558039e, this.f558040f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zw.f fVar = (zw.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f558038d.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f558039e.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12(this.f558040f, null, null, null, 14, null));
        return jz5.f0.f384359a;
    }
}
