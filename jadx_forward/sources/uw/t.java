package uw;

/* loaded from: classes.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f513041d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f513042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uw.y f513043f;

    /* renamed from: g, reason: collision with root package name */
    public int f513044g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(uw.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f513043f = yVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f513042e = obj;
        this.f513044g |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f513043f.a(this);
        return a17 == pz5.a.f440719d ? a17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(a17);
    }
}
