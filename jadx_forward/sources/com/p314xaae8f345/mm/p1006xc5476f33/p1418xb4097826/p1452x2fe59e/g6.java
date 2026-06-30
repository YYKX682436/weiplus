package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f188362e;

    public g6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, android.widget.TextView textView) {
        this.f188361d = a7Var;
        this.f188362e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm(this.f188361d.f187740d, null, 2, null);
        android.content.Context context = rmVar.f214498d;
        rmVar.setContentView(com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e6a, (android.view.ViewGroup) null, false));
        rmVar.f214500f = true;
        rmVar.f214507m = 5000L;
        rmVar.f214505k = -context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        rmVar.f214508n = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        rmVar.d(this.f188362e);
    }
}
