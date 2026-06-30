package gx;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx.i f357708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gx.i iVar, java.lang.String str) {
        super(2);
        this.f357708d = iVar;
        this.f357709e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        gx.i iVar = this.f357708d;
        if (intValue == 0) {
            iVar.s().mo146xb9724478(iVar.k());
        } else {
            iVar.s().mo146xb9724478(iVar.j(lc3.x.f399469c, "flutter errCode:" + intValue + ", errMsg:" + str + ", frameSetName: " + this.f357709e));
        }
        return jz5.f0.f384359a;
    }
}
