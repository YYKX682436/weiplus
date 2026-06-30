package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public final class h2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156088d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156088d = activityC11495xd59e7ca0;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156088d;
        android.widget.TextView textView = activityC11495xd59e7ca0.f156008t;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureClearTV");
            throw null;
        }
        textView.setVisibility(editable.length() > 0 ? 0 : 8);
        android.widget.TextView textView2 = activityC11495xd59e7ca0.f156009u;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureRecognizeTV");
            throw null;
        }
        textView2.setVisibility(editable.length() > 0 ? 0 : 8);
        android.widget.TextView textView3 = activityC11495xd59e7ca0.f156010v;
        if (textView3 != null) {
            textView3.setVisibility(editable.length() == 0 ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCapturePasteRecognizeTV");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
