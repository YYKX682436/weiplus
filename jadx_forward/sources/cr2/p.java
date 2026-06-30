package cr2;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f303406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f303407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f303409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cr2.x xVar, com.p314xaae8f345.mm.p944x882e457a.f fVar, yz5.l lVar, boolean z17, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f303406d = xVar;
        this.f303407e = fVar;
        this.f303408f = lVar;
        this.f303409g = z17;
        this.f303410h = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cr2.p(this.f303406d, this.f303407e, this.f303408f, this.f303409g, this.f303410h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cr2.p pVar = (cr2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        java.util.LinkedList<r45.fa2> linkedList;
        java.util.LinkedList linkedList2;
        r45.s92 s92Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cr2.x xVar = this.f303406d;
        java.lang.String str = xVar.f303434g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f303407e;
        sb6.append(fVar.f152148a);
        sb6.append(" errCode=");
        sb6.append(fVar.f152149b);
        sb6.append(" themeId: ");
        sb6.append(xVar.f303432e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int i17 = fVar.f152148a;
        yz5.l lVar = this.f303408f;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.yz2 yz2Var = (r45.yz2) fVar.f152151d;
            xVar.f303447t = yz2Var;
            boolean z18 = lVar == null && this.f303409g;
            xVar.getClass();
            java.lang.String str2 = xVar.f303434g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "#transResponseToListData cleanCurrent=" + z18);
            if (yz2Var != null && (s92Var = yz2Var.f473062s) != null) {
                xVar.a(s92Var.m75939xb282bd08(0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "transResponseToListData: bottomExtraInfo=" + s92Var.m75939xb282bd08(1));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.AbstractC14565x91bfdb1c abstractC14565x91bfdb1c = xVar.f303446s;
                if (abstractC14565x91bfdb1c != null) {
                    abstractC14565x91bfdb1c.m58449xfb021631(s92Var.m75939xb282bd08(1));
                }
            }
            java.util.ArrayList arrayList = xVar.f303444q;
            if (z18) {
                int size = arrayList.size();
                arrayList.clear();
                cr2.a aVar2 = xVar.f303445r;
                if (aVar2 != null) {
                    aVar2.m8154xdb81fc7f(0, size);
                }
            }
            java.util.List c17 = xVar.c();
            int i18 = 10;
            int i19 = 2;
            if (yz2Var != null && (linkedList2 = yz2Var.f473050d) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    java.util.LinkedList card_list = ((r45.fa2) it.next()).f455662h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.util.Iterator it6 = card_list.iterator();
                    while (it6.hasNext()) {
                        r45.ea2 ea2Var = (r45.ea2) it6.next();
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
                        if (((java.util.ArrayList) c17).contains(java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L))) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("id=");
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
                            sb8.append(c19792x256d27252 != null ? java.lang.Long.valueOf(c19792x256d27252.m76784x5db1b11()) : null);
                            sb8.append(" name=");
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
                            sb8.append(c19792x256d27253 != null ? c19792x256d27253.m76801x8010e5e4() : null);
                            sb7.append(sb8.toString() + '\n');
                            it6.remove();
                        }
                    }
                    java.lang.String sb9 = sb7.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb9);
                    if (!(sb9.length() > 0)) {
                        sb9 = null;
                    }
                    if (sb9 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "#checkAndRemoveDuplicateData remove: ".concat(sb9));
                        int i27 = sp2.y3.f492825a;
                        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                }
            }
            r45.yz2 yz2Var2 = xVar.f303447t;
            boolean z19 = yz2Var2 != null ? yz2Var2.f473057n : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "#transResponseToListData skipAsyncLoadLiveInfo=" + z19);
            if (yz2Var != null && (linkedList = yz2Var.f473050d) != null) {
                for (r45.fa2 fa2Var : linkedList) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("#transResponseToListData container.type=");
                    sb10.append(fa2Var.f455659e);
                    sb10.append(" container.container_id=");
                    sb10.append(fa2Var.f455658d);
                    sb10.append(" container.card_list.size=");
                    java.util.LinkedList<r45.ea2> linkedList3 = fa2Var.f455662h;
                    sb10.append(linkedList3.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb10.toString());
                    int i28 = fa2Var.f455659e;
                    if (i28 == 4 || i28 == i18 || i28 == 11) {
                        for (r45.ea2 ea2Var2 : linkedList3) {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var2.m75936x14adae67(i19);
                            if (c19792x256d27254 != null) {
                                cu2.t tVar = cu2.u.f303974a;
                                java.util.List c18 = kz5.b0.c(c19792x256d27254);
                                int d17 = hc2.d0.d(0);
                                r45.qt2 qt2Var = xVar.f303443p;
                                if (qt2Var == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                                    throw null;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) kz5.n0.Z(tVar.j(c18, d17, qt2Var));
                                if (c14994x9b99c079 != null) {
                                    int m75939xb282bd08 = ea2Var2.m75939xb282bd08(1);
                                    if (m75939xb282bd08 == 4) {
                                        arrayList.add(new vp2.d0(c14994x9b99c079, ea2Var2, fa2Var, ea2Var2.m75945x2fec8307(8), z19));
                                    } else if (m75939xb282bd08 == 13) {
                                        arrayList.add(new vp2.i0(c14994x9b99c079, ea2Var2, fa2Var, ea2Var2.m75945x2fec8307(8), z19));
                                    }
                                }
                            }
                            cr2.a aVar3 = xVar.f303445r;
                            if (aVar3 != null) {
                                aVar3.m8149x8b456734(arrayList.size() - 1);
                            }
                            i19 = 2;
                        }
                    }
                    i18 = 10;
                    i19 = 2;
                }
            }
            xVar.f303452y.R6(((r45.yz2) fVar.f152151d).f473066w * 1000);
            z17 = true;
        } else {
            z17 = false;
        }
        if (lVar != null) {
            lVar.mo146xb9724478(fVar);
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = xVar.f303441n;
            if (c22851x22587864 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x22587864.i(z17);
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = xVar.f303441n;
            if (c22851x225878642 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x225878642.e(z17);
        }
        yz5.l lVar2 = this.f303410h;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(fVar);
        }
        return jz5.f0.f384359a;
    }
}
