package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09;

/* loaded from: classes7.dex */
public class g implements ph1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i f159740b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i iVar, java.lang.String str) {
        this.f159740b = iVar;
        this.f159739a = str;
    }

    @Override // ph1.p
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePreloadManager", "hy: on load module progress %s", c11666xa31a0b7f);
    }

    @Override // ph1.p
    public void b(boolean z17, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePreloadManager", "onLoad, module:%s, succeed:%b", this.f159739a, java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f159740b.f159754k.addAndGet(1);
        }
    }
}
