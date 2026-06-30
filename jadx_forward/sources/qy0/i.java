package qy0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 f449126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449126e = c11004x58386388;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qy0.i(this.f449126e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        java.util.LinkedList<r45.mh4> linkedList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f449125d;
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388 = this.f449126e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.List list = c11004x58386388.f151276e;
            long j17 = c11004x58386388.f151282n;
            this.f449125d = 1;
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new xy0.a(list, 60000L, 10L, j17, 10, null), this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
        }
        r45.jh4 jh4Var = (r45.jh4) g17;
        java.util.ArrayList arrayList = (java.util.ArrayList) c11004x58386388.f151280i;
        arrayList.clear();
        java.util.LinkedList linkedList2 = jh4Var != null ? jh4Var.f459346e : null;
        java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> list2 = kz5.p0.f395529d;
        if (linkedList2 == null) {
            linkedList2 = list2;
        }
        arrayList.addAll(linkedList2);
        c11004x58386388.f151282n = jh4Var != null ? jh4Var.f459345d : 0L;
        if (jh4Var != null && (linkedList = jh4Var.f459346e) != null) {
            list2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.mh4 mh4Var : linkedList) {
                java.lang.String valueOf = java.lang.String.valueOf(mh4Var.f462041d);
                java.lang.String str = mh4Var.f462046i;
                java.util.LinkedList singer_name = mh4Var.f462047m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singer_name, "singer_name");
                java.lang.String g07 = kz5.n0.g0(singer_name, null, null, null, 0, null, null, 63, null);
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a();
                java.util.LinkedList lyrics = mh4Var.f462048n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lyrics, "lyrics");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(lyrics, 10));
                java.util.Iterator it = lyrics.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90(null, null, ((r45.nh4) it.next()).f462933e, null));
                }
                list2.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356(valueOf, str, g07, c4128x879fba0a, arrayList2.toArray(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[0])));
            }
        }
        ((n0.q4) c11004x58386388.f151277f).mo148714x53d8522f(list2);
        for (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 : list2) {
            java.util.Map map = c11004x58386388.f151285q.f504334k;
            java.lang.String m33856x92013dca = c4116xf4b2c356.m33856x92013dca();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33856x92013dca, "getMusicID(...)");
            map.put(m33856x92013dca, new java.lang.Long(c11004x58386388.f151282n));
        }
        if (!list2.isEmpty()) {
            ((n0.q4) c11004x58386388.f151278g).mo148714x53d8522f(kz5.n0.X(list2));
        }
        return jz5.f0.f384359a;
    }
}
