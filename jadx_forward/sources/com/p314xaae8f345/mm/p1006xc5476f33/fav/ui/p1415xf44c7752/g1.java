package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h1 f182464e;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h1 h1Var, int i17) {
        this.f182464e = h1Var;
        this.f182463d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f182463d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "notifyIndex :%s", java.lang.Integer.valueOf(i17));
        this.f182464e.f182502d.m8147xed6e4d18(i17);
    }
}
