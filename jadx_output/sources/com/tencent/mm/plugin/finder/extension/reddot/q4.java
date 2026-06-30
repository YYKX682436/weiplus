package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class q4 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f105784d;

    public q4(java.util.LinkedList linkedList) {
        this.f105784d = linkedList;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.LinkedList linkedList = this.f105784d;
        java.util.Iterator it = linkedList.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num != null && num.intValue() == ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.field_businessType) {
                break;
            }
            i18++;
        }
        if (i18 < 0) {
            i18 = Integer.MAX_VALUE;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        java.util.Iterator it6 = linkedList.iterator();
        int i19 = 0;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Integer num2 = (java.lang.Integer) it6.next();
            if (num2 != null && num2.intValue() == ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry2.getValue()).f105587a.field_businessType) {
                i17 = i19;
                break;
            }
            i19++;
        }
        return mz5.a.b(valueOf, java.lang.Integer.valueOf(i17 >= 0 ? i17 : Integer.MAX_VALUE));
    }
}
