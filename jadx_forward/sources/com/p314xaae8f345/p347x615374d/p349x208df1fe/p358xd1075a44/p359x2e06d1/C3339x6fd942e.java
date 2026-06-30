package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKListView */
/* loaded from: classes15.dex */
public class C3339x6fd942e extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.ListView> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce {

    /* renamed from: adapter */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3356x2cb1efac f13080xbb6ca34f;

    /* renamed from: mListViewCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033 f13081xa27b1c55;

    /* renamed from: binding */
    private void m26984xf98cae85() {
        this.f13080xbb6ca34f = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3356x2cb1efac(this.f13206xd6cfe882, this.f13081xa27b1c55);
        mo27110xfb86a31b().setAdapter((android.widget.ListAdapter) this.f13080xbb6ca34f);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: addFooter */
    public void mo26985xe9965d9c(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: addHeader */
    public void mo26986xec6c8a8e(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: getShowScrollBar */
    public boolean mo26987xb00c9bd3() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: getVertical */
    public boolean mo26988x596a4ec() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: setImpl */
    public void mo26989x764b91a2(com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033 abstractC3478xebeba033) {
        this.f13081xa27b1c55 = abstractC3478xebeba033;
        m26984xf98cae85();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: setOnScrollCallback */
    public void mo26990xbfa5f273(com.p314xaae8f345.p347x615374d.gen.AbstractC3479x95b0a7df abstractC3479x95b0a7df) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: setShowScrollBar */
    public void mo26991x42e30247(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3477xc41cc9ce
    /* renamed from: setVertical */
    public void mo26992x4f05f8(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.ListView mo26107x519d71c1(android.content.Context context) {
        return new android.widget.ListView(context);
    }
}
