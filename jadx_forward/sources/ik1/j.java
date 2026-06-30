package ik1;

/* loaded from: classes7.dex */
public final class j extends java.util.concurrent.CopyOnWriteArrayList {
    public final boolean d(ik1.h predict) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predict, "predict");
        try {
            return removeIf(new ik1.i(predict));
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : this) {
                if (predict.mo51793xb9724478(obj)) {
                    arrayList.add(obj);
                }
            }
            return removeAll(arrayList);
        }
    }
}
