package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class t5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f104592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f104593c;

    public t5(com.tencent.mm.plugin.finder.convert.q6 q6Var, r45.qt2 qt2Var, so2.z0 z0Var) {
        this.f104591a = q6Var;
        this.f104592b = qt2Var;
        this.f104593c = z0Var;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f104593c.E.field_id;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.convert.q6.n(this.f104591a, this.f104592b, this.f104593c.E, 1L);
        }
    }
}
