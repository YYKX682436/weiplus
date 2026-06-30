package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e f272366d;

    public f2(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e) {
        this.f272366d = c19641xd487040e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e = this.f272366d;
        c19641xd487040e.setSelection(c19641xd487040e.getText().length());
        ((android.view.inputmethod.InputMethodManager) c19641xd487040e.getContext().getSystemService("input_method")).showSoftInput(c19641xd487040e, 0);
    }
}
