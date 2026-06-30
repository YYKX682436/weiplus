package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class i implements db5.i4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272495a;

    public i(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar) {
        this.f272495a = vVar;
    }

    @Override // db5.i4
    public final void a(android.widget.ImageView imageView, android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) this.f272495a.f272545m.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (wVar != null) {
            if (wVar.h() != 3) {
                imageView.setVisibility(8);
                return;
            }
            int h17 = i65.a.h(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = h17;
                layoutParams2.height = h17;
                layoutParams2.rightMargin = i65.a.h(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                layoutParams2.bottomMargin = i65.a.h(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            }
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8i);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78469x693e23ce);
        }
    }
}
