package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class xw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f218033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f218034e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(x91.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        super(0);
        this.f218033d = hVar;
        this.f218034e = sxVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        x91.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", "onLinkingDevice mrDevice:" + this.f218033d);
        x91.h hVar = this.f218033d;
        if (hVar != null && hVar.f534180a != null) {
            java.util.ArrayList S6 = this.f218034e.S6();
            x91.h hVar2 = this.f218033d;
            synchronized (S6) {
                int i18 = 0;
                i17 = -1;
                for (java.lang.Object obj : S6) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    x91.h hVar3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv) obj).f217594a;
                    java.lang.String str = (hVar3 == null || (cVar = hVar3.f534180a) == null) ? null : cVar.f534174i;
                    x91.c cVar2 = hVar2.f534180a;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, cVar2 != null ? cVar2.f534174i : null)) {
                        i17 = i18;
                    }
                    i18 = i19;
                }
            }
            if (i17 != -1 && i17 > 0 && i17 < this.f218034e.S6().size()) {
                this.f218034e.R6().m8147xed6e4d18(i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
