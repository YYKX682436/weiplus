package x22;

/* loaded from: classes2.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x22.c f533091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f533092b;

    public a(x22.c cVar, yz5.l lVar) {
        this.f533091a = cVar;
        this.f533092b = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.p944x882e457a.f cgiBack = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        int i17 = cgiBack.f152148a;
        x22.c cVar = this.f533091a;
        if (i17 == 0 && cgiBack.f152149b == 0) {
            r45.bj0 bj0Var = (r45.bj0) cgiBack.f152151d;
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiEmojiTextSpam", "CgiTextAntiSpam " + bj0Var.f452330d + ' ' + bj0Var.f452331e + ' ' + bj0Var.f452332f);
            z17 = bj0Var.f452330d;
        } else {
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CgiEmojiTextSpam", "CgiTextAntiSpam error " + cgiBack.f152148a + ' ' + cgiBack.f152149b);
            z17 = false;
        }
        yz5.l lVar = this.f533092b;
        if (lVar == null) {
            return null;
        }
        lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        return jz5.f0.f384359a;
    }
}
