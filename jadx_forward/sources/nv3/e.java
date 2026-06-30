package nv3;

/* loaded from: classes5.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f422188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv3.f f422189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f422190c;

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, nv3.f fVar, boolean z17) {
        this.f422188a = g0Var;
        this.f422189b = fVar;
        this.f422190c = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        wt3.i0 i0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f422188a.f391654d;
        boolean z17 = this.f422190c;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        r45.xv0 xv0Var = (r45.xv0) fVar.f152151d;
        boolean z18 = xv0Var.f472007e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = xv0Var.f472006d;
        java.util.LinkedList items = xv0Var.f472008f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
        nv3.f fVar2 = this.f422189b;
        fVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GetListenVideoBgmListHelper", "GetListenVideoBgmList callback " + i17 + ' ' + i18 + ", " + str + ", loadFirstPage:" + z17);
        if ((i17 != 0 || i18 != 0) && (i0Var = fVar2.f422200i) != null) {
            i0Var.a(new java.util.LinkedList(), z17, z18, currentTimeMillis);
        }
        fVar2.f422201j = gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GetListenVideoBgmListHelper", "GetListenVideoBgmList count:" + items.size() + ", has_more:" + z18);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(items, 10));
        java.util.Iterator it = items.iterator();
        while (true) {
            java.lang.String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            r45.ug4 ug4Var = ((r45.vv0) it.next()).f470132d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("title:");
            r45.pg4 pg4Var = ug4Var.f468880d;
            sb6.append(pg4Var != null ? pg4Var.f464553f : null);
            sb6.append("-author:");
            r45.pg4 pg4Var2 = ug4Var.f468880d;
            sb6.append(pg4Var2 != null ? pg4Var2.f464554g : null);
            sb6.append("-duration:");
            r45.pg4 pg4Var3 = ug4Var.f468880d;
            sb6.append(pg4Var3 != null ? java.lang.Integer.valueOf(pg4Var3.f464556i) : null);
            sb6.append("-mir_begin:");
            sb6.append(ug4Var.f468884h);
            sb6.append("-mir_end:");
            sb6.append(ug4Var.f468885i);
            sb6.append("-listen_id:");
            r45.pg4 pg4Var4 = ug4Var.f468880d;
            if (pg4Var4 != null) {
                str2 = pg4Var4.f464551d;
            }
            sb6.append(str2);
            sb6.append("-url:");
            sb6.append(ug4Var.f468882f);
            arrayList.add(sb6.toString());
        }
        arrayList.toString();
        wt3.i0 i0Var2 = fVar2.f422200i;
        if (i0Var2 != null) {
            i0Var2.a(items, z17, z18, currentTimeMillis);
        }
        return null;
    }
}
