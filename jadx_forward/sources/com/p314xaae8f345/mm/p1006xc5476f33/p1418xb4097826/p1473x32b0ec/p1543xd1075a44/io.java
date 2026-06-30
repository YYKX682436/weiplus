package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class io extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 {
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 f200223J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 K;

    public io(android.content.Context context) {
        super(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.go goVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.go(this);
        this.f200223J = goVar;
        o(goVar);
        this.I = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1
    public void o(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 h2Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h2Var, this.f200223J)) {
            this.f293570s = h2Var;
        } else {
            this.K = h2Var;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1
    public void s() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMMCustomHalfBottomDialog", "start openPanel");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        android.view.View view = this.f293560f;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ho(this));
    }

    public io(android.content.Context context, int i17, boolean z17, boolean z18) {
        super(context, i17, z17, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.go goVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.go(this);
        this.f200223J = goVar;
        o(goVar);
        this.I = z18;
    }
}
