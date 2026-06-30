package si4;

/* loaded from: classes11.dex */
public interface a extends qi4.a {
    static /* synthetic */ int g(si4.a aVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStatusTotalNum");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        return aVar.o(str);
    }

    static /* synthetic */ void k(si4.a aVar, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markReadByStatusId");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        aVar.j(str, str2, z17);
    }

    static boolean m(si4.a aVar, mj4.h item, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insert");
        }
        if ((i17 & 2) != 0) {
            di4.i iVar = di4.i.f314315a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            z17 = !((((mj4.k) item).s() & 16) != 0);
        }
        return aVar.p(item, z17);
    }

    static boolean r(si4.a aVar, mj4.h item, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i17 & 2) != 0) {
            di4.i iVar = di4.i.f314315a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            z17 = !((((mj4.k) item).s() & 16) != 0);
        }
        return aVar.l(item, z17);
    }

    void a(java.lang.String str, java.lang.String str2);

    mj4.h b(java.lang.String str);

    boolean c(java.lang.String str, int i17);

    int e();

    java.util.List f(java.lang.String str, java.lang.String str2, boolean z17);

    java.util.List h(java.lang.String str, java.util.ArrayList arrayList);

    mj4.h i(java.lang.String str, int i17);

    void j(java.lang.String str, java.lang.String str2, boolean z17);

    boolean l(mj4.h hVar, boolean z17);

    boolean n(java.lang.String str);

    int o(java.lang.String str);

    boolean p(mj4.h hVar, boolean z17);

    java.util.List q(java.lang.String str);

    boolean s(mj4.h hVar);

    mj4.h t(java.lang.String str);

    boolean u(java.lang.String str, java.lang.String str2);

    boolean v();

    java.util.List w(java.lang.String str, java.util.ArrayList arrayList);
}
