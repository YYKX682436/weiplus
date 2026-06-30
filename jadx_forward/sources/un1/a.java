package un1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f510955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f510956e;

    public a(un1.d dVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, int i17) {
        this.f510955d = o4Var;
        this.f510956e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f510955d;
        java.lang.String string = o4Var.getString("MMKV_BACKUP_ERROR_CACHE", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6334xad1e0c67 c6334xad1e0c67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6334xad1e0c67();
            c6334xad1e0c67.f136902f = this.f510956e;
            c6334xad1e0c67.k();
        } else {
            new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6334xad1e0c67(string).k();
            o4Var.D("MMKV_BACKUP_ERROR_CACHE", "");
        }
        o4Var.G("MMKV_BACKUP_NEED_REPORT", false);
    }
}
