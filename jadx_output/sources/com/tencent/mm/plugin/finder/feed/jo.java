package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jo extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ko f107122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f107123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f107124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f107125d;

    public jo(com.tencent.mm.plugin.finder.feed.ko koVar, r45.qt2 qt2Var, kotlin.jvm.internal.h0 h0Var, int i17) {
        this.f107122a = koVar;
        this.f107123b = qt2Var;
        this.f107124c = h0Var;
        this.f107125d = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            this.f107122a.W(this.f107123b, (so2.j5) this.f107124c.f310123d, this.f107125d, "view_exp");
        }
    }
}
