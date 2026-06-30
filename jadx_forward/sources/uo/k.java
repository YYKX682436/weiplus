package uo;

/* loaded from: classes12.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo.a f511050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f511051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uo.a aVar, yz5.p pVar) {
        super(1);
        this.f511050d = aVar;
        this.f511051e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        uo.a aVar = this.f511050d;
        if (booleanValue) {
            uo.n.f511055a.f(null);
        } else {
            uo.n.f511055a.h(aVar, this.f511051e);
        }
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = java.lang.String.valueOf(aVar.f511035d);
        strArr[1] = booleanValue ? "1" : "0";
        strArr[2] = java.lang.String.valueOf(aVar.f511034c);
        strArr[3] = java.lang.String.valueOf(aVar.f511036e);
        ap.a.a(1, "openCameraRetry", null, null, strArr);
        return jz5.f0.f384359a;
    }
}
