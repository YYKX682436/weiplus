package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tw implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f133790a;

    public tw(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar) {
        this.f133790a = trVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm
    public final void b(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133790a;
        if (trVar == null || i17 != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131110c) {
            return;
        }
        int s17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).s();
        trVar.X = true;
        trVar.Y = true;
        if (s17 <= trVar.W) {
            trVar.Y = false;
        } else if (s17 >= trVar.V) {
            trVar.X = false;
        }
        if (!trVar.f133734p.isEmpty()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga();
            gaVar.f131086f = 0;
            gaVar.f131087g = trVar.X;
            gaVar.f131088h = trVar.Y;
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh> it = trVar.f133734p.iterator();
            while (it.hasNext()) {
                it.next().a(gaVar);
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.f133790a;
        if (trVar2.f133734p.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga();
        gaVar2.f131086f = 0;
        gaVar2.f131087g = trVar2.X;
        gaVar2.f131088h = trVar2.Y;
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh> it6 = trVar2.f133734p.iterator();
        while (it6.hasNext()) {
            it6.next().a(gaVar2);
        }
    }
}
