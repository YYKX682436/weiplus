package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class pc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f228846d;

    public pc(android.widget.EditText editText) {
        this.f228846d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f228846d;
        if (editText.findFocus() == null) {
            editText.requestFocus();
        }
    }
}
