package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f74537d;

    public e0(com.tencent.mm.plugin.address.ui.g0 g0Var, android.widget.TextView textView) {
        this.f74537d = textView;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            android.widget.TextView textView = this.f74537d;
            com.tencent.mm.sdk.platformtools.b0.e(textView.getText().toString());
            db5.e1.W(textView.getContext(), textView.getContext().getString(com.tencent.mm.R.string.f490361st));
        }
    }
}
