package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class iq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi f216296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 f216297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180) {
        super(0);
        this.f216296d = giVar;
        this.f216297e = abstractC15124x7bae6180;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        int i17 = this.f216297e.f210796n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar = this.f216296d;
        giVar.c(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15322xff344627 c15322xff344627 = giVar.f216067k;
        if (c15322xff344627 != null) {
            c15322xff344627.setVisibility(8);
        }
        android.view.View a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.M.a(giVar);
        if (a17 != null && (findViewById = a17.findViewById(com.p314xaae8f345.mm.R.id.nvk)) != null) {
            findViewById.requestLayout();
            findViewById.invalidate();
        }
        return jz5.f0.f384359a;
    }
}
