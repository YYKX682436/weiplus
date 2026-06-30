package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class pe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104259e;

    public pe(android.widget.TextView textView, android.content.Context context) {
        this.f104258d = textView;
        this.f104259e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f104258d.setText(this.f104259e.getResources().getString(com.tencent.mm.R.string.o0l));
    }
}
