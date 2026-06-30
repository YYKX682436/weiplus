package nj1;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f419345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f419346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419348g;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f419345d = f0Var;
        this.f419346e = f0Var2;
        this.f419347f = h0Var;
        this.f419348g = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSkylineNativeViewSize width:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f419345d;
        sb6.append(f0Var.f391649d);
        sb6.append(" height:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f419346e;
        sb6.append(f0Var2.f391649d);
        sb6.append(" viewWrapper:");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f419347f;
        sb6.append(h0Var.f391656d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", sb6.toString());
        java.lang.Object obj = h0Var.f391656d;
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SkylineNativeViewFactoryRichText", "updateSkylineNativeViewSize width:" + f0Var.f391649d + " height:" + f0Var2.f391649d + " fail, viewWrapper is null");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        android.view.ViewGroup.LayoutParams layoutParams = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l) obj).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = f0Var.f391649d;
            layoutParams.height = f0Var2.f391649d;
            java.lang.Object obj2 = h0Var.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l) obj2).setLayoutParams(layoutParams);
        }
        wl1.h hVar = (wl1.h) this.f419348g.f391656d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = hVar != null ? hVar.f528576c : null;
        android.view.ViewGroup.LayoutParams layoutParams2 = c22633x83752a59 != null ? c22633x83752a59.getLayoutParams() : null;
        if (c22633x83752a59 == null || layoutParams2 == null) {
            return;
        }
        layoutParams2.width = f0Var.f391649d;
        layoutParams2.height = f0Var2.f391649d;
        c22633x83752a59.setLayoutParams(layoutParams2);
    }
}
