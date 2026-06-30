package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f257333d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f257335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f257335f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z0(this.f257335f, interfaceC29045xdcb5ca57);
        z0Var.f257334e = obj;
        return z0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        java.util.List list;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 b1Var;
        long j18;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 b1Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i19 = this.f257333d;
        java.util.List list2 = this.f257335f;
        java.lang.Object[] objArr = null;
        int i27 = 1;
        if (i19 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f257334e;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y0((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) it.next(), null), 3, null));
            }
            this.f257333d = 1;
            a17 = p3325xe03a0797.p3326xc267989b.h.a(arrayList, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i19 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        java.util.List V = kz5.n0.V((java.lang.Iterable) a17);
        int i28 = 0;
        for (java.lang.Object obj2 : V) {
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 b1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) list2.get(i28);
            int i37 = i1Var.f257150b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem editItem = i1Var.f257159k;
            if (i37 == i27) {
                list = list2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ImageSource");
                editItem.f37770x368f3a = i27;
                j17 = 4000;
                b1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0) b1Var3;
            } else if (i37 != 2) {
                java.lang.String str = "unknown track type:" + i1Var.f257150b;
                int i38 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SourceMaterial", str, objArr);
                list = list2;
                j17 = 0;
                b1Var2 = b1Var3;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoSource");
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1 q1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1) b1Var3;
                list = list2;
                j17 = q1Var.f257248f;
                long j19 = j17 <= 60000 ? j17 : 60000L;
                editItem.f37770x368f3a = 2;
                j18 = j19;
                b1Var = q1Var;
                i1Var.d(0L);
                i1Var.c(j18);
                editItem.f37767xaa09dada = j17;
                editItem.f37769x2a5f0245 = j17;
                i17 = b1Var.f257101a;
                i18 = b1Var.f257102b;
                if (i17 <= 1080 || i18 > 1280) {
                    float max = java.lang.Math.max((i17 * 1.0f) / 1080, (i18 * 1.0f) / 1280);
                    i1Var.f257154f = (int) (b1Var.f257101a / max);
                    i1Var.f257155g = (int) (i18 / max);
                    i1Var.f257156h = max;
                } else {
                    i1Var.f257154f = i17;
                    i1Var.f257155g = i18;
                }
                i28 = i29;
                list2 = list;
                objArr = null;
                i27 = 1;
            }
            j18 = j17;
            b1Var = b1Var2;
            i1Var.d(0L);
            i1Var.c(j18);
            editItem.f37767xaa09dada = j17;
            editItem.f37769x2a5f0245 = j17;
            i17 = b1Var.f257101a;
            i18 = b1Var.f257102b;
            if (i17 <= 1080) {
            }
            float max2 = java.lang.Math.max((i17 * 1.0f) / 1080, (i18 * 1.0f) / 1280);
            i1Var.f257154f = (int) (b1Var.f257101a / max2);
            i1Var.f257155g = (int) (i18 / max2);
            i1Var.f257156h = max2;
            i28 = i29;
            list2 = list;
            objArr = null;
            i27 = 1;
        }
        rm5.i iVar = rm5.j.f479031v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(V, 10));
        java.util.Iterator it6 = V.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it6.next()).f257160l);
        }
        iVar.a(arrayList2);
        return V;
    }
}
