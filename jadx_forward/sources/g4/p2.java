package g4;

/* loaded from: classes5.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350018d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f350019e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f350020f;

    /* renamed from: g, reason: collision with root package name */
    public int f350021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f350022h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(g4.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350022h = y2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.p2 p2Var = new g4.p2(this.f350022h, completion);
        p2Var.f350018d = obj;
        return p2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.p2) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ca  */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlinx.coroutines.sync.d] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.p2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
