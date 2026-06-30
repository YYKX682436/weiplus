package lr1;

/* loaded from: classes9.dex */
public class s implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f402234d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f402235e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f402236f = new java.util.LinkedList();

    public s() {
        gm0.j1.d().a(387, this);
        gm0.j1.d().g(new lr1.e0());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(int r8) {
        /*
            r7 = this;
            java.lang.Class<bw.k> r0 = bw.k.class
            r1 = 0
            java.lang.String r2 = "fromList"
            java.util.List r3 = r7.f402236f
            r4 = 1
            if (r8 == 0) goto L4f
            if (r8 == r4) goto L15
            r0 = 2
            if (r8 == r0) goto L11
            goto L8a
        L11:
            java.util.List r3 = r7.f402235e
            goto L8a
        L15:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r3.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r2.next()
            r5 = r3
            r45.co r5 = (r45.co) r5
            qk.o r6 = r5.f453211f
            boolean r6 = r6.Q0()
            if (r6 == 0) goto L48
            i95.m r6 = i95.n0.c(r0)
            bw.k r6 = (bw.k) r6
            java.lang.String r5 = r5.f453209d
            zv.e2 r6 = (zv.e2) r6
            boolean r5 = r6.Bi(r5)
            if (r5 == 0) goto L48
            r5 = r4
            goto L49
        L48:
            r5 = r1
        L49:
            if (r5 == 0) goto L21
            r8.add(r3)
            goto L21
        L4f:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r3.iterator()
        L5b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r2.next()
            r5 = r3
            r45.co r5 = (r45.co) r5
            qk.o r6 = r5.f453211f
            boolean r6 = r6.T0()
            if (r6 == 0) goto L82
            i95.m r6 = i95.n0.c(r0)
            bw.k r6 = (bw.k) r6
            java.lang.String r5 = r5.f453209d
            zv.e2 r6 = (zv.e2) r6
            boolean r5 = r6.Bi(r5)
            if (r5 == 0) goto L82
            r5 = r4
            goto L83
        L82:
            r5 = r1
        L83:
            if (r5 == 0) goto L5b
            r8.add(r3)
            goto L5b
        L89:
            r3 = r8
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.s.a(int):java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.List<r45.co> list;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandService.BrandServiceMgr", "on scene end code(%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 387) {
            java.util.LinkedList linkedList = ((lr1.e0) m1Var).f402189f;
            if (linkedList == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BrandServiceMgr", "nameList is null.");
                return;
            }
            java.util.List<r45.co> list2 = this.f402235e;
            if (list2 == null || (list = this.f402236f) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BrandServiceMgr", "enterpriseItemList or subscribeAndServiceItemList is null.");
                return;
            }
            boolean z18 = true;
            if (linkedList.size() == ((java.util.LinkedList) list2).size() + ((java.util.LinkedList) list).size()) {
                for (r45.co coVar : list2) {
                    if (coVar == null || !linkedList.contains(coVar.f453209d)) {
                        z17 = true;
                        break;
                    }
                }
                z17 = false;
                if (!z17) {
                    for (r45.co coVar2 : list) {
                        if (coVar2 == null || !linkedList.contains(coVar2.f453209d)) {
                            break;
                        }
                    }
                }
                z18 = z17;
            }
            if (z18) {
                java.util.Iterator it = this.f402234d.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1) ((lr1.r) it.next())).i();
                }
            }
        }
    }
}
