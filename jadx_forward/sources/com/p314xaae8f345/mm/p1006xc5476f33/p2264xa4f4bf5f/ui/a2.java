package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f255242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 f255243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f255244f;

    public a2(boolean[] zArr, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var, yz5.a aVar) {
        this.f255242d = zArr;
        this.f255243e = j2Var;
        this.f255244f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean[] zArr = this.f255242d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissWithCompletion: fallback timer triggered");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2.b(this.f255243e, this.f255244f);
    }
}
