package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/MusicView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getMusicMediaIcon", "Landroid/widget/ImageView;", "getMusicCover", "Landroid/view/View;", "getMusicContainer", "", "getAccessibilityDesc", "", "p", "Ljz5/g;", "getOtherWidth", "()I", "otherWidth", "q", "getMusicViewHeight", "musicViewHeight", "r", "getTwoDp", "twoDp", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.widget.MusicView */
/* loaded from: classes4.dex */
public final class C18734x8eb4224a extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f256369d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f256370e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f256371f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f256372g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f256373h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f256374i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f256375m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f256376n;

    /* renamed from: o, reason: collision with root package name */
    public r45.zs4 f256377o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g otherWidth;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final jz5.g musicViewHeight;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final jz5.g twoDp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18734x8eb4224a(android.content.Context context) {
        this(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getMusicViewHeight */
    private final int m72266x368c59fb() {
        return ((java.lang.Number) ((jz5.n) this.musicViewHeight).mo141623x754a37bb()).intValue();
    }

    /* renamed from: getOtherWidth */
    private final int m72267xe2ee608c() {
        return ((java.lang.Number) ((jz5.n) this.otherWidth).mo141623x754a37bb()).intValue();
    }

    /* renamed from: getTwoDp */
    private final int m72268x75380e42() {
        return ((java.lang.Number) ((jz5.n) this.twoDp).mo141623x754a37bb()).intValue();
    }

    public final void a(boolean z17, boolean z18) {
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f256375m;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f256375m;
        if (c22699x3dcdb3522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
            throw null;
        }
        boolean z19 = false;
        c22699x3dcdb3522.setVisibility(0);
        r45.zs4 zs4Var = this.f256377o;
        if (zs4Var != null && zs4Var.f473892q) {
            z19 = true;
        }
        if (z19) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f256375m;
            if (c22699x3dcdb3523 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zs4Var);
            int i17 = zs4Var.f473893r;
            r45.zs4 zs4Var2 = this.f256377o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zs4Var2);
            c22699x3dcdb3523.s(i17, zs4Var2.f473894s);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f256375m;
            if (c22699x3dcdb3524 != null) {
                c22699x3dcdb3524.setImportantForAccessibility(2);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
                throw null;
            }
        }
        int i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832;
        int i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231;
        if (z18) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.f256375m;
            if (c22699x3dcdb3525 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
                throw null;
            }
            if (zs4Var != null) {
                if (!zs4Var.f473891p) {
                    i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231;
                }
                i19 = i18;
            }
            c22699x3dcdb3525.s(com.p314xaae8f345.mm.R.raw.f79844x41f895de, i19);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = this.f256375m;
            if (c22699x3dcdb3526 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
                throw null;
            }
            c22699x3dcdb3526.setImportantForAccessibility(1);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = this.f256375m;
            if (c22699x3dcdb3527 != null) {
                c22699x3dcdb3527.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lo6));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3528 = this.f256375m;
        if (c22699x3dcdb3528 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
            throw null;
        }
        if (zs4Var != null) {
            if (!zs4Var.f473891p) {
                i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231;
            }
            i19 = i18;
        }
        c22699x3dcdb3528.s(com.p314xaae8f345.mm.R.raw.f79905x9403a955, i19);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3529 = this.f256375m;
        if (c22699x3dcdb3529 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
            throw null;
        }
        c22699x3dcdb3529.setImportantForAccessibility(1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35210 = this.f256375m;
        if (c22699x3dcdb35210 != null) {
            c22699x3dcdb35210.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574918lo5));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
            throw null;
        }
    }

    public final void b(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f256374i;
        if (c22624x85d69039 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
            throw null;
        }
        if (c22624x85d69039 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c22624x85d69039.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i17;
        }
        c22624x85d69039.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f256374i;
        if (c22624x85d690392 != null) {
            c22624x85d690392.m84175x8dd5167d(i18);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
            throw null;
        }
    }

    public final void c(r45.zs4 musicViewData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicViewData, "musicViewData");
        this.f256377o = musicViewData;
        ff0.q qVar = (ff0.q) i95.n0.c(ff0.q.class);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f256372g;
        if (c22628xfde5d61d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicCover");
            throw null;
        }
        android.view.View view = this.f256369d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurBg");
            throw null;
        }
        ((if0.w) qVar).Bi(context, c22628xfde5d61d, view, musicViewData);
        java.lang.String str = musicViewData.f473883e;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            android.widget.TextView textView = this.f256373h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.f256373h;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = this.f256373h;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
            textView3.setText("");
            android.widget.TextView textView4 = this.f256373h;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
            textView4.setVisibility(8);
        }
        if (musicViewData.f473891p) {
            android.widget.TextView textView5 = this.f256373h;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
            textView5.setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
        } else {
            android.widget.TextView textView6 = this.f256373h;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
            textView6.setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f256374i;
        if (c22624x85d69039 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
            throw null;
        }
        c22624x85d69039.b(musicViewData.f473882d);
        if (musicViewData.f473891p) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f256374i;
            if (c22624x85d690392 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
                throw null;
            }
            c22624x85d690392.m84183x1c5c5ff4(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = this.f256374i;
            if (c22624x85d690393 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
                throw null;
            }
            c22624x85d690393.m84183x1c5c5ff4(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
        }
        if (musicViewData.f473890o == 0) {
            musicViewData.f473890o = getMeasuredWidth();
        }
        int max = java.lang.Integer.max(musicViewData.f473890o - m72267xe2ee608c(), 0);
        boolean z17 = i65.a.n(getContext()) > 1.0f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690394 = this.f256374i;
        if (c22624x85d690394 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
            throw null;
        }
        ks5.a i17 = c22624x85d690394.i(max, Integer.MAX_VALUE);
        if (i17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicMvView", "updateTitle layout null, isLargeFont: " + z17);
            b(0, z17 ? 2 : 3);
        } else {
            int i18 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i17).L;
            if (z17) {
                if (i18 >= 3) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690395 = this.f256374i;
                    if (c22624x85d690395 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
                        throw null;
                    }
                    int m84155xcf821e31 = c22624x85d690395.m84155xcf821e31();
                    int m72266x368c59fb = m72266x368c59fb();
                    android.widget.TextView textView7 = this.f256373h;
                    if (textView7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                        throw null;
                    }
                    if ((m84155xcf821e31 * 2) + ((ks5.c) i17).e(0) <= m72266x368c59fb - textView7.getLineHeight()) {
                        b(0, 3);
                    } else {
                        b(m72268x75380e42(), 2);
                    }
                } else {
                    b(m72268x75380e42(), 2);
                }
            } else if (i18 >= 3) {
                b(0, 3);
            } else {
                b(m72268x75380e42(), 2);
            }
        }
        a(musicViewData.f473888m, musicViewData.f473889n);
        if (!musicViewData.f473895t) {
            android.view.View view2 = this.f256376n;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f256376n == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d2 = this.f256372g;
            if (c22628xfde5d61d2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicCover");
                throw null;
            }
            android.view.ViewParent parent = c22628xfde5d61d2.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            android.view.View view3 = this.f256372g;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicCover");
                throw null;
            }
            int indexOfChild = viewGroup.indexOfChild(view3);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d3 = this.f256372g;
            if (c22628xfde5d61d3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicCover");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c22628xfde5d61d3.getLayoutParams();
            viewGroup.removeViewAt(indexOfChild);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setLayoutParams(layoutParams);
            android.view.View view4 = this.f256372g;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicCover");
                throw null;
            }
            frameLayout.addView(view4, new android.widget.FrameLayout.LayoutParams(-1, -1));
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
            android.graphics.drawable.Drawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, android.graphics.Color.argb(128, 0, 0, 0)});
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
            frameLayout2.setBackground(gradientDrawable);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, (dimensionPixelSize2 * 2) + dimensionPixelSize);
            layoutParams2.gravity = 80;
            frameLayout2.setLayoutParams(layoutParams2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f78712x3b941177, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(java.lang.Integer.valueOf(dimensionPixelSize), "null cannot be cast to non-null type kotlin.Int");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(java.lang.Integer.valueOf(dimensionPixelSize), "null cannot be cast to non-null type kotlin.Int");
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams3.gravity = 8388691;
            layoutParams3.setMargins(dimensionPixelSize2, 0, 0, dimensionPixelSize2);
            c22699x3dcdb352.setLayoutParams(layoutParams3);
            frameLayout2.addView(c22699x3dcdb352);
            frameLayout.addView(frameLayout2);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f256376n = frameLayout2;
        }
        android.view.View view5 = this.f256376n;
        if (view5 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getAccessibilityDesc */
    public final java.lang.String m72269x4d236449() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(",");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f256374i;
        if (c22624x85d69039 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
            throw null;
        }
        java.lang.CharSequence a17 = c22624x85d69039.a();
        if (!(a17 == null || a17.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f256374i;
            if (c22624x85d690392 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
                throw null;
            }
            sb6.append((java.lang.Object) c22624x85d690392.a());
            sb6.append(',');
            stringBuffer.append(sb6.toString());
        }
        android.widget.TextView textView = this.f256373h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
            throw null;
        }
        java.lang.CharSequence text = textView.getText();
        if (!(text == null || text.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            android.widget.TextView textView2 = this.f256373h;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
            sb7.append((java.lang.Object) textView2.getText());
            sb7.append(',');
            stringBuffer.append(sb7.toString());
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    /* renamed from: getMusicContainer */
    public final android.view.View m72270x79dd64d2() {
        android.view.View view = this.f256371f;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
        throw null;
    }

    /* renamed from: getMusicCover */
    public final android.widget.ImageView m72271xbe363c88() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f256372g;
        if (c22628xfde5d61d != null) {
            return c22628xfde5d61d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicCover");
        throw null;
    }

    /* renamed from: getMusicMediaIcon */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m72272x11eba6ce() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f256375m;
        if (c22699x3dcdb352 != null) {
            return c22699x3dcdb352;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaIcon");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18734x8eb4224a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18734x8eb4224a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.otherWidth = jz5.h.b(new nm4.b(this));
        this.musicViewHeight = jz5.h.b(new nm4.a(this));
        this.twoDp = jz5.h.b(new nm4.c(this));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5h, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.asz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f256369d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f256370e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.jyc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f256371f = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bpn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f256372g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bpq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f256373h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bpr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f256374i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bpo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f256375m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById7;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f256374i;
        if (c22624x85d69039 != null) {
            c22624x85d69039.m84175x8dd5167d(5);
            android.widget.TextView textView = this.f256373h;
            if (textView != null) {
                textView.setMaxLines(1);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSinger");
                throw null;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSongName");
        throw null;
    }
}
