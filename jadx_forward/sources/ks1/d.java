package ks1;

/* loaded from: classes7.dex */
public final class d implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ks1.g f393114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 f393115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f393116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f393117d;

    public d(ks1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2, zq1.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f393114a = gVar;
        this.f393115b = c12965xc9712d2;
        this.f393116c = g0Var;
        this.f393117d = c0Var;
    }

    @Override // zq1.g0
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 result) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        r45.z24 z24Var = result.f175461f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        sb6.append(this.f393114a.f());
        sb6.append("] onResult errCode: ");
        sb6.append(result.f175459d);
        sb6.append(", errMsg: ");
        sb6.append(result.f175460e);
        sb6.append(", result: ");
        sb6.append(z24Var != null ? java.lang.Integer.valueOf(z24Var.f473167d) : null);
        sb6.append(", isRetry: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = this.f393115b;
        sb6.append(c12965xc9712d2.f175456q);
        sb6.append(", header.size: ");
        sb6.append((z24Var == null || (linkedList = z24Var.f473170g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        sb6.append(", resp_json: ");
        sb6.append(z24Var != null ? z24Var.f473169f : null);
        sb6.append(", errMsg: ");
        sb6.append(z24Var != null ? z24Var.f473168e : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTransferRequest", sb6.toString());
        result.f175462g = !this.f393117d.f391645d;
        result.f175463h = c12965xc9712d2.f175456q;
        zq1.g0 g0Var = this.f393116c;
        if (g0Var != null) {
            g0Var.b(result);
        }
    }
}
