package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes8.dex */
public final class t implements m93.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f225816a;

    public t(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441) {
        this.f225816a = c3712x3ed8a441;
    }

    @Override // m93.h
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaLiteAppTaskPreloadReceiver", "geta8key fail: " + this.f225816a.f14359x58b7f1c);
    }

    @Override // m93.h
    public void b(m93.g info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("geta8key success:");
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f225816a;
        sb6.append(c3712x3ed8a441.f14359x58b7f1c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppTaskPreloadReceiver", sb6.toString());
        java.lang.String str = c3712x3ed8a441.f14359x58b7f1c;
        java.lang.String str2 = info.f406565a;
        java.util.Map map = info.f406567c;
        java.util.Map map2 = info.f406568d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65459xcbec40f8(str, str2, map, map2, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65459xcbec40f8(c3712x3ed8a441.f14359x58b7f1c, info.f406565a, map, map2, false);
    }
}
