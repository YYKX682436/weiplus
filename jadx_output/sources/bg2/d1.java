package bg2;

/* loaded from: classes3.dex */
public final class d1 extends tc2.c implements tc2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // tc2.c
    public void Q6() {
    }

    public final void Y6(java.lang.CharSequence text, android.view.View targetView, long j17, yz5.a onShow) {
        kotlinx.coroutines.y0 y0Var;
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(onShow, "onShow");
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        if (context == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.sl slVar = new com.tencent.mm.plugin.finder.live.widget.sl(context);
        slVar.f119798b.setText(text);
        slVar.f119807k = context.getResources().getColor(com.tencent.mm.R.color.aaz);
        slVar.f119806j = android.graphics.Color.parseColor("#404040");
        slVar.f119800d = targetView;
        slVar.f119799c = j17;
        slVar.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118844d;
        slVar.f119809m = 130;
        slVar.f119810n = 16;
        slVar.setOutsideTouchable(true);
        slVar.setFocusable(true);
        slVar.f119802f = new bg2.a1(this, onShow);
        slVar.f119803g = new bg2.b1(this);
        slVar.setOnDismissListener(new bg2.c1(this));
        slVar.b();
        slVar.setTouchInterceptor(new bg2.z0(targetView));
        in5.s0 s0Var2 = gVar.f417149i;
        if (s0Var2 == null || (y0Var = s0Var2.f293120d) == null) {
            return;
        }
        slVar.d(y0Var);
    }
}
