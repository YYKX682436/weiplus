package cj4;

/* loaded from: classes11.dex */
public final class d0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f41919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.LongTextView f41920b;

    public d0(cj4.i1 i1Var, com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView) {
        this.f41919a = i1Var;
        this.f41920b = longTextView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        bk4.c2 textviewSuffixWrapper;
        kotlin.jvm.internal.o.g(view, "view");
        cj4.i1 i1Var = this.f41919a;
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = i1Var.f41945g;
        if (longTextView != null) {
            longTextView.getTextviewSuffixWrapper();
        }
        if (!z17 || (textviewSuffixWrapper = this.f41920b.getTextviewSuffixWrapper()) == null) {
            return;
        }
        if (textviewSuffixWrapper.f21414e) {
            i1Var.S(textviewSuffixWrapper.f21413d);
            return;
        }
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView2 = i1Var.f41945g;
        if (longTextView2 != null) {
            longTextView2.setFullTextLineCountChangeListener(new cj4.c0(view, i1Var));
        }
    }
}
