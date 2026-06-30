package ls1;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ls1.e0 e0Var) {
        super(1);
        this.f402495d = e0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            str = "";
        }
        return java.lang.Boolean.valueOf(this.f402495d.Y0(str));
    }
}
