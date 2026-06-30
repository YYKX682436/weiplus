package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ug extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(in5.s0 s0Var) {
        super(0);
        this.f186238d = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) this.f186238d.p(com.p314xaae8f345.mm.R.id.e_k);
        boolean z17 = true;
        if (c15196x85976f5f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FeedFullVideoConvert", "videoLayout is null");
        } else if (c15196x85976f5f.J()) {
            c15196x85976f5f.L(true, true);
        } else {
            c15196x85976f5f.M();
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
