package bd4;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f19397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f19398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17, com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19395d = i17;
        this.f19396e = improveContentView;
        this.f19397f = f0Var;
        this.f19398g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        bd4.u uVar = new bd4.u(this.f19395d, this.f19396e, this.f19397f, this.f19398g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        bd4.u uVar = (bd4.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        bd4.f2 f2Var;
        bd4.f2 f2Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19396e;
        int width = improveContentView.getWidth();
        int i17 = this.f19395d;
        kotlin.jvm.internal.f0 f0Var = this.f19397f;
        if (i17 != width) {
            f0Var.f310116d = ad4.y.f3210a.g(improveContentView.getContentTv(), (java.lang.CharSequence) this.f19398g.f310123d, improveContentView.getWidth());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            xc4.p o17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.o(improveContentView);
            sb6.append(o17 != null ? o17.a1() : null);
            sb6.append(", ");
            sb6.append(i17);
            sb6.append(", ");
            sb6.append(improveContentView.getWidth());
            sb6.append(", lineCount:");
            sb6.append(f0Var.f310116d);
            com.tencent.mars.xlog.Log.i(improveContentView.f169124p, sb6.toString());
        }
        int i18 = f0Var.f310116d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$switchShrinkModeWithLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchShrinkModeWithLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        boolean z17 = improveContentView.f169123o;
        java.lang.String str = improveContentView.f169125q;
        if (z17) {
            int i19 = improveContentView.f169134z == 0 ? 6 : 2;
            if (i18 > i19) {
                improveContentView.getContentTv().setMaxLines(i19);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = improveContentView.f169129u;
                if (improveTextView == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView.setTag(2);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView2 = improveContentView.f169129u;
                if (improveTextView2 == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView2.setText(str);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView3 = improveContentView.f169129u;
                if (improveTextView3 == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView3.setVisibility(0);
                pc4.d dVar = pc4.d.f353410a;
                if (dVar.b(false)) {
                    int t17 = improveContentView.t();
                    if (t17 >= 0 && (f2Var = improveContentView.B) != null) {
                        f2Var.C(true, t17);
                    }
                } else if (!dVar.b(false)) {
                    improveContentView.getContentTv().setOnClickListener(new bd4.f0(improveContentView));
                }
            } else {
                improveContentView.getContentTv().setMaxLines(Integer.MAX_VALUE);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView4 = improveContentView.f169129u;
                if (improveTextView4 == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView4.setVisibility(8);
                improveContentView.getContentTv().setOnClickListener(null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchShrinkModeWithLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        } else {
            if (i18 > 5) {
                improveContentView.getContentTv().setMaxLines(5);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView5 = improveContentView.f169129u;
                if (improveTextView5 == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView5.setTag(2);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView6 = improveContentView.f169129u;
                if (improveTextView6 == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView6.setText(str);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView7 = improveContentView.f169129u;
                if (improveTextView7 == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView7.setVisibility(0);
                pc4.d dVar2 = pc4.d.f353410a;
                if (dVar2.b(false)) {
                    int t18 = improveContentView.t();
                    if (t18 >= 0 && (f2Var2 = improveContentView.B) != null) {
                        f2Var2.C(true, t18);
                    }
                } else if (!dVar2.b(false)) {
                    improveContentView.getContentTv().setOnClickListener(new bd4.e0(improveContentView));
                }
            } else {
                improveContentView.getContentTv().setMaxLines(5);
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView8 = improveContentView.f169129u;
                if (improveTextView8 == null) {
                    kotlin.jvm.internal.o.o("opTv");
                    throw null;
                }
                improveTextView8.setVisibility(8);
                improveContentView.getContentTv().setOnClickListener(null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchShrinkModeWithLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$switchShrinkModeWithLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        improveContentView.getContentTv().setCustomText(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.m(improveContentView));
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1$1");
        return f0Var2;
    }
}
