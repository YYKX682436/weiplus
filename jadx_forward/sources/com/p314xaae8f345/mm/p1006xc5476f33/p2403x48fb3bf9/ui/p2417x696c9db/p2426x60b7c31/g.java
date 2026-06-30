package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 f266645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f266647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f266648g;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a7, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, int i17, boolean z17) {
        this.f266645d = abstractC19284xdca64a7;
        this.f266646e = c1Var;
        this.f266647f = i17;
        this.f266648g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f266645d.f264269e);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_source_type", "camera");
        intent.putExtra("key_pick_local_media_local_ids", this.f266648g ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.h(arrayList));
        this.f266646e.mo9729x757c998b(this.f266647f, -1, intent);
    }
}
