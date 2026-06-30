package g31;

/* loaded from: classes9.dex */
public final class j implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.l f349614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 f349615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e31.i f349616c;

    public j(g31.l lVar, com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3, e31.i iVar) {
        this.f349614a = lVar;
        this.f349615b = c11159x8f55e6d3;
        this.f349616c = iVar;
    }

    @Override // e31.i
    public void a() {
        java.lang.String str = this.f349615b.f153336f;
        g31.e eVar = g31.e.f349607d;
        g31.l lVar = this.f349614a;
        lVar.k(str, eVar);
        lVar.r(g31.f.f349608d);
        e31.i iVar = this.f349616c;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = this.f349615b;
        g31.l.j(this.f349614a, c11159x8f55e6d3.f153336f, result);
        e31.i iVar = this.f349616c;
        if (iVar != null) {
            iVar.b(c11159x8f55e6d3.f153336f, result);
        }
    }
}
