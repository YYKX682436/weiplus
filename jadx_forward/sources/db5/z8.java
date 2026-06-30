package db5;

/* loaded from: classes15.dex */
public abstract class z8 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final db5.y8 f310130d;

    public z8() {
        db5.y8 y8Var = new db5.y8();
        this.f310130d = y8Var;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        y8Var.f310120d = 1;
        y8Var.f310121e = sparseArray;
        y8Var.f310119c = new android.util.SparseArray[]{sparseArray};
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public final void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        viewGroup.removeView(view);
        db5.y8 y8Var = this.f310130d;
        if (y8Var.f310120d == 1) {
            y8Var.f310121e.put(i17, view);
        } else {
            y8Var.f310119c[0].put(i17, view);
        }
        view.setAccessibilityDelegate(null);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public final java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        android.view.View a17;
        i12.b0 b0Var;
        java.lang.String str;
        java.lang.String str2;
        db5.y8 y8Var = this.f310130d;
        android.view.View view = null;
        if (y8Var.f310120d == 1) {
            a17 = db5.y8.a(y8Var.f310121e, i17);
        } else {
            android.util.SparseArray[] sparseArrayArr = y8Var.f310119c;
            a17 = sparseArrayArr.length > 0 ? db5.y8.a(sparseArrayArr[0], i17) : null;
        }
        i12.c0 c0Var = (i12.c0) this;
        java.util.LinkedList linkedList = c0Var.f368728e;
        if (linkedList != null) {
            int size = i17 % linkedList.size();
            android.content.Context context = c0Var.f368729f;
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "getView inflate");
                a17 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a8b, null);
                b0Var = new i12.b0(c0Var, a17);
                a17.setTag(b0Var);
            } else {
                b0Var = (i12.b0) a17.getTag();
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362.a(context)[0];
                b0Var.f368701a.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i18, ((i18 * 3) / 8) + 1));
            }
            a17.setTag(com.p314xaae8f345.mm.R.id.dbf, java.lang.Integer.valueOf(size));
            a17.setOnClickListener(c0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b) linkedList.get(size);
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "BaseEmotionBanner is null.");
            } else {
                if (bVar.f179072c) {
                    r45.kj0 kj0Var = bVar.f179070a;
                    str = kj0Var.f460259d.f458627g;
                    str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kj0Var.f460261f) ? "H5" : "Toptic";
                } else {
                    r45.hj0 hj0Var = bVar.f179071b;
                    str = hj0Var.f457744e.f458627g;
                    str2 = hj0Var.f457743d.f473661d;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.e(str2, 8, str, i65.a.g(context), true);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19697x5d42833e c19697x5d42833e = b0Var.f368701a;
                    if (e17 == null) {
                        java.util.ArrayList arrayList = c0Var.f368732i;
                        if (arrayList.contains(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "url has add to list. no need to try load image.");
                            c19697x5d42833e.m64938x75cc54fa("-");
                        } else {
                            n11.a.b().j(str, null, y12.f.c(str2, str, false, str2, "BANNER"), c0Var.f368733m);
                            arrayList.add(str);
                        }
                    } else {
                        c19697x5d42833e.m64938x75cc54fa(e17.N0());
                    }
                }
                view = a17;
            }
        }
        viewGroup.addView(view);
        return view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public final boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        db5.y8 y8Var = this.f310130d;
        boolean z17 = y8Var.f310120d > 1;
        android.util.SparseArray sparseArray = y8Var.f310121e;
        android.view.View[] viewArr = y8Var.f310117a;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            android.view.View view = viewArr[length];
            if (view != null) {
                int[] iArr = y8Var.f310118b;
                int i17 = iArr[length];
                viewArr[length] = null;
                iArr[length] = -1;
                if (i17 >= 0) {
                    if (z17) {
                        sparseArray = y8Var.f310119c[i17];
                    }
                    sparseArray.put(length, view);
                    view.setAccessibilityDelegate(null);
                }
            }
        }
        int length2 = viewArr.length;
        int i18 = y8Var.f310120d;
        android.util.SparseArray[] sparseArrayArr = y8Var.f310119c;
        for (int i19 = 0; i19 < i18; i19++) {
            android.util.SparseArray sparseArray2 = sparseArrayArr[i19];
            int size = sparseArray2.size();
            int i27 = size - length2;
            int i28 = size - 1;
            int i29 = 0;
            while (i29 < i27) {
                sparseArray2.remove(sparseArray2.keyAt(i28));
                i29++;
                i28--;
            }
        }
        super.mo8343xced61ae5();
    }
}
