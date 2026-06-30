package com.tencent.mm.app.plugin;

/* loaded from: classes8.dex */
public class m implements java.util.Comparator {
    public m(com.tencent.mm.app.plugin.n nVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((r35.m3) obj).f369192a;
        int i18 = ((r35.m3) obj2).f369192a;
        if (i17 < i18) {
            return -1;
        }
        return i17 > i18 ? 1 : 0;
    }
}
