package qf2;

/* loaded from: classes3.dex */
public final class c4 extends if2.b implements if2.d, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f443850m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f443851n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Space f443852o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f443853p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f443854q;

    /* renamed from: r, reason: collision with root package name */
    public int f443855r;

    /* renamed from: s, reason: collision with root package name */
    public int f443856s;

    /* renamed from: t, reason: collision with root package name */
    public xh2.b f443857t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f443855r = -1;
        this.f443856s = 1;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        this.f443857t = micInfoData;
        a7(micInfoData, "onMicInfoChanged");
    }

    public final void Z6() {
        android.view.ViewGroup viewGroup = this.f443853p;
        if (viewGroup != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewGroup != null ? viewGroup.getParent() : null, this.f443850m)) {
                return;
            }
            android.view.ViewGroup viewGroup2 = this.f443853p;
            java.lang.Object parent = viewGroup2 != null ? viewGroup2.getParent() : null;
            android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.f443853p);
            }
            android.widget.FrameLayout frameLayout = this.f443850m;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            android.widget.FrameLayout frameLayout2 = this.f443850m;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.f443853p);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).R7() == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(xh2.b r10, java.lang.String r11) {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = r10.f536055a
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkContentModeChange source: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = " micCount: "
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "TopContentLayoutControl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11)
            java.lang.Class<mm2.e1> r11 = mm2.e1.class
            androidx.lifecycle.c1 r11 = r9.m56788xbba4bfc0(r11)
            mm2.e1 r11 = (mm2.e1) r11
            boolean r11 = r11.g7()
            r1 = 0
            r2 = 0
            r3 = 1
            int r4 = r10.f536058d
            if (r11 == 0) goto L39
            r9.Z6()
            goto La6
        L39:
            if (r0 <= r3) goto La3
            if (r4 != r3) goto L3f
            r11 = r3
            goto L40
        L3f:
            r11 = r2
        L40:
            if (r11 != 0) goto La3
            zl2.r4 r11 = zl2.r4.f555483a
            boolean r11 = r11.x1()
            if (r11 != 0) goto L69
            dk2.ef r11 = dk2.ef.f314905a
            tn0.w0 r11 = dk2.ef.f314911d
            if (r11 == 0) goto L58
            boolean r11 = r11.X()
            if (r11 != r3) goto L58
            r11 = r3
            goto L59
        L58:
            r11 = r2
        L59:
            if (r11 != 0) goto L69
            java.lang.Class<mm2.c1> r11 = mm2.c1.class
            androidx.lifecycle.c1 r11 = r9.m56788xbba4bfc0(r11)
            mm2.c1 r11 = (mm2.c1) r11
            boolean r11 = r11.R7()
            if (r11 == 0) goto La3
        L69:
            android.view.ViewGroup r11 = r9.f443853p
            if (r11 == 0) goto La6
            android.view.ViewParent r11 = r11.getParent()
            android.widget.FrameLayout r0 = r9.f443851n
            boolean r11 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r11, r0)
            if (r11 != 0) goto La6
            android.view.ViewGroup r11 = r9.f443853p
            if (r11 == 0) goto L82
            android.view.ViewParent r11 = r11.getParent()
            goto L83
        L82:
            r11 = r1
        L83:
            boolean r0 = r11 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8a
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            goto L8b
        L8a:
            r11 = r1
        L8b:
            if (r11 == 0) goto L92
            android.view.ViewGroup r0 = r9.f443853p
            r11.removeView(r0)
        L92:
            android.widget.FrameLayout r11 = r9.f443851n
            if (r11 == 0) goto L99
            r11.removeAllViews()
        L99:
            android.widget.FrameLayout r11 = r9.f443851n
            if (r11 == 0) goto La6
            android.view.ViewGroup r0 = r9.f443853p
            r11.addView(r0)
            goto La6
        La3:
            r9.Z6()
        La6:
            int r11 = r9.f443855r
            java.util.LinkedHashMap r10 = r10.f536055a
            if (r11 != r4) goto Lb4
            int r11 = r10.size()
            int r0 = r9.f443856s
            if (r11 == r0) goto Lb5
        Lb4:
            r2 = r3
        Lb5:
            r9.f443855r = r4
            int r10 = r10.size()
            r9.f443856s = r10
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r5 = 0
            qf2.b4 r6 = new qf2.b4
            r6.<init>(r9, r2, r1)
            r7 = 2
            r8 = 0
            r3 = r9
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.c4.a7(xh2.b, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        this.f443857t = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TopContentLayoutControl", "onLiveDeactivate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f443850m = (android.widget.FrameLayout) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fnx);
        this.f443851n = (android.widget.FrameLayout) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.jji);
        this.f443852o = (android.widget.Space) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.afi);
        this.f443853p = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fnw);
        this.f443854q = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.c8f);
        xh2.b bVar = this.f443857t;
        if (bVar != null) {
            a7(bVar, "onViewMount");
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f443854q = null;
        this.f443853p = null;
        this.f443852o = null;
        this.f443851n = null;
        this.f443850m = null;
    }
}
