package aw2;

/* loaded from: classes10.dex */
public final class c0 implements ya2.r1, com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f14724d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f14725e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f14726f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f14727g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f14728h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f14729i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f14730m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f14731n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f14732o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14733p;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
    
        if (r13 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(com.tencent.mm.ui.MMActivity r12, com.tencent.mm.ui.tools.f5 r13) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw2.c0.<init>(com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.tools.f5):void");
    }

    public static final void a(aw2.c0 c0Var) {
        c0Var.f14725e.d();
        com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView d17 = c0Var.d();
        java.lang.String highlightTopic = c0Var.f14732o;
        d17.getClass();
        kotlin.jvm.internal.o.g(highlightTopic, "highlightTopic");
        d17.setVisibility(0);
        com.tencent.mm.ui.widget.MMEditText mMEditText = d17.f131128f;
        mMEditText.setText(highlightTopic);
        mMEditText.requestFocus();
        mMEditText.setSelection(highlightTopic.length());
        c0Var.d().post(new aw2.x(c0Var));
    }

    public final void b() {
        this.f14725e.f();
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f14726f).getValue()).d();
        this.f14724d.hideVKB();
        d().setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = 0;
        d().setLayoutParams(layoutParams2);
    }

    public final com.tencent.mm.plugin.finder.view.FinderJumperView c() {
        return (com.tencent.mm.plugin.finder.view.FinderJumperView) this.f14727g.getValue();
    }

    public final com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView d() {
        return (com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView) ((jz5.n) this.f14729i).getValue();
    }

    public final void e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderHighlightTopicWidget", "setHighlightTopic highlightTopic" + str);
        this.f14732o = str;
        if (str.length() == 0) {
            c().b();
            return;
        }
        java.lang.String string = this.f14724d.getResources().getString(com.tencent.mm.R.string.f491993m16, str);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.FinderJumperView c17 = c();
        kotlin.jvm.internal.o.f(c17, "<get-chooseView>(...)");
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(c17, string, false, 2, null);
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        com.tencent.mars.xlog.Log.i("FinderHighlightTopicWidget", "show: bottomMargin:" + layoutParams2.bottomMargin + " keyboardHeight:" + i17);
        if (layoutParams2.bottomMargin != i17) {
            aw2.z zVar = new aw2.z(this, i17);
            if (i17 != 0) {
                zVar.setDuration(200L);
            } else {
                zVar.setDuration(300L);
            }
            d().startAnimation(zVar);
        }
        d().setVisibility(0);
    }
}
