package sj3;

/* loaded from: classes14.dex */
public final class m5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a f490176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a) {
        super(0);
        this.f490176d = c16588x7b895f5a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View inflate = this.f490176d.m67091xacd3518b().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3i, (android.view.ViewGroup) this.f490176d, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        if (this.f490176d.f231894i) {
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jwu);
            if (imageView != null) {
                imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bdt);
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jwv);
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h2s);
            }
            inflate.setRotation(90.0f);
        }
        this.f490176d.addView(inflate, new android.widget.FrameLayout.LayoutParams(this.f490176d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4), this.f490176d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4), 17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a = this.f490176d;
        c16588x7b895f5a.f231890e = 4;
        c16588x7b895f5a.f231893h = inflate;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "show ori dialog");
        ku5.u0 u0Var = ku5.t0.f394148d;
        sj3.l5 l5Var = new sj3.l5(this.f490176d, inflate);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(l5Var, 3000L, false);
        return jz5.f0.f384359a;
    }
}
