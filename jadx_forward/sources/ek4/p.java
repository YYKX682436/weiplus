package ek4;

/* loaded from: classes12.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.y f335212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ek4.s sVar, java.lang.String str, ek4.y yVar) {
        super(0);
        this.f335210d = sVar;
        this.f335211e = str;
        this.f335212f = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek4.s sVar = this.f335210d;
        java.util.HashMap hashMap = sVar.f335219b;
        java.lang.String str = this.f335211e;
        boolean containsKey = hashMap.containsKey(str);
        ek4.y yVar = this.f335212f;
        if (containsKey) {
            dn.c cVar = new dn.c();
            int d17 = ek4.s.d(sVar, str, cVar);
            if (yVar != null) {
                yVar.a(d17, cVar);
            }
        } else if (yVar != null) {
            yVar.a(-1, null);
        }
        return jz5.f0.f384359a;
    }
}
