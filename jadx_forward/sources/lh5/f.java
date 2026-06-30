package lh5;

/* loaded from: classes11.dex */
public final class f extends lc3.b0 {

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f400265h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f400266i;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f400263f = {15.0f, 12.0f, 9.0f, 6.0f, 3.0f};

    /* renamed from: g, reason: collision with root package name */
    public final long[] f400264g = {0, 50, 100, 150, 200};

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f400267j = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f400268k = new java.util.LinkedList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f400269l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f400270m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f400271n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f400272o = new java.util.LinkedList();

    @Override // lc3.c0
    public java.lang.String f() {
        return "shakeVisibleBubblesAndAvatars";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        lc3.a0 k17;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        android.view.animation.AnimationSet animationSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        yz5.l s17 = s();
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        kh5.h hVar = (kh5.h) eVar;
        java.lang.String str = "MicroMsg.MEShakeBubblesAndAvatar";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEShakeBubblesAndAvatar", "[MB] shake");
        android.view.animation.Animation animation = this.f400265h;
        java.util.LinkedList linkedList2 = this.f400270m;
        java.util.LinkedList linkedList3 = this.f400267j;
        java.util.LinkedList linkedList4 = this.f400272o;
        java.util.LinkedList linkedList5 = this.f400269l;
        java.util.LinkedList linkedList6 = this.f400271n;
        java.util.LinkedList linkedList7 = this.f400268k;
        float[] fArr = this.f400263f;
        if (animation == null || this.f400266i == null) {
            this.f400265h = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30854x2dc211.f559353ce);
            this.f400266i = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30854x2dc211.f559354cf);
            int i17 = 0;
            while (i17 < 5) {
                float f17 = fArr[i17];
                long j17 = this.f400264g[i17];
                float f18 = (-2) * f17;
                yz5.l lVar = s17;
                float f19 = 2 * f17;
                kh5.h hVar2 = hVar;
                java.lang.String str2 = str;
                java.util.LinkedList linkedList8 = linkedList2;
                java.util.List i18 = kz5.c0.i(new lh5.e(f17, 50L, j17), new lh5.e(f18, 100L, 50 + j17), new lh5.e(f19, 100L, 150 + j17), new lh5.e(f18, 100L, 250 + j17), new lh5.e(f17, 50L, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a + j17));
                android.view.animation.AnimationSet u17 = u(i18, 0.0f);
                u17.addAnimation(this.f400265h);
                linkedList7.add(u17);
                android.view.animation.AnimationSet u18 = u(i18, 0.0f);
                u18.addAnimation(this.f400266i);
                linkedList6.add(u18);
                android.view.animation.AnimationSet u19 = u(i18, 1.0f);
                u19.addAnimation(this.f400265h);
                linkedList5.add(u19);
                android.view.animation.AnimationSet u27 = u(i18, 1.0f);
                u27.addAnimation(this.f400266i);
                linkedList4.add(u27);
                java.util.List i19 = kz5.c0.i(new lh5.e(f17, 34L, j17), new lh5.e(f18, 67L, 34 + j17), new lh5.e(f19, 67L, 101 + j17), new lh5.e(f18, 67L, be1.r0.f4232x366c91de + j17), new lh5.e(f19, 67L, 235 + j17), new lh5.e(f18, 67L, 312 + j17), new lh5.e(f17, 34L, 379 + j17));
                android.view.animation.AnimationSet u28 = u(i19, 0.5f);
                u28.addAnimation(this.f400265h);
                linkedList3.add(u28);
                android.view.animation.AnimationSet u29 = u(i19, 0.5f);
                u29.addAnimation(this.f400266i);
                linkedList8.add(u29);
                i17++;
                linkedList6 = linkedList6;
                linkedList7 = linkedList7;
                hVar = hVar2;
                str = str2;
                linkedList2 = linkedList8;
                s17 = lVar;
            }
        }
        yz5.l lVar2 = s17;
        java.lang.String str3 = str;
        java.util.LinkedList linkedList9 = linkedList2;
        java.util.LinkedList linkedList10 = linkedList6;
        java.util.LinkedList linkedList11 = linkedList7;
        java.util.List c17 = mh5.a.c(hVar.f389604h, true);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "[MB] no visible views");
            k17 = h(1, "no visible views");
        } else {
            boolean optBoolean = data.optBoolean("isFrom", false);
            java.util.ArrayList arrayList = (java.util.ArrayList) c17;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it.next();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) pair.second;
                android.view.View mo79945xb0f558d7 = g0Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var).f287596n : g0Var.mo79945xb0f558d7();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601 = g0Var.f39488x6a87d846;
                int size = (arrayList.size() - arrayList.indexOf(pair)) - 1;
                if (size >= fArr.length) {
                    size = fArr.length - 1;
                }
                if (mo79945xb0f558d7 != null) {
                    if (g0Var.f39491xbb6bd679.M()) {
                        android.view.animation.AnimationSet animationSet2 = (android.view.animation.AnimationSet) (optBoolean ? linkedList5.get(size) : linkedList4.get(size));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(animationSet2);
                        animationSet = animationSet2;
                        linkedList = linkedList11;
                    } else {
                        if (optBoolean) {
                            linkedList = linkedList11;
                            obj = linkedList.get(size);
                        } else {
                            linkedList = linkedList11;
                            obj = linkedList10.get(size);
                        }
                        animationSet = (android.view.animation.AnimationSet) obj;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(animationSet);
                    }
                    animationSet.setAnimationListener(new lh5.d(mo79945xb0f558d7));
                    mo79945xb0f558d7.startAnimation(animationSet);
                } else {
                    linkedList = linkedList11;
                }
                if (c21894x47dd8601 != null) {
                    java.lang.Object obj2 = optBoolean ? linkedList3.get(size) : linkedList9.get(size);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    android.view.animation.Animation animation2 = (android.view.animation.Animation) obj2;
                    animation2.setAnimationListener(new lh5.d(c21894x47dd8601));
                    c21894x47dd8601.startAnimation(animation2);
                }
                linkedList11 = linkedList;
            }
            k17 = k();
        }
        lVar2.mo146xb9724478(k17);
    }

    public final android.view.animation.AnimationSet u(java.util.List list, float f17) {
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            lh5.e eVar = (lh5.e) list.get(i17);
            android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, eVar.f400260a, 1, f17, 1, 0.0f);
            rotateAnimation.setDuration(eVar.f400261b);
            rotateAnimation.setStartOffset(eVar.f400262c);
            if (i17 == 0) {
                rotateAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
            } else if (i17 == list.size() - 1) {
                rotateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
            } else {
                rotateAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            }
            animationSet.addAnimation(rotateAnimation);
        }
        return animationSet;
    }
}
