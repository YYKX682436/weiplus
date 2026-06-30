package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pt extends com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4252x6e14267f implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc> f132313a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc> f132314b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132315c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f132316d;

    public pt(android.view.View view, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar) {
        super(view);
        this.f132313a = new java.util.ArrayList();
        this.f132314b = new java.util.ArrayList();
        this.f132316d = new android.os.Handler();
        this.f132315c = trVar;
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r2.mo35238x12a519ab().contains((int) r6, (int) r7) != false) goto L16;
     */
    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4252x6e14267f
    /* renamed from: getTargetPoiItemIdx */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo35379x139cb8e7(float r6, float r7) {
        /*
            r5 = this;
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.f16530xdc739417
            r1 = -1
            if (r0 == 0) goto L5b
            int r0 = r0.size()
            if (r0 <= 0) goto L5b
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.f16530xdc739417
            if (r0 == 0) goto L36
            int r0 = r0.size()
            if (r0 <= 0) goto L36
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.f16530xdc739417
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.f16530xdc739417
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc) r2
            boolean r3 = r2 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pu
            if (r3 == 0) goto L36
            android.graphics.Rect r2 = r2.mo35238x12a519ab()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 == r1) goto L3a
            return r0
        L3a:
            r0 = 0
        L3b:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.f16530xdc739417
            int r2 = r2.size()
            if (r0 >= r2) goto L5b
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.f16530xdc739417
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc) r2
            android.graphics.Rect r2 = r2.mo35238x12a519ab()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L58
            return r0
        L58:
            int r0 = r0 + 1
            goto L3b
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.mo35379x139cb8e7(float, float):int");
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4252x6e14267f
    /* renamed from: onItemClicked */
    public final boolean mo35380x30062a35(int i17) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc abstractC4234xc56d2fbc;
        if (i17 >= this.f16530xdc739417.size() || (abstractC4234xc56d2fbc = this.f16530xdc739417.get(i17)) == null) {
            return false;
        }
        m7252x7a174415(i17);
        m7264x9023e859(i17, 1);
        abstractC4234xc56d2fbc.mo35240xaf6b9ae9();
        return true;
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4252x6e14267f
    /* renamed from: onTalkBackActivate */
    public final void mo35381x672f01c5(android.view.View view) {
        super.mo35381x672f01c5(view);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f132315c.e_).a(this);
        u();
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4252x6e14267f
    /* renamed from: onTalkBackDeActivate */
    public final void mo35382x6aa174e6(android.view.View view) {
        super.mo35382x6aa174e6(view);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f132315c.e_).b(this);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq
    public final void u() {
        this.f132316d.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.pt.1
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f16530xdc739417.clear();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132313a.clear();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132314b.clear();
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132315c != null) {
                    java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an> ai6 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132315c.ai();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132315c;
                    trVar.f133720ah.clear();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = null;
                    java.util.ArrayList<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e> Q = neVar == null ? null : neVar.Q();
                    trVar.f133720ah = Q;
                    if (ai6 != null) {
                        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar2 : ai6) {
                            java.lang.String mo36435xc77303b9 = anVar2.mo36435xc77303b9();
                            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(mo36435xc77303b9)) {
                                if (mo36435xc77303b9.startsWith(com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc.f16300xbb5875c9)) {
                                    anVar = anVar2;
                                } else {
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132313a.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pu(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132315c, anVar2));
                                }
                            }
                        }
                        java.util.Collections.sort(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132313a);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f16530xdc739417.addAll(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132313a);
                    }
                    if (Q != null) {
                        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e c26055x88f0336e : Q) {
                            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(c26055x88f0336e.m99624xfb82e301())) {
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132314b.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pv(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132315c, c26055x88f0336e));
                            }
                        }
                        java.util.Collections.sort(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132314b);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f16530xdc739417.addAll(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132314b);
                    }
                    if (anVar != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f16530xdc739417.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pu(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.this.f132315c, anVar));
                    }
                }
            }
        });
    }

    private int a(float f17, float f18) {
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc> list = this.f16530xdc739417;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        int size = this.f16530xdc739417.size() - 1;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc abstractC4234xc56d2fbc = this.f16530xdc739417.get(size);
        if ((abstractC4234xc56d2fbc instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pu) && abstractC4234xc56d2fbc.mo35238x12a519ab().contains((int) f17, (int) f18)) {
            return size;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if ((r7 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pu) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r7.mo36435xc77303b9()
            boolean r1 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(r0)
            if (r1 == 0) goto Le
            return
        Le:
            com.tencent.mapsdk.internal.tr r1 = r7.F
            r2 = 1
            if (r1 == 0) goto L35
            android.graphics.Rect r1 = r7.j()
            com.tencent.mapsdk.internal.tr r3 = r7.F
            int r3 = r3.aj()
            com.tencent.mapsdk.internal.tr r4 = r7.F
            int r4 = r4.ak()
            int r5 = r1.left
            if (r5 < 0) goto L35
            int r5 = r1.top
            if (r5 < 0) goto L35
            int r5 = r1.right
            if (r5 > r3) goto L35
            int r1 = r1.bottom
            if (r1 > r4) goto L35
            r1 = r2
            goto L36
        L35:
            r1 = 0
        L36:
            if (r1 != 0) goto L39
            return
        L39:
            com.tencent.mapsdk.internal.pu r1 = new com.tencent.mapsdk.internal.pu
            com.tencent.mapsdk.internal.tr r3 = r6.f132315c
            r1.<init>(r3, r7)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.f16530xdc739417
            int r7 = r7.size()
            if (r7 <= 0) goto L5c
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.f16530xdc739417
            int r3 = r7.size()
            int r3 = r3 - r2
            java.lang.Object r7 = r7.get(r3)
            com.tencent.map.lib.models.AccessibleTouchItem r7 = (com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc) r7
            if (r7 == 0) goto L5c
            boolean r2 = r7 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pu
            if (r2 == 0) goto L5c
            goto L5d
        L5c:
            r7 = 0
        L5d:
            java.lang.String r2 = "我的位置"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L6c
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.f16530xdc739417
            r7.add(r1)
            return
        L6c:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f16530xdc739417
            r0.clear()
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f132313a
            r0.add(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f132313a
            java.util.Collections.sort(r0)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f16530xdc739417
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.f132313a
            r0.addAll(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f16530xdc739417
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.f132314b
            r0.addAll(r1)
            if (r7 == 0) goto L90
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f16530xdc739417
            r0.add(r7)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pt.a(com.tencent.mapsdk.internal.pp):void");
    }

    private void a() {
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f132315c.e_).b(this);
        this.f16530xdc739417.clear();
        this.f132313a.clear();
        this.f132314b.clear();
    }
}
