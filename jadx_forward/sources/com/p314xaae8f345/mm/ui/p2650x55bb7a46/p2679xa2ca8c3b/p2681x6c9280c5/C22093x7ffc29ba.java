package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingVideoMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/j0;", "Lz01/i0;", "downloadViewModel", "Ljz5/f0;", "setVideoDownloadUI", "", "visibility", "setOriginVideoStatusAreaVisibility", "Landroid/graphics/Bitmap;", "getBitmap", "Lem/z;", "g", "Lem/z;", "getHolder", "()Lem/z;", "setHolder", "(Lem/z;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView */
/* loaded from: classes9.dex */
public final class C22093x7ffc29ba extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.j0> {

    /* renamed from: f, reason: collision with root package name */
    public final int f286174f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.z holder;

    /* renamed from: h, reason: collision with root package name */
    public final af5.m0 f286176h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22093x7ffc29ba(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setVideoDownloadUI */
    private final void m80108xde1e0f35(z01.i0 i0Var) {
        if (!i0Var.f550587d && !i0Var.f550588e) {
            em.z m80110x1cddf0a2 = m80110x1cddf0a2();
            if (m80110x1cddf0a2.f336492m == null) {
                m80110x1cddf0a2.f336492m = (android.widget.FrameLayout) m80110x1cddf0a2.f336480a.findViewById(com.p314xaae8f345.mm.R.id.ukz);
            }
            m80110x1cddf0a2.f336492m.setVisibility(8);
            return;
        }
        em.z m80110x1cddf0a22 = m80110x1cddf0a2();
        if (m80110x1cddf0a22.f336492m == null) {
            m80110x1cddf0a22.f336492m = (android.widget.FrameLayout) m80110x1cddf0a22.f336480a.findViewById(com.p314xaae8f345.mm.R.id.ukz);
        }
        m80110x1cddf0a22.f336492m.setVisibility(0);
        if (i0Var.f550587d) {
            m80110x1cddf0a2().n().setVisibility(0);
            android.widget.TextView n17 = m80110x1cddf0a2().n();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i0Var.f550591h);
            sb6.append('%');
            n17.setText(sb6.toString());
            em.z m80110x1cddf0a23 = m80110x1cddf0a2();
            if (m80110x1cddf0a23.f336493n == null) {
                m80110x1cddf0a23.f336493n = (android.widget.LinearLayout) m80110x1cddf0a23.f336480a.findViewById(com.p314xaae8f345.mm.R.id.vm7);
            }
            m80110x1cddf0a23.f336493n.setVisibility(8);
            return;
        }
        m80110x1cddf0a2().n().setVisibility(8);
        em.z m80110x1cddf0a24 = m80110x1cddf0a2();
        if (m80110x1cddf0a24.f336493n == null) {
            m80110x1cddf0a24.f336493n = (android.widget.LinearLayout) m80110x1cddf0a24.f336480a.findViewById(com.p314xaae8f345.mm.R.id.vm7);
        }
        m80110x1cddf0a24.f336493n.setVisibility(0);
        em.z m80110x1cddf0a25 = m80110x1cddf0a2();
        if (m80110x1cddf0a25.f336489j == null) {
            m80110x1cddf0a25.f336489j = (android.widget.TextView) m80110x1cddf0a25.f336480a.findViewById(com.p314xaae8f345.mm.R.id.sxa);
        }
        m80110x1cddf0a25.f336489j.setText(i0Var.f550589f);
        em.z m80110x1cddf0a26 = m80110x1cddf0a2();
        if (m80110x1cddf0a26.f336489j == null) {
            m80110x1cddf0a26.f336489j = (android.widget.TextView) m80110x1cddf0a26.f336480a.findViewById(com.p314xaae8f345.mm.R.id.sxa);
        }
        android.widget.TextView textView = m80110x1cddf0a26.f336489j;
        em.z m80110x1cddf0a27 = m80110x1cddf0a2();
        if (m80110x1cddf0a27.f336497r == null) {
            m80110x1cddf0a27.f336497r = (android.widget.FrameLayout) m80110x1cddf0a27.f336480a.findViewById(com.p314xaae8f345.mm.R.id.uwy);
        }
        textView.setVisibility(m80110x1cddf0a27.f336497r.getWidth() > this.f286174f ? 0 : 8);
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2b, (android.view.ViewGroup) this, false);
        m80111x101324ae(new em.z(inflate));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        jz5.f0 f0Var;
        z01.j0 j0Var = (z01.j0) pVar2;
        if (j0Var == null) {
            return;
        }
        android.graphics.Bitmap bitmap = j0Var.f550596d;
        if (bitmap != null) {
            m80110x1cddf0a2().b().setImageBitmap(bitmap);
            m80110x1cddf0a2().c().setLayoutParams(new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            yz5.p pVar3 = j0Var.f550597e;
            if (pVar3 != null) {
                android.widget.ImageView b17 = m80110x1cddf0a2().b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getChattingContentIv(...)");
                pVar3.mo149xb9724478(b17, new af5.k0(this));
            }
            m80110x1cddf0a2().c().setLayoutParams(new android.widget.FrameLayout.LayoutParams(m80110x1cddf0a2().b().getLayoutParams().width, m80110x1cddf0a2().b().getLayoutParams().height));
        }
        android.widget.ImageView b18 = m80110x1cddf0a2().b();
        af5.m0 m0Var = this.f286176h;
        b18.removeOnLayoutChangeListener(m0Var);
        m80110x1cddf0a2().b().addOnLayoutChangeListener(m0Var);
        int i17 = j0Var.f550600h;
        if (j0Var.f550598f) {
            m80110x1cddf0a2().k().setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j0Var.f550601i));
            m80110x1cddf0a2().d().setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(j0Var.f550602m));
            m80110x1cddf0a2().l().setImageDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            m80110x1cddf0a2().j().setVisibility(8);
            m80110x1cddf0a2().m().setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingVideoMvvmView", "video status %d, msg fail is %s, is msg remuxing is %s, isfailreson is %s, has remux job is %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(j0Var.f550599g), java.lang.Boolean.valueOf(j0Var.f550608s), java.lang.Boolean.valueOf(j0Var.f550603n), java.lang.Boolean.valueOf(j0Var.f550609t));
            if (i17 == 104 || i17 == 103) {
                if (j0Var.f550608s) {
                    m80110x1cddf0a2().j().setVisibility(0);
                    m80110x1cddf0a2().m().setVisibility(0);
                    m80110x1cddf0a2().d().setText((java.lang.CharSequence) null);
                    m80110x1cddf0a2().k().setText((java.lang.CharSequence) null);
                    m80110x1cddf0a2().l().setImageDrawable(null);
                    m80112xb4e2a3e4(8);
                } else if (j0Var.f550611v) {
                    m80110x1cddf0a2().l().setVisibility(8);
                    m80112xb4e2a3e4(0);
                    m80110x1cddf0a2().i().setVisibility(8);
                    m80110x1cddf0a2().f().s(com.p314xaae8f345.mm.R.raw.f79844x41f895de, android.R.color.white);
                    m80110x1cddf0a2().g().m82112x7e1bd1fe(true);
                    m80110x1cddf0a2().g().m82113x3ae760af((int) j0Var.f550612w);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingVideoMvvmView", "newSendProgress BEGIN_SEND progress=" + j0Var.f550612w);
                } else {
                    if (m80110x1cddf0a2().j() != null) {
                        m80110x1cddf0a2().j().setVisibility(8);
                    }
                    if (m80110x1cddf0a2().m() != null) {
                        m80110x1cddf0a2().m().setVisibility(8);
                    }
                    m80110x1cddf0a2().l().setVisibility(8);
                    if (t21.d3.s()) {
                        m80112xb4e2a3e4(0);
                        m80110x1cddf0a2().i().setVisibility(8);
                        m80110x1cddf0a2().f().s(com.p314xaae8f345.mm.R.raw.f79844x41f895de, android.R.color.white);
                        m80110x1cddf0a2().g().m82112x7e1bd1fe(true);
                        m80110x1cddf0a2().g().m82113x3ae760af(j0Var.f550610u);
                    } else {
                        m80112xb4e2a3e4(8);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingVideoMvvmView", "status begin");
            } else if (i17 == 105 || j0Var.f550599g || i17 == 198 || j0Var.f550603n) {
                if (t21.d3.s()) {
                    m80110x1cddf0a2().l().setVisibility(8);
                    m80112xb4e2a3e4(0);
                    m80110x1cddf0a2().f().s(com.p314xaae8f345.mm.R.raw.f78418xba0710d8, android.R.color.white);
                    m80110x1cddf0a2().g().m82113x3ae760af(j0Var.f550611v ? (int) j0Var.f550612w : j0Var.f550610u);
                    m80110x1cddf0a2().g().m82112x7e1bd1fe(false);
                    if (i17 == 105) {
                        m80110x1cddf0a2().i().setVisibility(8);
                    }
                } else {
                    m80112xb4e2a3e4(8);
                    m80110x1cddf0a2().l().setVisibility(0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingVideoMvvmView", "status pause");
            } else if (i17 != 106) {
                m80112xb4e2a3e4(8);
                m80110x1cddf0a2().l().setVisibility(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingVideoMvvmView", "status gone");
            } else if (j0Var.f550611v) {
                m80110x1cddf0a2().j().setVisibility(8);
                m80110x1cddf0a2().m().setVisibility(8);
                m80110x1cddf0a2().l().setVisibility(8);
                m80112xb4e2a3e4(0);
                m80110x1cddf0a2().i().setVisibility(8);
                m80110x1cddf0a2().f().s(com.p314xaae8f345.mm.R.raw.f79844x41f895de, android.R.color.white);
                m80110x1cddf0a2().g().m82112x7e1bd1fe(true);
                m80110x1cddf0a2().g().m82113x3ae760af((int) j0Var.f550612w);
            } else if (j0Var.f550609t) {
                m80110x1cddf0a2().j().setVisibility(0);
                m80110x1cddf0a2().m().setVisibility(0);
                if (!t21.d3.s()) {
                    m80110x1cddf0a2().d().setText((java.lang.CharSequence) null);
                }
                m80110x1cddf0a2().k().setText((java.lang.CharSequence) null);
                m80110x1cddf0a2().l().setImageDrawable(null);
                m80112xb4e2a3e4(8);
            }
        } else {
            m80110x1cddf0a2().k().setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j0Var.f550601i));
            m80110x1cddf0a2().d().setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(j0Var.f550602m));
            if (i17 == 199) {
                m80110x1cddf0a2().l().setImageDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            } else {
                m80110x1cddf0a2().l().setImageDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
                m80110x1cddf0a2().k().setVisibility(8);
            }
            if (j0Var.f550604o) {
                m80110x1cddf0a2().e().setVisibility(0);
                m80110x1cddf0a2().e().m82113x3ae760af(j0Var.f550606q);
            } else {
                m80110x1cddf0a2().e().setVisibility(8);
                em.z m80110x1cddf0a2 = m80110x1cddf0a2();
                if (m80110x1cddf0a2.f336488i == null) {
                    m80110x1cddf0a2.f336488i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m80110x1cddf0a2.f336480a.findViewById(com.p314xaae8f345.mm.R.id.f565227bq5);
                }
                m80110x1cddf0a2.f336488i.setVisibility(j0Var.f550605p ? 0 : 8);
            }
            m80108xde1e0f35(j0Var.f550607r);
            m80112xb4e2a3e4(8);
        }
        if (t21.d3.s()) {
            m80110x1cddf0a2().h().setOnClickListener(j0Var.f550613x);
            m80110x1cddf0a2().h().setClickable(true);
            m80110x1cddf0a2().h().setFocusable(true);
        }
        android.view.View.OnClickListener onClickListener = j0Var.f550614y;
        if (onClickListener != null) {
            m80110x1cddf0a2().a().setOnClickListener(onClickListener);
        }
        android.view.View.OnLongClickListener onLongClickListener = j0Var.f550615z;
        if (onLongClickListener != null) {
            m80110x1cddf0a2().a().setOnLongClickListener(onLongClickListener);
        }
        android.view.View.OnTouchListener onTouchListener = j0Var.A;
        if (onTouchListener != null) {
            m80110x1cddf0a2().a().setOnTouchListener(onTouchListener);
        }
        if (!com.p314xaae8f345.mm.ui.bk.d0() || j62.e.g().i("clicfg_disable_tablet_media_opt", 0, true, true) == 0) {
            m80110x1cddf0a2().a().m82766x251ecffe(kz5.c0.i(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.bko), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.bkm)));
            com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2 a17 = m80110x1cddf0a2().a();
            android.graphics.Bitmap bitmap2 = j0Var.f550596d;
            int width = bitmap2 != null ? bitmap2.getWidth() : 0;
            android.graphics.Bitmap bitmap3 = j0Var.f550596d;
            a17.m82764xec18708e(g(width, bitmap3 != null ? bitmap3.getHeight() : 0));
        }
    }

    public final ym5.a6 g(int i17, int i18) {
        ym5.a6 a6Var;
        z01.j0 m48328xa0ab20ce = m48328xa0ab20ce();
        if (m48328xa0ab20ce == null) {
            return new ym5.a6(0.0d, 0.0d, 0.0d, 0.0d, 0, 31, null);
        }
        if (i17 == i18) {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, m48328xa0ab20ce.f550598f ? 5 : 3);
        } else if (i17 > i18) {
            a6Var = new ym5.a6(4.0d, 3.0d, 3.0d, 2.25d, m48328xa0ab20ce.f550598f ? 5 : 3);
        } else if (i17 < i18) {
            a6Var = new ym5.a6(3.0d, 4.0d, 2.25d, 3.0d, m48328xa0ab20ce.f550598f ? 5 : 3);
        } else {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, m48328xa0ab20ce.f550598f ? 5 : 3);
        }
        return a6Var;
    }

    /* renamed from: getBitmap */
    public final android.graphics.Bitmap m80109x12501425() {
        android.graphics.drawable.Drawable drawable = m80110x1cddf0a2().b().getDrawable();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    /* renamed from: getHolder */
    public final em.z m80110x1cddf0a2() {
        em.z zVar = this.holder;
        if (zVar != null) {
            return zVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: setHolder */
    public final void m80111x101324ae(em.z zVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zVar, "<set-?>");
        this.holder = zVar;
    }

    /* renamed from: setOriginVideoStatusAreaVisibility */
    public final void m80112xb4e2a3e4(int i17) {
        m80110x1cddf0a2().h().setVisibility(i17);
        m80110x1cddf0a2().i().setVisibility(i17);
        m80110x1cddf0a2().f().setVisibility(i17);
        m80110x1cddf0a2().g().setVisibility(i17);
    }

    public /* synthetic */ C22093x7ffc29ba(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22093x7ffc29ba(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f286174f = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 74);
        this.f286176h = new af5.m0(this);
    }
}
