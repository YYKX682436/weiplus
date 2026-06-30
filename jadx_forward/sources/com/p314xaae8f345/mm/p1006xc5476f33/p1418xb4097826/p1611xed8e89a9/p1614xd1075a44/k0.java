package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f206124a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f206125b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f206126c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f206127d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13856xcef94543 f206128e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f206129f;

    public k0(android.view.View header, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f206124a = activity;
        this.f206125b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.j0(header));
        this.f206126c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f0(this));
        this.f206127d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e0(this));
        this.f206128e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13856xcef94543(null, 1, null);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1613x373aa5.C14920xb7c6d451 a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1613x373aa5.C14920xb7c6d451) ((jz5.n) this.f206126c).mo141623x754a37bb();
    }

    public final void b() {
        java.util.List list = this.f206129f;
        if (list == null || list.isEmpty()) {
            a().setVisibility(8);
            return;
        }
        jz5.g gVar = this.f206125b;
        android.widget.FrameLayout sendMsgBtn = ((vb2.f0) ((jz5.n) gVar).mo141623x754a37bb()).W0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sendMsgBtn, "sendMsgBtn");
        android.widget.FrameLayout finderProfileFollowBtn = ((vb2.f0) ((jz5.n) gVar).mo141623x754a37bb()).F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileFollowBtn, "finderProfileFollowBtn");
        android.widget.FrameLayout finderProfileEnterpriseBtn = ((vb2.f0) ((jz5.n) gVar).mo141623x754a37bb()).f516132x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileEnterpriseBtn, "finderProfileEnterpriseBtn");
        if (sendMsgBtn.getVisibility() == 0 && finderProfileFollowBtn.getVisibility() == 0 && finderProfileEnterpriseBtn.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1613x373aa5.C14920xb7c6d451 a17 = a();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = a17.f205973f;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = i65.a.h(a17.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
        }
        a().setAlpha(0.0f);
        a().animate().alpha(1.0f).setDuration(200L).start();
        a().setVisibility(0);
    }
}
