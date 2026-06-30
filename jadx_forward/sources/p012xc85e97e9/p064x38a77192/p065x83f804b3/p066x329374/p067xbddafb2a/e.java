package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes5.dex */
public abstract class e {
    public static final int a(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d dVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        if (i17 >= 0) {
            p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0 b0Var = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0) dVar;
            if (i17 < b0Var.f91926c) {
                java.util.List list = b0Var.f91925b;
                int h17 = kz5.c0.h(list);
                int i18 = 0;
                while (i18 < h17) {
                    int i19 = ((h17 - i18) / 2) + i18;
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    int i27 = ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c) arrayList.get(i19)).f91927a;
                    if (i27 != i17) {
                        if (i27 < i17) {
                            i18 = i19 + 1;
                            if (i17 < ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c) arrayList.get(i18)).f91927a) {
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
        throw new java.lang.IndexOutOfBoundsException("Index " + i17 + ", size " + ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0) dVar).f91926c);
    }
}
