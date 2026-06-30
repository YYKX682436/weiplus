package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcelable f89071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, android.os.Parcelable parcelable) {
        super(1);
        this.f89070d = str;
        this.f89071e = parcelable;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.f47684a;
        java.lang.String str2 = this.f89070d;
        if (u46.l.c(str, str2)) {
            return new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage(str2, this.f89071e);
        }
        return null;
    }
}
