package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class yd extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements qi4.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255992d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f255993e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f255994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f255992d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.vd(this));
        this.f255993e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ud(this));
        this.f255994f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xd(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
    }

    @Override // qi4.b
    public void L3(java.lang.String event, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "onNotifyChange");
        O6();
    }

    public final void O6() {
        java.lang.String string;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) a17).f255260e;
        ai4.m0 m0Var = ai4.m0.f86706a;
        hj4.b i17 = m0Var.i();
        int a18 = i17.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "checkNotifyItem: dataList:" + arrayList.size() + " showTipsType:" + a18 + ' ');
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(P6(), kz5.c1.k(new jz5.l("status_scenesessionid", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ai()), new jz5.l("status_notif_new_msg_cnt_comment", java.lang.Integer.valueOf(m0Var.h(-1))), new jz5.l("status_notif_new_msg_cnt_like", java.lang.Integer.valueOf(m0Var.j())), new jz5.l("status_notif_new_msg_cnt", java.lang.Integer.valueOf(i17.f363194b))));
        if (a18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "hideNotifyView: ");
            android.view.ViewGroup P6 = P6();
            if (P6 == null) {
                return;
            }
            P6.setVisibility(8);
            return;
        }
        android.view.ViewGroup P62 = P6();
        if (P62 != null) {
            P62.setVisibility(0);
        }
        ni4.x xVar = ni4.x.f419309d;
        android.app.Activity context = m80379x76847179();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f255993e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.HashMap avatarSizeMap = ni4.x.f419311f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarSizeMap, "avatarSizeMap");
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        java.util.List K = m0Var.K();
        if (K.size() != 0) {
            java.lang.String str = (java.lang.String) K.get(0);
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            if (linearLayout != null) {
                linearLayout.addView(imageView);
            }
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            int i18 = ni4.x.f419310e;
            if (layoutParams2 != null) {
                layoutParams2.width = i18;
            }
            if (layoutParams2 != null) {
                layoutParams2.height = i18;
            }
            int b17 = i65.a.b(context, 1);
            imageView.setPadding(b17, b17, b17, b17);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78922x61de8d17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        }
        hj4.b i19 = m0Var.i();
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f255994f).mo141623x754a37bb();
        com.p314xaae8f345.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        if (textView != null) {
            int a19 = i19.a();
            if (a19 != 1) {
                string = a19 != 2 ? "" : m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jw_);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "showNotifyView: num:%" + i19.f363194b);
                string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwa, java.lang.Integer.valueOf(i19.f363194b));
            }
            textView.setText(string);
        }
        android.view.ViewGroup P63 = P6();
        if (P63 != null) {
            P63.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.wd(this));
        }
    }

    public final android.view.ViewGroup P6() {
        return (android.view.ViewGroup) ((jz5.n) this.f255992d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.Objects.toString(bundle);
        ai4.m0.f86706a.J(this, this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(P6(), "status_notification_bar");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(P6(), 24, 28809);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ai4.m0.f86706a.p(this, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        O6();
    }
}
