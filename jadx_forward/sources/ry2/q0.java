package ry2;

/* loaded from: classes10.dex */
public class q0 extends ry2.e {
    public final java.util.ArrayList A;
    public r45.h70 B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.Rect f482980J;
    public int K;
    public r45.fp5 L;
    public final java.util.LinkedList M;
    public long N;
    public final ry2.m P;
    public so2.b5 Q;
    public r45.dd4 R;
    public java.lang.String S;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f482981p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f482982q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f482983r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f482984s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f482985t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f482986u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f482987v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f482988w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f482989x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f482990y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f482991z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context activity, java.lang.String username) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f482981p = username;
        this.f482991z = new java.util.ArrayList();
        this.A = new java.util.ArrayList();
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.I = "";
        this.K = -1;
        this.M = new java.util.LinkedList();
        this.P = new ry2.m();
        this.S = "";
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b o(ry2.q0 q0Var, java.lang.String str) {
        q0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b e17 = hc2.l.e(str);
        q0Var.M.add(java.lang.Integer.valueOf(e17 != null ? e17.f243916b : 0));
        q0Var.N += e17 != null ? e17.f243915a : 0L;
        return e17;
    }

    public final void A(android.view.View view, java.lang.String str) {
        jz5.l lVar = new jz5.l("videodurations", java.lang.Integer.valueOf((int) (u() / 1000)));
        int i17 = 0;
        java.util.List g17 = ry2.e.g(this, false, 1, null);
        if ((!g17.isEmpty()) && w((r45.mb4) kz5.n0.X(g17))) {
            i17 = 1;
        }
        hc2.p0.c(view, "video_cover", str, kz5.c1.k(lVar, new jz5.l("if_horizontal_feed", java.lang.Integer.valueOf(i17))));
    }

    @Override // ry2.n
    public ry2.r0 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 k17 = h().k();
        android.content.Context context = this.f482907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sr2.w5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        sr2.w5 w5Var = (sr2.w5) a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i17 = ((dv2.e1) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(dv2.e1.class)).f325372p;
        if (k17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(h().m())) {
            return new ry2.r0(true, k17.getMediaType(), null, this.S, i17, null, null, 96, null);
        }
        if (!w5Var.f493320p.isEmpty()) {
            r45.kb4 kb4Var = new r45.kb4();
            kb4Var.m75941xfb821914(0).addAll(w5Var.f493320p);
            kb4Var.set(9, java.lang.Boolean.TRUE);
            return new ry2.r0(true, 4, kb4Var, "", i17, null, null, 96, null);
        }
        r45.kb4 kb4Var2 = new r45.kb4();
        android.os.Bundle bundle = this.f482908e;
        kb4Var2.set(2, bundle != null ? bundle.getString("ORIGIN_MUSIC_ID") : null);
        android.os.Bundle bundle2 = this.f482908e;
        kb4Var2.set(3, bundle2 != null ? bundle2.getString("ORIGIN_MUSIC_PATH") : null);
        android.os.Bundle bundle3 = this.f482908e;
        int i18 = 4;
        kb4Var2.set(4, bundle3 != null ? bundle3.getString("ORIGIN_BGM_URL") : null);
        android.os.Bundle bundle4 = this.f482908e;
        kb4Var2.set(5, java.lang.Boolean.valueOf(bundle4 != null ? bundle4.getBoolean("MEDIA_IS_MUTE", false) : false));
        android.os.Bundle bundle5 = this.f482908e;
        kb4Var2.set(6, java.lang.Boolean.valueOf(bundle5 != null ? bundle5.getBoolean("MUSIC_IS_MUTE", false) : false));
        android.os.Bundle bundle6 = this.f482908e;
        kb4Var2.set(7, java.lang.Integer.valueOf(bundle6 != null ? bundle6.getInt("SOUND_TRACK_TYPE", 0) : 0));
        android.os.Bundle bundle7 = this.f482908e;
        kb4Var2.set(8, bundle7 != null ? bundle7.getString("MUSIC_FEED_ID") : null);
        kb4Var2.set(1, this.f482909f);
        android.os.Bundle bundle8 = this.f482908e;
        kb4Var2.set(10, bundle8 != null ? bundle8.getString("ORIGIN_FILE_PATH") : null);
        r45.fp5 fp5Var = this.L;
        if (fp5Var != null) {
            fp5Var.f456066i = this.K;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "getUploadData: originMusicId=" + kb4Var2.m75945x2fec8307(2) + ", musicMute=" + kb4Var2.m75933x41a8a7f2(6) + ", soundTrackType=" + kb4Var2.m75939xb282bd08(7));
        if (q() && kb4Var2.m75941xfb821914(0).size() != 0) {
            int m75939xb282bd08 = ((r45.mb4) kb4Var2.m75941xfb821914(0).get(0)).m75939xb282bd08(2);
            if (hc2.o0.u().contains(java.lang.Integer.valueOf(m75939xb282bd08))) {
                if (m75939xb282bd08 != 4 || kb4Var2.m75941xfb821914(0).size() <= 1) {
                    java.util.LinkedList m75941xfb821914 = kb4Var2.m75941xfb821914(0);
                    if (m75941xfb821914 != null) {
                        java.util.Iterator it = m75941xfb821914.iterator();
                        while (it.hasNext()) {
                            if (((r45.mb4) it.next()).m75939xb282bd08(2) != m75939xb282bd08) {
                            }
                        }
                    }
                }
                i18 = 8;
                break;
            }
            i18 = m75939xb282bd08;
        }
        java.util.List g17 = ry2.e.g(this, false, 1, null);
        if (!(true ^ g17.isEmpty())) {
            return new ry2.r0(false, k17 != null ? k17.getMediaType() : 0, null, null, i17, null, null, 104, null);
        }
        kb4Var2.m75941xfb821914(0).addAll(g17);
        return new ry2.r0(true, i18, kb4Var2, this.S, i17, null, null, 96, null);
    }

    @Override // ry2.n
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var;
        java.lang.Throwable th6;
        android.content.Context context = this.f482907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View inflate = ((android.app.Activity) context).getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570606b66, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f482982q = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.oy7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f482985t = findViewById;
        android.view.View view = this.f482982q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f482983r = (android.widget.ImageView) findViewById2;
        android.view.View view2 = this.f482982q;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.f564962at3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f482984s = (android.widget.ImageView) findViewById3;
        android.view.View view3 = this.f482982q;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        this.f482986u = view3.findViewById(com.p314xaae8f345.mm.R.id.gyw);
        android.view.View view4 = this.f482982q;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        this.f482987v = view4.findViewById(com.p314xaae8f345.mm.R.id.oxz);
        android.view.View view5 = this.f482982q;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById4 = view5.findViewById(com.p314xaae8f345.mm.R.id.miu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f482988w = findViewById4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        if (((java.lang.Boolean) ad0Var2.a().r()).booleanValue()) {
            android.view.View view6 = this.f482988w;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectCoverView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view6, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            ad0Var = ad0Var2;
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view6, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f482982q;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            android.view.View findViewById5 = view7.findViewById(com.p314xaae8f345.mm.R.id.vkh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            this.f482988w = findViewById5;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById5, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById5, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ad0Var = ad0Var2;
        }
        android.view.View findViewById6 = ((android.app.Activity) context).findViewById(com.p314xaae8f345.mm.R.id.f566440fw3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f482989x = findViewById6;
        if (((java.lang.Boolean) ad0Var.a().r()).booleanValue()) {
            android.view.View view8 = this.f482982q;
            if (view8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            view8.post(new ry2.z(this));
            th6 = null;
        } else {
            th6 = null;
            v();
        }
        this.H = false;
        android.view.View view9 = this.f482982q;
        if (view9 != null) {
            return view9;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw th6;
    }

    @Override // ry2.e
    public boolean c() {
        r45.h70 h70Var = this.B;
        if (h70Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h70Var);
            java.util.LinkedList<r45.ho6> tracks = h70Var.f457430d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
            for (r45.ho6 ho6Var : tracks) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(ho6Var.f457866d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "[compositionInfo]video widget file:" + ho6Var.f457866d + " lost!");
                    return false;
                }
            }
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList = this.f482990y;
        if (arrayList == null) {
            return true;
        }
        for (java.lang.String str : arrayList) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "[videoFileList]video widget file:" + str + " lost!");
                return false;
            }
        }
        return true;
    }

    @Override // ry2.e
    public void d() {
        k();
        this.f482990y = null;
        this.f482991z.clear();
        this.A.clear();
        this.B = null;
        this.f482909f = null;
        this.E = "";
        this.D = "";
        this.G = 0;
        this.C = "";
        this.I = "";
        this.f482980J = null;
        android.view.View view = this.f482989x;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "delMedia", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "delMedia", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.Q = null;
    }

    @Override // ry2.e
    public android.graphics.drawable.Drawable e() {
        android.view.View view = this.f482985t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        int width = view.getWidth();
        android.view.View view2 = this.f482985t;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        int height = view2.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.widget.ImageView imageView = this.f482984s;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurIv");
            throw null;
        }
        imageView.draw(canvas);
        canvas.translate(0.0f, this.f482986u != null ? r3.getHeight() : 0.0f);
        android.widget.ImageView imageView2 = this.f482983r;
        if (imageView2 != null) {
            imageView2.draw(canvas);
            return new android.graphics.drawable.BitmapDrawable(this.f482907d.getResources(), createBitmap);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
        throw null;
    }

    @Override // ry2.e
    public java.util.List f(boolean z17) {
        r45.h70 h70Var;
        java.util.ArrayList arrayList;
        byte[] byteArray;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (z17) {
            android.os.Bundle bundle = this.f482908e;
            if (bundle == null || (byteArray = bundle.getByteArray("video_composition")) == null) {
                h70Var = null;
            } else {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.h70().mo11468x92b714fd(byteArray);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CompositionInfo");
                h70Var = (r45.h70) mo11468x92b714fd;
            }
        } else {
            h70Var = this.B;
        }
        if (h70Var != null) {
            r45.mb4 t17 = t(h70Var);
            p(t17);
            linkedList.add(t17);
        } else if (q() && (arrayList = this.f482990y) != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.mb4 s17 = s((java.lang.String) obj, i17);
                p(s17);
                linkedList.add(s17);
                i17 = i18;
            }
        }
        return linkedList;
    }

    @Override // ry2.e
    public jz5.l i() {
        android.view.View view = this.f482985t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
        android.view.View view2 = this.f482985t;
        if (view2 != null) {
            return new jz5.l(valueOf, java.lang.Integer.valueOf(view2.getHeight()));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0212, code lost:
    
        if ((r2.isEmpty()) != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289 A[Catch: IOException -> 0x02b2, TryCatch #0 {IOException -> 0x02b2, blocks: (B:51:0x016b, B:53:0x0174, B:56:0x01d0, B:57:0x01d4, B:59:0x01da, B:61:0x0205, B:63:0x0209, B:67:0x023e, B:69:0x0242, B:71:0x024a, B:75:0x0256, B:76:0x0263, B:78:0x0271, B:80:0x027d, B:85:0x0289, B:87:0x028d, B:88:0x0291, B:89:0x0295, B:91:0x0296, B:93:0x029a, B:94:0x02a3, B:95:0x02a7, B:97:0x02a8, B:98:0x02ac, B:102:0x0214, B:104:0x021f, B:106:0x0229, B:108:0x022d, B:109:0x0231, B:111:0x02ad, B:112:0x02b1), top: B:50:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029a A[Catch: IOException -> 0x02b2, TryCatch #0 {IOException -> 0x02b2, blocks: (B:51:0x016b, B:53:0x0174, B:56:0x01d0, B:57:0x01d4, B:59:0x01da, B:61:0x0205, B:63:0x0209, B:67:0x023e, B:69:0x0242, B:71:0x024a, B:75:0x0256, B:76:0x0263, B:78:0x0271, B:80:0x027d, B:85:0x0289, B:87:0x028d, B:88:0x0291, B:89:0x0295, B:91:0x0296, B:93:0x029a, B:94:0x02a3, B:95:0x02a7, B:97:0x02a8, B:98:0x02ac, B:102:0x0214, B:104:0x021f, B:106:0x0229, B:108:0x022d, B:109:0x0231, B:111:0x02ad, B:112:0x02b1), top: B:50:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3 A[Catch: IOException -> 0x02b2, TryCatch #0 {IOException -> 0x02b2, blocks: (B:51:0x016b, B:53:0x0174, B:56:0x01d0, B:57:0x01d4, B:59:0x01da, B:61:0x0205, B:63:0x0209, B:67:0x023e, B:69:0x0242, B:71:0x024a, B:75:0x0256, B:76:0x0263, B:78:0x0271, B:80:0x027d, B:85:0x0289, B:87:0x028d, B:88:0x0291, B:89:0x0295, B:91:0x0296, B:93:0x029a, B:94:0x02a3, B:95:0x02a7, B:97:0x02a8, B:98:0x02ac, B:102:0x0214, B:104:0x021f, B:106:0x0229, B:108:0x022d, B:109:0x0231, B:111:0x02ad, B:112:0x02b1), top: B:50:0x016b }] */
    @Override // ry2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.q0.m():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0483, code lost:
    
        if (r8 <= r1) goto L197;
     */
    @Override // ry2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(android.graphics.Bitmap r33) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.q0.n(android.graphics.Bitmap):void");
    }

    @Override // ry2.n
    /* renamed from: onDestroy */
    public void mo163453xac79a11b() {
        java.util.LinkedList<r45.ho6> linkedList;
        r45.h70 h70Var = this.B;
        if (h70Var == null || (linkedList = h70Var.f457430d) == null) {
            return;
        }
        for (r45.ho6 ho6Var : linkedList) {
            bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
            java.lang.String path = ho6Var.f457866d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
            ((b92.u2) vVar).getClass();
            dw3.c0.f325721g.remove(path);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "removeIgnorePath: ".concat(path));
        }
    }

    public final void p(r45.mb4 mb4Var) {
        r45.uf2 uf2Var = new r45.uf2();
        uf2Var.set(1, java.lang.Float.valueOf(this.G));
        mb4Var.set(22, uf2Var);
        android.os.Bundle bundle = this.f482908e;
        mb4Var.set(58, bundle != null ? bundle.getString("KEY_POST_VIDEO_TITLE") : null);
        mb4Var.set(51, java.lang.Integer.valueOf(h().g()));
        mb4Var.set(62, h().n());
        mb4Var.set(64, java.lang.Integer.valueOf(h().f482945a.getIntExtra("VIDEO_SHARE_COVER_STYLE", 0)));
        mb4Var.set(59, java.lang.Long.valueOf(h().f482951d));
        mb4Var.set(60, java.lang.Boolean.valueOf(this.f482914n));
        mb4Var.set(61, java.lang.Boolean.valueOf(this.f482915o));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "codec_info video_cover_score:" + this.G);
    }

    public final boolean q() {
        java.util.ArrayList arrayList = this.f482990y;
        if (arrayList == null || arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "video list null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video list ");
        java.util.ArrayList arrayList2 = this.f482990y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
        sb6.append(arrayList2.size());
        sb6.append(", thumb list ");
        java.util.ArrayList arrayList3 = this.f482991z;
        sb6.append(arrayList3.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", sb6.toString());
        java.util.ArrayList arrayList4 = this.f482990y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList4);
        return arrayList4.size() == arrayList3.size();
    }

    public final void r(r45.mb4 mb4Var) {
        java.lang.String str;
        jz5.f0 f0Var;
        r45.ho6 ho6Var;
        java.lang.String str2;
        android.content.Context context = this.f482907d;
        if (mb4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((dv2.o0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(dv2.o0.class)).f325446d = mb4Var.m75945x2fec8307(0) + mb4Var.m75945x2fec8307(18);
        }
        r45.h70 h70Var = this.B;
        if (h70Var != null) {
            java.util.LinkedList linkedList = h70Var.f457430d;
            if (linkedList == null || (ho6Var = (r45.ho6) kz5.n0.Z(linkedList)) == null || (str2 = ho6Var.f457866d) == null) {
                f0Var = null;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((dv2.o0) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(dv2.o0.class)).f325447e = str2;
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var != null) {
                return;
            }
        }
        java.util.ArrayList arrayList = this.f482990y;
        if (arrayList == null || (str = (java.lang.String) kz5.n0.Z(arrayList)) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar3 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((dv2.o0) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(dv2.o0.class)).f325447e = str;
    }

    public final r45.mb4 s(java.lang.String str, int i17) {
        mv2.f0 f0Var = mv2.f0.f413094a;
        java.lang.String str2 = (java.lang.String) kz5.n0.a0(this.f482991z, i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.util.ArrayList arrayList = this.A;
        return f0Var.f(str, str3, arrayList.size() > i17 ? (r45.dd4) arrayList.get(i17) : null, this.D, this.E, this.L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0022, code lost:
    
        if (r2 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.mb4 t(r45.h70 r14) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.q0.t(r45.h70):r45.mb4");
    }

    public final long u() {
        r45.h70 h70Var = this.B;
        long j17 = (h70Var != null ? h70Var.f457432f : 0L) - (h70Var != null ? h70Var.f457431e : 0L);
        if (j17 < 0) {
            j17 = 0;
        }
        return j17 == 0 ? this.N : j17;
    }

    public final void v() {
        java.util.Map e17;
        java.lang.String str;
        android.view.View view = this.f482982q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        A(view, "view_exp");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view2 = this.f482988w;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectCoverView");
            throw null;
        }
        ((cy1.a) rVar).pk(view2, "choose_cover_button");
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view3 = this.f482988w;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectCoverView");
            throw null;
        }
        ((cy1.a) rVar2).ik(view3, 40, 25496);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view4 = this.f482988w;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectCoverView");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        android.content.Context context = this.f482907d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
        lVarArr[0] = new jz5.l("behaviour_session_id", e18 != null ? e18.f216918q : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
        lVarArr[1] = new jz5.l("finder_context_id", e19 != null ? e19.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(context);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e27 != null ? e27.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar.e(context);
        lVarArr[3] = new jz5.l("comment_scene", e28 != null ? java.lang.Integer.valueOf(e28.f216913n) : null);
        ((cy1.a) rVar3).gk(view4, kz5.c1.k(lVarArr));
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            jz5.l[] lVarArr2 = new jz5.l[5];
            long j17 = 1000;
            lVarArr2[0] = new jz5.l("video_duration_time", java.lang.Integer.valueOf((int) (u() / j17)));
            lVarArr2[1] = new jz5.l("videodurations", java.lang.Integer.valueOf((int) (u() / j17)));
            java.util.List g17 = ry2.e.g(this, false, 1, null);
            lVarArr2[2] = new jz5.l("if_horizontal_feed", java.lang.Integer.valueOf(((g17.isEmpty() ^ true) && w((r45.mb4) kz5.n0.X(g17))) ? 1 : 0));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
            if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76327x23a7af9b()) == null) {
                str = "";
            }
            lVarArr2[3] = new jz5.l("finder_post_sessionid", str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
            lVarArr2[4] = new jz5.l("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b72 != null ? c19783xd9a946b72.m76275xbcc8608a() : 0));
            e17 = kz5.c1.k(lVarArr2);
        } else {
            e17 = kz5.b1.e(new jz5.l("video_duration_time", java.lang.Integer.valueOf((int) (u() / 1000))));
        }
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view5 = this.f482988w;
        if (view5 != null) {
            ((cy1.a) rVar4).Ai(view5, new ry2.j0(e17));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectCoverView");
            throw null;
        }
    }

    public final boolean w(r45.mb4 mb4Var) {
        int i17;
        int i18;
        int i19;
        int height;
        r45.y25 y25Var;
        if (!hc2.l0.c(mb4Var)) {
            r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
            if (h70Var != null) {
                r45.i70 i70Var = h70Var.f457435i;
                if (i70Var.A == null) {
                    r45.vl5 vl5Var = i70Var.f458311g;
                    r45.bb1 bb1Var = (r45.bb1) mb4Var.m75936x14adae67(34);
                    if (bb1Var != null && java.lang.Math.abs(bb1Var.m75938x746dc8a6(2) - bb1Var.m75938x746dc8a6(0)) > 0.0f && java.lang.Math.abs(bb1Var.m75938x746dc8a6(1) - bb1Var.m75938x746dc8a6(3)) > 0.0f) {
                        vl5Var.f469883d.set(0, java.lang.Integer.valueOf((int) bb1Var.m75938x746dc8a6(0)));
                        vl5Var.f469883d.set(1, java.lang.Integer.valueOf((int) bb1Var.m75938x746dc8a6(1)));
                        vl5Var.f469883d.set(2, java.lang.Integer.valueOf((int) bb1Var.m75938x746dc8a6(2)));
                        vl5Var.f469883d.set(3, java.lang.Integer.valueOf((int) bb1Var.m75938x746dc8a6(3)));
                    }
                    java.lang.Object obj = vl5Var.f469883d.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    int intValue = ((java.lang.Number) obj).intValue();
                    java.lang.Object obj2 = vl5Var.f469883d.get(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    int intValue2 = ((java.lang.Number) obj2).intValue();
                    java.lang.Object obj3 = vl5Var.f469883d.get(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                    int intValue3 = ((java.lang.Number) obj3).intValue();
                    java.lang.Object obj4 = vl5Var.f469883d.get(3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                    android.graphics.Rect rect = new android.graphics.Rect(intValue, intValue2, intValue3, ((java.lang.Number) obj4).intValue());
                    r45.i70 i70Var2 = h70Var.f457435i;
                    i19 = i70Var2 != null ? i70Var2.f458313i : 0;
                    height = (rect.height() * i19) / rect.width();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "3 videoWidth=" + i19 + " videoHeight=" + height);
                } else {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                    r45.vl5 vl5Var2 = h70Var.f457435i.A.f472263d;
                    ((b92.u2) vVar).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.f(vl5Var2, rect2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "originRect: " + rect2);
                    r45.i70 i70Var3 = h70Var.f457435i;
                    i19 = (i70Var3 == null || (y25Var = i70Var3.A) == null) ? 0 : y25Var.f472264e;
                    height = (rect2.height() * i19) / rect2.width();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "4 videoWidth=" + i19 + " videoHeight=" + height);
                }
                int i27 = height;
                i18 = i19;
                i17 = i27;
            } else {
                i17 = 0;
                i18 = 0;
            }
        } else if (com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(0))) {
            bg0.v vVar2 = (bg0.v) i95.n0.c(bg0.v.class);
            java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(0);
            ((b92.u2) vVar2).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b c17 = j33.s.f378989a.c(m75945x2fec8307);
            i18 = c17.f243917c;
            i17 = c17.f243918d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "1 videoWidth=" + i18 + " videoHeight=" + i17 + " media.width=" + mb4Var.m75938x746dc8a6(4) + " media.height=" + mb4Var.m75938x746dc8a6(5));
        } else {
            i18 = (int) mb4Var.m75938x746dc8a6(4);
            i17 = (int) mb4Var.m75938x746dc8a6(5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "2 videoWidth=" + i18 + " videoHeight=" + i17 + " media.width=" + mb4Var.m75938x746dc8a6(4) + " media.height=" + mb4Var.m75938x746dc8a6(5));
        }
        return i18 >= i17 && i18 != 0;
    }

    public final boolean x() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207960z).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final void y(java.util.LinkedList linkedList) {
        int i17;
        boolean z17;
        r45.kb4 kb4Var = new r45.kb4();
        kb4Var.m75941xfb821914(0).addAll(linkedList);
        r45.mb4 mb4Var = (r45.mb4) linkedList.getFirst();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mb4Var);
        boolean z18 = true;
        if (w(mb4Var)) {
            if (this.Q == null) {
                java.lang.String stringExtra = h().f482945a.getStringExtra("VIDEO_SHARE_FULL_COVER_URL");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (stringExtra.length() == 0) {
                    stringExtra = this.F;
                }
                java.lang.String str = stringExtra;
                java.lang.String n17 = h().n();
                if (n17.length() == 0) {
                    n17 = this.F;
                }
                this.Q = new so2.b5(str, n17, 0L, 1, null, h().f482945a.getByteArrayExtra("VIDEO_SHARE_COVER_INFO_WRAP"), h().f482945a.getIntExtra("VIDEO_SHARE_COVER_SOURCE", 0));
            }
            i17 = 1002;
            z17 = true;
        } else {
            i17 = 1001;
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.G("andr_Post_Page_Cover", null);
        android.os.Bundle bundle = this.f482908e;
        boolean z19 = bundle != null ? bundle.getBoolean("post_long_video", false) : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = this.f482907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("cover_style", h().g());
        intent.putExtra("cover_time_ms", h().h());
        intent.putExtra("cover_crop_model", h().e());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        intent.putExtra("key_context_id", nyVar != null ? nyVar.f216915p : null);
        if (!this.H) {
            this.H = true;
            intent.putExtra("cover_word_info_wrap", h().j().mo14344x5f01b1f6());
        }
        java.lang.String l17 = h().l();
        if (l17 == null || l17.length() == 0) {
            l17 = this.E;
        }
        intent.putExtra("key_full_cover_path", l17);
        java.lang.String i18 = h().i();
        if (i18 != null && i18.length() != 0) {
            z18 = false;
        }
        if (z18) {
            i18 = this.D;
        }
        intent.putExtra("key_cover_path", i18);
        intent.putExtra("key_cover_select_source", h().f());
        intent.putExtra("key_share_cover_item", this.Q);
        i0Var.getClass();
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        android.content.Intent b17 = xy2.c.b(activity, z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15056xb9bbed89.class : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.class, intent, false, false, 24, null);
        b17.putExtra("media_list_", kb4Var.mo14344x5f01b1f6());
        b17.putExtra("media_list_count", kb4Var.m75941xfb821914(0).size());
        b17.putExtra("isLongVideoPost", z19);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterSelectCoverUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;IZZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void z(android.graphics.Bitmap bitmap) {
        pm0.v.X(new ry2.c(bitmap, this));
        l();
    }
}
