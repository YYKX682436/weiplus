package b63;

/* loaded from: classes11.dex */
public class j implements com.tencent.mm.pluginsdk.ui.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n1 f18153b;

    public j(b63.k kVar, java.lang.String str, com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        this.f18152a = str;
        this.f18153b = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.l1
    public boolean U(java.lang.String str) {
        if (!this.f18152a.equals(str)) {
            return true;
        }
        com.tencent.mm.pluginsdk.ui.n1 n1Var = this.f18153b;
        n1Var.a();
        n1Var.f190903o = null;
        return true;
    }
}
