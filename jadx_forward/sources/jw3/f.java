package jw3;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw3.i f383854d;

    public f(jw3.i iVar) {
        this.f383854d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jw3.i iVar = this.f383854d;
        r45.sn snVar = iVar.f383857f;
        if (snVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomeContext");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectTextDialog", "startLoadUrl %s", snVar.f467385f);
        zg0.q2 q2Var = iVar.f383859h;
        if (q2Var != null) {
            android.content.Intent intent = new android.content.Intent();
            r45.sn snVar2 = iVar.f383857f;
            if (snVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomeContext");
                throw null;
            }
            intent.putExtra("rawUrl", snVar2.f467385f);
            intent.putExtra("useJs", true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) q2Var).j(intent);
        }
    }
}
