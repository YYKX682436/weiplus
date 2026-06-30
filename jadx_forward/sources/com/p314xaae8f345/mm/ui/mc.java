package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class mc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290654f;

    public mc(int i17, java.lang.String str, android.content.Context context) {
        this.f290652d = i17;
        this.f290653e = str;
        this.f290654f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f290652d == 4 && com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b.c() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMErrorProcessor", "alphaUpdateInfo expired");
        } else if (i95.n0.c(mi3.f.class) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8) ((mi3.f) i95.n0.c(mi3.f.class))).getClass();
            if (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.c(this.f290653e, false) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.lc(this));
            }
        }
    }
}
