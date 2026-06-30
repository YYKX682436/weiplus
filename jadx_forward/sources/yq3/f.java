package yq3;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f546039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yq3.v vVar) {
        super(0);
        this.f546039d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String w07;
        yq3.v vVar = this.f546039d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
        java.lang.String str2 = null;
        if (z3Var != null && (w07 = z3Var.w0()) != null) {
            if (!(w07.length() > 0)) {
                w07 = null;
            }
            if (w07 != null) {
                return w07;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = vVar.f546069g;
        if (yaVar != null && (str = yaVar.f66692x4854b29d) != null) {
            if (str.length() > 0) {
                str2 = str;
            }
        }
        return str2 == null ? "" : str2;
    }
}
