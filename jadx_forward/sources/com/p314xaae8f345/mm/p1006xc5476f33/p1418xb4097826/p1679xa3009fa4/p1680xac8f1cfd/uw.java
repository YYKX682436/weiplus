package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class uw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f217714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f217715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(x91.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        super(0);
        this.f217714d = hVar;
        this.f217715e = sxVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        x91.c cVar;
        x91.h hVar = this.f217714d;
        if (hVar != null && hVar.f534180a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f217715e;
            if (sxVar.H != 3) {
                java.util.ArrayList S6 = sxVar.S6();
                x91.h hVar2 = this.f217714d;
                synchronized (S6) {
                    java.util.Iterator it = S6.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        x91.h hVar3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv) next).f217594a;
                        java.lang.String str = (hVar3 == null || (cVar = hVar3.f534180a) == null) ? null : cVar.f534174i;
                        x91.c cVar2 = hVar2.f534180a;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, cVar2 != null ? cVar2.f534174i : null)) {
                            obj = next;
                            break;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv tvVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv) obj;
                this.f217715e.W6(2);
                if (tvVar == null) {
                    this.f217715e.S6().add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv(this.f217714d));
                    this.f217715e.R6().m8149x8b456734(this.f217715e.S6().size() - 1);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
