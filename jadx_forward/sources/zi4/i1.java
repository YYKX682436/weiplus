package zi4;

/* loaded from: classes4.dex */
public final class i1 extends zi4.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.h1.f554757d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
    }

    @Override // zi4.o1
    public zi4.s1 b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.LinkedList<bw5.vb> linkedList;
        java.util.LinkedList linkedList2;
        bw5.wb wbVar = (bw5.wb) fVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (wbVar != null && (linkedList2 = wbVar.f116166d) != null) {
            arrayList.addAll(linkedList2);
        }
        if (wbVar != null && (linkedList = wbVar.f116167e) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.vb vbVar : linkedList) {
                java.lang.String str = "";
                java.lang.String str2 = vbVar.f115807f[1] ? vbVar.f115805d : "";
                if (str2 != null) {
                    str = str2;
                }
                arrayList2.add(str);
            }
            arrayList.addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            zi4.g0 g0Var = this.f554715f;
            g0Var.getClass();
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = g0Var.f554751d;
            if (c20976x6ba6452a != null) {
                v65.i.b(c20976x6ba6452a, null, new zi4.b0(g0Var, arrayList, null), 1, null);
            }
        }
        return new zi4.s1(new bw5.xb(), 0L, null, 6, null);
    }
}
