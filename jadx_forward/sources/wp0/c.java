package wp0;

/* loaded from: classes7.dex */
public abstract class c extends lc3.s implements jc3.g0, jc3.u {

    /* renamed from: f, reason: collision with root package name */
    public jc3.j0 f529908f;

    /* renamed from: g, reason: collision with root package name */
    public bf3.p f529909g;

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return null;
    }

    public java.util.List G0() {
        return kz5.c0.i(new yp0.a(), new yp0.c(), new yp0.e(), new yp0.d());
    }

    public jz5.l H0() {
        return new jz5.l(0, 0);
    }

    public abstract com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 K0();

    public abstract wp0.b M0(java.lang.String str, java.lang.String str2, boolean z17);

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 K0 = K0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEmojiBaseBiz", "[ME] canvas created id = " + i17 + ", holder size = " + K0.getTop() + ' ' + K0.getWidth() + ' ' + K0.getHeight());
        android.widget.FrameLayout frameLayout = K0.f150181e;
        java.lang.Integer valueOf = frameLayout != null ? java.lang.Integer.valueOf(K0.indexOfChild(frameLayout)) : null;
        android.widget.FrameLayout frameLayout2 = K0.f150182f;
        java.lang.Integer valueOf2 = frameLayout2 != null ? java.lang.Integer.valueOf(K0.indexOfChild(frameLayout2)) : null;
        if (valueOf != null && valueOf2 != null) {
            int intValue2 = valueOf.intValue() - valueOf2.intValue();
            intValue = valueOf.intValue();
            if (intValue2 > 1) {
                intValue--;
            }
        } else if (valueOf != null) {
            intValue = valueOf.intValue() - 1;
            if (intValue < 0) {
                intValue = 0;
            }
        } else {
            intValue = valueOf2 != null ? valueOf2.intValue() + 1 : -1;
        }
        K0.addView(view, intValue, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public abstract java.util.Map N0(boolean z17);

    public void O0() {
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEmojiBaseBiz", "[ME] canvas layout id = " + i17 + ", holder size = " + i18 + ' ' + i27 + ' ' + i28);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEmojiBaseBiz", "[ME] js exception: ".concat(msg));
    }

    public abstract void S0(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b);

    public boolean V0() {
        boolean z17 = true;
        if (this.f529908f != null) {
            return true;
        }
        if (((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_5c731eda", "MagicEmojiCocos") == null) {
            ea5.l wi6 = ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).wi("ilinkres_5c731eda");
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            qVar.c("ilinkres_5c731eda");
            java.util.LinkedList linkedList = qVar.f299081e;
            if (linkedList != null) {
                linkedList.add("MagicEmojiCocos");
            }
            java.util.LinkedList linkedList2 = qVar.f299082f;
            if (linkedList2 != null) {
                java.util.RandomAccess mo14972x73ec24f3 = wi6 != null ? wi6.mo14972x73ec24f3() : null;
                if (mo14972x73ec24f3 == null) {
                    mo14972x73ec24f3 = kz5.p0.f395529d;
                }
                linkedList2.addAll(mo14972x73ec24f3);
            }
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Bi(qVar);
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEmojiBaseBiz", "[ME] canSetup = " + z17);
        if (z17) {
            O0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            bf3.p Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).Di(context);
            Di.a(K0());
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
            c16416x87606a7b.f229361r = this;
            c16416x87606a7b.f229367x = this;
            c16416x87606a7b.f229364u = Di;
            c16416x87606a7b.a(G0());
            c16416x87606a7b.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.001f);
            c16416x87606a7b.f229354h = z65.c.a();
            S0(c16416x87606a7b);
            jc3.j0 wi7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4.class))).wi("MagicEmojiCocos");
            rc3.w0 w0Var = (rc3.w0) wi7;
            w0Var.w(this);
            w0Var.W(c16416x87606a7b);
            w0Var.m162153x68ac462();
            this.f529908f = wi7;
            this.f529909g = Di;
        }
        return z17;
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEmojiBaseBiz", "[ME] canvas destroy id = " + i17);
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEmojiBaseBiz", "[ME] first frame rendered");
    }

    @Override // jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicEmojiBaseBiz", "[ME] biz destroy with reason = " + i17);
    }
}
