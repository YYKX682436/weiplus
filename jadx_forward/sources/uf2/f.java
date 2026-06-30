package uf2;

/* loaded from: classes3.dex */
public final class f extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f508711m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f508712n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f508713o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f508711m = new java.util.LinkedHashMap();
        this.f508712n = new java.util.LinkedHashMap();
        this.f508713o = new java.util.LinkedHashMap();
    }

    public static final boolean Z6(uf2.f fVar, uf2.a aVar, int i17) {
        fVar.getClass();
        if (i17 > 100 || i17 < 0) {
            return false;
        }
        android.widget.FrameLayout frameLayout = aVar.f508695a;
        android.view.ViewGroup b76 = fVar.b7();
        int width = b76 != null ? b76.getWidth() : 0;
        android.view.ViewGroup b77 = fVar.b7();
        int height = b77 != null ? b77.getHeight() : 0;
        if (width != 0 && height != 0) {
            android.graphics.Rect rect = aVar.f508697c;
            int i18 = rect != null ? rect.left : 0;
            int i19 = rect != null ? rect.top : 0;
            if (rect != null) {
                width = rect.right;
            }
            if (rect != null) {
                height = rect.bottom;
            }
            int i27 = height - i19;
            int i28 = (int) (i17 * i27 * 0.01f);
            frameLayout.setTranslationX(i18);
            frameLayout.setTranslationY(i19);
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = width - i18;
                layoutParams.height = i27;
                frameLayout.setLayoutParams(layoutParams);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = aVar.f508696b;
            float translationY = c22789xd23e9a9b.getTranslationY();
            float f17 = i27 - i28;
            if (translationY < f17) {
                c22789xd23e9a9b.setTranslationY(f17);
            } else {
                android.view.ViewPropertyAnimator animate = c22789xd23e9a9b.animate();
                animate.setUpdateListener(new uf2.b(f17, translationY, c22789xd23e9a9b));
                animate.setListener(new uf2.c(c22789xd23e9a9b, f17));
                animate.start();
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = c22789xd23e9a9b.getLayoutParams();
            if (layoutParams2 != null) {
                int i29 = width - i18;
                layoutParams2.width = i29;
                layoutParams2.height = java.lang.Math.max(i28, i29);
                c22789xd23e9a9b.setLayoutParams(layoutParams2);
            }
        }
        return true;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : micInfoData.f536055a.entrySet()) {
            sb6.append(((java.lang.String) entry.getKey()) + ':' + entry.getValue() + ' ');
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PkGiftForegroundPagController", "#onMicUserChanged " + ((java.lang.Object) sb6));
        pm0.v.X(new uf2.d(this, micInfoData));
    }

    public final void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PkGiftForegroundPagController", "#cleanAllStreamWidget");
        java.util.Map map = this.f508711m;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            c7((uf2.a) ((java.util.Map.Entry) it.next()).getValue());
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    public final android.view.ViewGroup b7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) T6(com.p314xaae8f345.mm.R.id.r9z, com.p314xaae8f345.mm.R.id.r9y);
        if (viewGroup != null) {
            return (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r_8);
        }
        return null;
    }

    public final void c7(uf2.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PkGiftForegroundPagController", "#removeStreamWidget widget=" + aVar);
        aVar.f508696b.n();
        android.widget.FrameLayout frameLayout = aVar.f508695a;
        android.view.ViewParent parent = frameLayout.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
    }

    public final void d7(java.lang.String sdkId, java.lang.String giftId, int i17) {
        r45.gs5 gs5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkId, "sdkId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PkGiftForegroundPagController", "#updateForegroundInfo sdkId=" + sdkId + " giftId=" + giftId + " height=" + i17);
        dk2.u7 u7Var = dk2.u7.f315714a;
        r45.l43 l43Var = (r45.l43) dk2.u7.f315724k.get(giftId);
        boolean z17 = false;
        java.lang.String m75945x2fec8307 = (l43Var == null || (gs5Var = (r45.gs5) l43Var.m75936x14adae67(0)) == null) ? null : gs5Var.m75945x2fec8307(0);
        boolean z18 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PkGiftForegroundPagController", "#updateForegroundInfo pagIsEmpty=" + z18);
        if (i17 <= 0 || z18) {
            return;
        }
        this.f508712n.put(sdkId, new jz5.o(giftId, java.lang.Integer.valueOf(i17), 0));
        tf2.n nVar = (tf2.n) m56789x25fe639c(tf2.n.class);
        if (nVar != null && nVar.f500471m) {
            z17 = true;
        }
        if (z17) {
            e7(sdkId, giftId, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(java.lang.String r18, java.lang.String r19, int r20) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf2.f.e7(java.lang.String, java.lang.String, int):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        ((java.util.LinkedHashMap) this.f508712n).clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        tf2.n nVar = (tf2.n) m56789x25fe639c(tf2.n.class);
        boolean z17 = false;
        if (nVar != null && nVar.f500471m) {
            z17 = true;
        }
        if (z17) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f508712n).entrySet()) {
                e7((java.lang.String) entry.getKey(), (java.lang.String) ((jz5.o) entry.getValue()).f384374d, ((java.lang.Number) ((jz5.o) entry.getValue()).f384375e).intValue());
            }
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        a7();
    }
}
