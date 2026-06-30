package zl2;

/* loaded from: classes3.dex */
public final class s1 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f555497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555499c;

    public s1(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, java.lang.String str2) {
        this.f555497a = interfaceC29045xdcb5ca57;
        this.f555498b = str;
        this.f555499c = str2;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f555497a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveUtil", "[genSecurityData] downloadImage error:" + this.f555498b);
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        fo3.s sVar = fo3.s.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f555499c);
        java.util.ArrayList id6 = sVar.id(arrayList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(id6, "getSecSdkImageInfoBuffers(...)");
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.n0.Z(id6)));
    }
}
