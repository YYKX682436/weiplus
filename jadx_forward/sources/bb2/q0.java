package bb2;

/* loaded from: classes5.dex */
public final class q0 extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f100484d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea f100485e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea f100486f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f100487g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ObjectAnimator f100488h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f100489i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.AnimatorSet f100490j;

    /* renamed from: k, reason: collision with root package name */
    public android.animation.ObjectAnimator f100491k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f100484d = itemView;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.sni);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f100485e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.snj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f100486f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sno);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f100487g = findViewById3;
    }

    @Override // yp.o
    public void f() {
        android.animation.AnimatorSet animatorSet = this.f100490j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.ObjectAnimator objectAnimator = this.f100488h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator = this.f100489i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f100486f.animate().cancel();
        android.animation.ObjectAnimator objectAnimator2 = this.f100491k;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f100490j = null;
        this.f100488h = null;
        this.f100489i = null;
        this.f100491k = null;
        this.f100487g.setOnClickListener(null);
    }
}
