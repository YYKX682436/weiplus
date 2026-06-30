package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class oa implements com.tencent.mm.plugin.finder.view.js {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104165b;

    public oa(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f104164a = qeVar;
        this.f104165b = s0Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.js
    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        if (motionEvent == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104164a;
        in5.s0 s0Var = this.f104165b;
        qeVar.s0(s0Var, view, ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i).getFeedObject().getFeedObject(), motionEvent, null);
        return true;
    }
}
