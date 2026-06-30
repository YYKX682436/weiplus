package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ed extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 f215797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7) {
        super(0);
        this.f215797d = c15452x854f54e7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = this.f215797d;
        android.view.View view = c15452x854f54e7.f215090e;
        if (view != null) {
            android.view.View view2 = view.getVisibility() == 0 ? view : null;
            if (view2 != null) {
                android.animation.ValueAnimator valueAnimator = c15452x854f54e7.f215093h;
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.iqr)).setAlpha(0.0f);
                android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.f564576v2);
                int color = view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560780tz);
                int color2 = view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560791ua);
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dd(view2, c15452x854f54e7, findViewById, color2, color));
                valueAnimator.start();
            }
        }
        c15452x854f54e7.f215090e = null;
        return jz5.f0.f384359a;
    }
}
