package pk1;

/* loaded from: classes.dex */
public final class x implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f437061d;

    public x(java.util.Map map) {
        this.f437061d = map;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = this.f437061d;
        java.lang.Object obj3 = map.get((com.p314xaae8f345.mm.vfs.r6) obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
        long longValue = ((java.lang.Number) obj3).longValue();
        java.lang.Object obj4 = map.get((com.p314xaae8f345.mm.vfs.r6) obj2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
        return (int) (longValue - ((java.lang.Number) obj4).longValue());
    }
}
