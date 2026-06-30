package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.ContactCountView */
/* loaded from: classes10.dex */
public class C22293x1808c434 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f287886d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f287887e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f287888f;

    /* renamed from: g, reason: collision with root package name */
    public int f287889g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f287890h;

    /* renamed from: i, reason: collision with root package name */
    public int f287891i;

    public C22293x1808c434(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f287888f = false;
        this.f287889g = 0;
        this.f287890h = true;
        this.f287891i = 1;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a0a, this);
    }

    public void a() {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2690x38b72420.f1(this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f287886d == null) {
            this.f287886d = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.cak);
            this.f287887e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.caj);
        }
        a();
        super.onMeasure(i17, i18);
    }

    /* renamed from: setContactType */
    public void m80404x72abd1b8(int i17) {
        this.f287891i = i17;
    }

    /* renamed from: setFixedContactCount */
    public void m80405x92401221(int i17) {
        this.f287888f = true;
        this.f287889g = i17;
        a();
    }

    /* renamed from: setVisible */
    public void m80406xcd1079b0(boolean z17) {
        this.f287890h = z17;
        android.view.View view = this.f287886d;
        if (view != null) {
            int i17 = (!z17 || this.f287889g <= 0) ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ContactCountView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/ContactCountView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C22293x1808c434(android.content.Context context) {
        super(context);
        this.f287888f = false;
        this.f287889g = 0;
        this.f287890h = true;
        this.f287891i = 1;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a0a, this);
    }
}
