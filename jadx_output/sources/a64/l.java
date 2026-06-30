package a64;

/* loaded from: classes4.dex */
public final class l extends a64.j implements l75.q0 {
    public android.widget.LinearLayout A;
    public android.widget.LinearLayout B;
    public android.view.View C;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo f1774r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f1775s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f1776t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f1777u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f1778v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f1779w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f1780x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f1781y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.Button f1782z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f1775s = "";
    }

    public final void S6(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOpenIMDescWording", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        if (!(str2 == null || str2.length() == 0)) {
            if (kotlin.jvm.internal.o.b("3552365301", str)) {
                str2 = "@" + str2;
            }
            android.widget.TextView textView = this.f1781y;
            if (textView != null) {
                textView.setText(str2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateOpenIMDescWording", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c8, code lost:
    
        if (r8 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e2, code lost:
    
        if (r8 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fc, code lost:
    
        if (r8 != null) goto L101;
     */
    @Override // a64.e, com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a64.l.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).getClass();
        ((i41.l) i95.n0.c(i41.l.class)).Ui().remove(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            return;
        }
        if (w0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            return;
        }
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo = this.f1774r;
        java.lang.String b17 = adJumpKefuConfirmInfo != null ? adJumpKefuConfirmInfo.b() : null;
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo2 = this.f1774r;
        java.lang.String Ai = ((l41.q2) b0Var).Ai(w0Var, b17, adJumpKefuConfirmInfo2 != null ? adJumpKefuConfirmInfo2.c() : null);
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo3 = this.f1774r;
        S6(adJumpKefuConfirmInfo3 != null ? adJumpKefuConfirmInfo3.b() : null, Ai);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
    }
}
