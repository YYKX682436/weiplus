package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class pi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f104264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f104265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(int i17, com.tencent.mm.plugin.finder.convert.oj ojVar, java.lang.String str) {
        super(0);
        this.f104264d = i17;
        this.f104265e = ojVar;
        this.f104266f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f104264d;
        int a17 = hc2.d0.a(hc2.d0.d(i17));
        java.util.List a18 = hc2.v.a(this.f104264d, null, a17, false, false, false, 0, 120, null);
        com.tencent.mars.xlog.Log.i(this.f104265e.f104186h, this.f104266f + " getTabLoaderDataList tabType=" + i17 + ",pageName=" + a17 + ",dataList size=" + ((java.util.ArrayList) a18).size());
        return a18;
    }
}
