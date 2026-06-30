package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class k implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.advertise.impl.jsapi.l f53173d;

    public k(com.tencent.mm.advertise.impl.jsapi.l lVar) {
        this.f53173d = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        com.tencent.mm.advertise.impl.jsapi.l lVar = this.f53173d;
        if (z17) {
            lVar.s().invoke(lVar.k());
        } else {
            lVar.s().invoke(lVar.i(lc3.x.f317936c));
        }
    }
}
