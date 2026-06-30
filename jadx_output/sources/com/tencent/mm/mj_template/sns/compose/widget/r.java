package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final n0.v2 f70203a;

    public r(boolean z17, java.lang.String templateId, java.lang.String tag) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f70203a = n0.s4.c(java.lang.Boolean.valueOf(z17), null, 2, null);
    }

    public final boolean a() {
        return ((java.lang.Boolean) ((n0.q4) this.f70203a).getValue()).booleanValue();
    }

    public final void b(boolean z17) {
        n0.v2 v2Var = this.f70203a;
        ((java.lang.Boolean) ((n0.q4) v2Var).getValue()).booleanValue();
        ((n0.q4) v2Var).setValue(java.lang.Boolean.valueOf(z17));
    }
}
