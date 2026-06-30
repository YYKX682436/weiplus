package dz0;

/* loaded from: classes5.dex */
public final class d2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f326350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.n7 n7Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f326348e = c11015x5b190a3b;
        this.f326349f = n7Var;
        this.f326350g = z17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17 = this.f326350g;
        dz0.d2 d2Var = new dz0.d2(this.f326348e, this.f326349f, z17, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        d2Var.f326347d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        d2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((java.lang.Throwable) this.f326347d) == null) {
            com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326348e;
            c11015x5b190a3b.t7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33391x2f60e70 = this.f326349f.f97275a.m33391x2f60e70();
            if (m33391x2f60e70 != null) {
                dz0.x xVar = c11015x5b190a3b.f151322m;
                xVar.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMusicInfo: on ");
                sb6.append(java.lang.Thread.currentThread().getName());
                sb6.append(", replaceLastInsert ");
                boolean z17 = this.f326350g;
                sb6.append(z17);
                sb6.append(", Id=");
                sb6.append(m33391x2f60e70.m33856x92013dca());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
                m33391x2f60e70.m33858xd75a8eb6();
                m33391x2f60e70.m33856x92013dca();
                p012xc85e97e9.p093xedfae76a.g0 g0Var = xVar.f326585c;
                java.util.List list = (java.util.List) g0Var.mo3195x754a37bb();
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext() && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) it.next()).m33856x92013dca(), m33391x2f60e70.m33856x92013dca())) {
                    }
                }
                java.util.List list2 = (java.util.List) g0Var.mo3195x754a37bb();
                java.lang.Object obj2 = null;
                if (list2 != null) {
                    java.util.Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) next).m33856x92013dca(), m33391x2f60e70.m33856x92013dca())) {
                            obj2 = next;
                            break;
                        }
                    }
                    obj2 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj2;
                }
                if (obj2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: insert other music");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(m33391x2f60e70);
                    java.util.List list3 = (java.util.List) g0Var.mo3195x754a37bb();
                    if (list3 != null) {
                        arrayList.addAll(list3);
                    }
                    if (z17) {
                        java.util.Iterator it7 = arrayList.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it7.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) it7.next()).m33856x92013dca(), xVar.f326589g)) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: remove i=" + i17 + " lastInsertMusicId=" + xVar.f326589g);
                            arrayList.remove(i17);
                        }
                    }
                    java.lang.String m33856x92013dca = m33391x2f60e70.m33856x92013dca();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33856x92013dca, "getMusicID(...)");
                    xVar.f326589g = m33856x92013dca;
                    p012xc85e97e9.p093xedfae76a.j0 j0Var = xVar.f326583a;
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        java.lang.Object next2 = it8.next();
                        if (hashSet.add(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) next2).m33856x92013dca())) {
                            arrayList2.add(next2);
                        }
                    }
                    j0Var.mo7808x76db6cb1(arrayList2);
                }
                xVar.f326584b.mo7808x76db6cb1(m33391x2f60e70);
            }
        }
        return jz5.f0.f384359a;
    }
}
