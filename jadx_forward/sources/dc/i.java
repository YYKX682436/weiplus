package dc;

/* loaded from: classes16.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final ec.a f310159a;

    /* renamed from: b, reason: collision with root package name */
    public int f310160b;

    /* renamed from: c, reason: collision with root package name */
    public dc.m f310161c;

    /* renamed from: d, reason: collision with root package name */
    public final fc.q f310162d = new fc.q();

    /* renamed from: e, reason: collision with root package name */
    public final fc.q f310163e = new fc.q();

    public i(ec.a aVar) {
        this.f310159a = aVar;
    }

    public final int a(dc.l lVar) {
        this.f310161c.a(new dc.k(lVar, h(), 0, null));
        return this.f310160b;
    }

    public final void b() {
        ec.a aVar = this.f310159a;
        ((ec.b) aVar).d();
        long h17 = h();
        ((ec.b) aVar).d();
        this.f310163e.s(h17, (java.lang.String) this.f310162d.n(h()));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0028. Please report as an issue. */
    public final void c(long j17) {
        long j18;
        int a17;
        long j19;
        int i17;
        int i18;
        int i19;
        long j27;
        int i27;
        long j28 = j17;
        while (j28 > 0) {
            int i28 = i();
            long j29 = j28 - 1;
            if (i28 == 144) {
                j18 = j29;
                a17 = a(dc.l.UNREACHABLE);
            } else {
                if (i28 == 195) {
                    java.lang.System.err.println("+--- PRIMITIVE ARRAY NODATA DUMP");
                    d();
                    throw new java.lang.IllegalArgumentException("Don't know how to load a nodata array");
                }
                fc.q qVar = this.f310162d;
                ec.a aVar = this.f310159a;
                if (i28 == 254) {
                    j18 = j29;
                    this.f310161c.j(((ec.b) aVar).d(), (java.lang.String) qVar.n(h()));
                    i17 = this.f310160b;
                } else if (i28 != 255) {
                    switch (i28) {
                        case 1:
                            j29 -= a(dc.l.NATIVE_STATIC);
                            h();
                            i18 = this.f310160b;
                            j28 = j29 - i18;
                        case 2:
                            long h17 = h();
                            ec.b bVar = (ec.b) aVar;
                            int d17 = bVar.d();
                            this.f310161c.a(new dc.k(dc.l.NATIVE_LOCAL, h17, d17, this.f310161c.f(this.f310161c.g(d17).f310199b, bVar.d())));
                            i19 = this.f310160b;
                            i17 = i19 + 4;
                            j18 = j29;
                            break;
                        case 3:
                            long h18 = h();
                            ec.b bVar2 = (ec.b) aVar;
                            int d18 = bVar2.d();
                            this.f310161c.a(new dc.k(dc.l.JAVA_LOCAL, h18, d18, this.f310161c.f(this.f310161c.g(d18).f310199b, bVar2.d())));
                            i19 = this.f310160b;
                            i17 = i19 + 4;
                            j18 = j29;
                            break;
                        case 4:
                            long h19 = h();
                            int d19 = ((ec.b) aVar).d();
                            this.f310161c.a(new dc.k(dc.l.NATIVE_STACK, h19, d19, this.f310161c.e(this.f310161c.g(d19).f310199b)));
                            i17 = this.f310160b;
                            j18 = j29;
                            break;
                        case 5:
                            a17 = a(dc.l.SYSTEM_CLASS);
                            j18 = j29;
                            break;
                        case 6:
                            long h27 = h();
                            int d27 = ((ec.b) aVar).d();
                            this.f310161c.a(new dc.k(dc.l.THREAD_BLOCK, h27, d27, this.f310161c.e(this.f310161c.g(d27).f310199b)));
                            i17 = this.f310160b;
                            j18 = j29;
                            break;
                        case 7:
                            a17 = a(dc.l.BUSY_MONITOR);
                            j18 = j29;
                            break;
                        case 8:
                            ec.b bVar3 = (ec.b) aVar;
                            this.f310161c.f310189c.f310154e.r(bVar3.d(), new dc.p(h(), bVar3.d()));
                            i19 = this.f310160b;
                            i17 = i19 + 4;
                            j18 = j29;
                            break;
                        default:
                            switch (i28) {
                                case 32:
                                    long h28 = h();
                                    ec.b bVar4 = (ec.b) aVar;
                                    dc.o e17 = this.f310161c.e(bVar4.d());
                                    long h29 = h();
                                    h();
                                    h();
                                    h();
                                    h();
                                    h();
                                    int d28 = bVar4.d();
                                    int i29 = (this.f310160b * 7) + 4 + 4;
                                    int j37 = j();
                                    int i37 = i29 + 2;
                                    int i38 = 0;
                                    while (i38 < j37) {
                                        j();
                                        int i39 = this.f310161c.f310191e[dc.q.a(i()).f310205d];
                                        k(i39);
                                        i37 += i39 + 1 + 2;
                                        i38++;
                                        d28 = d28;
                                    }
                                    int i47 = d28;
                                    j18 = j29;
                                    dc.e eVar = new dc.e(h28, e17, (java.lang.String) this.f310163e.n(h28), bVar4.f332461d);
                                    eVar.f310141m = h29;
                                    int j38 = j();
                                    int i48 = i37 + 2;
                                    dc.f[] fVarArr = new dc.f[j38];
                                    for (int i49 = 0; i49 < j38; i49++) {
                                        java.lang.String str = (java.lang.String) qVar.n(h());
                                        dc.q a18 = dc.q.a(bVar4.c());
                                        fVarArr[i49] = new dc.f(a18, str);
                                        k(this.f310161c.f310191e[a18.f310205d]);
                                        i48 += this.f310160b + 1 + this.f310161c.f310191e[a18.f310205d];
                                    }
                                    eVar.f310143o = fVarArr;
                                    int j39 = j();
                                    dc.f[] fVarArr2 = new dc.f[j39];
                                    int i57 = i48 + 2;
                                    for (int i58 = 0; i58 < j39; i58++) {
                                        fVarArr2[i58] = new dc.f(dc.q.a(i()), (java.lang.String) qVar.n(h()));
                                        i57 += this.f310160b + 1;
                                    }
                                    eVar.f310142n = fVarArr2;
                                    eVar.f310144p = i47;
                                    dc.m mVar = this.f310161c;
                                    dc.h hVar = mVar.f310189c;
                                    hVar.f310155f.s(h28, eVar);
                                    cc.a aVar2 = (cc.a) hVar.f310156g;
                                    java.util.Map map = aVar2.f121930g;
                                    java.lang.String str2 = eVar.f310139h;
                                    java.util.Collection collection = (java.util.Collection) map.get(str2);
                                    if (collection == null) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList(((cc.v) aVar2).f121936i);
                                        if (!arrayList.add(eVar)) {
                                            throw new java.lang.AssertionError("New Collection violated the Collection spec");
                                        }
                                        aVar2.f121931h++;
                                        map.put(str2, arrayList);
                                    } else if (collection.add(eVar)) {
                                        aVar2.f121931h++;
                                    }
                                    eVar.f310166f = mVar.f310189c;
                                    j19 = i57;
                                    j28 = j18 - j19;
                                case 33:
                                    j27 = j29;
                                    long h37 = h();
                                    ec.b bVar5 = (ec.b) aVar;
                                    dc.o e18 = this.f310161c.e(bVar5.d());
                                    long h38 = h();
                                    int d29 = bVar5.d();
                                    dc.c cVar = new dc.c(h37, e18, bVar5.f332461d);
                                    cVar.f310165e = h38;
                                    dc.m mVar2 = this.f310161c;
                                    mVar2.f310189c.f310157h.s(h37, cVar);
                                    cVar.f310166f = mVar2.f310189c;
                                    k(d29);
                                    int i59 = this.f310160b;
                                    i27 = i59 + 4 + i59 + 4 + d29;
                                    j28 = j27 - i27;
                                case 34:
                                    long h39 = h();
                                    ec.b bVar6 = (ec.b) aVar;
                                    dc.o e19 = this.f310161c.e(bVar6.d());
                                    int d37 = bVar6.d();
                                    long h47 = h();
                                    j27 = j29;
                                    dc.a aVar3 = new dc.a(h39, e19, dc.q.OBJECT, d37, bVar6.f332461d);
                                    aVar3.f310165e = h47;
                                    dc.m mVar3 = this.f310161c;
                                    mVar3.f310189c.f310157h.s(h39, aVar3);
                                    aVar3.f310166f = mVar3.f310189c;
                                    int i66 = d37 * this.f310160b;
                                    k(i66);
                                    int i67 = this.f310160b;
                                    i27 = i67 + 4 + 4 + i67 + i66;
                                    j28 = j27 - i27;
                                case 35:
                                    i18 = d();
                                    j28 = j29 - i18;
                                default:
                                    switch (i28) {
                                        case 137:
                                            i18 = a(dc.l.INTERNED_STRING);
                                            break;
                                        case 138:
                                            i18 = a(dc.l.FINALIZING);
                                            break;
                                        case 139:
                                            i18 = a(dc.l.DEBUGGER);
                                            break;
                                        case 140:
                                            i18 = a(dc.l.REFERENCE_CLEANUP);
                                            break;
                                        case 141:
                                            i18 = a(dc.l.VM_INTERNAL);
                                            break;
                                        case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                            long h48 = h();
                                            ec.b bVar7 = (ec.b) aVar;
                                            int d38 = bVar7.d();
                                            this.f310161c.a(new dc.k(dc.l.NATIVE_MONITOR, h48, d38, this.f310161c.f(this.f310161c.g(d38).f310199b, bVar7.d())));
                                            i18 = this.f310160b + 4 + 4;
                                            break;
                                        default:
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadHeapDump loop with unknown tag ");
                                            sb6.append(i28);
                                            sb6.append(" with ");
                                            ec.b bVar8 = (ec.b) aVar;
                                            sb6.append(bVar8.f332460c - bVar8.f332461d);
                                            sb6.append(" bytes possibly remaining");
                                            throw new java.lang.IllegalArgumentException(sb6.toString());
                                    }
                                    j29 = j29;
                                    j28 = j29 - i18;
                            }
                    }
                } else {
                    j18 = j29;
                    a17 = a(dc.l.UNKNOWN);
                }
                a17 = i17 + 4;
            }
            j19 = a17;
            j28 = j18 - j19;
        }
    }

    public final int d() {
        long h17 = h();
        ec.b bVar = (ec.b) this.f310159a;
        dc.o e17 = this.f310161c.e(bVar.d());
        int d17 = bVar.d();
        dc.q a17 = dc.q.a(i());
        int i17 = this.f310161c.f310191e[a17.f310205d];
        dc.a aVar = new dc.a(h17, e17, a17, d17, bVar.f332461d);
        dc.m mVar = this.f310161c;
        mVar.f310189c.f310157h.s(h17, aVar);
        aVar.f310166f = mVar.f310189c;
        int i18 = d17 * i17;
        k(i18);
        return this.f310160b + 4 + 4 + 1 + i18;
    }

    public final void e() {
        long h17 = h();
        long h18 = h();
        fc.q qVar = this.f310162d;
        java.lang.String str = (java.lang.String) qVar.n(h18);
        java.lang.String str2 = (java.lang.String) qVar.n(h());
        java.lang.String str3 = (java.lang.String) qVar.n(h());
        ec.a aVar = this.f310159a;
        dc.n nVar = new dc.n(h17, str, str2, str3, ((ec.b) aVar).d(), ((ec.b) aVar).d());
        dc.h hVar = this.f310161c.f310189c;
        hVar.getClass();
        hVar.f310151b.s(h17, nVar);
    }

    public final void f() {
        ec.a aVar = this.f310159a;
        int d17 = ((ec.b) aVar).d();
        int d18 = ((ec.b) aVar).d();
        int d19 = ((ec.b) aVar).d();
        dc.n[] nVarArr = new dc.n[d19];
        for (int i17 = 0; i17 < d19; i17++) {
            dc.m mVar = this.f310161c;
            nVarArr[i17] = (dc.n) mVar.f310189c.f310151b.n(h());
        }
        dc.o oVar = new dc.o(d17, d18, nVarArr);
        dc.h hVar = this.f310161c.f310189c;
        hVar.getClass();
        hVar.f310152c.r(d17, oVar);
    }

    public final void g(int i17) {
        long h17 = h();
        byte[] bArr = new byte[i17];
        ec.b bVar = (ec.b) this.f310159a;
        int a17 = bVar.a();
        java.nio.ByteBuffer[] byteBufferArr = bVar.f332459b;
        byteBufferArr[a17].position(bVar.b());
        if (i17 <= byteBufferArr[a17].remaining()) {
            byteBufferArr[a17].get(bArr, 0, i17);
        } else {
            int position = 1073741824 - byteBufferArr[a17].position();
            byteBufferArr[a17].get(bArr, 0, position);
            int i18 = a17 + 1;
            byteBufferArr[i18].position(0);
            byteBufferArr[i18].get(bArr, position, i17 - position);
        }
        bVar.f332461d += i17;
        this.f310162d.s(h17, new java.lang.String(bArr, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
    }

    public final long h() {
        int i17 = this.f310160b;
        ec.a aVar = this.f310159a;
        if (i17 == 1) {
            return ((ec.b) aVar).c();
        }
        if (i17 == 2) {
            return ((ec.b) aVar).f();
        }
        if (i17 == 4) {
            return ((ec.b) aVar).d();
        }
        if (i17 == 8) {
            return ((ec.b) aVar).e();
        }
        throw new java.lang.IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
    }

    public final int i() {
        return ((ec.b) this.f310159a).c() & 255;
    }

    public final int j() {
        return ((ec.b) this.f310159a).f() & 65535;
    }

    public final void k(long j17) {
        ((ec.b) this.f310159a).f332461d += j17;
    }
}
