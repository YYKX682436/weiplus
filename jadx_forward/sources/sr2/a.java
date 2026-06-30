package sr2;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.c f493038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f493040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sr2.c cVar, java.lang.String str, boolean z17) {
        super(0);
        this.f493038d = cVar;
        this.f493039e = str;
        this.f493040f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sr2.c cVar = this.f493038d;
        java.lang.String str = this.f493039e;
        if (str == null) {
            str = "";
        }
        cVar.getClass();
        cVar.f493055d = str;
        if (this.f493040f) {
            sr2.c cVar2 = this.f493038d;
            java.lang.String str2 = cVar2.f493055d;
            cVar2.f493056e = o35.a.b(str2) && o35.a.g(str2) > 0;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f493038d.f493057f;
        if (u3Var != null && u3Var.isShowing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f493038d.f493057f;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            yz5.a aVar = this.f493038d.f493058g;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
