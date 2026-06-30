package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class j4 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f173037d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173038e;

    /* renamed from: f, reason: collision with root package name */
    public ml1.c f173039f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f173040g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g4(this);

    public j4(android.widget.EditText editText) {
        this.f173038e = false;
        this.f173038e = editText.isFocused();
        editText.setOnFocusChangeListener(this);
        this.f173037d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    public android.text.Editable a(android.text.Editable editable) {
        editable.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h4(this), 0, editable.length(), 18);
        editable.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i4(this), 0, editable.length(), 18);
        return editable;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        this.f173038e = z17;
        if (z17) {
            return;
        }
        this.f173037d.mo50300x3fa464aa(this.f173040g);
    }
}
