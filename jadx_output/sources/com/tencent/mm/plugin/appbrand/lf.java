package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class lf extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Comparator f85487d;

    public lf(java.util.Comparator comparator) {
        kotlin.jvm.internal.o.g(comparator, "comparator");
        this.f85487d = comparator;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        int i17;
        int size = super.size() - 1;
        int size2 = super.size();
        boolean z17 = false;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 >= size2) {
                i17 = 0;
                break;
            }
            int i27 = (i19 + size) >>> 1;
            E e17 = get(i27);
            java.util.Comparator comparator = this.f85487d;
            if (comparator.compare(obj, e17) < 0) {
                size = i27;
            } else {
                i19 = i27 + 1;
            }
            if (i19 == size) {
                if (comparator.compare(obj, get(i19)) >= 0) {
                    i19++;
                }
                i17 = i19;
                z17 = true;
            } else {
                i18++;
            }
        }
        if (!z17) {
            i17 = super.size();
        }
        add(i17, obj);
        return true;
    }
}
