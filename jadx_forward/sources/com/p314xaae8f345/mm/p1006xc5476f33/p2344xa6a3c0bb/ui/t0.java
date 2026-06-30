package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class t0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4 f257810d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4 c18846x292f7cd4) {
        this.f257810d = c18846x292f7cd4;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4 c18846x292f7cd4 = this.f257810d;
        if (c18846x292f7cd4.f257756q) {
            if (c18846x292f7cd4.f257755p) {
                c18846x292f7cd4.f257753n *= com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4.f257744v + 1.0f;
            } else {
                c18846x292f7cd4.f257753n *= 1.0f - com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4.f257745w;
            }
            c18846x292f7cd4.postInvalidate();
        }
        return c18846x292f7cd4.f257756q;
    }
}
