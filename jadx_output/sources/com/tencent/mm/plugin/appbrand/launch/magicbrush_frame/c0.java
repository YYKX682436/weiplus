package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f84265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kotlinx.coroutines.q qVar) {
        super(2);
        this.f84265d = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str2 = (java.lang.String) obj2;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        int i17 = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.a.f84256d;
        if (str2 == null || str2.length() == 0) {
            str = "error (" + intValue + ')';
        } else {
            str = str2 + " (" + intValue + ')';
        }
        ((kotlinx.coroutines.r) this.f84265d).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.a(str))));
        return jz5.f0.f302826a;
    }
}
