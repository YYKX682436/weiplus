package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class o implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219174d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar) {
        this.f219174d = lVar;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219174d;
        if (!lVar.f423740d || str.equals("*") || str.equals("chatroomname") || lVar.f219124m.containsKey(str)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e0(lVar, str));
    }
}
