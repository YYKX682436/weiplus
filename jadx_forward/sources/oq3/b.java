package oq3;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f428908d;

    public b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f428908d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f428908d;
        if (f9Var.J2()) {
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.m134976x2690a4ac();
            sq3.b bVar = nVar.A;
            java.lang.String msgItemId = f9Var.I0() + "_1";
            bVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("MsgItemId", msgItemId);
            sq3.a aVar = (sq3.a) bVar.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(sq3.a.class));
            if (aVar != null) {
                aVar.a1(50);
                com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(bVar, aVar, false, false, 6, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: msg exposure, update priority, msgId:" + f9Var.m124847x74d37ac6() + ", msgSvrId:" + f9Var.I0());
        }
    }
}
