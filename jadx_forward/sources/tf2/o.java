package tf2;

/* loaded from: classes3.dex */
public final class o extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public km2.q f500472m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f500473n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f500473n = new java.util.ArrayList();
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        tf2.n nVar = (tf2.n) m56789x25fe639c(tf2.n.class);
        boolean z17 = false;
        if (nVar != null && nVar.f500471m) {
            z17 = true;
        }
        Z6(z17);
    }

    public final synchronized void Z6(boolean z17) {
        java.lang.Object obj;
        java.util.List list;
        java.lang.Object obj2;
        java.lang.Object obj3 = null;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            dk2.u4 u4Var = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).Z;
            if (u4Var != null && (list = u4Var.f315696j) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj4 : list) {
                    java.util.LinkedList m75941xfb821914 = ((r45.r22) obj4).m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj2).m75945x2fec8307(1), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410520q.f461834n)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    if (obj2 == null) {
                        arrayList2.add(obj4);
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.util.LinkedList m75941xfb8219142 = ((r45.r22) it6.next()).m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getMembers(...)");
                    arrayList.addAll(m75941xfb8219142);
                }
            }
            ((java.util.ArrayList) this.f500473n).clear();
            java.util.List list2 = this.f500473n;
            java.util.List list3 = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-anchorPkMicUserList>(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj5 : list3) {
                km2.q qVar = (km2.q) obj5;
                java.util.Iterator it7 = arrayList.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(1), qVar.f390703a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    arrayList3.add(obj5);
                }
            }
            ((java.util.ArrayList) list2).addAll(arrayList3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo pkAnchorBucket.size=" + ((java.util.ArrayList) this.f500473n).size());
            java.util.Iterator it8 = ((java.util.ArrayList) this.f500473n).iterator();
            while (it8.hasNext()) {
                km2.q qVar2 = (km2.q) it8.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo nickname=" + qVar2.f390706d + ", sdkuserid=" + qVar2.f390703a);
            }
            if (this.f500472m != null) {
                java.util.Iterator it9 = this.f500473n.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it9.next();
                    java.lang.String str = ((km2.q) next).f390703a;
                    km2.q qVar3 = this.f500472m;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, qVar3 != null ? qVar3.f390703a : null)) {
                        obj3 = next;
                        break;
                    }
                }
                if (obj3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo do not need replace. Now is " + this.f500472m);
                }
            }
            a7((km2.q) kz5.n0.w0(this.f500473n, c06.e.f119249d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo replace to " + this.f500472m);
        } else {
            ((java.util.ArrayList) this.f500473n).clear();
            a7(null);
        }
    }

    public final void a7(km2.q qVar) {
        java.lang.Object obj;
        java.util.Iterator it = this.f500473n.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, qVar != null ? qVar.f390703a : null)) {
                    break;
                }
            }
        }
        if (obj != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftTargetPickerController", "set currentPickUser find it. " + qVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftTargetPickerController", "set currentPickUser not found, set null. " + qVar);
            qVar = null;
        }
        this.f500472m = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }
}
