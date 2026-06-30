package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class j9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f110183d;

    public j9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f110183d = finderLiveDelManagerUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f110183d.f109361d.y(java.lang.String.valueOf(editable != null ? r26.n0.u0(editable) : null));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
