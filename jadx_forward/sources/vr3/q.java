package vr3;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 f521176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f521177e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7, java.util.List list) {
        this.f521176d = c16893x570516c7;
        this.f521177e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f521176d.f235821s.mo523x53d8522f(new vr3.g(this.f521177e));
    }
}
