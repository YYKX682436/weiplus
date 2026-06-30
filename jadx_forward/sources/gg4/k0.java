package gg4;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4 f353292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f353293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f353294f;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4 c18542x1ed6a4a4, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f353292d = c18542x1ed6a4a4;
        this.f353293e = h0Var;
        this.f353294f = h0Var2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeFooterPreference$setUpViewsAppear$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4 c18542x1ed6a4a4 = this.f353292d;
            android.widget.TextView textView = c18542x1ed6a4a4.M;
            if (textView != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f353293e;
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f353294f;
                float M = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4.M(c18542x1ed6a4a4);
                android.content.Context context = c18542x1ed6a4a4.f279303d;
                int i17 = (int) M;
                int width = (textView.getWidth() / 2) - (i17 / 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeFooterPreference", "lenOfNickname = %d, xOffset = %d ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(width));
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570223e41, (android.view.ViewGroup) null);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t0d)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr));
                new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b(inflate).a(textView, al5.f.f87419d, al5.g.f87442d, width, 0, new gg4.i0(h0Var), new gg4.j0(c18542x1ed6a4a4, h0Var2));
            }
            z17 = true;
        } catch (java.lang.Throwable unused) {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeFooterPreference$setUpViewsAppear$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
