package qp2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f447317a;

    /* renamed from: b, reason: collision with root package name */
    public int f447318b;

    /* renamed from: c, reason: collision with root package name */
    public int f447319c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f447320d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f447321e;

    public i(oa.i tab, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f447317a = tab;
        jz5.g b17 = jz5.h.b(new qp2.h(this));
        tab.f425311a = this;
        tab.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570879c75);
        android.widget.TextView textView = ((ap2.d) ((jz5.n) b17).mo141623x754a37bb()).f94318c;
        this.f447320d = textView;
        if (textView != null) {
            android.view.View view = tab.f425316f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d : com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        }
        android.widget.ImageView imageView = ((ap2.d) ((jz5.n) b17).mo141623x754a37bb()).f94317b;
        this.f447321e = imageView;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
        }
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f447320d;
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }
}
