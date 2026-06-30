package kk;

/* loaded from: classes15.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 implements kk.j {

    /* renamed from: i, reason: collision with root package name */
    public final kk.h f389999i;

    /* renamed from: j, reason: collision with root package name */
    public final kk.i f390000j;

    public l(int i17) {
        super(i17);
        this.f389999i = null;
        this.f390000j = null;
    }

    @Override // kk.j
    public void c(kk.g gVar) {
        mo143584x5a5b64d();
    }

    @Override // kk.j
    /* renamed from: clear */
    public void mo143584x5a5b64d() {
        super.d(-1);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.r2, kk.j
    public void d(int i17) {
        super.d(i17);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.r2
    public int g(java.lang.Object obj, java.lang.Object obj2) {
        kk.i iVar = this.f390000j;
        if (iVar != null) {
            return iVar.a(obj, obj2);
        }
        return 1;
    }

    @Override // kk.j
    public void j(java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 == null || obj == null) {
            return;
        }
        put(obj, obj2);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.r2
    public java.lang.Object n(java.lang.Object obj) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.r2
    public void o(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kk.h hVar = this.f389999i;
        if (hVar != null) {
            hVar.a(obj, obj2, obj3);
        }
    }

    public l(int i17, kk.h hVar) {
        super(i17);
        this.f389999i = null;
        this.f390000j = null;
        this.f389999i = hVar;
    }

    public l(int i17, kk.h hVar, kk.i iVar) {
        super(i17);
        this.f389999i = null;
        this.f390000j = null;
        this.f389999i = hVar;
        this.f390000j = iVar;
    }
}
