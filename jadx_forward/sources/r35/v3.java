package r35;

/* loaded from: classes11.dex */
public class v3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.w3 f450844d;

    public v3(r35.w3 w3Var) {
        this.f450844d = w3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        r35.e4 e4Var = this.f450844d.f450852d;
        if (e4Var.f450621h == null) {
            return false;
        }
        java.lang.String trim = e4Var.f450622i.m79028xfb85ada3().toString().trim();
        android.content.Context context = e4Var.f450620g;
        e4Var.f450617d = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), e4Var.f450620g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new r35.z3(e4Var));
        e4Var.f450627q = trim;
        if (e4Var.f450623m.size() == 1 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) e4Var.f450623m.getFirst())) {
            e4Var.c();
            return false;
        }
        e4Var.b();
        return false;
    }
}
