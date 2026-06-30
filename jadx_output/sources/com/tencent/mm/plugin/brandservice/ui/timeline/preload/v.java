package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes.dex */
public final class v implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.r f94463d;

    public v(yz5.r rVar) {
        this.f94463d = rVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        yz5.r rVar = this.f94463d;
        if (rVar == null) {
            return 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        if (str == null) {
            str = "";
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type T of com.tencent.mm.plugin.brandservice.ui.timeline.preload.CGIExKt.runCGI");
        rVar.C(valueOf, valueOf2, str, (r45.js5) fVar);
        return 0;
    }
}
