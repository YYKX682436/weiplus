package com.tencent.mm.ipcinvoker;

/* loaded from: classes11.dex */
class u implements com.tencent.mm.ipcinvoker.j {
    private u() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("Token");
        java.lang.String string2 = bundle.getString("Event");
        if (nk0.b.f337944b == null) {
            synchronized (nk0.b.class) {
                if (nk0.b.f337944b == null) {
                    nk0.b.f337944b = new nk0.b();
                }
            }
        }
        nk0.b bVar = nk0.b.f337944b;
        com.tencent.mm.ipcinvoker.t tVar = new com.tencent.mm.ipcinvoker.t(this, string, rVar);
        bVar.getClass();
        if (string2 == null || string2.length() == 0) {
            return;
        }
        java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) bVar.f337945a).get(string2);
        if (list == null) {
            list = new java.util.LinkedList();
            ((java.util.concurrent.ConcurrentHashMap) bVar.f337945a).put(string2, list);
        }
        if (list.contains(tVar)) {
            return;
        }
        synchronized (list) {
            list.add(tVar);
        }
    }
}
