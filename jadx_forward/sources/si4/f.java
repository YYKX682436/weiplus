package si4;

/* loaded from: classes11.dex */
public final class f implements si4.a {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f489854a;

    /* renamed from: b, reason: collision with root package name */
    public final si4.a f489855b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f489856c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f489857d;

    public f(l75.k0 db6, si4.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f489854a = db6;
        this.f489855b = aVar;
        this.f489856c = jz5.h.b(new si4.d(this));
        this.f489857d = new java.util.HashMap();
    }

    @Override // si4.a
    public void a(java.lang.String str, java.lang.String str2) {
        si4.a aVar = this.f489855b;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    @Override // si4.a
    public mj4.h b(java.lang.String str) {
        return x().z0(str);
    }

    @Override // si4.a
    public boolean c(java.lang.String userName, int i17) {
        mj4.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        si4.a aVar2 = this.f489855b;
        if (aVar2 != null) {
            aVar2.c(userName, i17);
        }
        mj4.v x17 = x();
        x17.getClass();
        boolean z17 = x17.f408615d.mo70514xb06685ab("TextStatus", "UserName = ? and CreateTime<?", new java.lang.String[]{userName, java.lang.String.valueOf(i17)}) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "deleteByCreateTime " + userName + ' ' + i17 + ", " + z17);
        if (z17 && (aVar = (mj4.a) x17.y0().get(userName)) != null && aVar.f76512x81959a6e < i17) {
            x17.y0().remove(userName);
            x17.mo145247xf35bbb4(userName);
        }
        return z17;
    }

    @Override // qi4.a
    public void d(qi4.b observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        si4.e eVar = new si4.e(observer);
        x().add(eVar);
        this.f489857d.put(observer, eVar);
    }

