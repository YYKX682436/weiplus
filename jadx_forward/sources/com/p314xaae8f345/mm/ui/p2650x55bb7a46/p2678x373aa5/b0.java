package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes13.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 f284410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284411e;

    public b0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a87, yz5.a aVar) {
        this.f284410d = c21895xf6c09a87;
        this.f284411e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a87 = this.f284410d;
        if (!c21895xf6c09a87.f284361h || c21895xf6c09a87.f284362i) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c21895xf6c09a87.f284357d, "reset anim params by post delay");
        c21895xf6c09a87.f284368r.clear();
        c21895xf6c09a87.f284369s.clear();
        c21895xf6c09a87.f284361h = false;
        c21895xf6c09a87.f284362i = true;
        yz5.a aVar = this.f284411e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
