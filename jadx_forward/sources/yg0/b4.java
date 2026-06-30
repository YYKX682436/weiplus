package yg0;

/* loaded from: classes8.dex */
public final class b4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f543691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(yz5.p pVar, int i17) {
        super(2);
        this.f543691d = pVar;
        this.f543692e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String status = (java.lang.String) obj;
        java.lang.String str = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.lang.String str2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, "STATE_DRAGGING") ? "heightWillChange" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, "STATE_IDLE") ? "heightDidChange" : "";
        if (str2.length() > 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6265xefb8191d c6265xefb8191d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6265xefb8191d();
            int i17 = this.f543692e;
            am.j20 j20Var = c6265xefb8191d.f136515g;
            j20Var.f88538a = i17;
            j20Var.f88539b = str2;
            c6265xefb8191d.e();
        }
        yz5.p pVar = this.f543691d;
        if (pVar == null) {
            return null;
        }
        pVar.mo149xb9724478(status, str);
        return jz5.f0.f384359a;
    }
}
