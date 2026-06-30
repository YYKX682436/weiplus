package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class sd implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f82978d;

    public sd(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f82978d = mdVar;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.DESTROYED == bVar) {
            ((com.tencent.mm.plugin.appbrand.jsapi.md$$a) this.f82978d.f81611h).dead();
        }
    }
}
