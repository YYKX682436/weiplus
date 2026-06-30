package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class c6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f213284d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f213285e;

    /* renamed from: f, reason: collision with root package name */
    public int f213286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 f213287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f213288h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f213289i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0, java.lang.CharSequence charSequence, android.view.ViewGroup viewGroup, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f213287g = c15269x718714b0;
        this.f213288h = charSequence;
        this.f213289i = viewGroup;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c6(this.f213287g, this.f213288h, this.f213289i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f213286f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0 = this.f213287g;
            android.widget.TextView textView = new android.widget.TextView(c15269x718714b0.getContext());
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(c15269x718714b0.getWidth(), c15269x718714b0.getHeight());
            android.view.ViewGroup.LayoutParams layoutParams2 = c15269x718714b0.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            layoutParams.topMargin = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams3 = c15269x718714b0.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            layoutParams.bottomMargin = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams4 = c15269x718714b0.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            layoutParams.leftMargin = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams5 = c15269x718714b0.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
            layoutParams.rightMargin = marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0;
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(0, c15269x718714b0.getTextSize());
            textView.setText(this.f213288h);
            textView.setGravity(16);
            textView.setPadding(c15269x718714b0.getPaddingLeft(), c15269x718714b0.getPaddingTop(), c15269x718714b0.getPaddingRight(), c15269x718714b0.getPaddingBottom());
            textView.setTextColor(c15269x718714b0.getHintTextColors());
            textView.setAlpha(0.0f);
            android.view.ViewGroup viewGroup = this.f213289i;
            viewGroup.addView(textView, viewGroup.indexOfChild(c15269x718714b0) + 1);
            c15269x718714b0.getLocalVisibleRect(new android.graphics.Rect());
            textView.setTranslationX(r4.left);
            textView.setTranslationY(r4.top);
            this.f213284d = textView;
            this.f213285e = viewGroup;
            this.f213286f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            if (!textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b6(rVar, textView))) {
                viewGroup.removeView(textView);
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
