package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f211145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f211146f;

    public p(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba, boolean z17) {
        this.f211144d = view;
        this.f211145e = activityC15007xc74afeba;
        this.f211146f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int height = this.f211144d.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba = this.f211145e;
        android.view.View view = activityC15007xc74afeba.f210026t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descContainer");
            throw null;
        }
        int height2 = view.getHeight();
        if (!this.f211146f) {
            int b17 = i65.a.b(activityC15007xc74afeba.mo55332x76847179(), 170);
            if (height - height2 > b17) {
                android.view.View view2 = activityC15007xc74afeba.f210026t;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descContainer");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = height - b17;
                android.view.View view3 = activityC15007xc74afeba.f210026t;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descContainer");
                    throw null;
                }
                view3.setLayoutParams(layoutParams);
            }
            android.widget.TextView textView = activityC15007xc74afeba.B;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
                throw null;
            }
            textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba.c7(activityC15007xc74afeba));
            android.widget.TextView textView2 = activityC15007xc74afeba.B;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
                throw null;
            }
        }
        int b18 = i65.a.b(activityC15007xc74afeba.mo55332x76847179(), 170);
        if (height - height2 > b18) {
            android.view.View view4 = activityC15007xc74afeba.f210026t;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descContainer");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            layoutParams2.height = height - b18;
            android.view.View view5 = activityC15007xc74afeba.f210026t;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descContainer");
                throw null;
            }
            view5.setLayoutParams(layoutParams2);
        }
        android.widget.TextView textView3 = activityC15007xc74afeba.A;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("participateBtn");
            throw null;
        }
        r45.h21 h21Var = activityC15007xc74afeba.Y;
        if (h21Var != null) {
            str = h21Var.m75945x2fec8307(3);
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = activityC15007xc74afeba.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572789cj4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        textView3.setText(str);
        android.widget.TextView textView4 = activityC15007xc74afeba.A;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("participateBtn");
            throw null;
        }
    }
}
