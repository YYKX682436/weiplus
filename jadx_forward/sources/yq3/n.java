package yq3;

/* loaded from: classes11.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f546047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yq3.v vVar) {
        super(0);
        this.f546047d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        yq3.v vVar = this.f546047d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
        java.lang.String str3 = null;
        if (z3Var != null && (str2 = z3Var.E1) != null) {
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = vVar.f546069g;
        if (yaVar != null && (str = yaVar.f66691xf9f876b1) != null) {
            if (str.length() > 0) {
                str3 = str;
            }
        }
        return str3 == null ? "" : str3;
    }
}
