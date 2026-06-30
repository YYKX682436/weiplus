package l31;

/* loaded from: classes9.dex */
public final class j extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final e31.l f396898e;

    /* renamed from: f, reason: collision with root package name */
    public final k31.a f396899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String username, k31.a aVar, e31.l lVar) {
        super(username);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f396899f = aVar;
        this.f396898e = lVar;
    }

    @Override // l31.u
    public void run() {
        java.util.List list;
        k31.a aVar = this.f396899f;
        com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 d17 = aVar != null ? ((k31.h) aVar).d(this.f396846a) : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (d17 != null && (list = d17.f153365d) != null) {
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : kz5.n0.V(list)) {
                if (c11159x8f55e6d3.f153337g == 3) {
                    arrayList.add(c11159x8f55e6d3);
                }
            }
        }
        e31.l lVar = this.f396898e;
        if (lVar != null) {
            lVar.e(this.f396846a, new com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5(false, "", "", 0, arrayList, false, false, null, d17 != null ? d17.f153366e : false, true, true, new byte[0], -1, null, "", "", 0, "", false, "", false, kz5.p0.f395529d));
        }
        k31.o.f385383a.a(this);
    }
}
