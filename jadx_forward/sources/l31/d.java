package l31;

/* loaded from: classes9.dex */
public final class d implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.e f396864d;

    public d(l31.e eVar) {
        this.f396864d = eVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetAllSubscribeListTask", "getSubscribeMsgListByUsername end errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        if (i17 == 0 && i18 == 0) {
            if ((c11158xe7d16ed5 != null ? c11158xe7d16ed5.f153318h : null) != null) {
                l31.e eVar = this.f396864d;
                java.util.ArrayList arrayList = c11158xe7d16ed5.f153318h;
                eVar.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next()).f153342o = currentTimeMillis;
                }
                l31.e eVar2 = this.f396864d;
                if (eVar2.f396872f != null) {
                    java.lang.String bizUsername = eVar2.f396846a;
                    java.util.ArrayList subscribeMsgList = c11158xe7d16ed5.f153318h;
                    boolean z17 = c11158xe7d16ed5.f153322o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeMsgList, "subscribeMsgList");
                    ((ku5.t0) ku5.t0.f394148d).h(new k31.f(1, bizUsername, subscribeMsgList, z17), "SubscribeMsgSaveTag");
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l31.c(i17, i18, this.f396864d, c11158xe7d16ed5, errMsg));
    }
}
