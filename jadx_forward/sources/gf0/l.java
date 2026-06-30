package gf0;

/* loaded from: classes15.dex */
public final class l implements gf0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf0.r f352754a;

    public l(gf0.r rVar) {
        this.f352754a = rVar;
    }

    public void a(int i17, java.lang.String recordFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordFilePath, "recordFilePath");
        gf0.r rVar = this.f352754a;
        gf0.u uVar = rVar.f352765e;
        gf0.u uVar2 = gf0.u.f352779f;
        if (uVar == uVar2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorderService", "Finish Record");
        rVar.f352765e = uVar2;
        d75.b.g(new gf0.m(rVar, i17, recordFilePath));
    }
}
