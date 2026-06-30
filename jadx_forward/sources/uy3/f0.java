package uy3;

/* loaded from: classes8.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f513470d;

    public f0(uy3.j0 j0Var) {
        this.f513470d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        uy3.j0 j0Var = this.f513470d;
        r45.sn snVar = j0Var.f513481f;
        if (snVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("homeContext");
            throw null;
        }
        objArr[0] = snVar.f467385f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "startLoadUrl %s", objArr);
        zg0.q2 q2Var = j0Var.f513483h;
        if (q2Var != null) {
            android.content.Intent intent = new android.content.Intent();
            r45.sn snVar2 = j0Var.f513481f;
            if (snVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("homeContext");
                throw null;
            }
            intent.putExtra("rawUrl", snVar2.f467385f);
            intent.putExtra("useJs", true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) q2Var).j(intent);
        }
    }
}
