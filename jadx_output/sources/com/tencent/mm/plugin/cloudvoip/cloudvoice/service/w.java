package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class w implements java.util.Comparator {
    public w(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x xVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((fw1.d) obj).f267069a;
        int i18 = ((fw1.d) obj2).f267069a;
        if (i17 > i18) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }
}
