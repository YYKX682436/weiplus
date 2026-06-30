package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar f103401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(android.view.View view, com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar finderVideoGreenSeekBar, in5.s0 s0Var) {
        super(0);
        this.f103400d = view;
        this.f103401e = finderVideoGreenSeekBar;
        this.f103402f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f103400d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar finderVideoGreenSeekBar = this.f103401e;
        cw2.ba baVar = finderVideoGreenSeekBar.f130703y0;
        if (baVar != null) {
            cw2.ba.a(baVar, finderVideoGreenSeekBar.f162480p / finderVideoGreenSeekBar.f162479o, false, 2, null);
        }
        finderVideoGreenSeekBar.f130702x1 = false;
        in5.s0 s0Var = this.f103402f;
        if (s0Var.p(com.tencent.mm.R.id.frs).getVisibility() == 0) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.g99);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
