package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class f1 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f69951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.v f69952b;

    public f1(androidx.lifecycle.y yVar, androidx.lifecycle.v vVar) {
        this.f69951a = yVar;
        this.f69952b = vVar;
    }

    @Override // n0.a2
    public void dispose() {
        this.f69951a.mo133getLifecycle().c(this.f69952b);
    }
}
