package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public final class m2 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79252d;

    public m2(java.lang.String str) {
        this.f79252d = str;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        c01.l2 e17;
        if (u81.b.DESTROYED != bVar || (e17 = c01.n2.d().e(this.f79252d)) == null) {
            return;
        }
        e17.h();
    }
}
