package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f69963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f69964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(androidx.lifecycle.y yVar, yz5.p pVar) {
        super(1);
        this.f69963d = yVar;
        this.f69964e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        final yz5.p pVar = this.f69964e;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelKt$ComposableLifecycle$1$observer$1
            @Override // androidx.lifecycle.v
            public final void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                kotlin.jvm.internal.o.g(source, "source");
                kotlin.jvm.internal.o.g(event, "event");
                yz5.p.this.invoke(source, event);
            }
        };
        androidx.lifecycle.y yVar = this.f69963d;
        yVar.mo133getLifecycle().a(vVar);
        return new com.tencent.mm.mj_template.sns.compose.widget.f1(yVar, vVar);
    }
}
