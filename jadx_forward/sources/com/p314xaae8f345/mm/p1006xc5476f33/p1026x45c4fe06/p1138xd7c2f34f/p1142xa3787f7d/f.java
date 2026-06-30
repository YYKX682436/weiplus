package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.f f166728d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.f();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.f166733a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4> u07 = w2Var != null ? w2Var.u0(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.ASC) : null;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = u07 != null ? java.lang.Integer.valueOf(u07.size()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeReporter", "checkRemovedCollection allCollection: %d", objArr);
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.f166734b;
        if (u07 != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 : u07) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k kVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.f166733a;
                java.lang.String username = c11712x63ef1ef4.f157894d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                java.lang.String b17 = kVar2.b(username, c11712x63ef1ef4.f157896f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeReporter", "checkRemovedCollection key: %s", b17);
                if (hashMap.containsKey(b17)) {
                    hashMap.remove(b17);
                }
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeReporter", "checkRemovedCollection needRemove key: %s", entry.getKey());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.c(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.a) entry.getValue()).f166723a);
        }
        kVar.e(u07);
    }
}
