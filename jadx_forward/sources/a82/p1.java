package a82;

/* loaded from: classes11.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f83647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f83648e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f83649f;

    /* renamed from: g, reason: collision with root package name */
    public int f83650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83651h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f83652i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f83653m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83654n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f83655o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83656p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83657q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83658r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o72.o4 f83659s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.String str, long j17, int i17, java.lang.String str2, a82.u1 u1Var, java.lang.String str3, java.lang.String str4, java.lang.String str5, o72.o4 o4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83651h = str;
        this.f83652i = j17;
        this.f83653m = i17;
        this.f83654n = str2;
        this.f83655o = u1Var;
        this.f83656p = str3;
        this.f83657q = str4;
        this.f83658r = str5;
        this.f83659s = o4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a82.p1(this.f83651h, this.f83652i, this.f83653m, this.f83654n, this.f83655o, this.f83656p, this.f83657q, this.f83658r, this.f83659s, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.p1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83650g;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return obj;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download request: path=");
        java.lang.String str = this.f83651h;
        sb6.append(str);
        sb6.append(", size=");
        long j17 = this.f83652i;
        sb6.append(j17);
        sb6.append(", fieldType=");
        int i18 = this.f83653m;
        sb6.append(i18);
        sb6.append(", htmlId=");
        sb6.append(this.f83654n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", sb6.toString());
        a82.u1 u1Var = this.f83655o;
        if (a82.u1.Ai(u1Var, str, j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "file already exists and complete: " + str);
            return new o72.p4(1, "File already exists", str);
        }
        if (!u1Var.f83712f.containsKey(str)) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = u1Var.f83711e;
            if (!(concurrentLinkedQueue instanceof java.util.Collection) || !concurrentLinkedQueue.isEmpty()) {
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((a82.k1) it.next()).f83589f, str)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                boolean z18 = i18 == 4;
                java.lang.String str2 = com.p314xaae8f345.mm.vfs.w6.i(str, false) + ".fasttemp";
                long j18 = this.f83652i;
                java.lang.String str3 = this.f83656p;
                java.lang.String str4 = this.f83657q;
                java.lang.String str5 = this.f83658r;
                int i19 = this.f83653m;
                java.lang.String str6 = this.f83651h;
                java.lang.String str7 = this.f83654n;
                o72.o4 o4Var = this.f83659s;
                a82.k1 k1Var = new a82.k1(j18, str3, str4, str5, i19, str6, str2, z18, str7, 0, false, false, o4Var, new a82.o1(o4Var), 3584, null);
                this.f83647d = k1Var;
                this.f83648e = u1Var;
                this.f83649f = str;
                this.f83650g = 2;
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                u1Var.f83713g.put(str, rVar);
                u1Var.f83711e.offer(k1Var);
                rVar.m(new a82.n1(str, u1Var));
                if (u1Var.f83715i.compareAndSet(false, true)) {
                    p3325xe03a0797.p3326xc267989b.l.d(u1Var.f83710d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new a82.s1(u1Var, null), 2, null);
                }
                java.lang.Object j19 = rVar.j();
                pz5.a aVar2 = pz5.a.f440719d;
                return j19 == aVar ? aVar : j19;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavPublicCdnDownloadService", "task already exists: " + str);
        this.f83647d = u1Var;
        this.f83648e = str;
        this.f83650g = 1;
        p3325xe03a0797.p3326xc267989b.r rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar2.k();
        u1Var.f83713g.put(str, rVar2);
        rVar2.m(new a82.m1(u1Var, str));
        java.lang.Object j27 = rVar2.j();
        pz5.a aVar3 = pz5.a.f440719d;
        return j27 == aVar ? aVar : j27;
    }
}
