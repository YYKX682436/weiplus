package com.google.android.material.theme;

/* loaded from: classes15.dex */
public class MaterialComponentsViewInflater extends androidx.appcompat.app.AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public androidx.appcompat.widget.AppCompatButton createButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.button.MaterialButton(context, attributeSet);
    }
}
