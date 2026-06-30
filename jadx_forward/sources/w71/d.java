package w71;

/* loaded from: classes11.dex */
public final class d implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.e70 f524925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524926b;

    public d(bw5.e70 e70Var, yz5.l lVar) {
        this.f524925a = e70Var;
        this.f524926b = lVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        yz5.l lVar = this.f524926b;
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ting" + ".".concat("TingFinderSourcePlugin"), "requestMediaInfo fail, errType: " + i17 + ", errCode: " + i18);
            if (lVar != null) {
                lVar.mo146xb9724478(new byte[0]);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMediaInfo success, tid:");
        java.lang.String m11811xb5887159 = this.f524925a.m11811xb5887159();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m11811xb5887159);
        sb6.append((java.lang.Object) jz5.x.a(r26.q0.c(m11811xb5887159)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting" + ".".concat("TingFinderSourcePlugin"), sb6.toString());
        if (lVar != null) {
            byte[] mo14344x5f01b1f6 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj).mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            lVar.mo146xb9724478(mo14344x5f01b1f6);
        }
    }
}
