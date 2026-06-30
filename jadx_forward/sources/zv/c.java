package zv;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l8 f557451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f557452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f557453f;

    public c(com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var, java.util.ArrayList arrayList, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f557451d = l8Var;
        this.f557452e = arrayList;
        this.f557453f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zv.l lVar = zv.l.f557549a;
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) this.f557451d).Q((java.lang.String[]) kz5.n0.t0(this.f557452e, zv.l.a(lVar, (java.util.List) this.f557453f.f391656d)).toArray(new java.lang.String[0]), "service_officialaccounts", true, true);
        lVar.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", true);
    }
}
