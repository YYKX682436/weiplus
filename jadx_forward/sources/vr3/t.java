package vr3;

/* loaded from: classes11.dex */
public final class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 f521183a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7) {
        this.f521183a = c16893x570516c7;
    }

    public static final void a(java.util.List list, r45.o5 o5Var, int i17, java.lang.String str, java.util.ArrayList arrayList) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.s5 s5Var = (r45.s5) it.next();
                try {
                    java.util.LinkedList linkedList = s5Var.f467047i.f464287e;
                    if (linkedList.isEmpty()) {
                        continue;
                    } else {
                        java.util.Iterator it6 = linkedList.iterator();
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i19 = -1;
                                break;
                            }
                            r45.z5 z5Var = ((r45.o5) it6.next()).R;
                            if (z5Var != null && z5Var.f473251e == i17) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        if (i19 != -1) {
                            r45.z5 z5Var2 = ((r45.o5) linkedList.get(i19)).R;
                            int i27 = ((r45.o5) linkedList.get(i19)).f463470y0;
                            java.lang.String str2 = ((r45.o5) linkedList.get(i19)).Z;
                            java.lang.String str3 = ((r45.o5) linkedList.get(i19)).f463452l1;
                            o5Var.R = z5Var2;
                            o5Var.f463470y0 = i27;
                            o5Var.Z = str2;
                            o5Var.f463452l1 = str3;
                            linkedList.set(i19, o5Var);
                            arrayList.add(s5Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", str + ": Updated Info idx=" + i19 + " for msgId=" + i17 + " in MsgList");
                        } else if (s5Var.f467047i.f464286d.f460671d == i17) {
                            for (java.lang.Object obj : linkedList) {
                                int i28 = i18 + 1;
                                if (i18 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                    break;
                                }
                                r45.o5 o5Var2 = (r45.o5) obj;
                                if (o5Var2.f463449g == o5Var.f463449g) {
                                    o5Var.R = o5Var2.R;
                                    o5Var.f463470y0 = o5Var2.f463470y0;
                                    o5Var.Z = o5Var2.Z;
                                    o5Var.f463452l1 = o5Var2.f463452l1;
                                    linkedList.set(i18, o5Var);
                                    arrayList.add(s5Var);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", str + ": Updated Info index=" + i18 + " for msgId=" + i17 + " in MsgList");
                                }
                                i18 = i28;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizProfileDataFetcher", str + ": Exception processing MsgList item: " + e17 + ", msg=" + s5Var.f467047i.f464286d.f460671d, e17);
                }
            }
        }
    }
}
