package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class k1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f289329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f289331h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289332i;

    public k1(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.content.Context context, boolean z17, java.lang.String str, boolean z18, java.lang.Runnable runnable) {
        this.f289327d = c19762x487075a;
        this.f289328e = context;
        this.f289329f = z17;
        this.f289330g = str;
        this.f289331h = z18;
        this.f289332i = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f289327d.f38859x6ac9171 = true;
        android.content.Context context = this.f289328e;
        boolean z17 = this.f289329f;
        java.lang.String str = this.f289330g;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.a(context, z17, str);
        if (this.f289331h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 1, 4, str);
        }
        java.lang.Runnable runnable = this.f289332i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
