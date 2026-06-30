package vy2;

/* loaded from: classes2.dex */
public final class b extends gy2.b {
    public b(int i17) {
        super(i17, 0);
    }

    @Override // gy2.b, zx2.k, zx2.i
    public void e(boolean z17) {
        int i17;
        int i18 = z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.a0c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj;
        if (z17) {
            if (this.f558584i == com.p314xaae8f345.mm.R.C30867xcad56011.ery) {
                r("", true);
            }
            i17 = com.p314xaae8f345.mm.R.raw.f79668x47e8ad96;
        } else {
            i17 = com.p314xaae8f345.mm.R.raw.f79670xb62772ac;
        }
        int i19 = i17;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.CharSequence i27 = i(context);
        int dimension = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        java.lang.CharSequence k17 = hc2.x0.k(i27, context2, '#', i19, i18, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            textView.setText(k17);
            k(z17);
            j(z17);
        }
    }

    @Override // gy2.b, zx2.k
    public void f(android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.f(tabView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWxNotifyTab", "onTabSelected real");
        if (this.f558584i == com.p314xaae8f345.mm.R.C30867xcad56011.ery) {
            r("", true);
        }
    }

    @Override // gy2.b, zx2.k
    public void g(android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWxNotifyTab", "onTabUnSelected real");
        r("", false);
    }

    @Override // gy2.b
    public void r(java.lang.String str, boolean z17) {
        if (this.f359075l != null) {
            int i17 = this.f558584i;
            if (i17 == com.p314xaae8f345.mm.R.C30867xcad56011.ery) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageLike");
                q(str, z17, I0 != null && I0.f455420d == 2);
            } else if (i17 == com.p314xaae8f345.mm.R.C30867xcad56011.erv) {
                r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageComment");
                q(str, z17, I02 != null && I02.f455420d == 2);
            }
        }
    }
}
