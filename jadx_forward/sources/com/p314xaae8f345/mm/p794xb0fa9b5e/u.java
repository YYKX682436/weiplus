package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes11.dex */
class u implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private u() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("Token");
        java.lang.String string2 = bundle.getString("Event");
        if (nk0.b.f419477b == null) {
            synchronized (nk0.b.class) {
                if (nk0.b.f419477b == null) {
                    nk0.b.f419477b = new nk0.b();
                }
            }
        }
        nk0.b bVar = nk0.b.f419477b;
        com.p314xaae8f345.mm.p794xb0fa9b5e.t tVar = new com.p314xaae8f345.mm.p794xb0fa9b5e.t(this, string, rVar);
        bVar.getClass();
        if (string2 == null || string2.length() == 0) {
            return;
        }
        java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) bVar.f419478a).get(string2);
        if (list == null) {
            list = new java.util.LinkedList();
            ((java.util.concurrent.ConcurrentHashMap) bVar.f419478a).put(string2, list);
        }
        if (list.contains(tVar)) {
            return;
        }
        synchronized (list) {
            list.add(tVar);
        }
    }
}
