package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.a0.class)
/* loaded from: classes9.dex */
public final class o4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f281153e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f281154f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f281155g = new java.util.LinkedHashSet();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((java.util.LinkedHashMap) this.f281153e).clear();
        ((java.util.LinkedHashMap) this.f281154f).clear();
        this.f281155g.clear();
    }

    public void m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) this.f281153e).get(ic5.f.f371970c.a(msgInfo));
        if (weakReference == null || (abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) weakReference.get()) == null) {
            return;
        }
        z01.l lVar = (z01.l) abstractC11172x705e5905.m48328xa0ab20ce();
        if (lVar != null) {
            lVar.f550622f = false;
        } else {
            lVar = null;
        }
        abstractC11172x705e5905.m48330xfcfee142(lVar);
    }

    public void n0(java.lang.String groupId) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        if (r26.n0.N(groupId) || !this.f281155g.remove(groupId) || (list = (java.util.List) ((java.util.LinkedHashMap) this.f281154f).get(groupId)) == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) it.next()).get();
            if (view == null) {
                it.remove();
            } else {
                n3.l1.a(view).b();
                n3.z1 a17 = n3.l1.a(view);
                a17.a(1.0f);
                a17.c(150L);
                a17.f();
            }
        }
    }

    public int o0(long j17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(talker, j17);
        if (k17 == null) {
            return 0;
        }
        up5.x a17 = c95.d.f121280a.a(ic5.f.f371970c.a(k17));
        if (a17 != null) {
            return a17.f511652e;
        }
        return 0;
    }

    public void p0(android.view.View optView) {
        java.lang.Object obj;
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optView, "optView");
        int width = optView.getWidth();
        int height = optView.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        java.util.Iterator mo144672x467c086e = q26.y.d(optView.getParent(), n3.w1.f415966d).mo144672x467c086e();
        while (true) {
            if (!mo144672x467c086e.hasNext()) {
                obj = null;
                break;
            } else {
                obj = mo144672x467c086e.next();
                if (((android.view.ViewParent) obj) instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
                    break;
                }
            }
        }
        android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
        if (viewGroup == null) {
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupCommonComponent", "startOptViewFadeOutOverlay", "(Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupCommonComponent", "startOptViewFadeOutOverlay", "(Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            optView.draw(new android.graphics.Canvas(createBitmap));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(createBitmap);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        if (bitmap == null) {
            return;
        }
        int[] iArr = new int[2];
        optView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationInWindow(iArr2);
        int i17 = iArr[0] - iArr2[0];
        int i18 = iArr[1] - iArr2[1];
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(viewGroup.getResources(), bitmap);
        bitmapDrawable.setBounds(i17, i18, width + i17, height + i18);
        viewGroup.getOverlay().add(bitmapDrawable);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(255, 0);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l4(bitmapDrawable));
        ofInt.addListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k4(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m4(viewGroup, bitmapDrawable, bitmap)));
        ofInt.start();
    }

    public void q0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, android.view.View optView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optView, "optView");
        java.lang.String b17 = ic5.f.f371970c.b(msgInfo);
        if (r26.n0.N(b17)) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f281154f;
        java.lang.Object obj = linkedHashMap.get(b17);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(b17, obj);
        }
        java.util.List list = (java.util.List) obj;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) it.next()).get();
            if (view == null || view == optView) {
                it.remove();
            }
        }
        list.add(new java.lang.ref.WeakReference(optView));
    }
}
