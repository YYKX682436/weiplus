package my2;

/* loaded from: classes3.dex */
public final class y extends ie2.a implements my2.b {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f414307g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f414308h;

    /* renamed from: i, reason: collision with root package name */
    public final my2.a f414309i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f414310m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, android.view.View root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, my2.a aVar) {
        super(root, c14179xd6e3454a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f414307g = z17;
        this.f414308h = activity;
        this.f414309i = aVar;
        u().setTag(java.lang.Float.valueOf(1.0f));
    }

    public final void A(android.os.Bundle bundle) {
        java.lang.String str;
        android.widget.TextView B = B();
        if (B != null) {
            if (bundle == null || (str = bundle.getString("currentCountDownText")) == null) {
                str = "";
            }
            B.setText(str);
        }
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.fqf);
        if (t17 != null) {
            t17.setOnClickListener(new my2.v(this));
        }
    }

    public final android.widget.TextView B() {
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.cjn);
        if (t17 instanceof android.widget.TextView) {
            return (android.widget.TextView) t17;
        }
        return null;
    }

    public void C(boolean z17) {
        if (z17 != this.f414310m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "needResize :" + z17);
        }
        this.f414310m = z17;
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.p8g);
        android.widget.ImageView imageView = t17 instanceof android.widget.ImageView ? (android.widget.ImageView) t17 : null;
        boolean z18 = false;
        if (imageView != null && imageView.getVisibility() == 0) {
            z18 = true;
        }
        if (z18) {
            E();
        }
    }

    public final android.os.Bundle D() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.widget.TextView B = B();
        bundle.putString("currentCountDownText", java.lang.String.valueOf(B != null ? B.getText() : null));
        return bundle;
    }

    public final void E() {
        float f17 = this.f414310m ? 0.8f : 1.0f;
        android.view.View u17 = u();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17.getTag(), java.lang.Float.valueOf(f17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "updateRootViewSize fail, scale:" + f17 + ",width:" + u17.getLayoutParams().width);
            return;
        }
        u17.setTag(java.lang.Float.valueOf(f17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "updateRootViewSize scale:" + f17);
        u17.post(new my2.x(u17, f17));
    }

    public void F(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "showBubbleFinish");
        android.widget.TextView B = B();
        if (B != null) {
            B.setText(u().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573415ej0));
        }
        callback.mo152xb9724478();
    }

    public void G(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "showPrepareVote");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "reset");
        E();
        android.widget.TextView B = B();
        if (B != null) {
            B.setText(u().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573416ej1));
        }
        callback.mo152xb9724478();
    }

    @Override // ie2.h
    public android.os.Bundle a() {
        return D();
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f414308h;
    }

    @Override // ie2.h
    public void j() {
    }

    @Override // ie2.h
    public void l(android.os.Bundle bundle) {
        A(bundle);
        android.widget.TextView B = B();
        if (B != null) {
            B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563271a53);
        }
    }

    @Override // ie2.h
    public android.os.Bundle o() {
        return D();
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.a
    public java.lang.String v() {
        return "FinderLiveVoteBubbleViewCallback";
    }
}
