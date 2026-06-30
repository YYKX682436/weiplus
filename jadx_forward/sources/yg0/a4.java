package yg0;

/* loaded from: classes8.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f543680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(int i17) {
        super(2);
        this.f543680d = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String event = (java.lang.String) obj;
        java.lang.String _data = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_data, "_data");
        if (event.length() > 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6265xefb8191d c6265xefb8191d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6265xefb8191d();
            int i17 = this.f543680d;
            am.j20 j20Var = c6265xefb8191d.f136515g;
            j20Var.f88538a = i17;
            j20Var.f88539b = event;
            j20Var.f88540c = _data;
            c6265xefb8191d.e();
        }
        return jz5.f0.f384359a;
    }
}
