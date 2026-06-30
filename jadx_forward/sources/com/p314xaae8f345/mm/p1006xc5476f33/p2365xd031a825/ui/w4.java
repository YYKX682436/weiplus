package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes5.dex */
public class w4 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f262295a;

    public w4(android.widget.Button button) {
        this.f262295a = button;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.widget.Button button = this.f262295a;
        if (z17) {
            button.setEnabled(true);
            button.setClickable(true);
        } else {
            button.setEnabled(false);
            button.setClickable(false);
        }
    }
}
