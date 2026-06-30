package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes9.dex */
public final class i implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 f156090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f156091e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b89, android.content.Context context) {
        this.f156090d = c11487xdaa53b89;
        this.f156091e = context;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b89 = this.f156090d;
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c11487xdaa53b89.f155939p;
            if (c22621x7603e017 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            java.lang.String obj = c22621x7603e017.getText().toString();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f156091e, obj);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, i17.toString())) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c11487xdaa53b89.f155939p;
                if (c22621x7603e0172 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                    throw null;
                }
                c22621x7603e0172.setText(i17);
            }
        }
        r26.t tVar = com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89.f155929t;
        c11487xdaa53b89.c(false);
    }
}
