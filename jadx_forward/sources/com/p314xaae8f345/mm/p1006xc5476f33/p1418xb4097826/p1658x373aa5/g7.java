package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f213681d;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f213681d = c15270x6d877a34;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f213681d;
        c15270x6d877a34.m61918xcd569a2(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentFooter", "onSelectImage footerMode " + c15270x6d877a34.getFooterMode());
        if (c15270x6d877a34.getFooterMode() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.c(c15270x6d877a34, false);
        } else {
            c15270x6d877a34.D(true);
        }
    }
}
