package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKOptionsPicker implements com.tencent.kinda.gen.KOptionPicker {
    private com.tencent.mm.ui.widget.picker.c0 optionPicker;

    @Override // com.tencent.kinda.gen.KOptionPicker
    public void hide() {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.optionPicker;
        if (c0Var != null) {
            c0Var.d();
        }
    }

    @Override // com.tencent.kinda.gen.KOptionPicker
    public void showImpl(java.util.ArrayList<com.tencent.kinda.gen.Option> arrayList, com.tencent.kinda.gen.VoidBoolOptionCallback voidBoolOptionCallback) {
    }
}
