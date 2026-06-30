package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.HashMap f236918y = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final o72.x3 f236919x;

    public f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var) {
        super(context, f0Var);
        this.f236919x = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0
    public void g(et3.b bVar) {
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b) this.f236941q).f236883c.f67645x88be67a1;
        bVar.f338128f = 1;
        bVar.f338127e = 1;
        bVar.f338129g = 15;
        bVar.f338124b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b) this.f236941q).f236883c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b) aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavRecordAdapter", "updateData localId %s,status %s", java.lang.Long.valueOf(bVar.f236883c.f67645x88be67a1), java.lang.Integer.valueOf(bVar.f236883c.f67644x3059914a));
        this.f236941q = aVar;
        java.util.List list = this.f236940p;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).addAll(aVar.f236875a);
        notifyDataSetChanged();
    }
}