    @Override // si4.a
    public int e() {
        mj4.v x17 = x();
        java.util.Collection<mj4.a> values = x17.y0().values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (mj4.a aVar : values) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            java.util.LinkedList linkedList = xe0.j0.a(new mj4.k(aVar), false, 1, null).f436759t;
            if (!(linkedList == null || linkedList.isEmpty())) {
                if (!(linkedList == null || linkedList.isEmpty())) {
                    java.lang.String str = ((pj4.x) linkedList.get(linkedList.size() - 1)).f436858g;
                    if (str == null || str.length() == 0) {
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "NewClusterId invalid %s", aVar.f76535x11b86abb);
            java.util.Collection<mj4.a> values2 = x17.y0().values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
            for (mj4.a aVar2 : values2) {
                java.lang.String str2 = aVar2.f76509x338ecf90;
                if (str2 == null || r26.n0.N(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "cluster invalid %s", aVar2.f76535x11b86abb);
                    return 0;
                }
            }
            return 1;
        }
        return 1;
    }

    @Override // si4.a
    public java.util.List f(java.lang.String str, java.lang.String str2, boolean z17) {
        if (z17) {
            mj4.v x17 = x();
            x17.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (mj4.a aVar : x17.y0().values()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                mj4.k kVar = new mj4.k(aVar);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.h()) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, kVar.o())) {
                    if (!kVar.w() && !android.text.TextUtils.isEmpty(kVar.c())) {
                        ai4.e eVar = (ai4.e) hashMap.get(kVar.c());
                        if (eVar == null) {
                            java.lang.String c17 = kVar.c();
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(kVar);
                            hashMap.put(kVar.c(), new ai4.e(c17, linkedList));
                        } else {
                            eVar.f86668b.add(kVar);
                        }
                    }
                    for (ai4.e eVar2 : hashMap.values()) {
                        eVar2.getClass();
                        eVar2.f86668b = new java.util.LinkedList(kz5.n0.F0(eVar2.f86668b, new ai4.d()));
                    }
                }
            }
            return new java.util.LinkedList(kz5.n0.F0(hashMap.values(), new mj4.u()));
        }
        mj4.v x18 = x();
        x18.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (mj4.a aVar2 : x18.y0().values()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
            mj4.k kVar2 = new mj4.k(aVar2);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar2.c()) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, kVar2.o())) {
                if (!kVar2.w() && !android.text.TextUtils.isEmpty(kVar2.c())) {
                    ai4.e eVar3 = (ai4.e) hashMap2.get(kVar2.c());
                    if (eVar3 == null) {
                        java.lang.String c18 = kVar2.c();
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        linkedList2.add(kVar2);
                        hashMap2.put(kVar2.c(), new ai4.e(c18, linkedList2));
                    } else {
                        eVar3.f86668b.add(kVar2);
                    }
                }
                for (ai4.e eVar4 : hashMap2.values()) {
                    eVar4.getClass();
                    eVar4.f86668b = new java.util.LinkedList(kz5.n0.F0(eVar4.f86668b, new ai4.d()));
                }
            }
        }
        return new java.util.LinkedList(kz5.n0.F0(hashMap2.values(), new mj4.t()));
    }

    @Override // si4.a
    public java.util.List h(java.lang.String str, java.util.ArrayList arrayList) {
        mj4.v x17 = x();
        x17.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!(str == null || r26.n0.N(str))) {
            for (mj4.a aVar : x17.y0().values()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                mj4.k kVar = new mj4.k(aVar);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.h(), str) && !kVar.w() && (arrayList == null || !arrayList.contains(kVar.o()))) {
                    arrayList2.add(kVar);
                }
            }
            if (arrayList2.size() > 1) {
                kz5.g0.t(arrayList2, new mj4.r());
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    @Override // si4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mj4.h i(java.lang.String r3, int r4) {
        /*
            r2 = this;
            mj4.v r0 = r2.x()
            r0.getClass()
            r1 = 0
            if (r3 == 0) goto L34
            if (r4 > 0) goto Ld
            goto L34
        Ld:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            l75.k0 r4 = r0.f408615d
            java.lang.String r0 = "select rowid, * from TextStatus where UserName = ? and CreateTime = ?"
            android.database.Cursor r3 = r4.B(r0, r3)
            if (r3 == 0) goto L34
            boolean r4 = r3.moveToNext()
            if (r4 == 0) goto L2f
            mj4.a r4 = new mj4.a
            r4.<init>()
            r4.mo9015xbf5d97fd(r3)
            goto L30
        L2f:
            r4 = r1
        L30:
            r3.close()
            goto L35
        L34:
            r4 = r1
        L35:
            if (r4 != 0) goto L38
            return r1
        L38:
            mj4.k r3 = new mj4.k
            r3.<init>(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: si4.f.i(java.lang.String, int):mj4.h");
    }

    @Override // si4.a
    public void j(java.lang.String str, java.lang.String str2, boolean z17) {
        si4.a aVar = this.f489855b;
        if (aVar != null) {
            aVar.j(str, str2, z17);
        }
        mj4.v x17 = x();
        x17.getClass();
        boolean z18 = true;
        boolean z19 = false;
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                mj4.h z07 = x17.z0(str);
                if (z07 != null) {
                    mj4.k kVar = (mj4.k) z07;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.o(), str)) {
                        int i17 = kVar.f408600b.f76549x29d3a50c;
                        mj4.h.f408597a.getClass();
                        int i18 = mj4.g.f408596c;
                        if (i17 != i18) {
                            mj4.j jVar = new mj4.j(kVar);
                            jVar.f(i18);
                            mj4.a aVar2 = ((mj4.k) jVar.a()).f408600b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.storage.BuzDbTextStatus");
                            x17.mo9952xce0038c9(aVar2, new java.lang.String[0]);
                            z19 = z18;
                        }
                    }
                    z18 = false;
                    z19 = z18;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "markReadByStatusId " + str + ", " + str2 + ", " + z19);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "markReadByStatusId: failed, " + str + ", " + str2);
    }

    @Override // si4.a
    public boolean l(mj4.h item, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        si4.a aVar = this.f489855b;
        if (aVar != null) {
            si4.a.r(aVar, item, false, 2, null);
        }
        mj4.a aVar2 = ((mj4.k) item).f408600b;
        mj4.a aVar3 = aVar2 instanceof mj4.a ? aVar2 : null;
        if (aVar3 != null) {
            return x().mo9952xce0038c9(aVar3, new java.lang.String[0]);
        }
        return false;
    }

    @Override // si4.a
    public boolean n(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        si4.a aVar = this.f489855b;
        if (aVar != null) {
            aVar.n(userName);
        }
        mj4.v x17 = x();
        x17.getClass();
        boolean z17 = x17.f408615d.mo70514xb06685ab("TextStatus", "UserName = ?", new java.lang.String[]{userName}) > 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.TextStatusStorage", "deleteByUserName " + userName + ' ' + z17, new java.lang.Object[0]);
        if (z17) {
            x17.y0().remove(userName);
            x17.mo145247xf35bbb4(userName);
        }
        return z17;
    }

    @Override // si4.a
    public int o(java.lang.String str) {
        int i17 = 0;
        for (mj4.a aVar : x().y0().values()) {
            if (!aVar.t0() && !aVar.f76535x11b86abb.equals(str)) {
                i17++;
            }
        }
        return i17;
    }

    @Override // si4.a
    public boolean p(mj4.h item, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        si4.a aVar = this.f489855b;
        if (aVar != null) {
            si4.a.m(aVar, item, false, 2, null);
        }
        mj4.a aVar2 = ((mj4.k) item).f408600b;
        mj4.a aVar3 = aVar2 instanceof mj4.a ? aVar2 : null;
        if (aVar3 != null) {
            return x().mo880xb970c2b9(aVar3);
        }
        return false;
    }

    @Override // si4.a
    public java.util.List q(java.lang.String str) {
        mj4.a aVar;
        mj4.v x17 = x();
        x17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!(str == null || str.length() == 0) && x17.y0().containsKey(str) && (aVar = (mj4.a) x17.y0().get(str)) != null && !aVar.t0()) {
            arrayList.add(new mj4.k(aVar));
        }
        return arrayList;
    }

    @Override // si4.a
    public boolean s(mj4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        si4.a aVar = this.f489855b;
        if (aVar != null) {
            aVar.s(item);
        }
        mj4.a aVar2 = ((mj4.k) item).f408600b;
        if (!(aVar2 instanceof mj4.a)) {
            aVar2 = null;
        }
        if (aVar2 != null) {
            return x().mo11260x413cb2b4(aVar2);
        }
        return false;
    }

    @Override // si4.a
    public mj4.h t(java.lang.String statusId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        mj4.v x17 = x();
        x17.getClass();
        for (mj4.a aVar : x17.y0().values()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f76532x70371252, statusId) && !aVar.t0()) {
                return new mj4.k(aVar);
            }
        }
        return null;
    }

    @Override // si4.a
    public boolean u(java.lang.String userName, java.lang.String statusId) {
        mj4.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        si4.a aVar2 = this.f489855b;
        if (aVar2 != null) {
            aVar2.u(userName, statusId);
        }
        mj4.v x17 = x();
        x17.getClass();
        boolean z17 = x17.f408615d.mo70514xb06685ab("TextStatus", "StatusID = ?", new java.lang.String[]{statusId}) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "deleteByStatusId: " + z17 + ", " + userName + ", " + statusId + ", " + z17);
        if (z17 && (aVar = (mj4.a) x17.y0().get(userName)) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f76532x70371252, statusId)) {
            x17.y0().remove(userName);
            x17.mo145247xf35bbb4(userName);
        }
        return z17;
    }

    @Override // si4.a
    public boolean v() {
        mj4.v x17 = x();
        x17.getClass();
        java.lang.String a17 = en1.a.a();
        java.util.Iterator it = x17.y0().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            mj4.a aVar = (mj4.a) it.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f76535x11b86abb, a17) && !aVar.t0()) {
                int i17 = aVar.f76549x29d3a50c;
                mj4.h.f408597a.getClass();
                if (!(i17 == mj4.g.f408596c)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "hasOtherFriendsStatusUnRead: " + aVar.f76532x70371252 + ", " + aVar.f76535x11b86abb);
                    return true;
                }
            }
        }
    }

    @Override // si4.a
    public java.util.List w(java.lang.String str, java.util.ArrayList arrayList) {
        mj4.v x17 = x();
        x17.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!(str == null || r26.n0.N(str))) {
            for (mj4.a aVar : x17.y0().values()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                mj4.k kVar = new mj4.k(aVar);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.c(), str) && !kVar.w() && (arrayList == null || !arrayList.contains(kVar.o()))) {
                    arrayList2.add(kVar);
                }
            }
            if (arrayList2.size() > 1) {
                kz5.g0.t(arrayList2, new mj4.s());
            }
        }
        return arrayList2;
    }

    public final mj4.v x() {
        return (mj4.v) ((jz5.n) this.f489856c).mo141623x754a37bb();
    }
}
