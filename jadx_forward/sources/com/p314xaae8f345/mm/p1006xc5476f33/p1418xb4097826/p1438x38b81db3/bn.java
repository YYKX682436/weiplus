package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class bn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn f184520e;

    public bn(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar) {
        this.f184519d = s0Var;
        this.f184520e = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f184519d;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.frs);
        if (p17.getVisibility() == 0 && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d) s0Var.p(com.p314xaae8f345.mm.R.id.frt)).f212235x1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.g99);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.SeekBar seekBar = (android.widget.SeekBar) s0Var.p(com.p314xaae8f345.mm.R.id.f569075oy0);
        if (seekBar != null) {
            seekBar.setVisibility(0);
        }
        this.f184520e.D1 = null;
    }
}
