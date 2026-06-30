package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class h1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f259431d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734, android.view.View.OnClickListener onClickListener) {
        this.f259431d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            this.f259431d.onClick(null);
        }
        return true;
    }
}
