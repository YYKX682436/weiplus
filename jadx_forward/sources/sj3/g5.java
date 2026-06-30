package sj3;

/* loaded from: classes14.dex */
public final class g5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a f490077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a) {
        super(0);
        this.f490077d = c16588x7b895f5a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView m67088x8c409d27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a = this.f490077d;
        android.view.View view = c16588x7b895f5a.f231893h;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567556jw5) : null;
        if ((imageView != null ? imageView.getBackground() : null) instanceof android.graphics.drawable.AnimationDrawable) {
            android.graphics.drawable.Drawable background = imageView.getBackground();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((android.graphics.drawable.AnimationDrawable) background).stop();
        }
        c16588x7b895f5a.removeView(c16588x7b895f5a.f231893h);
        m67088x8c409d27 = c16588x7b895f5a.m67088x8c409d27();
        m67088x8c409d27.setVisibility(8);
        c16588x7b895f5a.f231893h = null;
        c16588x7b895f5a.f231890e = 0;
        return jz5.f0.f384359a;
    }
}
