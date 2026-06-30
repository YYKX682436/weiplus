package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f295663d;

    public e0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, android.widget.EditText editText) {
        this.f295663d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f295663d;
        if (editText.findFocus() == null) {
            editText.requestFocus();
        }
    }
}
