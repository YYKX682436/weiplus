package bg2;

/* loaded from: classes3.dex */
public final class d1 extends tc2.c implements tc2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // tc2.c
    public void Q6() {
    }

    public final void Y6(java.lang.CharSequence text, android.view.View targetView, long j17, yz5.a onShow) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onShow, "onShow");
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
        if (context == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl(context);
        slVar.f201331b.setText(text);
        slVar.f201340k = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz);
        slVar.f201339j = android.graphics.Color.parseColor("#404040");
        slVar.f201333d = targetView;
        slVar.f201332c = j17;
        slVar.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200377d;
        slVar.f201342m = 130;
        slVar.f201343n = 16;
        slVar.setOutsideTouchable(true);
        slVar.setFocusable(true);
        slVar.f201335f = new bg2.a1(this, onShow);
        slVar.f201336g = new bg2.b1(this);
        slVar.setOnDismissListener(new bg2.c1(this));
        slVar.b();
        slVar.setTouchInterceptor(new bg2.z0(targetView));
        in5.s0 s0Var2 = gVar.f498682i;
        if (s0Var2 == null || (y0Var = s0Var2.f374653d) == null) {
            return;
        }
        slVar.d(y0Var);
    }
}
