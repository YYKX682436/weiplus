package ea1;

/* loaded from: classes7.dex */
public final class a implements l75.q0 {
    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandSearchStorageChangeListener", "onNotifyChange by SysConfigStorage, but sLayoutStorage is null.");
            return;
        }
        int i17 = w0Var.f398507b;
        if (i17 == 2 || i17 == 3) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if ("batch".equals(str)) {
                java.lang.Object obj = w0Var.f398509d;
                if (obj == null || !(obj instanceof java.util.List)) {
                    return;
                }
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().z0((java.lang.String) it.next()));
                }
            } else {
                linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().z0(w0Var.f398509d.toString()));
            }
            if (linkedList.isEmpty()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().mo142179xf35bbb4("batch", 3, linkedList);
            return;
        }
        if (i17 != 5) {
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if ("batch".equals(str)) {
            java.lang.Object obj2 = w0Var.f398509d;
            if (obj2 == null || !(obj2 instanceof java.util.List)) {
                return;
            }
            java.util.Iterator it6 = ((java.util.List) obj2).iterator();
            while (it6.hasNext()) {
                linkedList2.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().z0((java.lang.String) it6.next()));
            }
        } else {
            linkedList2.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().z0(w0Var.f398509d.toString()));
        }
        if (linkedList2.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().mo142179xf35bbb4("batch", 5, linkedList2);
    }
}
