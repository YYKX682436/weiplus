package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class en extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f103271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar f103273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103274g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar finderVideoGreenSeekBar, android.view.View view) {
        super(0);
        this.f103271d = ynVar;
        this.f103272e = s0Var;
        this.f103273f = finderVideoGreenSeekBar;
        this.f103274g = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        cw2.h8 playInfo;
        com.tencent.mm.plugin.finder.convert.yn ynVar = this.f103271d;
        in5.s0 s0Var = this.f103272e;
        com.tencent.mm.plugin.finder.convert.yn.Q1(ynVar, s0Var, true);
        com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar finderVideoGreenSeekBar = this.f103273f;
        cw2.ba baVar = finderVideoGreenSeekBar.f130703y0;
        if (baVar != null && (playInfo = (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) baVar).getPlayInfo()) != null) {
            playInfo.f223755k = !(finderVideoLayout.getVideoView() != null ? r3.isPlaying() : false);
        }
        finderVideoGreenSeekBar.f130702x1 = true;
        android.view.View view = this.f103274g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
