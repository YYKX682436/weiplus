package us2;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt3.r f512036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f512037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f512038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f512039h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ us2.d f512040i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vt3.r rVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18, us2.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512036e = rVar;
        this.f512037f = gVar;
        this.f512038g = i17;
        this.f512039h = i18;
        this.f512040i = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new us2.l(this.f512036e, this.f512037f, this.f512038g, this.f512039h, this.f512040i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        java.lang.Object g18;
        rt3.a aVar;
        us2.a aVar2;
        us2.b bVar;
        pz5.a aVar3 = pz5.a.f440719d;
        int i17 = this.f512035d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f512036e.f521575d) {
                rt3.e eVar = us2.u.f512092l;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f512037f;
                this.f512035d = 1;
                eVar.getClass();
                g18 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new rt3.c(eVar, gVar, null), this);
                if (g18 == aVar3) {
                    return aVar3;
                }
                aVar = (rt3.a) g18;
            } else {
                rt3.e eVar2 = us2.u.f512092l;
                int i18 = this.f512038g;
                int i19 = this.f512039h;
                vt3.n nVar = new vt3.n(null, null, null, null, 8, null);
                java.lang.Long l17 = new java.lang.Long(this.f512040i.f512009a);
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f512037f;
                this.f512035d = 2;
                eVar2.getClass();
                g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new rt3.b(i18, 0, i19, nVar, eVar2, l17, gVar2, null), this);
                if (g17 == aVar3) {
                    return aVar3;
                }
                aVar = (rt3.a) g17;
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g18 = obj;
            aVar = (rt3.a) g18;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
            aVar = (rt3.a) g17;
        }
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "load more data failed");
            return null;
        }
        java.lang.Object obj2 = us2.u.f512087g;
        int i27 = this.f512038g;
        us2.d dVar = this.f512040i;
        synchronized (obj2) {
            java.util.Map map = (java.util.Map) ((java.util.HashMap) us2.u.f512088h).get(new java.lang.Integer(i27));
            if (map != null && (aVar2 = (us2.a) map.get(dVar)) != null && (bVar = aVar2.f512001b) != null) {
                java.util.ArrayList arrayList = aVar.f481041a;
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : arrayList) {
                    if (hashSet.add(((vt3.p) obj3).f521553b)) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    boolean z18 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    vt3.p pVar = (vt3.p) next;
                    java.util.List list = bVar.f512004c;
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        java.util.Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it6.next()).f521553b, pVar.f521553b)) {
                                break;
                            }
                        }
                    }
                    z18 = true;
                    if (z18) {
                        arrayList3.add(next);
                    }
                }
                int size = bVar.f512004c.size();
                int size2 = arrayList3.size();
                boolean z19 = aVar.f481043c == 0;
                bVar.f512005d = aVar.f481044d;
                bVar.f512006e = z19;
                bVar.f512004c.addAll(arrayList3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("getOrCreateLoadMoreJob: reachEnd: ");
                if (!z19) {
                    z17 = false;
                }
                sb6.append(z17);
                sb6.append(", currentSize: ");
                sb6.append(size);
                sb6.append(", newPageSize: ");
                sb6.append(size2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", sb6.toString());
                return arrayList3;
            }
            return null;
        }
    }
}
