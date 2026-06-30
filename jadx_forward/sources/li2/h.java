package li2;

/* loaded from: classes10.dex */
public final class h extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.m0 f400298J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        fg2.m0 a17 = fg2.m0.a(com.p314xaae8f345.mm.ui.id.b(context), this, false);
        this.f400298J = a17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = a17.f343668b.f343596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343667a;
        addView(c1073x7e08a787);
        if (pluginAbility.f() == lj2.w0.f400491d) {
            c1073x7e08a787.setOnClickListener(this);
        }
        c22645x24069159.setVisibility(4);
    }

    @Override // lj2.u0
    public void g() {
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124433x9681e6d() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124447xe76ca375() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "GrabRequestWidget";
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005a, code lost:
    
        if (r5.X() == true) goto L12;
     */
    @Override // wj2.w, lj2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(pm2.a r4, xh2.a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "widgetMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            super.l(r4, r5)
            xh2.i r4 = r5.f536054b
            int r4 = r4.f536086e
            r3.K = r4
            fg2.m0 r4 = r3.f400298J
            android.widget.TextView r5 = r4.f343671e
            zl2.r4 r0 = zl2.r4.f555483a
            boolean r1 = r0.x1()
            if (r1 == 0) goto L30
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131764237(0x7f10240d, float:1.9159602E38)
            java.lang.String r1 = r1.getString(r2)
            goto L3f
        L30:
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131763596(0x7f10218c, float:1.9158302E38)
            java.lang.String r1 = r1.getString(r2)
        L3f:
            r5.setText(r1)
            android.view.View r5 = r4.f343670d
            r1 = 2131232997(0x7f0808e5, float:1.808212E38)
            r5.setBackgroundResource(r1)
            lj2.v0 r5 = r3.m174009x3a33aac1()
            tn0.w0 r5 = r5.h()
            r1 = 0
            if (r5 == 0) goto L5d
            boolean r5 = r5.X()
            r2 = 1
            if (r5 != r2) goto L5d
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 == 0) goto L75
            boolean r5 = r0.x1()
            if (r5 != 0) goto L75
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r4.f343669c
            r0 = 2131690939(0x7f0f05bb, float:1.9010936E38)
            r5.setImageResource(r0)
            android.widget.TextView r4 = r4.f343671e
            r5 = 4
            r4.setVisibility(r5)
            goto L82
        L75:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r4.f343669c
            r0 = 2131691135(0x7f0f067f, float:1.9011333E38)
            r5.setImageResource(r0)
            android.widget.TextView r4 = r4.f343671e
            r4.setVisibility(r1)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: li2.h.l(pm2.a, xh2.a):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 m174010xb411027f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pf5.u uVar = pf5.u.f435469a;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (((pl2.x) uVar.b(context).a(pl2.x.class)).f438216f) {
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((pl2.x) uVar.b(context2).a(pl2.x.class)).f438220m.f438211h = 3;
            android.content.Context context3 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            pl2.s sVar = ((pl2.x) uVar.b(context3).a(pl2.x.class)).f438217g;
            if (sVar != null) {
                pl2.s.e(sVar, 0L, null, 3, null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f400298J.f343667a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (zl2.r4.f555483a.w1()) {
                xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
                if (m145850xf6df7a5e != null && (m174010xb411027f = m174010xb411027f()) != null) {
                    m174010xb411027f.e(m145850xf6df7a5e);
                }
            } else {
                lj2.x0 m174010xb411027f2 = m174010xb411027f();
                if (m174010xb411027f2 != null) {
                    m174010xb411027f2.S(this.K);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
