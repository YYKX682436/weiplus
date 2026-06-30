package l31;

/* loaded from: classes9.dex */
public final class h implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.i f396891d;

    public h(l31.i iVar) {
        this.f396891d = iVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetGlobalNotifySwitchInfoTask", "GetGlobalNotifySwitchInfoTask end errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + errMsg);
        if (i17 == 0 && i18 == 0 && c11158xe7d16ed5 != null) {
            boolean z17 = c11158xe7d16ed5.A;
            k31.a aVar = this.f396891d.f396893e;
            if (aVar != null) {
                ((k31.h) aVar).h(z17);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new l31.g(this.f396891d, i17, i18, errMsg, c11158xe7d16ed5));
    }
}
