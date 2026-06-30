package md3;

/* loaded from: classes.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "addContact";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.app.Activity B0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f412094g);
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String optString = data.optString(dm.i4.f66875xa013b0d5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiAddContact", "username nil");
            s().mo146xb9724478(i(lc3.x.f399470d));
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f424002g = true;
        o25.o1 o1Var = (o25.o1) i95.n0.c(o25.o1.class);
        lc3.e eVar = this.f399423a;
        r35.o3 wi6 = ((r35.p) o1Var).wi(eVar != null ? eVar.B0() : null, optString, optInt, new md3.b(this), aVar);
        lc3.e eVar2 = this.f399423a;
        if (eVar2 == null || (B0 = eVar2.B0()) == null) {
            return;
        }
        B0.runOnUiThread(new md3.a(wi6));
    }
}
