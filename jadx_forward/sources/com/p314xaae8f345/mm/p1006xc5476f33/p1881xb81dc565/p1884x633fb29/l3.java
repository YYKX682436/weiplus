package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p3 f231572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 f231573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f231574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p3 p3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 b0Var, int i17, java.lang.String str) {
        super(3);
        this.f231572d = p3Var;
        this.f231573e = b0Var;
        this.f231574f = i17;
        this.f231575g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (r6.getHeight() != r3) goto L15;
     */
    @Override // yz5.q
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo147xb9724478(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r2 = r22
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r23
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "byteBuffer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            com.tencent.mm.plugin.multitalk.model.p3 r4 = r0.f231572d
            java.lang.String r5 = r4.f231610j
            boolean r5 = r4.f(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r6 = r5.booleanValue()
            if (r6 == 0) goto L2e
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r5 == 0) goto Le3
            int r11 = r0.f231574f
            java.lang.String r9 = r0.f231575g
            r5.booleanValue()
            int r5 = r4.f231609i
            com.tencent.mm.plugin.multitalk.model.b0 r7 = r0.f231573e
            com.tencent.mm.plugin.multitalk.model.a0 r8 = r7.d(r5)
            if (r8 == 0) goto Le3
            java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.multitalk.model.h3 r5 = r4.f231604d
            android.graphics.Bitmap r6 = r5.f231529d
            if (r6 == 0) goto L5c
            int r6 = r6.getWidth()
            if (r6 != r2) goto L5c
            android.graphics.Bitmap r6 = r5.f231529d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            int r6 = r6.getHeight()
            if (r6 == r3) goto Lc6
        L5c:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r6)
            java.lang.ThreadLocal r6 = zj0.c.f554818a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.add(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.add(r2)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            java.util.Collections.reverse(r10)
            java.lang.Object[] r13 = r10.toArray()
            java.lang.String r14 = "com/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer"
            java.lang.String r15 = "refreshBitmap"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer$BitmapHolder;Ljava/nio/ByteBuffer;II)V"
            java.lang.String r17 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r18 = "createBitmap"
            java.lang.String r19 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r12 = r2
            yj0.a.d(r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = 0
            java.lang.Object r3 = r10.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6 = 1
            java.lang.Object r6 = r10.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r12 = 2
            java.lang.Object r10 = r10.get(r12)
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r6, r10)
            java.lang.String r14 = "com/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer"
            java.lang.String r15 = "refreshBitmap"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/multitalk/model/VideoDisplayDataMuxer$BitmapHolder;Ljava/nio/ByteBuffer;II)V"
            java.lang.String r17 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r18 = "createBitmap"
            java.lang.String r19 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r12 = r2
            r13 = r3
            yj0.a.e(r12, r13, r14, r15, r16, r17, r18, r19)
            r5.f231529d = r3
        Lc6:
            android.graphics.Bitmap r2 = r5.f231529d
            if (r2 == 0) goto Lcd
            r2.copyPixelsFromBuffer(r1)
        Lcd:
            java.lang.System.currentTimeMillis()
            r5.f231528c = r11
            int r1 = r4.f231609i
            r5.f231527b = r1
            android.graphics.Bitmap r10 = r5.f231529d
            if (r10 == 0) goto Le3
            com.tencent.mm.plugin.multitalk.model.k3 r1 = new com.tencent.mm.plugin.multitalk.model.k3
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            d75.b.g(r1)
        Le3:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.l3.mo147xb9724478(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
