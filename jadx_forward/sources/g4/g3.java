package g4;

/* loaded from: classes4.dex */
public final class g3 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f349852d = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        return new g4.g3(this.f349852d, completion);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((g4.g3) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return this.f349852d.mo152xb9724478();
    }
}
