package wh5;

/* loaded from: classes12.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f527615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wh5.s sVar, java.lang.String str) {
        super(1);
        this.f527615d = sVar;
        this.f527616e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = this.f527616e;
        wh5.s sVar = this.f527615d;
        if (intValue == 0) {
            sVar.C.add(str);
        } else {
            sVar.C.remove(str);
        }
        return jz5.f0.f384359a;
    }
}
