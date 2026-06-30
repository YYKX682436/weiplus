package com.tencent.mm.ipcinvoker;

/* loaded from: classes11.dex */
class w implements com.tencent.mm.ipcinvoker.j {
    private w() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.List list;
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
        com.tencent.mm.ipcinvoker.v vVar = new com.tencent.mm.ipcinvoker.v(this, string);
        bVar.getClass();
        if (string2 == null || string2.length() == 0 || (list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) bVar.f337945a).get(string2)) == null) {
            return;
        }
        synchronized (list) {
            list.remove(vVar);
        }
        if (list.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) bVar.f337945a).remove(string2);
        }
    }
}
