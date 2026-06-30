package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class bn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f102987e;

    public bn(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.yn ynVar) {
        this.f102986d = s0Var;
        this.f102987e = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f102986d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.frs);
        if (p17.getVisibility() == 0 && !((com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar) s0Var.p(com.tencent.mm.R.id.frt)).f130702x1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.g99);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.SeekBar seekBar = (android.widget.SeekBar) s0Var.p(com.tencent.mm.R.id.f487542oy0);
        if (seekBar != null) {
            seekBar.setVisibility(0);
        }
        this.f102987e.D1 = null;
    }
}
