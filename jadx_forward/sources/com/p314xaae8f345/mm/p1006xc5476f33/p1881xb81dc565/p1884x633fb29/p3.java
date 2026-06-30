package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f231601a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f231602b;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 f231606f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e0 f231607g;

    /* renamed from: i, reason: collision with root package name */
    public int f231609i;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f231603c = "";

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3 f231604d = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3("", 0, 0, null, 14, null);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f231605e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f231608h = true;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f231610j = "";

    public void a(java.lang.String userName, int[] pBuffer, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pBuffer, "pBuffer");
        this.f231608h = true;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f(userName));
        if (!(valueOf.booleanValue() && i17 > 0 && i18 > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0> arrayList = this.f231601a;
            if (arrayList != null) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 b0Var : arrayList) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 d17 = b0Var.d(i27);
                    if (d17 != null) {
                        this.f231609i = i27;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3 h3Var = this.f231604d;
                        d(h3Var, pBuffer, i17, i18);
                        h3Var.f231528c = i19;
                        h3Var.f231527b = i27;
                        android.graphics.Bitmap bitmap = h3Var.f231529d;
                        if (bitmap != null) {
                            d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j3(b0Var, d17, userName, bitmap, i19));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r25, byte[] r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p3.b(java.lang.String, byte[], int, int, int, int):void");
    }

    public void c(java.lang.String userName, int[] pBuffer, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3 h3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pBuffer, "pBuffer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f231601a;
        if (arrayList2 != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0) it.next();
                if (this.f231602b == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, this.f231603c)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0.a(b0Var, 0, 1, null);
                    if (a17 != null) {
                        arrayList.add(a17);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 b17 = b0Var.b(userName);
                    if (b17 != null) {
                        arrayList.add(b17);
                    }
                }
            }
        }
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0> arrayList3 = arrayList.isEmpty() ^ true ? arrayList : null;
        if (arrayList3 != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 a0Var : arrayList3) {
                if (this.f231602b == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.getF231877m(), this.f231603c)) {
                    h3Var = this.f231604d;
                } else {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f231605e;
                    if (concurrentHashMap.get(a0Var.getF231877m()) == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3 h3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3(a0Var.getF231877m(), 0, 0, null, 14, null);
                        concurrentHashMap.put(a0Var.getF231877m(), h3Var2);
                        h3Var = h3Var2;
                    } else {
                        h3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3) concurrentHashMap.get(a0Var.getF231877m());
                    }
                }
                if (h3Var != null) {
                    d(h3Var, pBuffer, i17, i18);
                    h3Var.f231528c = i19;
                    h3Var.f231527b = i27;
                    android.graphics.Bitmap bitmap = h3Var.f231529d;
                    if (bitmap != null) {
                        d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o3(arrayList3, userName, bitmap, i27, i19));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1.getHeight() != r23) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3 r20, int[] r21, int r22, int r23) {
        /*
            r19 = this;
            r0 = r20
            r8 = r22
            r9 = r23
            java.lang.String r10 = "error happened in set pixel while w is "
            monitor-enter(r19)
            android.graphics.Bitmap r1 = r0.f231529d     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L21
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lcb
            if (r1 != r8) goto L21
            android.graphics.Bitmap r1 = r0.f231529d     // Catch: java.lang.Throwable -> Lcb
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> Lcb
            if (r1 == r9) goto L8b
        L21:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lcb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Throwable -> Lcb
            r2.add(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.ThreadLocal r1 = zj0.c.f554818a     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> Lcb
            r2.add(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch: java.lang.Throwable -> Lcb
            r2.add(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r1 = new java.lang.Object     // Catch: java.lang.Throwable -> Lcb
            r1.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.util.Collections.reverse(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object[] r12 = r2.toArray()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = "com/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer"
            java.lang.String r14 = "refreshBitmap"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer$BitmapHolder;[III)V"
            java.lang.String r16 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r17 = "createBitmap"
            java.lang.String r18 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r11 = r1
            yj0.a.d(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lcb
            r4 = 1
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lcb
            r5 = 2
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lcb
            android.graphics.Bitmap$Config r2 = (android.graphics.Bitmap.Config) r2     // Catch: java.lang.Throwable -> Lcb
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3, r4, r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = "com/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer"
            java.lang.String r14 = "refreshBitmap"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer$BitmapHolder;[III)V"
            java.lang.String r16 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r17 = "createBitmap"
            java.lang.String r18 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r11 = r1
            r12 = r2
            yj0.a.e(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lcb
            r0.f231529d = r2     // Catch: java.lang.Throwable -> Lcb
        L8b:
            android.graphics.Bitmap r11 = r0.f231529d     // Catch: java.lang.Throwable -> Lcb
            if (r11 == 0) goto Lc9
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r11
            r1 = r21
            r3 = r22
            r6 = r22
            r7 = r23
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lcb
            goto Lc9
        L9f:
            java.lang.String r0 = "VideoDisplayDataMuxer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r1.<init>(r10)     // Catch: java.lang.Throwable -> Lcb
            r1.append(r8)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " and h is "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            r1.append(r9)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " and bitmap bound is "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            int r2 = r11.getWidth()     // Catch: java.lang.Throwable -> Lcb
            int r3 = r11.getHeight()     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2 * r3
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lcb
        Lc9:
            monitor-exit(r19)
            return
        Lcb:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p3.d(com.tencent.mm.plugin.multitalk.model.h3, int[], int, int):void");
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 targetContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetContainer, "targetContainer");
        java.util.ArrayList arrayList = this.f231601a;
        boolean z17 = false;
        if (arrayList != null && arrayList.contains(targetContainer)) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        if (this.f231601a == null) {
            this.f231601a = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = this.f231601a;
        if (arrayList2 != null) {
            arrayList2.add(targetContainer);
        }
    }

    public final boolean f(java.lang.String str) {
        return this.f231602b == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f231603c);
    }

    public final void g(int i17, java.lang.String largeHostName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(largeHostName, "largeHostName");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("VideoDisplayDataMuxer", "setLargeTargetState " + i17, new java.lang.Object[0]);
        this.f231602b = i17;
        this.f231603c = largeHostName;
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 targetContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetContainer, "targetContainer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f231601a;
        if (arrayList2 != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0) it.next();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b0Var, targetContainer)) {
                    arrayList.add(b0Var);
                }
            }
        }
        this.f231601a = arrayList;
    }
}
