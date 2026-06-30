package vc3;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc3.g f516792d;

    public d(vc3.g gVar) {
        this.f516792d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b bVar = this.f516792d.f516795d;
        if (bVar != null) {
            bVar.mo14659x5cd39ffa();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rt");
            throw null;
        }
    }
}
