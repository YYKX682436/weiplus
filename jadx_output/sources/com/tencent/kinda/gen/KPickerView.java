package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KPickerView extends com.tencent.kinda.gen.KView {
    java.util.ArrayList<java.lang.Integer> getCurrentSelectedRows();

    void setCallbackImpl(com.tencent.kinda.gen.VoidListCallback voidListCallback);

    void setNormalData(java.util.ArrayList<java.util.ArrayList<java.lang.String>> arrayList);

    void setSelectedRows(java.util.ArrayList<java.lang.Integer> arrayList);

    void setSyncData(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.util.ArrayList<java.lang.String>> arrayList2);
}
