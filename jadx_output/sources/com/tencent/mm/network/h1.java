package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class h1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72015h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72016i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.lang.String str) {
        super(j17, obj);
        this.f72016i = g1Var;
        this.f72015h = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mars.xlog.Log.appenderFlush();
        com.tencent.mars.magicbox.IPxxLogic.onIPxx(this.f72015h, 0);
        return null;
    }
}
