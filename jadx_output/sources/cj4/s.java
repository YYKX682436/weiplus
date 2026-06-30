package cj4;

/* loaded from: classes11.dex */
public final class s extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f42031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42032b;

    public s(cj4.a0 a0Var, java.lang.String str) {
        this.f42031a = a0Var;
        this.f42032b = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        bk4.c2 c2Var;
        kotlin.jvm.internal.o.g(view, "view");
        cj4.a0 a0Var = this.f42031a;
        java.lang.String str = a0Var.D1;
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = a0Var.f41945g;
        if (longTextView != null) {
            longTextView.getTextviewSuffixWrapper();
        }
        if (z17) {
            java.lang.String str2 = this.f42032b;
            if ((str2 == null || str2.length() == 0) || (c2Var = a0Var.P1) == null) {
                return;
            }
            if (!c2Var.f21414e) {
                c2Var.f21420k = new cj4.r(a0Var, view, c2Var);
            } else {
                java.lang.String str3 = a0Var.D1;
                a0Var.S(c2Var.f21413d);
            }
        }
    }
}
