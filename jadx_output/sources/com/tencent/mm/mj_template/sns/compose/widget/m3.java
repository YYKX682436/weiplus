package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f70070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f70072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f70073g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(int i17, com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70071e = i17;
        this.f70072f = c1Var;
        this.f70073g = m5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.m3(this.f70071e, this.f70072f, this.f70073g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f70070d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f70072f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f70071e;
            f0.r1 r1Var = c1Var.f69885p;
            this.f70070d = 1;
            w0.x xVar = f0.r1.f258206t;
            int i19 = r1Var.f258211e;
            float f17 = f0.f1.f258072a;
            if (!(((float) i18) >= 0.0f)) {
                throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i18 + ')').toString());
            }
            java.lang.Object a17 = b0.e3.a(r1Var, null, new f0.e1(r1Var, i18, i19, 0, null), this, 1, null);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c1Var.getClass();
        com.tencent.mm.mj_template.sns.compose.widget.m5 data = this.f70073g;
        kotlin.jvm.internal.o.g(data, "data");
        if (!data.f70079c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onMoreTemplateItemSelected: click unselectable item");
        }
        if (data instanceof com.tencent.mm.mj_template.sns.compose.widget.e5) {
            com.tencent.mm.mj_template.sns.compose.widget.c7 c7Var = c1Var.f69895z;
            java.lang.String str = data.f70077a;
            if (c7Var != null) {
                c7Var.a(this.f70071e, str);
            }
            com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var = (com.tencent.mm.mj_template.sns.compose.widget.e5) data;
            java.lang.String templateID = e5Var.f69947p.getTemplateID();
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = c1Var.f69884o;
            if (kotlin.jvm.internal.o.b(templateID, m5Var != null ? m5Var.f70077a : null)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onMoreTemplateItemSelected: no need to select " + str);
            } else if (c1Var.f69872c) {
                c1Var.a(e5Var, new com.tencent.mm.mj_template.sns.compose.widget.z0(c1Var, e5Var));
            } else {
                com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var2 = c1Var.f69884o;
                com.tencent.mm.mj_template.sns.compose.widget.r rVar = m5Var2 != null ? m5Var2.f70078b : null;
                if (rVar != null) {
                    rVar.b(false);
                }
                data.f70078b.b(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onTemplateSelected: id=" + e5Var.f70077a);
                kotlinx.coroutines.l.d(c1Var.f69870a, null, null, new com.tencent.mm.mj_template.sns.compose.widget.a1(c1Var, e5Var, null), 3, null);
            }
        }
        return f0Var;
    }
}
