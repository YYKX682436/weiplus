package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class h implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f210841e;

    public h(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba) {
        this.f210840d = view;
        this.f210841e = activityC15007xc74afeba;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f210840d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba = this.f210841e;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activityC15007xc74afeba);
        android.view.View view = activityC15007xc74afeba.f210026t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descContainer");
            throw null;
        }
        int paddingTop = view.getPaddingTop();
        android.view.View view2 = activityC15007xc74afeba.f210026t;
        if (view2 != null) {
            view2.setPadding(0, paddingTop + h17, 0, 0);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descContainer");
        throw null;
    }
}
