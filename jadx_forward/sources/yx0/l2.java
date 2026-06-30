package yx0;

/* loaded from: classes5.dex */
public final class l2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f548962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548963e;

    /* renamed from: f, reason: collision with root package name */
    public int f548964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f548963e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f548962d = obj;
        this.f548964f |= Integer.MIN_VALUE;
        return this.f548963e.O(this);
    }
}
