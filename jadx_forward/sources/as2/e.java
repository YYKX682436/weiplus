package as2;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f94973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f94974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ as2.g f94975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, r45.qt2 qt2Var, as2.g gVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94973d = hVar;
        this.f94974e = qt2Var;
        this.f94975f = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new as2.e(this.f94973d, interfaceC29045xdcb5ca57, this.f94974e, this.f94975f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        as2.e eVar = (as2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.aa1 aa1Var = (r45.aa1) ((xg2.i) this.f94973d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestBackupList success list:");
        java.util.LinkedList m75941xfb821914 = aa1Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            arrayList.add(hc2.o0.m((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSharePageBackupUIC", sb6.toString());
        cu2.t tVar = cu2.u.f303974a;
        java.util.LinkedList m75941xfb8219142 = aa1Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
        r45.qt2 qt2Var = this.f94974e;
        java.util.List j17 = tVar.j(m75941xfb8219142, 1, qt2Var);
        java.util.Iterator it6 = j17.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).cl(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()).getFeedObject(), qt2Var);
        }
        java.util.LinkedList m75941xfb8219143 = aa1Var.m75941xfb821914(18);
        as2.g gVar = this.f94975f;
        gVar.f94997e = m75941xfb8219143;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it7 = j17.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it7.next());
            p17.b2(true);
            p17.X0(true);
            arrayList2.add(p17);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        gVar.f94996d.clear();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = gVar.f94996d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                arrayList3.add(obj2);
            }
        }
        copyOnWriteArrayList.addAll(arrayList3);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("requestBackupList backupList:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = gVar.f94996d;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList2, 10));
        java.util.Iterator it8 = copyOnWriteArrayList2.iterator();
        while (it8.hasNext()) {
            arrayList4.add(hc2.b0.f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it8.next(), true));
        }
        sb7.append(arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSharePageBackupUIC", sb7.toString());
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5530xa6d73130().e();
        return jz5.f0.f384359a;
    }
}
