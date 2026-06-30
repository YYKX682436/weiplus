package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class ac implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.bc f100471d;

    public ac(com.tencent.mm.plugin.fav.ui.bc bcVar) {
        this.f100471d = bcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100471d.f100533h.dismiss();
    }

    public java.lang.String toString() {
        return super.toString() + "|batchDelFavItems";
    }
}
