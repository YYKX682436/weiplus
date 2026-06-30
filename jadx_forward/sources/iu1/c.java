package iu1;

/* loaded from: classes9.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376376d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376376d = activityC13064xaf775f76;
    }

    public final void B(java.lang.String merchantId, r45.wt mchInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(merchantId, "merchantId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mchInfo, "mchInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376376d;
        java.util.Iterator it = activityC13064xaf775f76.f176725u.iterator();
        while (it.hasNext()) {
            iu1.a aVar = (iu1.a) it.next();
            r45.wt wtVar = aVar.f376364a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wtVar != null ? wtVar.f470960d : null, merchantId)) {
                aVar.f376364a = mchInfo;
                int y17 = y(merchantId);
                if (y17 >= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = activityC13064xaf775f76.f176716i;
                    if (c12808x5de4409f == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                        throw null;
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c12808x5de4409f.mo7946xf939df19();
                    if (mo7946xf939df19 != null) {
                        mo7946xf939df19.m8148xed6e4d18(y17, java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        java.util.Iterator it6 = activityC13064xaf775f76.f176726v.iterator();
        while (it6.hasNext()) {
            iu1.a aVar2 = (iu1.a) it6.next();
            r45.wt wtVar2 = aVar2.f376364a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wtVar2 != null ? wtVar2.f470960d : null, merchantId)) {
                aVar2.f376364a = mchInfo;
                int y18 = y(merchantId);
                if (y18 >= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = activityC13064xaf775f76.f176716i;
                    if (c12808x5de4409f2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                        throw null;
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c12808x5de4409f2.mo7946xf939df19();
                    if (mo7946xf939df192 != null) {
                        mo7946xf939df192.m8148xed6e4d18(y18, java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376376d;
        java.util.ArrayList arrayList = activityC13064xaf775f76.f176725u;
        int size = arrayList != null ? arrayList.size() : 0;
        java.util.ArrayList arrayList2 = activityC13064xaf775f76.f176726v;
        int size2 = arrayList2 != null ? arrayList2.size() : 0;
        int i17 = activityC13064xaf775f76.f176728x != null ? 1 : 0;
        activityC13064xaf775f76.getClass();
        int i18 = activityC13064xaf775f76.f176729y != null ? 1 : 0;
        java.util.ArrayList arrayList3 = activityC13064xaf775f76.f176724t;
        return size + size2 + i17 + 0 + i18 + (arrayList3 != null ? arrayList3.size() : 0) + (activityC13064xaf775f76.f176727w == null ? 0 : 1);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        iu1.a x17 = x(i17);
        if (x17 != null) {
            return x17.f376365b;
        }
        return 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        iu1.m holder = (iu1.m) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        iu1.a x17 = x(i17);
        if (x17 != null) {
            int i18 = iu1.m.f376434z;
            holder.y(x17, i17, false);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        switch (i17) {
            case 0:
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569846pv;
                break;
            case 1:
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569848px;
                break;
            case 2:
            case 3:
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569840pp;
                break;
            case 4:
            case 6:
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569849py;
                break;
            case 5:
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569841pq;
                break;
            case 7:
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569845pu;
                break;
            default:
                i18 = 0;
                break;
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(i18, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new iu1.m(this.f376376d, inflate, i17);
    }

    public final iu1.a x(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376376d;
        java.util.ArrayList arrayList = activityC13064xaf775f76.f176725u;
        if (arrayList != null) {
            arrayList.size();
        }
        java.util.ArrayList arrayList2 = activityC13064xaf775f76.f176725u;
        if (arrayList2 != null) {
            arrayList2.size();
        }
        iu1.a aVar = activityC13064xaf775f76.f176728x;
        java.util.ArrayList arrayList3 = activityC13064xaf775f76.f176724t;
        if (arrayList3 != null) {
            int i19 = i17 + 0;
            if (i19 < arrayList3.size()) {
                return (iu1.a) arrayList3.get(i19);
            }
            i18 = arrayList3.size();
        } else {
            i18 = 0;
        }
        iu1.a aVar2 = activityC13064xaf775f76.f176729y;
        if (aVar2 != null) {
            if (i17 == i18) {
                return aVar2;
            }
            i18++;
        }
        iu1.a aVar3 = activityC13064xaf775f76.f176727w;
        if (aVar3 != null && i17 == i18) {
            return aVar3;
        }
        java.util.ArrayList arrayList4 = activityC13064xaf775f76.f176725u;
        if (arrayList4 != null) {
            int i27 = i17 - i18;
            if (i27 < arrayList4.size()) {
                return (iu1.a) arrayList4.get(i27);
            }
            i18 = arrayList4.size() - 1;
        }
        iu1.a aVar4 = activityC13064xaf775f76.f176728x;
        if (aVar4 != null && i17 == (i18 = i18 + 1)) {
            return aVar4;
        }
        java.util.ArrayList arrayList5 = activityC13064xaf775f76.f176726v;
        if (arrayList5 == null || i17 <= i18 || i17 > arrayList5.size() + i18) {
            return null;
        }
        return (iu1.a) arrayList5.get((i17 - i18) - 1);
    }

    public final int y(java.lang.String merchantId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(merchantId, "merchantId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376376d;
        int i17 = 0;
        int i18 = activityC13064xaf775f76.f176724t != null ? 1 : 0;
        if (activityC13064xaf775f76.f176729y != null) {
            i18++;
        }
        java.util.Iterator it = activityC13064xaf775f76.f176725u.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                int size = (i18 + activityC13064xaf775f76.f176725u.size()) - 1;
                if (activityC13064xaf775f76.f176728x != null) {
                    size++;
                }
                java.util.Iterator it6 = activityC13064xaf775f76.f176726v.iterator();
                while (it6.hasNext()) {
                    int i27 = i17 + 1;
                    r45.wt wtVar = ((iu1.a) it6.next()).f376364a;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wtVar != null ? wtVar.f470960d : null, merchantId)) {
                        return size + i17 + 1;
                    }
                    i17 = i27;
                }
                return -1;
            }
            int i28 = i19 + 1;
            r45.wt wtVar2 = ((iu1.a) it.next()).f376364a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wtVar2 != null ? wtVar2.f470960d : null, merchantId)) {
                return i18 + i19;
            }
            i19 = i28;
        }
    }

    public final void z(java.lang.String merchantId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(merchantId, "merchantId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376376d;
        java.util.Iterator it = activityC13064xaf775f76.f176725u.iterator();
        while (it.hasNext()) {
            iu1.a aVar = (iu1.a) it.next();
            r45.wt wtVar = aVar.f376364a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wtVar != null ? wtVar.f470960d : null, merchantId)) {
                activityC13064xaf775f76.f176725u.remove(aVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = activityC13064xaf775f76.f176716i;
                if (c12808x5de4409f == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c12808x5de4409f.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                    return;
                }
                return;
            }
        }
        java.util.Iterator it6 = activityC13064xaf775f76.f176726v.iterator();
        while (it6.hasNext()) {
            iu1.a aVar2 = (iu1.a) it6.next();
            r45.wt wtVar2 = aVar2.f376364a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wtVar2 != null ? wtVar2.f470960d : null, merchantId)) {
                activityC13064xaf775f76.f176726v.remove(aVar2);
                if (activityC13064xaf775f76.f176726v.size() == 0) {
                    activityC13064xaf775f76.f176728x = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = activityC13064xaf775f76.f176716i;
                    if (c12808x5de4409f2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                        throw null;
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c12808x5de4409f2.mo7946xf939df19();
                    if (mo7946xf939df192 != null) {
                        mo7946xf939df192.m8146xced61ae5();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        iu1.m holder = (iu1.m) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if ((!payloads.isEmpty()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(payloads.get(0), java.lang.Boolean.TRUE)) {
            iu1.a x17 = x(i17);
            if (x17 != null) {
                holder.y(x17, i17, false);
                return;
            }
            return;
        }
        super.mo8157xe5e2e48d(holder, i17, payloads);
    }
}
