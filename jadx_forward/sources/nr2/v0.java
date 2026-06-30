package nr2;

/* loaded from: classes2.dex */
public final class v0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f420855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f420856e;

    /* renamed from: f, reason: collision with root package name */
    public int f420857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(nr2.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f420856e = i1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f420855d = obj;
        this.f420857f |= Integer.MIN_VALUE;
        java.lang.Object a17 = nr2.i1.a(this.f420856e, null, this);
        return a17 == pz5.a.f440719d ? a17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(a17);
    }
}
