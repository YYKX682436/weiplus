package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class bd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f187910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f187911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f187912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f187913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar, java.util.List list, java.util.Set set, java.util.Set set2) {
        super(0);
        this.f187910d = idVar;
        this.f187911e = list;
        this.f187912f = set;
        this.f187913g = set2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar = this.f187910d;
        if (idVar.f188550w) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processPendingPrivacyEvents events:");
            sb6.append(this.f187911e.size());
            sb6.append(" remove:");
            java.util.Set set = this.f187912f;
            sb6.append(set);
            sb6.append(" restore:");
            java.util.Set set2 = this.f187913g;
            sb6.append(set2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb6.toString());
            boolean z17 = !set.isEmpty();
            java.util.Set set3 = idVar.C;
            if (z17) {
                java.util.Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String str = (java.lang.String) it.next();
                    java.util.ArrayList arrayList = idVar.f188540m;
                    java.util.Iterator it6 = arrayList.iterator();
                    boolean z18 = false;
                    int i17 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((so2.f1) it6.next()).f491869d.m75945x2fec8307(5), str)) {
                            break;
                        }
                        i17++;
                    }
                    if (i17 >= 0 && i17 < arrayList.size()) {
                        z18 = true;
                    }
                    if (z18) {
                        arrayList.remove(i17);
                        yw2.n nVar = idVar.f188543p;
                        if (nVar != null && (m82555x4905e9fa = nVar.o().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                            mo7946xf939df19.m8155x27702c4(i17);
                        }
                        idVar.f188546s--;
                        idVar.o();
                        if (idVar.f188546s == 0) {
                            yw2.n nVar2 = idVar.f188543p;
                            if (nVar2 != null) {
                                nVar2.q();
                            }
                        }
                    }
                }
                set3.addAll(set);
            }
            if (!set2.isEmpty()) {
                set3.removeAll(set2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id.m(idVar, idVar.f188536f, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ad(idVar), 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
