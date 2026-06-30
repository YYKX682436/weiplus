package at4;

/* loaded from: classes8.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f13874a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f13875b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13876c;

    public static at4.j0 b(int i17, int i18) {
        at4.j0 j0Var = new at4.j0();
        j0Var.f13876c = false;
        j0Var.f13874a = i17;
        j0Var.f13875b = "";
        return j0Var;
    }

    public static at4.j0 c(int i17, java.lang.String str) {
        at4.j0 j0Var = new at4.j0();
        j0Var.f13876c = true;
        j0Var.f13874a = i17;
        j0Var.f13875b = str;
        return j0Var;
    }

    public void a(android.content.Context context, boolean z17) {
        if (!this.f13876c) {
            db5.e1.F(context, context.getString(com.tencent.mm.R.string.kpu), "", false);
            return;
        }
        if ((context instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI ? np5.t.a((com.tencent.mm.wallet_core.ui.WalletBaseUI) context, null, 1000, this.f13874a, this.f13875b) : false) || com.tencent.mm.sdk.platformtools.t8.K0(this.f13875b)) {
            return;
        }
        if (z17) {
            dp.a.makeText(context, this.f13875b, 1).show();
        } else {
            db5.e1.F(context, this.f13875b, "", false);
        }
    }
}
