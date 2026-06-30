package com.tencent.mm.network;

/* loaded from: classes8.dex */
public class d implements java.util.Comparator {
    public d(com.tencent.mm.network.AccInfo accInfo) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).compareTo((java.lang.String) ((java.util.Map.Entry) obj2).getKey());
    }
}
