package pr;

/* loaded from: classes4.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.d f439228a;

    public c(pr.d dVar) {
        this.f439228a = dVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        pr.d dVar = this.f439228a;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDesignerTask", "getNext: " + i17 + ", " + i18);
        r45.cl3 cl3Var = (r45.cl3) fVar.f152151d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.util.LinkedList linkedList3 = dVar.f439233d;
        if (i17 == 0 && i18 == 0) {
            if (cl3Var != null && (linkedList2 = cl3Var.f453174i) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    linkedList3.add(((r45.zj0) it.next()).f473661d);
                }
            }
            pr.d.a(dVar);
            return f0Var;
        }
        if (i17 != 4 || i18 != 2) {
            yz5.l lVar = dVar.f439231b;
            if (lVar == null) {
                return null;
            }
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return f0Var;
        }
        if (cl3Var != null && (linkedList = cl3Var.f453174i) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                linkedList3.add(((r45.zj0) it6.next()).f473661d);
            }
        }
        byte[] d17 = x51.j1.d(cl3Var != null ? cl3Var.f453175m : null);
        dVar.f439232c = d17;
        if (d17 == null) {
            pr.d.a(dVar);
            return f0Var;
        }
        dVar.b();
        return f0Var;
    }
}
