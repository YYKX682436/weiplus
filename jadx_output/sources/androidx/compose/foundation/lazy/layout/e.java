package androidx.compose.foundation.lazy.layout;

/* loaded from: classes5.dex */
public abstract class e {
    public static final int a(androidx.compose.foundation.lazy.layout.d dVar, int i17) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        if (i17 >= 0) {
            androidx.compose.foundation.lazy.layout.b0 b0Var = (androidx.compose.foundation.lazy.layout.b0) dVar;
            if (i17 < b0Var.f10393c) {
                java.util.List list = b0Var.f10392b;
                int h17 = kz5.c0.h(list);
                int i18 = 0;
                while (i18 < h17) {
                    int i19 = ((h17 - i18) / 2) + i18;
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    int i27 = ((androidx.compose.foundation.lazy.layout.c) arrayList.get(i19)).f10394a;
                    if (i27 != i17) {
                        if (i27 < i17) {
                            i18 = i19 + 1;
                            if (i17 < ((androidx.compose.foundation.lazy.layout.c) arrayList.get(i18)).f10394a) {
                            }
                        } else {
                            h17 = i19 - 1;
                        }
                    }
                    return i19;
                }
                return i18;
            }
        }
        throw new java.lang.IndexOutOfBoundsException("Index " + i17 + ", size " + ((androidx.compose.foundation.lazy.layout.b0) dVar).f10393c);
    }
}
