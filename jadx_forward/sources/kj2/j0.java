package kj2;

/* loaded from: classes10.dex */
public class j0 extends oj2.f {

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 f389942p1;

    /* renamed from: x1, reason: collision with root package name */
    public lj2.s0 f389943x1;

    /* renamed from: y1, reason: collision with root package name */
    public final int f389944y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f389944y1 = android.graphics.Color.parseColor("#A18B98");
    }

    @Override // wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            u(m151511xfa1f106b());
            t(m151497xd639d394());
            f(m145849x949ba2a5.f390716n, m145849x949ba2a5.f390724v, false);
            S(m151506x2f0ee047());
            r(m151503x4e6f0963(), m151510xc1e76b5b(), m151508x4723753());
        }
        if (A()) {
            m151506x2f0ee047().setOnClickListener(this);
            m174012xaf0594a2(m151506x2f0ee047());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.f389942p1;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(m174010xb411027f().a());
        }
        km2.q m145849x949ba2a52 = m145849x949ba2a5();
        if (m145849x949ba2a52 != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a52.f390705c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935022 = this.f389942p1;
                if (c14246xaa8935022 != null) {
                    c14246xaa8935022.m56875xb4464262(jj2.e.f381512d);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935023 = this.f389942p1;
                if (c14246xaa8935023 != null) {
                    c14246xaa8935023.m56875xb4464262(jj2.e.f381513e);
                }
            }
        }
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setTranslationY(-i65.a.b(getContext(), 10));
        }
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            lj2.s0 s0Var = this.f389943x1;
            if (s0Var != null) {
                km2.q qVar = m145850xf6df7a5e.f536053a;
                java.lang.String str3 = "";
                if (qVar == null || (str = qVar.f390705c) == null) {
                    str = "";
                }
                if (qVar != null && (str2 = qVar.f390703a) != null) {
                    str3 = str2;
                }
                s0Var.a(str, str3);
            }
            oj2.s m151509x82a18d82 = m151509x82a18d82();
            if (m151509x82a18d82 != null) {
                m151509x82a18d82.b(mo124441xc9b30e32(), m145850xf6df7a5e);
            }
        }
        e();
        if (m174009x3a33aac1().a0().K() == null || m145851x309290b1() != pm2.a.f438395r) {
            m174009x3a33aac1().a0().b(new kj2.g0(this));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935024 = this.f389942p1;
        if (c14246xaa8935024 != null) {
            c14246xaa8935024.m56876x52d2f021(this.f389944y1);
        }
    }

    @Override // lj2.u0
    public void e() {
        jz5.f0 f0Var;
        oj2.s m151509x82a18d82;
        dk2.u4 K;
        xh2.i iVar;
        android.widget.TextView m151500xeb5fda54 = m151500xeb5fda54();
        if (m151500xeb5fda54 != null) {
            m151500xeb5fda54.setVisibility(8);
        }
        android.widget.TextView m151500xeb5fda542 = m151500xeb5fda54();
        int i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.a5v;
        if (m151500xeb5fda542 != null) {
            m151500xeb5fda542.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a5v);
        }
        lj2.t0 a07 = m174009x3a33aac1().a0();
        if (a07 == null || (K = a07.K()) == null) {
            f0Var = null;
        } else {
            if (K.h() || K.i()) {
                android.widget.TextView m151500xeb5fda543 = m151500xeb5fda54();
                if (m151500xeb5fda543 != null) {
                    m151500xeb5fda543.setText("0");
                }
                int i18 = K.f315693g;
                if (i18 == 2) {
                    android.widget.TextView m151500xeb5fda544 = m151500xeb5fda54();
                    if (m151500xeb5fda544 != null) {
                        lj2.t0 a08 = m174009x3a33aac1().a0();
                        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
                        m151500xeb5fda544.setBackgroundResource(a08.d((m145850xf6df7a5e == null || (iVar = m145850xf6df7a5e.f536054b) == null) ? 0 : iVar.f536086e) ? com.p314xaae8f345.mm.R.C30861xcebc809e.coa : com.p314xaae8f345.mm.R.C30861xcebc809e.cjh);
                    }
                } else if (i18 == 1) {
                    int h17 = m174009x3a33aac1().a0().h(m145849x949ba2a5());
                    android.widget.TextView m151500xeb5fda545 = m151500xeb5fda54();
                    if (m151500xeb5fda545 != null) {
                        if (h17 == 1) {
                            i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.a2y;
                        }
                        m151500xeb5fda545.setBackgroundResource(i17);
                    }
                }
                W(m151500xeb5fda54());
                android.widget.TextView m151500xeb5fda546 = m151500xeb5fda54();
                if (m151500xeb5fda546 != null) {
                    m151500xeb5fda546.setVisibility(0);
                }
            } else {
                S(m151506x2f0ee047());
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            S(m151506x2f0ee047());
        }
        xh2.a m145850xf6df7a5e2 = m145850xf6df7a5e();
        if (m145850xf6df7a5e2 == null || (m151509x82a18d82 = m151509x82a18d82()) == null) {
            return;
        }
        m151509x82a18d82.b(mo124441xc9b30e32(), m145850xf6df7a5e2);
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public ai2.a mo124427x4f7d778f() {
        return this.f389943x1;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // oj2.f, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public android.animation.ValueAnimator mo124432x5dc7fd72() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new kj2.h0(this));
        return ofFloat;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // wj2.w
    /* renamed from: getProfileSourceType */
    public int mo143569xa7893c8() {
        return zl2.r4.f555483a.x1() ? 8 : 3;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "AudioRoomVisitorWidget";
    }

    @Override // lj2.j
    /* renamed from: getTagTextColor */
    public int mo124441xc9b30e32() {
        return getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz);
    }

    @Override // oj2.f, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // oj2.f, wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oj2.s m151509x82a18d82 = m151509x82a18d82();
        if (m151509x82a18d82 != null) {
            m151509x82a18d82.c();
        }
    }

    @Override // wj2.w
    public boolean z() {
        return false;
    }
}
