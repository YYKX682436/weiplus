package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f284703a = new java.util.HashMap();

    public final void a(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewGroup) {
            a(viewGroup, (android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public final android.graphics.Matrix b(android.graphics.Bitmap bitmap, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int width = view.getWidth();
        int height = view.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (width2 <= 0 || height2 <= 0) {
            return matrix;
        }
        float f17 = width;
        float f18 = width2;
        float f19 = height;
        float f27 = height2;
        float max = java.lang.Math.max(f17 / f18, f19 / f27);
        float f28 = (f19 - (f27 * max)) / 2.0f;
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postScale(max, max);
        matrix2.postTranslate((f17 - (f18 * max)) / 2.0f, f28);
        return matrix2;
    }

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2 c(android.view.ViewGroup host, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2 snapshot, android.view.View targetView, float f17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        a(host, targetView, matrix);
        matrix.preConcat(b(snapshot.f284673a, targetView));
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.reset();
        a(host, targetView, matrix2);
        jz5.l d17 = d(matrix2);
        float floatValue = ((java.lang.Number) d17.f384366d).floatValue();
        float floatValue2 = ((java.lang.Number) d17.f384367e).floatValue();
        int b17 = a06.d.b(targetView.getWidth() * floatValue);
        if (b17 < 1) {
            b17 = 1;
        }
        int b18 = a06.d.b(targetView.getHeight() * floatValue2);
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2(j17, snapshot.f284673a, new jz5.l(java.lang.Integer.valueOf(snapshot.f284675c), java.lang.Integer.valueOf(snapshot.f284676d)), snapshot.f284674b, new jz5.l(java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(b18 >= 1 ? b18 : 1)), matrix, snapshot.f284678f, f17);
    }

    public final jz5.l d(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float abs = java.lang.Math.abs(fArr[0]);
        float abs2 = java.lang.Math.abs(fArr[4]);
        if (abs == 0.0f) {
            abs = 1.0f;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(abs);
        if (abs2 == 0.0f) {
            abs2 = 1.0f;
        }
        return new jz5.l(valueOf, java.lang.Float.valueOf(abs2));
    }

    public final boolean e(java.lang.String groupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        return this.f284703a.containsKey(groupId);
    }

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2 f(android.view.ViewGroup host, jz5.l lVar, float f17) {
        android.graphics.Bitmap bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        if (lVar == null) {
            return null;
        }
        android.view.View view = (android.view.View) lVar.f384366d;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        a(host, view, matrix);
        jz5.l d17 = d(matrix);
        float floatValue = ((java.lang.Number) d17.f384366d).floatValue();
        float floatValue2 = ((java.lang.Number) d17.f384367e).floatValue();
        int b17 = a06.d.b(width * floatValue);
        int i17 = b17 < 1 ? 1 : b17;
        int b18 = a06.d.b(height * floatValue2);
        int i18 = b18 < 1 ? 1 : b18;
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) lVar.f384367e;
        if (bitmap2 == null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/SharedElementEngine", "snapshotView", "(Landroid/view/ViewGroup;Lkotlin/Pair;F)Lcom/tencent/mm/ui/chatting/view/SharedElementEngine$Snapshot;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/chatting/view/SharedElementEngine", "snapshotView", "(Landroid/view/ViewGroup;Lkotlin/Pair;F)Lcom/tencent/mm/ui/chatting/view/SharedElementEngine$Snapshot;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            view.draw(new android.graphics.Canvas(createBitmap));
            bitmap = createBitmap;
        } else {
            bitmap = bitmap2;
        }
        matrix.preConcat(b(bitmap, view));
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2(bitmap, matrix, i17, i18, view.getZ(), f17);
    }

    public final void g(android.view.ViewGroup host, java.lang.String groupId, java.util.List elements, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        if (elements.isEmpty()) {
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        java.util.HashMap hashMap = this.f284703a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u2 u2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u2) hashMap.get(groupId);
        if (u2Var != null) {
            java.util.Iterator it = u2Var.f284642a.iterator();
            while (it.hasNext()) {
                ((u3.s) it.next()).b();
            }
        }
        android.view.ViewGroupOverlay overlay = host.getOverlay();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(elements, 10));
        java.util.Iterator it6 = elements.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2 t2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2) it6.next();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v2 v2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v2(t2Var.f284628b);
            v2Var.setBounds(0, 0, host.getWidth(), host.getHeight());
            jz5.l lVar = t2Var.f284629c;
            v2Var.a(t2Var.f284630d, ((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue(), t2Var.f284633g);
            arrayList.add(v2Var);
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            overlay.add((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v2) it7.next());
        }
        int size = elements.size();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(elements, 10));
        int i17 = 0;
        for (java.lang.Object obj : elements) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2 t2Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2) obj;
            android.graphics.Matrix matrix = t2Var2.f284630d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.x2 x2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.x2(t2Var2, arrayList, i17);
            java.util.HashMap hashMap2 = hashMap;
            java.util.ArrayList arrayList3 = arrayList2;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.y2 y2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.y2(i17, f0Var, size, c0Var, h0Var, arrayList, aVar, this, groupId, overlay);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "<this>");
            android.graphics.Matrix finalMatrix = t2Var2.f284632f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalMatrix, "finalMatrix");
            float[] fArr = new float[9];
            float[] fArr2 = new float[9];
            new android.graphics.Matrix(matrix).getValues(fArr);
            finalMatrix.getValues(fArr2);
            pa5.d dVar = new pa5.d(new p3321xbce91901.jvm.p3324x21ffc6bd.e0(), new float[9], fArr, fArr2, x2Var);
            u3.v vVar = new u3.v(1.0f);
            vVar.a(0.85f);
            vVar.b(500.0f);
            u3.u uVar = new u3.u(matrix, dVar);
            uVar.f505769t = vVar;
            uVar.f505759b = 0.0f;
            uVar.f505760c = true;
            uVar.f505758a = 0.0f;
            uVar.f505766i = 0.00390625f;
            uVar.a(new pa5.c(matrix, finalMatrix, x2Var, y2Var));
            arrayList3.add(uVar);
            arrayList2 = arrayList3;
            i17 = i18;
            arrayList = arrayList;
            hashMap = hashMap2;
            h0Var = h0Var;
        }
        java.util.HashMap hashMap3 = hashMap;
        java.util.ArrayList arrayList4 = arrayList2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u2 u2Var2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u2(arrayList4);
        h0Var.f391656d = u2Var2;
        hashMap3.put(groupId, u2Var2);
        java.util.Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            ((u3.u) it8.next()).e();
        }
    }
}
