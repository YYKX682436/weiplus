package wv2;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv2.f f531537d;

    public e(wv2.f fVar) {
        this.f531537d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object obj;
        if (m1Var instanceof wv2.p) {
            wv2.f fVar = this.f531537d;
            if (fVar.f531542o.contains(m1Var)) {
                java.util.HashSet hashSet = fVar.f531542o;
                hashSet.remove(m1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = fVar.f531538h;
                if (i17 == 0 && i18 == 0) {
                    wv2.p pVar = (wv2.p) m1Var;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = pVar.f531576i.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.pp2) fVar2).m75936x14adae67(1);
                    java.util.Iterator<T> it = c14994x9b99c079.m59214x2de915fd().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj).m59276x6c285d75(), pVar.f531574g.m59276x6c285d75())) {
                                break;
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
                    if (c14994x9b99c0792 != null) {
                        c14994x9b99c0792.getFeedObject().m76877x684351d(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
                    }
                    java.lang.Long valueOf = java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
                    r45.jf2 jf2Var = pVar.f531575h;
                    jf2Var.set(2, valueOf);
                    jf2Var.set(3, c19792x256d2725 != null ? c19792x256d2725.m76803x6c285d75() : null);
                    jf2Var.set(4, 0L);
                    cu2.u.f303974a.n(c14994x9b99c079);
                } else {
                    fVar.f531543p = true;
                }
                if (hashSet.isEmpty() && !fVar.f531543p) {
                    fVar.k();
                } else if (hashSet.isEmpty() && fVar.f531543p) {
                    fVar.f531540m = new wv2.n(c14994x9b99c079, 2);
                    fVar.f531541n.countDown();
                }
            }
        }
    }
}
