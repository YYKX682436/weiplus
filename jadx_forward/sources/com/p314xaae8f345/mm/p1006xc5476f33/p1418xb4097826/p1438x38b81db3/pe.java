package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class pe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f185791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185792e;

    public pe(android.widget.TextView textView, android.content.Context context) {
        this.f185791d = textView;
        this.f185792e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f185791d.setText(this.f185792e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o0l));
    }
}
