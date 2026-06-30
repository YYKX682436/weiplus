package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r.f284596n.entrySet()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) entry.getKey();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i iVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i) entry.getValue();
            if (iVar.f284490b == j17) {
                iVar.f284489a.cancel();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d69039);
                arrayList.add(c22624x85d69039);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r.f284596n.remove((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) it.next());
        }
    }
}
