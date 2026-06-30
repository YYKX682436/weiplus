package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.d0 f77648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.appbrand.debugger.console.d0 d0Var) {
        super(0);
        this.f77648d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.appbrand.debugger.console.v vVar = (com.tencent.mm.plugin.appbrand.debugger.console.v) ((jz5.n) this.f77648d.f77657d).getValue();
        vVar.setOnClickListener(com.tencent.mm.plugin.appbrand.debugger.console.z.f77721d);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = i65.a.f(frameLayout.getContext(), com.tencent.mm.R.dimen.f479669c6);
        frameLayout.addView(vVar, layoutParams);
        frameLayout.setOnClickListener(new com.tencent.mm.plugin.appbrand.debugger.console.a0(vVar));
        return frameLayout;
    }
}
