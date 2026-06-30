package km2;

/* loaded from: classes3.dex */
public final class t implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final km2.m f390755d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.p f390756e;

    public t(km2.m liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f390755d = liveData;
    }

    public final gk2.e a() {
        km2.m mVar = this.f390755d;
        if (mVar != null) {
            return mVar.f390663e;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b() {
        km2.m mVar = this.f390755d;
        if (mVar != null) {
            return mVar.f390662d;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        km2.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof km2.t)) {
            return -1;
        }
        km2.p pVar = this.f390756e;
        if (pVar == null) {
            km2.t tVar = (km2.t) obj;
            if (tVar.f390756e == null) {
                km2.m mVar2 = this.f390755d;
                if (mVar2 == null || (mVar = tVar.f390755d) == null) {
                    return -1;
                }
                return mVar2.d(mVar);
            }
        }
        if (pVar == null) {
            return -1;
        }
        km2.t tVar2 = (km2.t) obj;
        return (tVar2.f390756e == null || mo2128x1ed62e84() != tVar2.mo2128x1ed62e84()) ? -1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        km2.p pVar = this.f390756e;
        if (pVar != null) {
            return java.lang.System.identityHashCode(pVar != null ? pVar.f390699a : null);
        }
        km2.m mVar = this.f390755d;
        if (mVar != null) {
            return mVar.f390662d.f150082s;
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        r45.fa2 fa2Var;
        km2.p pVar = this.f390756e;
        if (pVar == null) {
            return 9;
        }
        if (pVar == null || (fa2Var = pVar.f390699a) == null) {
            return 0;
        }
        return fa2Var.f455659e;
    }

    /* renamed from: toString */
    public java.lang.String m143692x9616526c() {
        km2.p pVar = this.f390756e;
        if (pVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveVisitorData(container=");
            sb6.append(pVar != null ? pVar.f390699a : null);
            sb6.append(')');
            return sb6.toString();
        }
        return "FinderLiveVisitorData(liveData=" + this.f390755d + ')';
    }

    public t(km2.p guidePageData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guidePageData, "guidePageData");
        this.f390755d = null;
        this.f390756e = guidePageData;
    }
}
