package qo1;

/* loaded from: classes5.dex */
public final class c1 extends qo1.f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f446989y = 0;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f446990w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f446991x;

    public /* synthetic */ c1(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(gVar, (i17 & 2) != 0 ? kz5.p0.f395529d : list);
    }

    @Override // qo1.j0
    public boolean b() {
        boolean z17;
        synchronized (this.f447017j) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f447018k;
            if (n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING && n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_RUNNING) {
                z17 = n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_IMPORTING;
            }
        }
        return z17;
    }

    @Override // qo1.f0
    public java.lang.String n() {
        return this.f446991x;
    }

    @Override // qo1.f0
    public void s() {
        if (k()) {
            return;
        }
        this.f447023p = false;
        this.f447025r = this.f447008a;
        this.f447024q = new qo1.b1(this);
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, java.util.List restoreConvList) {
        super(pkgInfo, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_RESTORE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restoreConvList, "restoreConvList");
        this.f446990w = restoreConvList;
        this.f446991x = "MicroMsg.RoamRestoreTask";
    }
}
