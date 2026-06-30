package wr3;

/* loaded from: classes11.dex */
public final class l0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba f530365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 f530366e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba abstractC16899xcafbd5ba, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7) {
        this.f530365d = abstractC16899xcafbd5ba;
        this.f530366e = c16893x570516c7;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        r45.gl glVar5;
        r45.gl glVar6;
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        int i17 = 0;
        boolean z17 = arrayList == null || arrayList.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba abstractC16899xcafbd5ba = this.f530365d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC16899xcafbd5ba.getF235957w(), "bizProfileUpdateData: received no update messages");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC16899xcafbd5ba.getF235957w(), "bizProfileUpdateData: received " + arrayList.size() + " update messages");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            r45.ul ulVar = null;
            r3 = null;
            java.util.LinkedList linkedList = null;
            ulVar = null;
            if (!it.hasNext()) {
                try {
                    r45.tj6 t07 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
                    java.util.List list = (t07 == null || (glVar4 = t07.f468042e) == null) ? null : glVar4.f456856d;
                    if (list == null) {
                        list = kz5.p0.f395529d;
                    }
                    java.util.List list2 = list;
                    r45.tj6 t08 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
                    java.util.LinkedList linkedList2 = (t08 == null || (glVar3 = t08.f468042e) == null) ? null : glVar3.f456860h;
                    r45.tj6 t09 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
                    java.lang.Integer valueOf = (t09 == null || (glVar2 = t09.f468042e) == null) ? null : java.lang.Integer.valueOf(glVar2.f456861i);
                    r45.tj6 t010 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
                    if (t010 != null && (glVar = t010.f468042e) != null) {
                        ulVar = glVar.f456859g;
                    }
                    r45.ul ulVar2 = ulVar;
                    java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b.c(abstractC16899xcafbd5ba.m0(), abstractC16899xcafbd5ba.mo7438x76847179());
                    if (c17 == null) {
                        c17 = "";
                    }
                    this.f530365d.H0(list2, linkedList2, ulVar2, c17, valueOf);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC16899xcafbd5ba.getF235957w(), "bizProfileUpdateData: Adapter updated successfully");
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(abstractC16899xcafbd5ba.getF235957w(), "bizProfileUpdateData: Failed to update adapter: " + e17, e17);
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
            r45.tj6 t011 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
            java.util.LinkedList linkedList3 = (t011 == null || (glVar6 = t011.f468042e) == null) ? null : glVar6.f456856d;
            r45.tj6 t012 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
            if (t012 != null && (glVar5 = t012.f468042e) != null) {
                linkedList = glVar5.f456860h;
            }
            java.lang.String u07 = abstractC16899xcafbd5ba.u0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7 = this.f530366e;
            c16893x570516c7.i(linkedList3, s5Var, u07 + ".Msg");
            c16893x570516c7.i(linkedList, s5Var, u07 + ".Msg.featuredList");
            i17 = i18;
        }
    }
}
