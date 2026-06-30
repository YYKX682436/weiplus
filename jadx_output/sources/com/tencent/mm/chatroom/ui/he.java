package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class he implements java.util.Comparator {
    public he(com.tencent.mm.chatroom.ui.le leVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((kn.a) obj).f309371b;
        int i18 = ((kn.a) obj2).f309371b;
        if (i17 > i18) {
            return 1;
        }
        return i17 == i18 ? 0 : -1;
    }
}
