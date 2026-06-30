package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class qw implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f217274d;

    public qw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        this.f217274d = sxVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what != 7) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f217274d;
        x91.h hVar = sxVar.f217474w;
        if (hVar != null) {
            hVar.f534184e.f534196a = x91.j.Stopped;
        }
        if (hVar != null) {
            hVar.h();
        }
        x91.h hVar2 = sxVar.f217474w;
        if (hVar2 != null) {
            hVar2.i();
        }
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 == null) {
            return true;
        }
        hVar3.f534187h = null;
        return true;
    }
}
