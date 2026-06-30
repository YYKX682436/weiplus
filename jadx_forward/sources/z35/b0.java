package z35;

/* loaded from: classes4.dex */
public final class b0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 f551536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f551537e;

    public b0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46, android.content.Context context) {
        this.f551536d = c19718xcf23ab46;
        this.f551537e = context;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f551536d;
        z35.d0 heroSeekBarChangeListener = c19718xcf23ab46.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.mo129341x95ed2be8(seekBar, i17, z17);
        }
        if (z17) {
            c19718xcf23ab46.m75690x727fe0b2(i17);
            c19718xcf23ab46.m75683xc531d4eb(c19718xcf23ab46.getMTotalTimeMs() * i17);
            c19718xcf23ab46.k(i17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f551536d;
        c19718xcf23ab46.m75691x389cdeb0(true);
        c19718xcf23ab46.m75682xb0dabe1c(true);
        wu5.c hideTask = c19718xcf23ab46.getHideTask();
        if (hideTask != null) {
            hideTask.cancel(false);
        }
        android.content.Context context = this.f551537e;
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        android.view.ViewGroup.LayoutParams layoutParams = c19718xcf23ab46.m75652xa19403eb().getLayoutParams();
        layoutParams.height = h17;
        c19718xcf23ab46.m75652xa19403eb().setLayoutParams(layoutParams);
        c19718xcf23ab46.m75676xa589f587(com.p314xaae8f345.mm.R.C30861xcebc809e.agf);
        android.view.View m75666xfee3d4b = c19718xcf23ab46.m75666xfee3d4b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m75666xfee3d4b, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m75666xfee3d4b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m75666xfee3d4b, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView indCurrentTimeTv = c19718xcf23ab46.getIndCurrentTimeTv();
        android.view.View view = (android.view.View) (indCurrentTimeTv != null ? indCurrentTimeTv.getParent() : null);
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c19718xcf23ab46.m75652xa19403eb().setVisibility(0);
        z35.g0 visibleChangeListener = c19718xcf23ab46.getVisibleChangeListener();
        if (visibleChangeListener != null) {
            visibleChangeListener.a(true);
        }
        c19718xcf23ab46.m75652xa19403eb().setThumb(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.agi));
        z35.d0 heroSeekBarChangeListener = c19718xcf23ab46.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.g6(seekBar, c19718xcf23ab46.getUserSeekProgress());
        }
        x25.b reporter = c19718xcf23ab46.getReporter();
        if (reporter != null) {
            xd4.l0 l0Var = (xd4.l0) reporter;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            l0Var.a();
            l0Var.f535211m++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f551536d;
        c19718xcf23ab46.m75691x389cdeb0(false);
        z35.d0 heroSeekBarChangeListener = c19718xcf23ab46.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.D0(seekBar, c19718xcf23ab46.getUserSeekProgress());
        }
        android.content.Context context = this.f551537e;
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        android.view.ViewGroup.LayoutParams layoutParams = c19718xcf23ab46.m75652xa19403eb().getLayoutParams();
        layoutParams.height = h17;
        c19718xcf23ab46.m75652xa19403eb().setLayoutParams(layoutParams);
        c19718xcf23ab46.m75676xa589f587(com.p314xaae8f345.mm.R.C30861xcebc809e.age);
        c19718xcf23ab46.m75652xa19403eb().setThumb(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.agh));
        android.view.View m75666xfee3d4b = c19718xcf23ab46.m75666xfee3d4b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m75666xfee3d4b, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m75666xfee3d4b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m75666xfee3d4b, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView indCurrentTimeTv = c19718xcf23ab46.getIndCurrentTimeTv();
        android.view.View view = (android.view.View) (indCurrentTimeTv != null ? indCurrentTimeTv.getParent() : null);
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c19718xcf23ab46.e();
    }
}
