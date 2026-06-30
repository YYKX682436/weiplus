package ry2;

/* loaded from: classes10.dex */
public final class t extends ry2.e {

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f483019p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f483020q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f483021r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f483022s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f483023t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f483024u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f483025v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f483026w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f483027x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context activity, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f483024u = new java.util.ArrayList();
        this.f483026w = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    @Override // ry2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ry2.r0 a() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.t.a():ry2.r0");
    }

    @Override // ry2.n
    public android.view.View b() {
        android.content.Context context = this.f482907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View inflate = ((android.app.Activity) context).getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5q, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f483019p = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f483020q = (android.widget.ImageView) findViewById;
        android.view.View view = this.f483019p;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.lzf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f483021r = findViewById2;
        android.widget.ImageView imageView = this.f483020q;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        hc2.p0.d(imageView, "video_cover", "view_exp", null, 4, null);
        android.view.View view2 = this.f483019p;
        if (view2 != null) {
            return view2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    @Override // ry2.e
    public boolean c() {
        java.util.ArrayList<java.lang.String> arrayList = this.f483022s;
        if (arrayList == null) {
            return true;
        }
        for (java.lang.String str : arrayList) {
            if (android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "image widget file:" + str + " lost!");
                return false;
            }
        }
        return true;
    }

    @Override // ry2.e
    public void d() {
        k();
        this.f483022s = null;
        this.f483023t = null;
        this.f483024u.clear();
        this.f482909f = null;
        this.f483025v = null;
        this.f483026w.clear();
        this.f483027x = null;
    }

    @Override // ry2.e
    public android.graphics.drawable.Drawable e() {
        android.widget.ImageView imageView = this.f483020q;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
        throw null;
    }

    @Override // ry2.e
    public java.util.List f(boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = this.f483022s;
        if (arrayList != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                linkedList.add(o(i17, (java.lang.String) obj));
                i17 = i18;
            }
        }
        return linkedList;
    }

    @Override // ry2.e
    public jz5.l i() {
        android.view.View view = this.f483019p;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
        android.view.View view2 = this.f483019p;
        if (view2 != null) {
            return new jz5.l(valueOf, java.lang.Integer.valueOf(view2.getHeight()));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    @Override // ry2.e
    public void m() {
        r45.mb4 mb4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "refresh thumbLocalUrl");
        jz5.f0 f0Var = null;
        if (h().k() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(h().m())) {
            java.util.LinkedList m17 = h().m();
            if (m17 != null && (mb4Var = (r45.mb4) kz5.n0.Z(m17)) != null) {
                j(mb4Var);
            }
            android.widget.ImageView imageView = this.f483020q;
            if (imageView != null) {
                imageView.setOnClickListener(new ry2.p(this));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
                throw null;
            }
        }
        android.os.Bundle bundle = this.f482908e;
        this.f483022s = bundle != null ? bundle.getStringArrayList("image_file_list") : null;
        android.os.Bundle bundle2 = this.f482908e;
        this.f483023t = bundle2 != null ? bundle2.getIntegerArrayList("image_quality_list") : null;
        this.f482909f = mv2.f0.f413094a.i(this.f482908e);
        android.os.Bundle bundle3 = this.f482908e;
        this.f483025v = bundle3 != null ? bundle3.getStringArrayList("half_image_file_list") : null;
        android.os.Bundle bundle4 = this.f482908e;
        this.f483027x = bundle4 != null ? bundle4.getParcelableArrayList("HALF_RECT_LIST") : null;
        if (this.f482909f == null) {
            android.os.Bundle bundle5 = this.f482908e;
            java.lang.String string = bundle5 != null ? bundle5.getString("ORIGIN_BGM_URL") : null;
            android.os.Bundle bundle6 = this.f482908e;
            java.lang.String string2 = bundle6 != null ? bundle6.getString("ORIGIN_MUSIC_PATH") : null;
            if (string == null || string.length() == 0) {
                string = kk.w.a(string2, true);
            }
            if (!(string == null || string.length() == 0)) {
                r45.zi2 zi2Var = new r45.zi2();
                zi2Var.set(5, string);
                this.f482909f = zi2Var;
            }
        }
        java.util.ArrayList arrayList = this.f483022s;
        if (arrayList != null) {
        }
        android.os.Bundle bundle7 = this.f482908e;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle7 != null ? bundle7.getStringArrayList("image_thumb_list") : null;
        java.util.ArrayList arrayList2 = this.f483022s;
        if (!(arrayList2 == null || arrayList2.isEmpty())) {
            ((ku5.t0) ku5.t0.f394148d).h(new ry2.s(this, stringArrayList), "Finder_Post_Create_Image_Thumb");
        }
        android.view.View view = this.f483019p;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 c18393x3e165bd9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) view.findViewById(com.p314xaae8f345.mm.R.id.h9l);
        if (c18393x3e165bd9 != null) {
            c18393x3e165bd9.setVisibility(0);
        }
        java.util.ArrayList arrayList3 = this.f483022s;
        if (arrayList3 != null) {
            if (!(arrayList3.size() > 0)) {
                arrayList3 = null;
            }
            if (arrayList3 != null) {
                int Ui = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ui();
                if (c18393x3e165bd9 != null) {
                    int size = arrayList3.size();
                    if (size <= Ui) {
                        Ui = size;
                    }
                    c18393x3e165bd9.f252184e = Ui;
                    f0Var = jz5.f0.f384359a;
                }
            }
        }
        if (f0Var != null || c18393x3e165bd9 == null) {
            return;
        }
        c18393x3e165bd9.setVisibility(8);
    }

    @Override // ry2.e
    public void n(android.graphics.Bitmap thumb) {
        android.view.View rootView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumb, "thumb");
        mv2.f0 f0Var = mv2.f0.f413094a;
        float f17 = 1.0f;
        float height = (thumb.getHeight() * 1.0f) / thumb.getWidth();
        if (height > 1.3333334f) {
            f17 = 1.3333334f;
        } else if (height >= 1.0f) {
            f17 = height;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(android.widget.ImageView.ScaleType.CENTER_CROP.ordinal());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f0Var.l());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf((int) (f0Var.l() * f17));
        this.f482910g = thumb.getWidth();
        this.f482911h = thumb.getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostImageWidget", "[showThumb] thumbWidth:" + this.f482910g + " thumbHeight:" + this.f482911h);
        int intValue = valueOf2.intValue();
        int intValue2 = valueOf3.intValue();
        android.widget.ImageView imageView = this.f483020q;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        imageView.getLayoutParams().width = intValue;
        android.widget.ImageView imageView2 = this.f483020q;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        imageView2.getLayoutParams().height = intValue2;
        android.view.View view = this.f483019p;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.h9m)).getLayoutParams().width = intValue;
        android.view.View view2 = this.f483019p;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) view2.findViewById(com.p314xaae8f345.mm.R.id.h9l)).getLayoutParams().width = intValue;
        android.view.View view3 = this.f483019p;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.ViewParent parent = view3.getParent();
        android.widget.LinearLayout linearLayout = parent instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) parent : null;
        android.widget.TextView textView = (linearLayout == null || (rootView = linearLayout.getRootView()) == null) ? null : (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.l0t);
        if (textView != null) {
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        android.view.View view4 = this.f483019p;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view4.findViewById(com.p314xaae8f345.mm.R.id.gyw);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostImageWidget", "showThumb", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/widget/post/PostImageWidget", "showThumb", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                android.view.View view5 = this.f483019p;
                if (view5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                    throw null;
                }
                layoutParams2.topMargin = (int) view5.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            }
            if (linearLayout != null) {
                linearLayout.setLayoutParams(layoutParams2);
            }
        }
        android.widget.ImageView imageView3 = this.f483020q;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        imageView3.setScaleType(android.widget.ImageView.ScaleType.values()[valueOf.intValue()]);
        android.widget.ImageView imageView4 = this.f483020q;
        if (imageView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        imageView4.requestLayout();
        android.widget.ImageView imageView5 = this.f483020q;
        if (imageView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        imageView5.setImageBitmap(thumb);
        android.widget.ImageView imageView6 = this.f483020q;
        if (imageView6 != null) {
            imageView6.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
    }

    public final r45.mb4 o(int i17, java.lang.String str) {
        java.lang.Integer num;
        mv2.f0 f0Var = mv2.f0.f413094a;
        java.lang.Object obj = this.f483024u.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.mb4 e17 = f0Var.e(str, (java.lang.String) obj);
        r45.uf2 uf2Var = new r45.uf2();
        java.util.ArrayList arrayList = this.f483023t;
        if (arrayList != null && (num = (java.lang.Integer) kz5.n0.a0(arrayList, i17)) != null) {
            int intValue = num.intValue();
            uf2Var.set(4, java.lang.Float.valueOf(intValue));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostImageWidget", "codec_info hdimg_score:" + intValue);
        }
        e17.set(22, uf2Var);
        java.util.ArrayList arrayList2 = this.f483025v;
        java.lang.String str2 = arrayList2 != null ? (java.lang.String) kz5.n0.a0(arrayList2, i17) : null;
        java.lang.String str3 = (java.lang.String) kz5.n0.a0(this.f483026w, i17);
        java.util.ArrayList arrayList3 = this.f483027x;
        android.graphics.Rect rect = arrayList3 != null ? (android.graphics.Rect) kz5.n0.a0(arrayList3, i17) : null;
        if (str2 != null && str3 != null && rect != null) {
            r45.bb1 bb1Var = new r45.bb1();
            bb1Var.set(0, java.lang.Float.valueOf(rect.left));
            bb1Var.set(1, java.lang.Float.valueOf(rect.top));
            bb1Var.set(2, java.lang.Float.valueOf(rect.right));
            bb1Var.set(3, java.lang.Float.valueOf(rect.bottom));
            e17.set(34, bb1Var);
        }
        e17.set(59, java.lang.Long.valueOf(h().f482951d));
        return e17;
    }

    @Override // ry2.n
    /* renamed from: onDestroy */
    public void mo163453xac79a11b() {
    }
}
