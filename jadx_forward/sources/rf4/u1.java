package rf4;

/* loaded from: classes4.dex */
public final class u1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf4.a f476646b;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331, gf4.a aVar) {
        this.f476645a = c18486xb54a9331;
        this.f476646b = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.Integer num;
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.ArrayList arrayList3;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        int i17;
        if (z17) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331.H;
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476645a;
            c18486xb54a9331.getClass();
            gf4.l lVar = gf4.l.f352887d;
            gf4.a aVar = this.f476646b;
            lVar.e(aVar.f352866d, aVar.f352867e, c18486xb54a9331.com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String, aVar.f352864b);
            if4.a aVar2 = c18486xb54a9331.f253552q;
            if (aVar2 == null || (linkedList2 = aVar2.f372773h) == null) {
                num = null;
            } else {
                java.util.Iterator it = linkedList2.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    gf4.a aVar3 = (gf4.a) it.next();
                    int i27 = aVar.f352867e;
                    if ((i27 == 0 || (i17 = aVar3.f352867e) == 0) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(aVar3.f352864b, aVar.f352864b) : i17 == i27) {
                        break;
                    } else {
                        i19++;
                    }
                }
                num = java.lang.Integer.valueOf(i19);
            }
            if (num == null || num.intValue() == -1) {
                return;
            }
            if4.a aVar4 = c18486xb54a9331.f253552q;
            if (aVar4 != null && (linkedList = aVar4.f372773h) != null) {
            }
            pf4.a0 a0Var = c18486xb54a9331.f253550o;
            if (a0Var != null && (arrayList3 = a0Var.f435371f) != null) {
            }
            boolean z18 = c18486xb54a9331.f253553r;
            java.util.ArrayList arrayList4 = c18486xb54a9331.f253551p;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList4.get(1);
                if4.a aVar5 = c18486xb54a9331.f253552q;
                if (aVar5 == null || (arrayList2 = aVar5.f372773h) == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                c18485x239212ef.c(arrayList2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList4.get(0);
                if4.a aVar6 = c18486xb54a9331.f253552q;
                if (aVar6 == null || (arrayList = aVar6.f372773h) == null) {
                    arrayList = new java.util.ArrayList();
                }
                c18485x239212ef2.c(arrayList);
            }
            if4.a aVar7 = c18486xb54a9331.f253552q;
            if (aVar7 != null) {
                c18486xb54a9331.f253549n.e(aVar7);
            }
        }
    }
}
