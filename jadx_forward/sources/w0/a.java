package w0;

/* loaded from: classes13.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f523359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar) {
        super(2);
        this.f523359d = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Saver, "$this$Saver");
        java.util.List list = (java.util.List) this.f523359d.mo149xb9724478(Saver, obj2);
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            int i18 = i17 + 1;
            java.lang.Object obj3 = list.get(i17);
            if (obj3 != null && !((w0.d) Saver).f523364a.b(obj3)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            i17 = i18;
        }
        if (!list.isEmpty()) {
            return new java.util.ArrayList(list);
        }
        return null;
    }
}
