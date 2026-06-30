package vx5;

/* loaded from: classes13.dex */
public class q extends com.p314xaae8f345.p3210x3857dc.y {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i f522919a;

    public q(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i iVar) {
        this.f522919a = iVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void a() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i iVar = this.f522919a;
        if (iVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.j) iVar).a();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z
    public void b() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i iVar = this.f522919a;
        if (iVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.j) iVar).b();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.y
    public void c(java.lang.String str) {
        by5.i0 i0Var;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i iVar = this.f522919a;
        if (iVar != null) {
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.j jVar = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.j) iVar;
            jVar.getClass();
            try {
                synchronized (jVar) {
                    i0Var = jVar.f301981d;
                    if (i0Var == null) {
                        i0Var = new by5.i0(jVar.f301978a, "confirm", java.lang.String.class);
                        jVar.f301981d = i0Var;
                    }
                }
                i0Var.b(str);
            } catch (java.lang.UnsupportedOperationException unused) {
            }
        }
    }
}
