package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
public abstract class SingleTypeAdapter implements com.eclipsesource.mmv8.utils.TypeAdapter {
    private int typeToAdapt;

    public SingleTypeAdapter(int i17) {
        this.typeToAdapt = i17;
    }

    @Override // com.eclipsesource.mmv8.utils.TypeAdapter
    public java.lang.Object adapt(int i17, java.lang.Object obj) {
        if (i17 == this.typeToAdapt) {
            return adapt(obj);
        }
        return com.eclipsesource.mmv8.utils.TypeAdapter.DEFAULT;
    }

    public abstract java.lang.Object adapt(java.lang.Object obj);
}
