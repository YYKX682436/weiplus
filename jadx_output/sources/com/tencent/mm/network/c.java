package com.tencent.mm.network;

/* loaded from: classes8.dex */
public class c implements java.util.Comparator {
    public c(com.tencent.mm.network.AccInfo accInfo) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Integer) ((java.util.Map.Entry) obj).getKey()).intValue() > ((java.lang.Integer) ((java.util.Map.Entry) obj2).getKey()).intValue() ? 1 : -1;
    }
}
