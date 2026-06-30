package fb2;

/* loaded from: classes2.dex */
public final class g implements fb2.m {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f342377a = new android.util.SparseArray();

    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        return false;
    }

    @Override // fb2.m
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        so2.i1 i1Var = (so2.i1) this.f342377a.get(i17);
        if (i1Var != null) {
            loadedInfo.f189300e.add(0, i1Var);
        }
        return false;
    }

    @Override // fb2.m
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        return false;
    }
}
