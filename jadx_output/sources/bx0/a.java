package bx0;

/* loaded from: classes5.dex */
public final class a implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.model.time.MJTime lhs = (com.tencent.maas.model.time.MJTime) obj;
        com.tencent.maas.model.time.MJTime rhs = (com.tencent.maas.model.time.MJTime) obj2;
        kotlin.jvm.internal.o.g(lhs, "lhs");
        kotlin.jvm.internal.o.g(rhs, "rhs");
        return lhs.compare(rhs);
    }
}
