package g31;

/* loaded from: classes9.dex */
public final class n implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.p f349630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f349631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349632c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f349633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.i f349634e;

    public n(g31.p pVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, int i17, e31.i iVar) {
        this.f349630a = pVar;
        this.f349631b = h0Var;
        this.f349632c = str;
        this.f349633d = i17;
        this.f349634e = iVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubscribeStatusUpdateManager", "loadSubscribeMsgList onError templateId: " + this.f349632c + ", errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + errMsg);
        e31.i iVar = this.f349634e;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.ArrayList<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> arrayList = result.f153318h;
        boolean z17 = !arrayList.isEmpty();
        e31.i iVar = this.f349634e;
        java.lang.String str = this.f349632c;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f349631b;
        if (z17) {
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : arrayList) {
                if (str.equals(c11159x8f55e6d3.f153336f)) {
                    e31.j jVar = new e31.j(c11159x8f55e6d3.f153340m == 1, c11159x8f55e6d3.f153341n);
                    jVar.f328610c = c11159x8f55e6d3.f153347t;
                    jVar.f328611d = c11159x8f55e6d3.f153348u;
                    jVar.f328612e = c11159x8f55e6d3.f153350w;
                    jVar.f328613f = c11159x8f55e6d3.f153351x;
                    jVar.f328614g = c11159x8f55e6d3.B;
                    jVar.f328615h = c11159x8f55e6d3.C;
                    jVar.f328618k = c11159x8f55e6d3.A;
                    if (iVar != null) {
                        iVar.b(str, jVar);
                    }
                    h0Var.f391656d = c11159x8f55e6d3;
                }
            }
        }
        java.lang.Object obj = h0Var.f391656d;
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj;
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d33 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj;
        g31.b bVar = new g31.b(bizUsername, str, c11159x8f55e6d33 != null ? c11159x8f55e6d33.f153340m : -1, this.f349633d);
        bVar.f349598e = iVar;
        this.f349630a.a(c11159x8f55e6d32, bVar);
    }
}
