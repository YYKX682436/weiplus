package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100554d;

    public cb(com.tencent.mm.plugin.fav.ui.bb bbVar, android.app.Dialog dialog) {
        this.f100554d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100554d.dismiss();
    }

    public java.lang.String toString() {
        return super.toString() + "|batchAddFavTags";
    }
}
