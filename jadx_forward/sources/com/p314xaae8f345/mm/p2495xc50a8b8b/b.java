package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.k f273684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f273685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar, java.util.LinkedList linkedList) {
        super(3);
        this.f273684d = kVar;
        this.f273685e = linkedList;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object k17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.reflect.Constructor constructor;
        ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k17, "k");
        java.lang.Class cls = this.f273684d.f273697e;
        java.lang.Object newInstance = (cls == null || (constructor = cls.getConstructor(new java.lang.Class[0])) == null) ? null : constructor.newInstance(new java.lang.Object[0]);
        com.p314xaae8f345.mm.p2495xc50a8b8b.e eVar = newInstance instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.e ? (com.p314xaae8f345.mm.p2495xc50a8b8b.e) newInstance : null;
        if (eVar != null) {
            eVar.set(0, k17);
            eVar.set(1, obj);
            java.util.LinkedList linkedList = this.f273685e;
            java.util.Iterator it = linkedList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p2495xc50a8b8b.e) it.next()).mo75944x4aabfc28(0), k17)) {
                    break;
                }
                i17++;
            }
            if (i17 != -1) {
                linkedList.remove(i17);
            }
            linkedList.add(eVar);
        }
        return jz5.f0.f384359a;
    }
}
