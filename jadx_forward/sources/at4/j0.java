package at4;

/* loaded from: classes8.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f95407a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f95408b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95409c;

    public static at4.j0 b(int i17, int i18) {
        at4.j0 j0Var = new at4.j0();
        j0Var.f95409c = false;
        j0Var.f95407a = i17;
        j0Var.f95408b = "";
        return j0Var;
    }

    public static at4.j0 c(int i17, java.lang.String str) {
        at4.j0 j0Var = new at4.j0();
        j0Var.f95409c = true;
        j0Var.f95407a = i17;
        j0Var.f95408b = str;
        return j0Var;
    }

    public void a(android.content.Context context, boolean z17) {
        if (!this.f95409c) {
            db5.e1.F(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu), "", false);
            return;
        }
        if ((context instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e ? np5.t.a((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) context, null, 1000, this.f95407a, this.f95408b) : false) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f95408b)) {
            return;
        }
        if (z17) {
            dp.a.m125854x26a183b(context, this.f95408b, 1).show();
        } else {
            db5.e1.F(context, this.f95408b, "", false);
        }
    }
}
