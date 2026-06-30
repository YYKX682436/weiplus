package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes11.dex */
class w implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private w() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.util.List list;
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
        com.p314xaae8f345.mm.p794xb0fa9b5e.v vVar = new com.p314xaae8f345.mm.p794xb0fa9b5e.v(this, string);
        bVar.getClass();
        if (string2 == null || string2.length() == 0 || (list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) bVar.f419478a).get(string2)) == null) {
            return;
        }
        synchronized (list) {
            list.remove(vVar);
        }
        if (list.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) bVar.f419478a).remove(string2);
        }
    }
}
