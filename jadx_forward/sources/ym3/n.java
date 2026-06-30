package ym3;

/* loaded from: classes.dex */
public final class n extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f544707d;

    /* renamed from: e, reason: collision with root package name */
    public int f544708e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f544709f;

    public n(ym3.f... dataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f544707d = arrayList;
        kz5.h0.w(arrayList, dataSource);
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new ym3.m());
        }
        this.f544709f = new java.util.HashMap();
    }

    public static final java.lang.Object d(ym3.n nVar, v65.i iVar, ym3.c cVar, ym3.d dVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object mo771x2f8fd3;
        ym3.f fVar = (ym3.f) kz5.n0.a0(nVar.f544707d, nVar.f544708e);
        return ((fVar == null || v65.i.b(iVar, null, new ym3.l(fVar, iVar, cVar, dVar, nVar, i2Var, null), 1, null) == null) && (mo771x2f8fd3 = i2Var.mo771x2f8fd3(dVar, interfaceC29045xdcb5ca57)) == pz5.a.f440719d) ? mo771x2f8fd3 : jz5.f0.f384359a;
    }

    @Override // ym3.a
    public ym3.f b(ym3.f dataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f544707d);
        if (dataSource instanceof ym3.n) {
            arrayList.addAll(((ym3.n) dataSource).f544707d);
        } else {
            arrayList.add(dataSource);
        }
        ym3.f[] fVarArr = (ym3.f[]) arrayList.toArray(new ym3.f[0]);
        return new ym3.n((ym3.f[]) java.util.Arrays.copyOf(fVarArr, fVarArr.length));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getData request:");
        int i17 = request.f544677b;
        sb6.append(i17);
        sb6.append(" dataSourceIndex:");
        sb6.append(this.f544708e);
        sb6.append(" dataSourceSize:");
        sb6.append(this.f544707d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MergeDataSource", sb6.toString());
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.HashMap hashMap = this.f544709f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f544708e);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = 0;
            hashMap.put(valueOf, obj);
        }
        v65.i.b(scope, null, new ym3.j(this, scope, new ym3.c(request.f544676a, i17 - ((java.lang.Number) obj).intValue(), request.f544678c, null, 8, null), new ym3.d(request), b17, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        this.f544708e = 0;
        java.util.HashMap hashMap = this.f544709f;
        hashMap.clear();
        hashMap.put(0, 0);
        java.util.Iterator it = this.f544707d.iterator();
        while (it.hasNext()) {
            ((ym3.f) it.next()).mo10202x3e5a77bb();
        }
    }
}
