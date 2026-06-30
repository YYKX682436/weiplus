package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class eu implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f249797d;

    /* renamed from: e, reason: collision with root package name */
    public float f249798e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f249799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf f249800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba f249801h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu f249802i;

    public eu(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba c18153xb2f8a3ba, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar) {
        this.f249800g = abstractC18397x5bc42bbf;
        this.f249801h = c18153xb2f8a3ba;
        this.f249802i = huVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (v17.getId() != com.p314xaae8f345.mm.R.id.n7y) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
            return false;
        }
        boolean z17 = this.f249800g.getVisibility() == 0;
        int action = event.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar = this.f249802i;
        if (action == 0) {
            event.getX();
            this.f249797d = event.getY();
            this.f249798e = 0.0f;
        } else {
            int action2 = event.getAction();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba c18153xb2f8a3ba = this.f249801h;
            if (action2 == 2) {
                if (z17) {
                    c18153xb2f8a3ba.m70823x788d9147(true);
                    float y17 = this.f249798e + (event.getY() - this.f249797d);
                    this.f249798e = y17;
                    if (java.lang.Math.abs(y17) >= 50.0f) {
                        huVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
                        android.content.Context context = huVar.f250067a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) context : null;
                        if (activityC18133x39856dcd != null) {
                            activityC18133x39856dcd.l7();
                        }
                        this.f249799f = true;
                        this.f249798e = 0.0f;
                        z17 = false;
                    }
                }
                if (!z17) {
                    c18153xb2f8a3ba.m70823x788d9147(false);
                }
            } else if (event.getAction() == 1) {
                c18153xb2f8a3ba.m70823x788d9147(false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.c(huVar);
        event.getAction();
        boolean z18 = this.f249799f;
        yj0.a.i(z18, this, "com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
        return z18;
    }
}
