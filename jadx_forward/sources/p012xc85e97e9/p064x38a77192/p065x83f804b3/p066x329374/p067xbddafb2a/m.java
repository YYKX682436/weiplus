package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes13.dex */
public final class m implements s1.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k f91948a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f91949b;

    public m(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k factory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        this.f91948a = factory;
        this.f91949b = new java.util.LinkedHashMap();
    }

    @Override // s1.n2
    public void a(s1.m2 slotIds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotIds, "slotIds");
        java.util.Map map = this.f91949b;
        ((java.util.LinkedHashMap) map).clear();
        java.util.Iterator it = slotIds.iterator();
        while (it.hasNext()) {
            java.lang.Object b17 = this.f91948a.b(it.next());
            java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) map).get(b17);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                map.put(b17, java.lang.Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // s1.n2
    public boolean b(java.lang.Object obj, java.lang.Object obj2) {
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k kVar = this.f91948a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.b(obj), kVar.b(obj2));
    }
}
