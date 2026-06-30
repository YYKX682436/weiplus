package jc2;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc2.f f380481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f380482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jc2.f fVar, r45.vs2 vs2Var) {
        super(1);
        this.f380481d = fVar;
        this.f380482e = vs2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f380481d.getClass();
        r45.vs2 vs2Var = this.f380482e;
        if (vs2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InnerDropTabRedDotInterceptor", "removeShowInfoWithReport :" + vs2Var.f470020e + ' ' + path);
            java.util.LinkedList show_infos = vs2Var.f470022g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
            java.util.Iterator it = show_infos.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj2).f455425i, path)) {
                    break;
                }
            }
            r45.f03 f03Var = (r45.f03) obj2;
            if (f03Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a, vs2Var, f03Var, 13, null, 0L, 24, null);
            }
            hc2.u0.g(vs2Var, path, true);
        }
        return jz5.f0.f384359a;
    }
}
