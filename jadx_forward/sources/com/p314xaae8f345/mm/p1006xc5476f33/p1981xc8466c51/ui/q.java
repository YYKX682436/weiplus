package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 implements zs3.t {

    /* renamed from: x, reason: collision with root package name */
    public final int f237001x;

    public q(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var) {
        super(context, f0Var);
        this.f237001x = 3;
    }

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        this.f236934g.mo50293x3498a0(this.f236947w);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0
    public int c() {
        return this.f237001x;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0
    public void g(et3.b bVar) {
        bVar.f338127e = 3;
        bVar.f338128f = this.f237001x;
        bVar.f338129g = this.f236944t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a aVar = this.f236941q;
        bVar.f338125c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y) aVar).f237136c;
        bVar.f338132j = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y) aVar).f237137d;
        bVar.f338126d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y) aVar).f237138e;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y) aVar).f237137d != null) {
            bVar.f338133k = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y) aVar).f237137d.Q0();
        }
        if (android.text.TextUtils.isEmpty(bVar.f338133k)) {
            return;
        }
        bVar.f338133k = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y) this.f236941q).f237139f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a aVar) {
        if (aVar != null) {
            this.f236941q = aVar;
            java.util.List list = this.f236940p;
            ((java.util.LinkedList) list).clear();
            java.util.List list2 = aVar.f236875a;
            if (list2 != null) {
                ((java.util.LinkedList) list).addAll(list2);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m j(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar) {
        mVar.f237077h = this.f237001x;
        return mVar;
    }
}
