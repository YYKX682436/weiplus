package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class py implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132375b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapPoiClickListener f132376c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw> f132374a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener> f132377d = new java.util.HashMap();

    public py(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        this.f132375b = neVar;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne b() {
        return this.f132375b;
    }

    private void c() {
        this.f132376c = null;
        this.f132374a.clear();
        this.f132377d.clear();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener
    /* renamed from: onAoiLayerLoaded */
    public final void mo36920x40ec4b7a(boolean z17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436 interfaceC26006x789d436) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        if (interfaceC26006x789d436 == null || this.f132375b == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener onAoiLayerLoadListener = this.f132377d.get(interfaceC26006x789d436.mo36409x5db1b11());
        if (onAoiLayerLoadListener != null) {
            onAoiLayerLoadListener.mo36920x40ec4b7a(z17, interfaceC26006x789d436);
        }
        if (!z17 || (hgVar = this.f132375b.f130533c) == null) {
            return;
        }
        hgVar.g().f131210a++;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn a() {
        return this.f132375b;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436 a(java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26007x97be4188 c26007x97be4188, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar;
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw> it = this.f132374a.iterator();
        while (true) {
            if (!it.hasNext()) {
                pwVar = null;
                break;
            }
            pwVar = it.next();
            if (pwVar.mo36409x5db1b11() != null && pwVar.mo36409x5db1b11().equals(str)) {
                break;
            }
        }
        if (pwVar == null) {
            pwVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw(this, str, c26007x97be4188, this);
            this.f132374a.add(pwVar);
            if (onAoiLayerLoadListener != null) {
                this.f132377d.put(str, onAoiLayerLoadListener);
            }
        }
        pwVar.a(c26007x97be4188);
        return pwVar;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar) {
        this.f132374a.remove(pwVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(r0.mo36409x5db1b11(), r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 r11) {
        /*
            r10 = this;
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r10.f132376c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r11 == 0) goto L6d
            int r0 = r11.f17376x368f3a
            r2 = 4
            if (r0 != r2) goto L6d
            long r2 = r11.f17369xb9bf0b8e
            java.util.List<com.tencent.mapsdk.internal.pw> r11 = r10.f132374a
            java.util.Iterator r11 = r11.iterator()
        L15:
            boolean r0 = r11.hasNext()
            r4 = 0
            if (r0 == 0) goto L64
            java.lang.Object r0 = r11.next()
            com.tencent.mapsdk.internal.pw r0 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw) r0
            com.tencent.mapsdk.internal.px r5 = r0.f132324b
            if (r5 == 0) goto L5a
            com.tencent.mapsdk.internal.px$d r5 = r5.f132343a
            if (r5 == 0) goto L5a
            java.util.List<com.tencent.mapsdk.internal.px$d> r5 = r5.f132361j
            if (r5 == 0) goto L5a
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.px$d r6 = (com.tencent.mapsdk.internal.px.d) r6
            com.tencent.mapsdk.internal.py r7 = r0.f132323a
            com.tencent.mapsdk.internal.ne r7 = r7.f132375b
            com.tencent.mapsdk.internal.bi r7 = r7.f132043j
            int r8 = r6.f132352a
            java.lang.Class<com.tencent.mapsdk.internal.oc> r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc.class
            com.tencent.mapsdk.internal.ng r7 = r7.a(r9, r8)
            com.tencent.mapsdk.internal.oc r7 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) r7
            if (r7 == 0) goto L32
            int r7 = r7.a()
            long r7 = (long) r7
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L32
            r4 = r6
        L5a:
            if (r4 == 0) goto L15
            java.lang.String r11 = r0.mo36409x5db1b11()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(r11, r4)
        L64:
            if (r4 == 0) goto L6d
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r10.f132376c
            r11.mo99162x82f09148(r4)
            r11 = 1
            return r11
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py.a(com.tencent.mapsdk.engine.jni.models.TappedElement):boolean");
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapPoiClickListener onMapPoiClickListener) {
        this.f132376c = onMapPoiClickListener;
    }
}
