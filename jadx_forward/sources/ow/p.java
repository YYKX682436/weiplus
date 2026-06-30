package ow;

/* loaded from: classes11.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e f430794d;

    public p(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e eVar) {
        this.f430794d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24543xfc330919 Bi;
        f50.y yVar = (f50.y) i95.n0.c(f50.y.class);
        if (yVar == null || (Bi = ((e50.z0) yVar).Bi()) == null) {
            return;
        }
        byte[] mo14344x5f01b1f6 = this.f430794d.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        Bi.m91019xb0f54e90(mo14344x5f01b1f6, ow.o.f430793d);
    }
}
