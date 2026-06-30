package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class yw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f218150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f218151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(x91.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        super(0);
        this.f218150d = hVar;
        this.f218151e = sxVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        x91.c cVar;
        x91.h hVar = this.f218150d;
        if (hVar != null && hVar.f534180a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f218151e;
            if (sxVar.H != 3) {
                java.util.ArrayList S6 = sxVar.S6();
                x91.h hVar2 = this.f218150d;
                synchronized (S6) {
                    int i18 = 0;
                    i17 = -1;
                    for (java.lang.Object obj : S6) {
                        int i19 = i18 + 1;
                        java.lang.String str = null;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv tvVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv) obj;
                        x91.c cVar2 = hVar2.f534180a;
                        java.lang.String str2 = cVar2 != null ? cVar2.f534174i : null;
                        x91.h hVar3 = tvVar.f217594a;
                        if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
                            str = cVar.f534174i;
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, str)) {
                            i17 = i18;
                        }
                        i18 = i19;
                    }
                }
                if (i17 != -1 && i17 > 0 && i17 < this.f218151e.S6().size()) {
                    this.f218151e.S6().remove(i17);
                    this.f218151e.R6().m8155x27702c4(i17);
                }
                if (this.f218151e.S6().isEmpty()) {
                    this.f218151e.W6(1);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
