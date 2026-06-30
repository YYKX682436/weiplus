package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class ge implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f210831d;

    public ge(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949) {
        this.f210831d = activityC15059x3e98c949;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f210831d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa = activityC15059x3e98c949.f210211u;
        if (c22678xac4e51fa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropLayout");
            throw null;
        }
        c22678xac4e51fa.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        java.lang.String string = activityC15059x3e98c949.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nke);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = activityC15059x3e98c949.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572806ni3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = activityC15059x3e98c949.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572805ni2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        db5.e1.D(activityC15059x3e98c949.mo55332x76847179(), string, "", string2, string3, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.Cif(activityC15059x3e98c949), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.jf.f210931d, com.p314xaae8f345.mm.R.C30859x5a72f63.f560154cg);
    }
}
