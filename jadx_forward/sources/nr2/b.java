package nr2;

/* loaded from: classes2.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f420695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.l f420696e;

    /* renamed from: f, reason: collision with root package name */
    public int f420697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nr2.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f420696e = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f420695d = obj;
        this.f420697f |= Integer.MIN_VALUE;
        java.lang.Object O6 = nr2.l.O6(this.f420696e, null, this);
        return O6 == pz5.a.f440719d ? O6 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(O6);
    }
}
