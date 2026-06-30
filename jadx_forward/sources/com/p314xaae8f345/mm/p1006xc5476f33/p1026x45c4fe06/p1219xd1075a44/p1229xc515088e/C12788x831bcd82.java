package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV2 */
/* loaded from: classes15.dex */
public class C12788x831bcd82 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f {
    public java.lang.String[] X1;
    public int Y1;

    public C12788x831bcd82(android.content.Context context) {
        super(context);
        m53587x6c813c5e(i65.a.b(context, 2));
        m53586x4d90c14c(android.graphics.Color.parseColor("#1AAD19"));
        m53593x63a5752(i65.a.b(context, 8));
        m53596xd557904d(android.graphics.Color.parseColor("#A5A5A5"));
        m53603x8ad9ad99(-16777216);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: currentValue */
    public java.lang.Object mo51206x57066778() {
        java.lang.String[] strArr = this.X1;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[m53581x754a37bb()];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: getView */
    public final android.view.View mo51207xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onAttach */
    public void mo51208x3b13c504(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onDetach */
    public void mo51209x3f5eee52(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onHide */
    public void mo51210xc39a57c1(tl1.v vVar) {
        q();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.C1;
        if (n3Var != null) {
            n3Var.mo50311x7ab51103(g(1, 0, 0, null), 0L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f, android.view.View
    public final void onMeasure(int i17, int i18) {
        int i19 = this.Y1;
        if (i19 > 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onShow */
    public void mo51211xc39f557c(tl1.v vVar) {
    }

    /* renamed from: setForceWidth */
    public final void m53564x23f7d39d(int i17) {
        this.Y1 = i17;
    }

    /* renamed from: setOptionsArray */
    public final void m53565x203ffbdd(java.lang.String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            setEnabled(false);
            setVisibility(4);
            return;
        }
        setEnabled(true);
        setVisibility(0);
        this.X1 = strArr;
        int m53577x29c75bb5 = m53577x29c75bb5();
        int m53576x93a5f7e3 = (m53576x93a5f7e3() - m53577x29c75bb5) + 1;
        int length = strArr.length - 1;
        if ((length - m53577x29c75bb5) + 1 > m53576x93a5f7e3) {
            m53585xe3204a1(strArr);
            m53594x8e5e58ef(length);
        } else {
            m53594x8e5e58ef(length);
            m53585xe3204a1(strArr);
        }
    }
}
