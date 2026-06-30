package er;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er.d f337459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(er.d dVar) {
        super(1);
        this.f337459d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        er.d dVar = this.f337459d;
        java.lang.String str = dVar.f337460q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = dVar.f337463f;
        sb6.append(interfaceC4987x84e327cb.mo42933xb5885648());
        sb6.append(" fetch ");
        sb6.append(booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (booleanValue) {
            boolean b17 = new fr.b().b(fr.d.f347220a.a((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f337460q, interfaceC4987x84e327cb.mo42933xb5885648() + " verify " + b17);
            dVar.f(b17);
        } else {
            dVar.f(false);
        }
        return jz5.f0.f384359a;
    }
}
