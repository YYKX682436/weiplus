package cp2;

/* loaded from: classes2.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc f302389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f302390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302393h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302394i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f302395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302396n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f302397o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc, java.util.LinkedList linkedList, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4, ym5.s3 s3Var, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa) {
        super(0);
        this.f302389d = c14500x958689dc;
        this.f302390e = linkedList;
        this.f302391f = f0Var;
        this.f302392g = f0Var2;
        this.f302393h = f0Var3;
        this.f302394i = f0Var4;
        this.f302395m = s3Var;
        this.f302396n = lVar;
        this.f302397o = c13924x37151faa;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302389d;
        c14500x958689dc.m56387xe6796cde().clear();
        c14500x958689dc.m56387xe6796cde().addAll(this.f302390e);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f302391f;
        if (f0Var.f391649d >= 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f302392g;
            if (f0Var2.f391649d > 0) {
                c14500x958689dc.getDispatcher().e(f0Var.f391649d, f0Var2.f391649d);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3 = this.f302393h;
        int i17 = f0Var3.f391649d;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4 = this.f302394i;
        if (i17 >= 0 && f0Var4.f391649d > 0) {
            c14500x958689dc.getDispatcher().d(f0Var3.f391649d, f0Var4.f391649d);
        }
        int i18 = f0Var4.f391649d;
        ym5.s3 s3Var = this.f302395m;
        s3Var.f545056h = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0.f(c14500x958689dc.getDispatcher(), s3Var, false, 2, null);
        yz5.l lVar = this.f302396n;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f302397o);
        }
        c14500x958689dc.f203011v = false;
        return jz5.f0.f384359a;
    }
}
