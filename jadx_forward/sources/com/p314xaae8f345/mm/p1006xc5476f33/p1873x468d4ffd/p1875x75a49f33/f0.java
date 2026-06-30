package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public final class f0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f230545d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g0 f230546e;

    /* renamed from: f, reason: collision with root package name */
    public int f230547f;

    /* renamed from: g, reason: collision with root package name */
    public int f230548g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f230549h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f230550i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe f230551m;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe, java.util.ArrayList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f230551m = c16539x811795fe;
        this.f230545d = dataList;
        this.f230546e = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g0(c16539x811795fe);
        int i17 = c16539x811795fe.f230428n;
        this.f230547f = i17;
        this.f230548g = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f230545d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0) this.f230545d.get(i17)).f230543c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h0 vh6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vh6, "vh");
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe = this.f230551m;
        if (mo863xcdaf1228 == c16539x811795fe.f230439y || mo863xcdaf1228(i17) == c16539x811795fe.f230440z) {
            if (i17 == 0) {
                vh6.f3639x46306858.setMinimumWidth(this.f230547f);
            } else {
                vh6.f3639x46306858.setMinimumWidth(this.f230548g);
            }
            vh6.f3639x46306858.setBackgroundColor(0);
            vh6.f3639x46306858.setMinimumHeight(c16539x811795fe.f230423f);
            return;
        }
        java.util.ArrayList arrayList = this.f230545d;
        int b17 = a06.d.b((((float) ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0) arrayList.get(i17)).f230542b) / ((float) c16539x811795fe.f230434t)) * c16539x811795fe.f230424g);
        android.widget.ImageView imageView = vh6.f230562d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = b17;
        }
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "onBindViewHolder pos:" + i17 + " time:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0) arrayList.get(i17)).f230541a + " width:" + b17 + " thumbWidth:" + c16539x811795fe.f230424g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g0 g0Var = this.f230546e;
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "onBindViewHolder ImageLoader invoked after released.");
            return;
        }
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0) arrayList.get(i17)).f230541a;
        if (imageView == null || i18 < 0) {
            return;
        }
        int i19 = g0Var.f230558e.f230422e;
        int i27 = i18 > i19 ? i19 : i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "loadImageAsync() called with: time = [" + i27 + "], view = [" + imageView + ']');
        java.lang.Object tag = imageView.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0 d0Var = (tag == null || !(tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0)) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0) tag;
        if (d0Var != null && d0Var.f230534d == i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "SimpleImageLoader.loadImageAsync time equals %d return directly", java.lang.Integer.valueOf(i27));
            return;
        }
        if (d0Var != null) {
            d0Var.f230538h = true;
        }
        if (imageView.getDrawable() == null || !(imageView.getDrawable() instanceof android.graphics.drawable.BitmapDrawable)) {
            bitmap = null;
        } else {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        imageView.setImageBitmap(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0 d0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0(g0Var.f230558e, i27, imageView, bitmap, g0Var.f230554a);
        imageView.setTag(d0Var2);
        int i28 = g0Var.f230557d;
        int i29 = i28 % g0Var.f230555b;
        g0Var.f230557d = i28 + 1;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] n3VarArr = g0Var.f230556c;
        if (n3VarArr[i29] == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = n3VarArr[i29];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n3Var);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(n3Var.mo50283x2f1920ea()).mo50293x3498a0(d0Var2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe = this.f230551m;
        if (i17 == c16539x811795fe.f230439y || i17 == c16539x811795fe.f230440z) {
            android.view.View view = new android.view.View(c16539x811795fe.getContext());
            if (i17 == c16539x811795fe.f230439y) {
                this.f230549h = view;
            } else {
                this.f230550i = view;
            }
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h0(c16539x811795fe, view, i17);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(c16539x811795fe.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setMinimumWidth(c16539x811795fe.f230424g);
        imageView.setMinimumHeight(c16539x811795fe.f230423f);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c16539x811795fe.getContext());
        linearLayout.addView(imageView, c16539x811795fe.f230424g, c16539x811795fe.f230423f);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h0(c16539x811795fe, linearLayout, c16539x811795fe.A);
    }

    public final void x(boolean z17, int i17) {
        if (z17) {
            android.view.View view = this.f230549h;
            if (view != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                view.setMinimumWidth(i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe = this.f230551m;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c16539x811795fe.f230430p;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1162x665295de);
            if (c1162x665295de.w() == 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c16539x811795fe.f230430p;
                if (c1163xf1deaba42 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                c1163xf1deaba42.scrollBy(i17 - this.f230547f, 0);
            }
            this.f230547f = i17;
        } else {
            this.f230548g = i17;
            android.view.View view2 = this.f230550i;
            if (view2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
                view2.setMinimumWidth(this.f230548g);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "setCanScrollOverLength left:%B length:%d headLength:%d tailLength:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f230547f), java.lang.Integer.valueOf(this.f230548g));
    }
}
