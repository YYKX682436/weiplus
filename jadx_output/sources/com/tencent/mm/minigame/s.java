package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class s implements com.tencent.shadow.core.common.AppEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f69141a;

    public s(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f69141a = c0Var;
    }

    @Override // com.tencent.shadow.core.common.AppEventListener
    public final void onAppEvent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.d(str2);
        kotlin.jvm.internal.o.d(str3);
        this.f69141a.p(new com.tencent.mm.minigame.z(str, str2, str3));
    }
}
