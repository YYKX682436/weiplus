package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class lb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290608d;

    public lb(int i17) {
        this.f290608d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        c01.d9.b().p().w(65, java.lang.Integer.valueOf(this.f290608d + 1));
    }
}
