package wr3;

/* loaded from: classes11.dex */
public final class k1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 f530361d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2) {
        this.f530361d = c16901x75950f2;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        int i17 = 0;
        boolean z17 = arrayList == null || arrayList.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2 = this.f530361d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16901x75950f2.f235968q, "bizProfileUpdateData: received no update messages");
            return;
        }
        java.lang.String str = c16901x75950f2.f235968q;
        java.lang.String str2 = c16901x75950f2.f235968q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "bizProfileUpdateData: received " + arrayList.size() + " update messages");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r45.gl glVar = c16901x75950f2.f235973v;
            if (!hasNext) {
                try {
                    wr3.t0 t0Var = c16901x75950f2.f235972u;
                    if (t0Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
                        throw null;
                    }
                    r45.gl glVar2 = c16901x75950f2.m0().f470768f;
                    java.lang.Integer valueOf = glVar2 != null ? java.lang.Integer.valueOf(glVar2.f456861i) : null;
                    r45.gl glVar3 = c16901x75950f2.m0().f470768f;
                    t0Var.N(glVar, valueOf, glVar3 != null ? glVar3.f456860h : null, c16901x75950f2.f235974w);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "bizProfileUpdateData: Adapter updated successfully");
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "bizProfileUpdateData: Failed to update adapter: " + e17, e17);
                    return;
                }
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.s5 s5Var = (r45.s5) next;
            c16901x75950f2.n0().i(glVar.f456856d, s5Var, "Msg");
            c16901x75950f2.n0().i(c16901x75950f2.m0().f470768f.f456860h, s5Var, "FeaturedList");
            i17 = i18;
        }
    }
}
