package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.j f231523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, sj3.j jVar) {
        super(0);
        this.f231522d = i17;
        this.f231523e = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f231522d;
        boolean z17 = i17 == 1 || i17 == 3;
        sj3.j jVar = this.f231523e;
        if (z17 != jVar.f490124u) {
            jVar.f490124u = z17;
            boolean z18 = !z17;
            if (jVar.f490128y == -1) {
                java.lang.Object systemService = jVar.f3639x46306858.getContext().getSystemService("layout_inflater");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3i, (android.view.ViewGroup) jVar.f490123t, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                if (!z18) {
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
                jVar.f490128y = 4;
                jVar.l(inflate, jVar.f3639x46306858.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4), jVar.f3639x46306858.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4), false);
                ((ku5.t0) ku5.t0.f394148d).k(new sj3.g(jVar), 3000);
            }
        }
        return jz5.f0.f384359a;
    }
}
