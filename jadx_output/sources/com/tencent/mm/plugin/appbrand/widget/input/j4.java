package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class j4 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f91504d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91505e;

    /* renamed from: f, reason: collision with root package name */
    public ml1.c f91506f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f91507g = new com.tencent.mm.plugin.appbrand.widget.input.g4(this);

    public j4(android.widget.EditText editText) {
        this.f91505e = false;
        this.f91505e = editText.isFocused();
        editText.setOnFocusChangeListener(this);
        this.f91504d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    public android.text.Editable a(android.text.Editable editable) {
        editable.setSpan(new com.tencent.mm.plugin.appbrand.widget.input.h4(this), 0, editable.length(), 18);
        editable.setSpan(new com.tencent.mm.plugin.appbrand.widget.input.i4(this), 0, editable.length(), 18);
        return editable;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        this.f91505e = z17;
        if (z17) {
            return;
        }
        this.f91504d.removeCallbacks(this.f91507g);
    }
}
