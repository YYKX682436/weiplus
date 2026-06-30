package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e1 f213400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f213401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f213402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f213403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f213404h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f213405i;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e1 e1Var, android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f213400d = e1Var;
        this.f213401e = context;
        this.f213402f = charSequence;
        this.f213403g = z17;
        this.f213404h = i17;
        this.f213405i = onCancelListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f213400d.f213484a = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this.f213401e, this.f213402f, this.f213403g, this.f213404h, this.f213405i);
    }
}
