package w70;

/* loaded from: classes12.dex */
public final class c implements r70.b {
    @Override // r70.b
    public void K3(r70.c event) {
        c01.h7 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.f474608b == r70.d.f474618f) {
            c01.h7 h7Var = event.f474607a.f474636e.f386189o;
            if (h7Var != null && (a17 = c01.i7.a(h7Var)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgIncrementalCleanFSC", "[sendFirstMsg] trigger incremental clean for original message id: " + a17.f118760b + ", talker: " + a17.f118762d);
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(a17.f118760b), a17.f118762d);
            }
            a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
            r70.e eVar = event.f474613g;
            java.lang.Long valueOf = eVar != null ? java.lang.Long.valueOf(eVar.f474620a) : null;
            r70.e eVar2 = event.f474613g;
            ((t02.e) iVar).mj(valueOf, eVar2 != null ? eVar2.f474621b : null);
        }
    }
}
