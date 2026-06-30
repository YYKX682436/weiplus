package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingImgMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/q;", "Landroid/widget/ImageView;", "getMainContentIv", "Lcom/tencent/mm/ui/chatting/viewitems/er;", "tag", "Ljz5/f0;", "setItemTag", "Landroid/graphics/Bitmap;", "getBitmap", "Lem/o;", "f", "Lem/o;", "getHolder", "()Lem/o;", "setHolder", "(Lem/o;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView */
/* loaded from: classes12.dex */
public final class C22081xf5de6b82 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.q> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.o holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22081xf5de6b82(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0z, (android.view.ViewGroup) this, false);
        m80097x101324ae(new em.o(inflate));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        z01.q qVar = (z01.q) pVar2;
        if (qVar == null) {
            return;
        }
        yz5.p pVar3 = qVar.f550673e;
        int i17 = qVar.f550677i;
        if (pVar3 != null) {
            android.widget.ImageView b17 = m80095x1cddf0a2().b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getChattingContentIv(...)");
            pVar3.mo149xb9724478(b17, new af5.b0(this));
        } else {
            em.o m80095x1cddf0a2 = m80095x1cddf0a2();
            int i18 = i17 + 2;
            int i19 = i17 + 1;
            o70.f aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(qVar.m75939xb282bd08(i18), qVar.m75939xb282bd08(i19));
            android.widget.ImageView b18 = m80095x1cddf0a2.b();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(aj6.f424764a, aj6.f424765b);
            int i27 = i17 + 4;
            if (qVar.m75933x41a8a7f2(i27)) {
                layoutParams.gravity = 5;
            } else {
                layoutParams.gravity = 3;
            }
            b18.setLayoutParams(layoutParams);
            if (qVar.m75933x41a8a7f2(i27)) {
                m80095x1cddf0a2.b().setTag(com.p314xaae8f345.mm.R.id.f567528ui0, m80095x1cddf0a2.g());
            }
            m80095x1cddf0a2.b().setTag(com.p314xaae8f345.mm.R.id.uhz, m80095x1cddf0a2.c());
            int i28 = i17 + 9;
            if (((oi3.f) qVar.m75936x14adae67(i28)) == null) {
                if (qVar.m75939xb282bd08(i18) == 0 || qVar.m75939xb282bd08(i19) == 0) {
                    com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                    com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r0(qVar.m75945x2fec8307(i17 + 0), c19767x257d7f, c19767x257d7f2);
                    qVar.set(i18, java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171));
                    qVar.set(i19, java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingImgMvvmView", "getRent: " + c19767x257d7f + ", " + c19767x257d7f2);
                }
                o70.f aj7 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(qVar.m75939xb282bd08(i18), qVar.m75939xb282bd08(i19));
                qVar.set(i18, java.lang.Integer.valueOf(aj7.f424764a));
                qVar.set(i19, java.lang.Integer.valueOf(aj7.f424765b));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingImgMvvmView", "viewModel.thumbImgW: " + qVar.m75939xb282bd08(i18) + " , " + qVar.m75939xb282bd08(i19));
                gk0.k kVar = new gk0.k(qVar.m75939xb282bd08(i18), qVar.m75939xb282bd08(i19));
                kVar.f353967e = com.p314xaae8f345.mm.R.raw.f79863x2ebe0c96;
                kVar.f353965c = qVar.f550672d;
                kVar.f353966d = 0.0f;
                int i29 = i17 + 0;
                if (com.p314xaae8f345.mm.vfs.w6.j(qVar.m75945x2fec8307(i29))) {
                    gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
                    android.widget.ImageView b19 = m80095x1cddf0a2().b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b19, "getChattingContentIv(...)");
                    java.lang.String m75945x2fec8307 = qVar.m75945x2fec8307(i29);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    ((h83.g) n0Var).Ai(b19, m75945x2fec8307, kVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingImgMvvmView", "attachLocalFile: file exists");
                }
            } else {
                xs.f1 f1Var = (xs.f1) i95.n0.c(xs.f1.class);
                oi3.f fVar = (oi3.f) qVar.m75936x14adae67(i28);
                android.widget.ImageView b27 = m80095x1cddf0a2().b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b27, "getChattingContentIv(...)");
                v70.b0 b0Var = (v70.b0) f1Var;
                b0Var.getClass();
                if (fVar != null) {
                    int i37 = fVar.f427150d;
                    if (!r26.n0.N(fVar.m75945x2fec8307(i37 + 3)) && (fVar.m75942xfb822ef2(i37 + 0) != 0 || fVar.m75942xfb822ef2(i37 + 1) != 0)) {
                        v70.a0 a0Var = v70.b0.f515133m;
                        java.lang.String a17 = a0Var.a(fVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "attachMsgImgThumb imageKey:" + a17);
                        jz5.l Zi = v70.b0.Zi(b0Var, fVar, false, 2, null);
                        java.lang.String str = (java.lang.String) Zi.f384366d;
                        java.lang.String str2 = (java.lang.String) Zi.f384367e;
                        i95.m c17 = i95.n0.c(tg3.u0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        java.lang.String Q8 = tg3.u0.Q8((tg3.u0) c17, fVar, fVar.k(), false, true, 4, null);
                        java.lang.String concat = Q8.concat("hd");
                        g75.z zVar = new g75.z();
                        zVar.l("Common_ImageKey", a17);
                        zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                        zVar.l("Common_MakeSureUIThread", java.lang.Boolean.TRUE);
                        zVar.l("Common_ImageViewRefMap", a0Var.b());
                        zVar.l("Common_ImageViewRef", new d75.c(b27));
                        zVar.l("key_thumb_path", str);
                        zVar.l("key_hd_thumb_path", str2);
                        zVar.l("key_write_thumb_path", Q8);
                        zVar.l("key_write_hd_thumb_path", concat);
                        zVar.l("key_msg_info", fVar);
                        b27.setTag(com.p314xaae8f345.mm.R.id.h9z, a17);
                        gk0.j.b(new gk0.j(kz5.c0.k(y70.g.class, y70.h.class, y70.f.class, y70.s.class, y70.l.class, y70.p.class)), zVar, null, 2, null);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "attachMsgImgThumb invalid msg info");
            }
        }
        pd5.k kVar2 = pd5.l.f435113b;
        if (kVar2.a(com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20104xc7ce92cc.class, false)) {
            em.o m80095x1cddf0a22 = m80095x1cddf0a2();
            if (m80095x1cddf0a22.f336182d == null) {
                m80095x1cddf0a22.f336182d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1) m80095x1cddf0a22.f336179a.findViewById(com.p314xaae8f345.mm.R.id.f569040lg);
            }
            m80095x1cddf0a22.f336182d.m82113x3ae760af(qVar.m75939xb282bd08(i17 + 6));
            m80095x1cddf0a2().e().setVisibility(qVar.m75933x41a8a7f2(i17 + 7) ? 0 : 8);
            m80095x1cddf0a2().g().setVisibility(8);
        } else {
            m80095x1cddf0a2().f().setText(qVar.m75945x2fec8307(i17 + 5));
            int i38 = i17 + 7;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.A(m80095x1cddf0a2().d(), qVar.m75933x41a8a7f2(i38), false);
            m80095x1cddf0a2().f().setVisibility(qVar.m75933x41a8a7f2(i38) ? 0 : 8);
            m80095x1cddf0a2().g().setVisibility(qVar.m75933x41a8a7f2(i38) ? 0 : 8);
            m80095x1cddf0a2().e().setVisibility(8);
        }
        em.o m80095x1cddf0a23 = m80095x1cddf0a2();
        if (m80095x1cddf0a23.f336181c == null) {
            m80095x1cddf0a23.f336181c = (android.widget.ProgressBar) m80095x1cddf0a23.f336179a.findViewById(com.p314xaae8f345.mm.R.id.d4_);
        }
        m80095x1cddf0a23.f336181c.setVisibility(qVar.m75933x41a8a7f2(i17 + 8) ? 0 : 8);
        android.view.View.OnClickListener onClickListener = qVar.f550674f;
        if (onClickListener != null) {
            m80095x1cddf0a2().a().setOnClickListener(onClickListener);
        }
        android.view.View.OnLongClickListener onLongClickListener = qVar.f550675g;
        if (onLongClickListener != null) {
            m80095x1cddf0a2().a().setOnLongClickListener(onLongClickListener);
        }
        android.view.View.OnTouchListener onTouchListener = qVar.f550676h;
        if (onTouchListener != null) {
            m80095x1cddf0a2().a().setOnTouchListener(onTouchListener);
        }
        m80095x1cddf0a2().a().setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2g));
        if (!com.p314xaae8f345.mm.ui.bk.d0() || j62.e.g().i("clicfg_disable_tablet_media_opt", 0, true, true) == 0) {
            m80095x1cddf0a2().a().m82766x251ecffe(kVar2.a(com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20104xc7ce92cc.class, false) ? kz5.c0.i(java.lang.Integer.valueOf(m80095x1cddf0a2().c().getId()), java.lang.Integer.valueOf(m80095x1cddf0a2().b().getId()), java.lang.Integer.valueOf(m80095x1cddf0a2().e().getId())) : kz5.c0.i(java.lang.Integer.valueOf(m80095x1cddf0a2().c().getId()), java.lang.Integer.valueOf(m80095x1cddf0a2().b().getId()), java.lang.Integer.valueOf(m80095x1cddf0a2().g().getId())));
            m80095x1cddf0a2().a().m82764xec18708e(g(qVar.m75939xb282bd08(i17 + 2), qVar.m75939xb282bd08(i17 + 1)));
        }
    }

    public final ym5.a6 g(int i17, int i18) {
        ym5.a6 a6Var;
        z01.q m48328xa0ab20ce = m48328xa0ab20ce();
        if (m48328xa0ab20ce == null) {
            return new ym5.a6(0.0d, 0.0d, 0.0d, 0.0d, 0, 31, null);
        }
        int i19 = m48328xa0ab20ce.f550677i;
        if (i17 == i18) {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, m48328xa0ab20ce.m75933x41a8a7f2(i19 + 4) ? 5 : 3);
        } else if (i17 > i18) {
            a6Var = new ym5.a6(4.0d, 3.0d, 3.0d, 2.25d, m48328xa0ab20ce.m75933x41a8a7f2(i19 + 4) ? 5 : 3);
        } else if (i17 < i18) {
            a6Var = new ym5.a6(3.0d, 4.0d, 2.25d, 3.0d, m48328xa0ab20ce.m75933x41a8a7f2(i19 + 4) ? 5 : 3);
        } else {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, m48328xa0ab20ce.m75933x41a8a7f2(i19 + 4) ? 5 : 3);
        }
        return a6Var;
    }

    /* renamed from: getBitmap */
    public final android.graphics.Bitmap m80094x12501425() {
        android.widget.ImageView b17 = m80095x1cddf0a2().b();
        android.graphics.drawable.Drawable drawable = b17 != null ? b17.getDrawable() : null;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    /* renamed from: getHolder */
    public final em.o m80095x1cddf0a2() {
        em.o oVar = this.holder;
        if (oVar != null) {
            return oVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: getMainContentIv */
    public final android.widget.ImageView m80096x9e033a17() {
        android.widget.ImageView b17 = m80095x1cddf0a2().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getChattingContentIv(...)");
        return b17;
    }

    /* renamed from: setHolder */
    public final void m80097x101324ae(em.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<set-?>");
        this.holder = oVar;
    }

    /* renamed from: setItemTag */
    public final void m80098x2f6118c5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        m80095x1cddf0a2().a().setTag(tag);
    }

    public /* synthetic */ C22081xf5de6b82(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22081xf5de6b82(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
