package nd3;

/* loaded from: classes.dex */
public final class a implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nd3.b f418005d;

    public a(nd3.b bVar) {
        this.f418005d = bVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        nd3.b bVar = this.f418005d;
        if (intValue == 0) {
            bVar.s().mo146xb9724478(bVar.k());
        } else {
            bVar.s().mo146xb9724478(bVar.h(2, errMsg));
        }
        return jz5.f0.f384359a;
    }
}
