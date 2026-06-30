package wj2;

/* loaded from: classes10.dex */
public final class a extends oj2.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // oj2.l
    public void a0() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570463av4, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.g9c;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g9c);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f566244f85;
            android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566244f85);
            if (a17 != null) {
                fg2.v a18 = fg2.v.a(a17);
                android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
                if (a19 != null) {
                    fg2.a0 a27 = fg2.a0.a(a19);
                    int i18 = com.p314xaae8f345.mm.R.id.f_i;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_i);
                    if (frameLayout != null) {
                        i18 = com.p314xaae8f345.mm.R.id.fa_;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_);
                        if (textView != null) {
                            i18 = com.p314xaae8f345.mm.R.id.fak;
                            android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                            if (a28 != null) {
                                fg2.r0 a29 = fg2.r0.a(a28);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
                                int i19 = com.p314xaae8f345.mm.R.id.fm8;
                                if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fm8)) != null) {
                                    i19 = com.p314xaae8f345.mm.R.id.fqg;
                                    android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fqg);
                                    if (a37 != null) {
                                        fg2.w1 a38 = fg2.w1.a(a37);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22641xff2656ea, "getRoot(...)");
                                        m151546x764fb064(c22641xff2656ea);
                                        m151541xc9649f78(frameLayout);
                                        android.widget.RelativeLayout relativeLayout = a38.f343922a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                                        m151545x4d20176c(relativeLayout);
                                        android.widget.RelativeLayout relativeLayout2 = a27.f343469a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
                                        m151540x91c3b56e(relativeLayout2);
                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a29.f343815a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                                        m151543x96ee7780(c1073x7e08a787);
                                        android.widget.RelativeLayout relativeLayout3 = a18.f343914a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout3, "getRoot(...)");
                                        m151539xe2837de3(relativeLayout3);
                                        m151542x1da37660(textView);
                                        m151538x2eb7dd5d(imageView);
                                        return;
                                    }
                                }
                                i17 = i19;
                            }
                        }
                    }
                    i17 = i18;
                } else {
                    i17 = com.p314xaae8f345.mm.R.id.f8q;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // oj2.l, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "AnchorMultiAudienceWidget";
    }
}
