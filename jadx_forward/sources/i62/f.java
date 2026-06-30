package i62;

/* loaded from: classes13.dex */
public final class f extends com.p314xaae8f345.mm.app.s2 {
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        i62.o oVar = i62.o.f370496a;
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.plugin.expt.resource.MMResReporter");
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }
}
