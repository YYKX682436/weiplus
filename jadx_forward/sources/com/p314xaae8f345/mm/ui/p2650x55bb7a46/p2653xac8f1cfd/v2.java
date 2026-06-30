package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.e.class)
/* loaded from: classes8.dex */
public class v2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.e {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f281638n = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f281639e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f281640f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f281641g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f281642h = true;

    /* renamed from: i, reason: collision with root package name */
    public final l75.q0 f281643i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u2(this);

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 f281644m = null;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        f21.b wi6 = f21.r0.wi();
        l75.q0 q0Var = this.f281643i;
        wi6.add(q0Var);
        f21.r0.Bi().add(q0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingExitAnimEnd]");
        if (gm0.j1.a()) {
            f21.b wi6 = f21.r0.wi();
            l75.q0 q0Var = this.f281643i;
            wi6.mo49775xc84af884(q0Var);
            f21.r0.Bi().mo49775xc84af884(q0Var);
        }
        m0();
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 && !this.f281642h) {
            q0();
        } else if (i17 == 2 && this.f281642h) {
            q0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
    }

    public final void m0() {
        android.graphics.Bitmap bitmap = this.f281639e;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "recycle bitmap:%s", this.f281639e.toString());
            this.f281639e.recycle();
        }
        android.widget.ImageView imageView = this.f281640f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.widget.ImageView imageView2 = this.f281641g;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    public int n0() {
        if (this.f281644m.f272402d) {
            return !com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30861xcebc809e.czh : com.p314xaae8f345.mm.R.C30861xcebc809e.czg;
        }
        return 0;
    }

    public int o0(int i17) {
        if (this.f281644m.f272402d) {
            return 0;
        }
        return i17 - i65.a.f(this.f280113d.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561178bk);
    }

    public boolean p0() {
        f21.a m07 = f21.r0.wi().m0(this.f280113d.x());
        return (m07 == null || m07.f340366b == -2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0() {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2.q0():void");
    }

    public final void r0(int i17) {
        m0();
        android.widget.ImageView imageView = this.f281640f;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(i17));
            return;
        }
        android.view.View c17 = this.f280113d.c(com.p314xaae8f345.mm.R.id.bkb);
        if (c17 != null) {
            c17.setBackgroundColor(i17);
        }
    }

    public final boolean s0(android.content.Context context, java.lang.String str) {
        java.util.HashMap hashMap = f281638n;
        if (hashMap.containsKey(str)) {
            this.f281644m = (com.p314xaae8f345.mm.p2470x93e71c27.ui.i0) hashMap.get(str);
            return true;
        }
        try {
            java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(context.getAssets().open(str));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 i0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.i0(e17, this.f280113d.g());
                this.f281644m = i0Var;
                hashMap.put(str, i0Var);
            }
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.ChattingBackgroundComponent", e18, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingEnterAnimStart]");
        q0();
    }
}
