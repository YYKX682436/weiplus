package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKPickerView */
/* loaded from: classes15.dex */
public class C3347xcef4ad5e extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0<java.lang.String>> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3501xc11cfafe {
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3501xc11cfafe
    /* renamed from: getCurrentSelectedRows */
    public java.util.ArrayList<java.lang.Integer> mo27030x4bcda3f7() {
        return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0) this.f13218x373aa5).m26541xb74a503d();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3501xc11cfafe
    /* renamed from: setCallbackImpl */
    public void mo27031x15d6d987(final com.p314xaae8f345.p347x615374d.gen.AbstractC3633xcc6ae2d7 abstractC3633xcc6ae2d7) {
        ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0) this.f13218x373aa5).m26549x4e5bd421(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.OnSelectChangeListener() { // from class: com.tencent.kinda.framework.widget.base.MMKPickerView.1
            @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.OnSelectChangeListener
            /* renamed from: onSelected */
            public void mo26552xec20159a(java.util.ArrayList<java.lang.Integer> arrayList) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3633xcc6ae2d7 abstractC3633xcc6ae2d72 = abstractC3633xcc6ae2d7;
                if (abstractC3633xcc6ae2d72 != null) {
                    abstractC3633xcc6ae2d72.mo28505x2e7a5e(arrayList);
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3501xc11cfafe
    /* renamed from: setNormalData */
    public void mo27032xd1855b33(java.util.ArrayList<java.util.ArrayList<java.lang.String>> arrayList) {
        if (arrayList == null) {
            return;
        }
        ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0) this.f13218x373aa5).m26545x84e47d09(arrayList);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3501xc11cfafe
    /* renamed from: setSelectedRows */
    public void mo27033x2ea7b096(java.util.ArrayList<java.lang.Integer> arrayList) {
        ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0) this.f13218x373aa5).m26542xed934b49(arrayList);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3501xc11cfafe
    /* renamed from: setSyncData */
    public void mo27034xe2d45767(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.util.ArrayList<java.lang.String>> arrayList2) {
        ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0) this.f13218x373aa5).m26547x93273e71(arrayList, arrayList2);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0<java.lang.String> mo26107x519d71c1(android.content.Context context) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0<java.lang.String> c3306x3c1b5a0 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0<>(context);
        this.f13218x373aa5 = c3306x3c1b5a0;
        return c3306x3c1b5a0;
    }
}
