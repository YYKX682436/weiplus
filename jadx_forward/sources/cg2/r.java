package cg2;

/* loaded from: classes5.dex */
public final class r extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f122655d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea f122656e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea f122657f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.AnimatorSet f122658g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.AnimatorSet f122659h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f122655d = itemView;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.sni);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f122656e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.snj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f122657f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea) findViewById2;
    }

    @Override // yp.o
    public void f() {
        this.f122657f.animate().cancel();
        android.animation.AnimatorSet animatorSet = this.f122658g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f122658g = null;
        android.animation.AnimatorSet animatorSet2 = this.f122659h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f122659h = null;
    }
}
