package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class MMKPickerView extends com.tencent.kinda.framework.widget.base.MMKView<com.tencent.kinda.framework.widget.base.KindaPickerViewImpl<java.lang.String>> implements com.tencent.kinda.gen.KPickerView {
    @Override // com.tencent.kinda.gen.KPickerView
    public java.util.ArrayList<java.lang.Integer> getCurrentSelectedRows() {
        return ((com.tencent.kinda.framework.widget.base.KindaPickerViewImpl) this.view).getCurrentItems();
    }

    @Override // com.tencent.kinda.gen.KPickerView
    public void setCallbackImpl(final com.tencent.kinda.gen.VoidListCallback voidListCallback) {
        ((com.tencent.kinda.framework.widget.base.KindaPickerViewImpl) this.view).setOnSelectChangeListener(new com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.OnSelectChangeListener() { // from class: com.tencent.kinda.framework.widget.base.MMKPickerView.1
            @Override // com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.OnSelectChangeListener
            public void onSelected(java.util.ArrayList<java.lang.Integer> arrayList) {
                com.tencent.kinda.gen.VoidListCallback voidListCallback2 = voidListCallback;
                if (voidListCallback2 != null) {
                    voidListCallback2.call(arrayList);
                }
            }
        });
    }

    @Override // com.tencent.kinda.gen.KPickerView
    public void setNormalData(java.util.ArrayList<java.util.ArrayList<java.lang.String>> arrayList) {
        if (arrayList == null) {
            return;
        }
        ((com.tencent.kinda.framework.widget.base.KindaPickerViewImpl) this.view).setIndividualPicker(arrayList);
    }

    @Override // com.tencent.kinda.gen.KPickerView
    public void setSelectedRows(java.util.ArrayList<java.lang.Integer> arrayList) {
        ((com.tencent.kinda.framework.widget.base.KindaPickerViewImpl) this.view).setCurrentItems(arrayList);
    }

    @Override // com.tencent.kinda.gen.KPickerView
    public void setSyncData(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.util.ArrayList<java.lang.String>> arrayList2) {
        ((com.tencent.kinda.framework.widget.base.KindaPickerViewImpl) this.view).setLinkagePicker(arrayList, arrayList2);
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public com.tencent.kinda.framework.widget.base.KindaPickerViewImpl<java.lang.String> createView(android.content.Context context) {
        com.tencent.kinda.framework.widget.base.KindaPickerViewImpl<java.lang.String> kindaPickerViewImpl = new com.tencent.kinda.framework.widget.base.KindaPickerViewImpl<>(context);
        this.view = kindaPickerViewImpl;
        return kindaPickerViewImpl;
    }
}
