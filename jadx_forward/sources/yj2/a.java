package yj2;

/* loaded from: classes10.dex */
public final class a extends yj2.e {

    /* renamed from: q, reason: collision with root package name */
    public lj2.p f544176q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, android.content.Context context, int i18, java.lang.String coverUrl) {
        super(context, i18, coverUrl, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
    }

    @Override // yj2.e
    public void c(boolean z17) {
        super.c(z17);
        if (m177211x7520bed6() == 0) {
            android.widget.RelativeLayout relativeLayout = m177212xd2d0feea().f343577b.f343642a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
            this.f544176q = new lj2.p(relativeLayout);
            android.widget.TextView pkNormalNickName = m177212xd2d0feea().f343583h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkNormalNickName, "pkNormalNickName");
            com.p314xaae8f345.mm.ui.fk.a(pkNormalNickName);
            android.widget.ImageView pkNormalHead = m177212xd2d0feea().f343582g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkNormalHead, "pkNormalHead");
            if (m177207x7c9c69eb() != 4) {
                pkNormalNickName.setVisibility(8);
                pkNormalHead.setVisibility(8);
                return;
            }
            km2.q m177204x949ba2a5 = m177204x949ba2a5();
            if (m177204x949ba2a5 != null) {
                g(m177204x949ba2a5, pkNormalHead);
                pkNormalNickName.setText(m177204x949ba2a5.f390706d);
            }
            pkNormalNickName.setVisibility(0);
            pkNormalHead.setVisibility(0);
        }
    }

    @Override // yj2.e
    public void d() {
        super.d();
        pm2.a aVar = this.f544192p;
        pm2.a aVar2 = pm2.a.f438388h;
        if ((aVar != aVar2) || m177211x7520bed6() != 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = m177212xd2d0feea().f343580e.getLayoutParams();
        layoutParams.width = this.f544192p == aVar2 ? i65.a.b(getContext(), 80) : 0;
        layoutParams.height = this.f544192p == aVar2 ? i65.a.b(getContext(), 80) : 0;
    }

    @Override // yj2.e, xh2.f
    /* renamed from: getBattleResultWidgetCallback */
    public ai2.a mo175548x1de6fcf4() {
        return this.f544176q;
    }
}
