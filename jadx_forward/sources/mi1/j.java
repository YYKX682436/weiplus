package mi1;

/* loaded from: classes7.dex */
public final class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.v f408116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.l f408117e;

    public j(mi1.v vVar, mi1.l lVar) {
        this.f408116d = vVar;
        this.f408117e = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public final void mo32094xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page = this.f408117e.f408137d;
        mi1.v vVar = this.f408116d;
        mi1.l lVar = null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(page, vVar.f408246l)) {
            vVar.f408246l = null;
        }
        mi1.m mVar = vVar.f408245k;
        mVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        android.util.SparseArray sparseArray = mVar.f408149a;
        int indexOfKey = sparseArray.indexOfKey(page.hashCode());
        if (indexOfKey >= 0) {
            lVar = (mi1.l) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (lVar != null) {
            lVar.r();
        }
    }
}
