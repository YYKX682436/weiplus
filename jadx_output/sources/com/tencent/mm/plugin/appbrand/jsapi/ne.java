package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class ne extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(java.lang.String str) {
        super(1);
        this.f82388d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String line = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(line, "line");
        com.tencent.mars.xlog.Log.i("AppBrandLog", this.f82388d + ' ' + line);
        return jz5.f0.f302826a;
    }
}
