package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.a0 f230644d;

    /* renamed from: e, reason: collision with root package name */
    public int f230645e;

    /* renamed from: f, reason: collision with root package name */
    public int f230646f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f230647g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f230648h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 f230649i;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q qVar) {
        this.f230649i = c16538x58704dc4;
        this.f230644d = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.a0(c16538x58704dc4);
        int i17 = c16538x58704dc4.f230415q;
        this.f230645e = i17;
        this.f230646f = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        if (this.f230649i.f230407f <= 0) {
            return 0;
        }
        return java.lang.Math.max(0, (int) java.lang.Math.floor(r1 / r0.f230406e)) + 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 == 0) {
            return 1;
        }
        return i17 == mo1894x7e414b06() - 1 ? 2 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b0) k3Var;
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = this.f230649i;
        if (mo863xcdaf1228 == 1 || mo863xcdaf1228(i17) == 2) {
            if (i17 == 0) {
                b0Var.f3639x46306858.setMinimumWidth(this.f230645e);
            } else {
                b0Var.f3639x46306858.setMinimumWidth(this.f230646f);
            }
            b0Var.f3639x46306858.setBackgroundColor(0);
            b0Var.f3639x46306858.setMinimumHeight(c16538x58704dc4.f230408g);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.a0 a0Var = this.f230644d;
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "onBindViewHolder ImageLoader invoked after released.");
            return;
        }
        int i18 = i17 * c16538x58704dc4.f230406e;
        android.widget.ImageView imageView = b0Var.f230519d;
        if (imageView == null || i18 < 0) {
            return;
        }
        int i19 = a0Var.f230513e.f230407f;
        int i27 = i18 > i19 ? i19 : i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "loadImageAsync() called with: time = [" + i27 + "], view = [" + imageView + "]");
        java.lang.Object tag = imageView.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y yVar = (tag == null || !(tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y)) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y) tag;
        if (yVar != null && yVar.f230637d == i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "SimpleImageLoader.loadImageAsync time equals %d return directly", java.lang.Integer.valueOf(i27));
            return;
        }
        if (yVar != null) {
            yVar.f230639f = true;
        }
        android.graphics.Bitmap bitmap = (imageView.getDrawable() == null || !(imageView.getDrawable() instanceof android.graphics.drawable.BitmapDrawable)) ? null : ((android.graphics.drawable.BitmapDrawable) imageView.getDrawable()).getBitmap();
        imageView.setImageBitmap(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y yVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y(a0Var.f230513e, i27, imageView, bitmap, a0Var.f230509a);
        imageView.setTag(yVar2);
        int i28 = a0Var.f230512d;
        int i29 = i28 % a0Var.f230510b;
        a0Var.f230512d = i28 + 1;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] n3VarArr = a0Var.f230511c;
        if (n3VarArr[i29] == null) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(n3VarArr[i29].mo50283x2f1920ea()).mo50293x3498a0(yVar2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = this.f230649i;
        if (i17 == 1 || i17 == 2) {
            android.view.View view = new android.view.View(c16538x58704dc4.getContext());
            if (i17 == 1) {
                this.f230647g = view;
            } else {
                this.f230648h = view;
            }
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b0(c16538x58704dc4, view, 1);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(c16538x58704dc4.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setMinimumWidth(c16538x58704dc4.f230409h);
        imageView.setMinimumHeight(c16538x58704dc4.f230408g);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c16538x58704dc4.getContext());
        linearLayout.addView(imageView, c16538x58704dc4.f230409h, c16538x58704dc4.f230408g);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b0(c16538x58704dc4, linearLayout, 0);
    }

    public void x(boolean z17, int i17) {
        if (!z17) {
            this.f230646f = i17;
            android.view.View view = this.f230648h;
            if (view != null) {
                view.setMinimumWidth(i17);
                return;
            }
            return;
        }
        android.view.View view2 = this.f230647g;
        if (view2 != null) {
            view2.setMinimumWidth(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = this.f230649i;
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c16538x58704dc4.f230412n.getLayoutManager()).w() == 0) {
            c16538x58704dc4.f230412n.scrollBy(i17 - this.f230645e, 0);
        }
        this.f230645e = i17;
    }
}
