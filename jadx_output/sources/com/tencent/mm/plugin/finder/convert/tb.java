package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104604d;

    public tb(android.view.ViewGroup viewGroup) {
        this.f104604d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f104604d.setVisibility(8);
    }
}
