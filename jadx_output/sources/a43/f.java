package a43;

/* loaded from: classes11.dex */
public class f implements com.tencent.mm.pluginsdk.ui.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n1 f1215b;

    public f(a43.g gVar, java.lang.String str, com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        this.f1214a = str;
        this.f1215b = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.l1
    public boolean U(java.lang.String str) {
        if (!this.f1214a.equals(str)) {
            return true;
        }
        com.tencent.mm.pluginsdk.ui.n1 n1Var = this.f1215b;
        n1Var.a();
        n1Var.f190903o = null;
        return true;
    }
}
