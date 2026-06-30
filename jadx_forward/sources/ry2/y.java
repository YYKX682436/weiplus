package ry2;

/* loaded from: classes10.dex */
public class y extends ry2.e {

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f483038p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 f483039q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f483040r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f483041s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f483042t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f483043u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f483044v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.ArrayList f483045w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f483046x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f483047y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f483046x = new java.util.ArrayList();
        this.f483047y = new java.util.ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (r1.size() == r5.size()) goto L16;
     */
    @Override // ry2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ry2.r0 a() {
        /*
            r24 = this;
            r0 = r24
            java.util.ArrayList r1 = r0.f483044v
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L11
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = r3
            goto L12
        L11:
            r1 = r2
        L12:
            java.lang.String r4 = "Finder.PostMixMediaWidget"
            if (r1 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "media list "
            r1.<init>(r5)
            java.util.ArrayList r5 = r0.f483044v
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)
            int r5 = r5.size()
            r1.append(r5)
            java.lang.String r5 = ", thumb list "
            r1.append(r5)
            java.util.ArrayList r5 = r0.f483046x
            int r6 = r5.size()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r1)
            java.util.ArrayList r1 = r0.f483044v
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            int r1 = r1.size()
            int r4 = r5.size()
            if (r1 != r4) goto L4e
            goto L56
        L4e:
            r2 = r3
            goto L56
        L50:
            java.lang.String r1 = "media list null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r1)
            goto L4e
        L56:
            if (r2 == 0) goto L9a
            r45.kb4 r7 = new r45.kb4
            r7.<init>()
            java.util.ArrayList r1 = r0.f483044v
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = r3
        L67:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r1.next()
            int r5 = r2 + 1
            if (r2 < 0) goto L84
            java.lang.String r4 = (java.lang.String) r4
            java.util.LinkedList r6 = r7.m75941xfb821914(r3)
            r45.mb4 r2 = r0.o(r2, r4)
            r6.add(r2)
            r2 = r5
            goto L67
        L84:
            kz5.c0.p()
            r1 = 0
            throw r1
        L89:
            ry2.r0 r1 = new ry2.r0
            r5 = 1
            r6 = 8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 120(0x78, float:1.68E-43)
            r13 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        L9a:
            ry2.r0 r1 = new ry2.r0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 120(0x78, float:1.68E-43)
            r23 = 0
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.y.a():ry2.r0");
    }

    @Override // ry2.n
    public android.view.View b() {
        android.content.Context context = this.f482907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View inflate = ((android.app.Activity) context).getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5t, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f483038p = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f483039q = (com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7) findViewById;
        android.view.View view = this.f483038p;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f567405je3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f483040r = (android.widget.TextView) findViewById2;
        android.view.View view2 = this.f483038p;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.ozq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f483041s = (android.widget.ImageView) findViewById3;
        android.view.View view3 = this.f483038p;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.jur);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f483042t = findViewById4;
        android.view.View view4 = this.f483038p;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.p314xaae8f345.mm.R.id.lzf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f483043u = findViewById5;
        hc2.p0.d(p(), "video_cover", "view_exp", null, 4, null);
        android.view.View view5 = this.f483038p;
        if (view5 != null) {
            return view5;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    @Override // ry2.e
    public boolean c() {
        java.util.ArrayList<java.lang.String> arrayList = this.f483044v;
        if (arrayList == null) {
            return true;
        }
        for (java.lang.String str : arrayList) {
            if (android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "[PostMixMediaWidget] widget file:" + str + " lost!");
                return false;
            }
        }
        return true;
    }

    @Override // ry2.e
    public android.graphics.drawable.Drawable e() {
        return p().getDrawable();
    }

    @Override // ry2.e
    public jz5.l i() {
        android.view.View view = this.f483038p;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
        android.view.View view2 = this.f483038p;
        if (view2 != null) {
            return new jz5.l(valueOf, java.lang.Integer.valueOf(view2.getHeight()));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    @Override // ry2.e
    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "refresh thumbLocalUrl");
        android.os.Bundle bundle = this.f482908e;
        this.f483044v = bundle != null ? bundle.getStringArrayList("MEDIA_FILE_LIST") : null;
        android.os.Bundle bundle2 = this.f482908e;
        this.f483045w = bundle2 != null ? bundle2.getIntegerArrayList("MEDIA_TYPE_LIST") : null;
        android.os.Bundle bundle3 = this.f482908e;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle3 != null ? bundle3.getStringArrayList("MEDIA_THUMB_LIST") : null;
        android.os.Bundle bundle4 = this.f482908e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle4);
        java.util.ArrayList<android.os.Parcelable> parcelableArrayList = bundle4.getParcelableArrayList("VIDEO_CROP_LIST");
        if (parcelableArrayList != null) {
            for (android.os.Parcelable parcelable : parcelableArrayList) {
                java.util.ArrayList arrayList = this.f483047y;
                if (parcelable == null || !(parcelable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1)) {
                    arrayList.add(null);
                } else {
                    arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1) parcelable).f212292d);
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f483044v;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList3 = this.f483044v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList3);
        if (arrayList3.size() > 1) {
            android.widget.TextView textView = this.f483040r;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaCountView");
                throw null;
            }
            textView.setVisibility(8);
            android.widget.TextView textView2 = this.f483040r;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaCountView");
                throw null;
            }
            java.util.ArrayList arrayList4 = this.f483044v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList4);
            textView2.setText(this.f482907d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0v, java.lang.Integer.valueOf(arrayList4.size())));
            android.view.View view = this.f483042t;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiIcon");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.widget.TextView textView3 = this.f483040r;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaCountView");
                throw null;
            }
            textView3.setVisibility(8);
        }
        s75.d.b(new ry2.u(this, stringArrayList), "Finder_Post_Create_Media_Thumb");
    }

    public final r45.mb4 o(int i17, java.lang.String file) {
        r45.mb4 f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        java.util.ArrayList arrayList = this.f483045w;
        java.lang.Integer num = arrayList != null ? (java.lang.Integer) arrayList.get(i17) : null;
        java.util.ArrayList arrayList2 = this.f483046x;
        if (num != null && 2 == num.intValue()) {
            mv2.f0 f0Var = mv2.f0.f413094a;
            java.lang.Object obj = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            return f0Var.e(file, (java.lang.String) obj);
        }
        mv2.f0 f0Var2 = mv2.f0.f413094a;
        java.lang.String str = (java.lang.String) arrayList2.get(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.util.ArrayList arrayList3 = this.f483047y;
        f17 = f0Var2.f(file, str, (r16 & 4) != 0 ? null : arrayList3.size() > i17 ? (r45.dd4) arrayList3.get(i17) : null, (r16 & 8) != 0 ? "" : null, (r16 & 16) != 0 ? "" : null, (r16 & 32) != 0 ? null : null);
        return f17;
    }

    @Override // ry2.n
    /* renamed from: onDestroy */
    public void mo163453xac79a11b() {
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 p() {
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f483039q;
        if (c22796x44e7a3d7 != null) {
            return c22796x44e7a3d7;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
        throw null;
    }
}
