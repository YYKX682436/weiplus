package bd4;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f19400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19401e = improveContentView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
        bd4.v vVar = new bd4.v(this.f19401e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
        java.lang.Object invokeSuspend = ((bd4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar;
        int i17;
        kotlin.jvm.internal.f0 f0Var;
        kotlin.jvm.internal.h0 h0Var;
        java.lang.String str;
        java.lang.String str2 = "invokeSuspend";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
        pz5.a aVar2 = pz5.a.f359186d;
        int i18 = this.f19400d;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19401e;
            int width = improveContentView.getWidth();
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ad4.y yVar = ad4.y.f3210a;
            java.lang.CharSequence m17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.m(improveContentView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generatePostContentForMeasure", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String valueOf = java.lang.String.valueOf(m17);
            com.tencent.mm.plugin.sns.ui.widget.h3.a();
            com.tencent.mm.plugin.sns.ui.widget.h3 h3Var = com.tencent.mm.plugin.sns.ui.widget.h3.f171151e;
            float b17 = h3Var.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            com.tencent.mm.pluginsdk.ui.span.f0 f0Var3 = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.k(context, true, valueOf, (int) b17, 2, null, null, -1, true));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
            java.lang.CharSequence a17 = com.tencent.mm.plugin.sns.model.j4.f() > 0 ? com.tencent.mm.plugin.sns.ui.widget.i3.a(f0Var3) : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generatePostContentForMeasure", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            h0Var2.f310123d = a17;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            f0Var2.f310116d = yVar.g(improveContentView.getContentTv(), (java.lang.CharSequence) h0Var2.f310123d, width);
            long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
            long currentTimeMillis5 = java.lang.System.currentTimeMillis();
            java.lang.CharSequence m18 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.m(improveContentView);
            xc4.p o17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.o(improveContentView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateMainContentSpan", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            if (com.tencent.mm.sdk.platformtools.t8.J0(m18) || o17 == null) {
                aVar = aVar2;
                i17 = width;
                f0Var = f0Var2;
                h0Var = h0Var2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateMainContentSpan", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            } else {
                aVar = aVar2;
                android.os.Bundle bundle = new android.os.Bundle();
                h0Var = h0Var2;
                i17 = width;
                bundle.putString("key_wxa_short_link_launch_scene", "TIME_LINE");
                com.tencent.mm.plugin.wallet_core.utils.t tVar = com.tencent.mm.plugin.wallet_core.utils.t.f180986a;
                com.tencent.mm.plugin.sns.storage.SnsInfo c17 = o17.c1();
                tVar.b(bundle, c17 != null ? c17.getUserName() : null);
                bundle.putInt("ShareScene", 3);
                bundle.putString("serverMsgID", o17.a1());
                bundle.putString("msgUsername", o17.c1().getUserName());
                bundle.putString("ShareSceneId", o17.c1().getUserName() + '#' + o17.a1());
                f0Var = f0Var2;
                bundle.putLong("CreateTime", (long) o17.c1().getCreateTime());
                bundle.putInt("TimelineEnterSource", 1);
                bundle.putInt("SnsContentType", o17.c1().field_type);
                bundle.putInt("SnsLocalId", (int) o17.U0());
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String valueOf2 = java.lang.String.valueOf(m18);
                com.tencent.mm.plugin.sns.ui.widget.h3.a();
                m18 = com.tencent.mm.plugin.sns.model.j4.f() > 0 ? com.tencent.mm.plugin.sns.ui.widget.i3.a(com.tencent.mm.plugin.sns.ui.widget.i3.b(context2, valueOf2, h3Var.b(), bundle, o17.c1().field_snsId, 2)) : null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateMainContentSpan", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            improveContentView.f169132x = m18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            ca4.e1 e1Var = ca4.f1.f39897a;
            xc4.p o18 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.o(improveContentView);
            e1Var.h(o18 != null ? o18.c1() : null, com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.m(improveContentView));
            long currentTimeMillis6 = java.lang.System.currentTimeMillis() - currentTimeMillis5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            xc4.p o19 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.o(improveContentView);
            sb6.append(o19 != null ? o19.a1() : null);
            sb6.append(" createTempCost:");
            sb6.append(currentTimeMillis2);
            sb6.append(", span cost:");
            sb6.append(currentTimeMillis6);
            sb6.append(", measureLineCost:");
            sb6.append(currentTimeMillis4);
            sb6.append(", lineCount:");
            kotlin.jvm.internal.f0 f0Var4 = f0Var;
            sb6.append(f0Var4.f310116d);
            com.tencent.mars.xlog.Log.i(improveContentView.f169124p, sb6.toString());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            bd4.u uVar = new bd4.u(i17, this.f19401e, f0Var4, h0Var, null);
            this.f19400d = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(g3Var, uVar, this);
            pz5.a aVar3 = aVar;
            if (g17 == aVar3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
                return aVar3;
            }
            str2 = "invokeSuspend";
            str = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1";
        } else {
            if (i18 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            str = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$setContentLineCount$1";
        }
        jz5.f0 f0Var5 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
        return f0Var5;
    }
}
