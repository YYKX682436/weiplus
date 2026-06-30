package uj5;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final uj5.n f510011a = new uj5.n();

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0092 -> B:10:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.graphics.Canvas r10, android.view.View r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof uj5.l
            if (r0 == 0) goto L13
            r0 = r12
            uj5.l r0 = (uj5.l) r0
            int r1 = r0.f510006m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f510006m = r1
            goto L18
        L13:
            uj5.l r0 = new uj5.l
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f510004h
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f510006m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r10 = r0.f510003g
            uj5.h r10 = (uj5.h) r10
            java.lang.Object r11 = r0.f510002f
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r2 = r0.f510001e
            android.graphics.Canvas r2 = (android.graphics.Canvas) r2
            java.lang.Object r5 = r0.f510000d
            uj5.n r5 = (uj5.n) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r8 = r12
            r12 = r10
            r10 = r2
            r2 = r8
            goto L95
        L3c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L44:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            float r12 = r11.getX()
            int r12 = (int) r12
            float r2 = r11.getY()
            int r2 = (int) r2
            java.util.List r12 = r9.b(r11, r12, r2)
            r11.draw(r10)
            boolean r11 = r12.isEmpty()
            r11 = r11 ^ r4
            if (r11 == 0) goto Laa
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.Iterator r11 = r12.iterator()
            r5 = r9
        L66:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Laa
            java.lang.Object r12 = r11.next()
            uj5.h r12 = (uj5.h) r12
            if (r12 == 0) goto L66
            android.view.SurfaceView r2 = r12.f509989a
            if (r2 == 0) goto L66
            r0.f510000d = r5
            r0.f510001e = r10
            r0.f510002f = r11
            r0.f510003g = r12
            r0.f510006m = r4
            r5.getClass()
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            uj5.k r7 = new uj5.k
            r7.<init>(r2, r3)
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r6, r7, r0)
            if (r2 != r1) goto L95
            return r1
        L95:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L66
            boolean r6 = r2.isRecycled()
            if (r6 == 0) goto La0
            goto L66
        La0:
            int r6 = r12.f509990b
            float r6 = (float) r6
            int r12 = r12.f509991c
            float r12 = (float) r12
            r10.drawBitmap(r2, r6, r12, r3)
            goto L66
        Laa:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uj5.n.a(android.graphics.Canvas, android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.List b(android.view.View view, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.SurfaceView) {
            arrayList.add(new uj5.h((android.view.SurfaceView) view, i17, i18));
        } else if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                android.view.View childAt = viewGroup.getChildAt(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                arrayList.addAll(b(childAt, (int) (viewGroup.getX() + i17), (int) (viewGroup.getY() + i18)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.view.View r16, java.lang.Integer r17, java.lang.Integer r18, android.graphics.Bitmap.Config r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof uj5.m
            if (r2 == 0) goto L16
            r2 = r1
            uj5.m r2 = (uj5.m) r2
            int r3 = r2.f510010g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f510010g = r3
            goto L1b
        L16:
            uj5.m r2 = new uj5.m
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.f510008e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f510010g
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            java.lang.Object r2 = r2.f510007d
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto Ld8
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            if (r17 == 0) goto L41
            int r1 = r17.intValue()
            goto L45
        L41:
            int r1 = r16.getWidth()
        L45:
            if (r18 == 0) goto L4c
            int r4 = r18.intValue()
            goto L50
        L4c:
            int r4 = r16.getHeight()
        L50:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r19
            r6.add(r7)
            java.lang.ThreadLocal r7 = zj0.c.f554818a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.add(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.add(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            java.util.Collections.reverse(r6)
            java.lang.Object[] r8 = r6.toArray()
            java.lang.String r9 = "com/tencent/mm/ui/snapshot/SnapShotUtilKt"
            java.lang.String r10 = "getBitmapFromSurfaceView"
            java.lang.String r11 = "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r12 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r13 = "createBitmap"
            java.lang.String r14 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r7 = r1
            yj0.a.d(r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = 0
            java.lang.Object r4 = r6.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = 2
            java.lang.Object r6 = r6.get(r8)
            android.graphics.Bitmap$Config r6 = (android.graphics.Bitmap.Config) r6
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r7, r6)
            java.lang.String r9 = "com/tencent/mm/ui/snapshot/SnapShotUtilKt"
            java.lang.String r10 = "getBitmapFromSurfaceView"
            java.lang.String r11 = "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r12 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r13 = "createBitmap"
            java.lang.String r14 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r7 = r1
            r8 = r4
            yj0.a.e(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = "createBitmap(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r4)
            android.graphics.drawable.Drawable r6 = r16.getBackground()
            if (r6 == 0) goto Lca
            r6.draw(r1)
        Lca:
            r2.f510007d = r4
            r2.f510010g = r5
            r5 = r16
            java.lang.Object r1 = r15.a(r1, r5, r2)
            if (r1 != r3) goto Ld7
            return r3
        Ld7:
            r2 = r4
        Ld8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uj5.n.c(android.view.View, java.lang.Integer, java.lang.Integer, android.graphics.Bitmap$Config, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
