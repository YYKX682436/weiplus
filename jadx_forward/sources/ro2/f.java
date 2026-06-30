package ro2;

/* loaded from: classes2.dex */
public final class f implements com.p314xaae8f345.mm.ui.ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f f479574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479575c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479577e;

    public f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f479573a = context;
        this.f479574b = c15326x96ed1d6f;
        this.f479575c = qeVar;
        this.f479576d = s0Var;
        this.f479577e = abstractC14490x69736cb5;
    }

    @Override // com.p314xaae8f345.mm.ui.ea
    /* renamed from: onBackPressed */
    public final boolean mo80638xbdc3c5dc() {
        android.content.Context context = this.f479573a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
        boolean z17 = abstractActivityC15087xee12defa != null ? abstractActivityC15087xee12defa.f210347p : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f479577e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f479575c;
        if (z17) {
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            lb2.j jVar = (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Z5).mo141623x754a37bb();
            jVar.l();
            if (((java.lang.Boolean) jVar.r()).booleanValue() && this.f479574b.getVisibility() == 0) {
                ro2.r.c(qeVar, this.f479576d);
                ro2.t tVar = ro2.t.f479630h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
                ro2.r.h(qeVar, tVar, context, item);
                return true;
            }
        }
        ro2.t tVar2 = ro2.t.f479632m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        ro2.r.h(qeVar, tVar2, context, item);
        return false;
    }
}
