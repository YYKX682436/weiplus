package so5;

/* loaded from: classes14.dex */
public final class u implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f492442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f492443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so5.y f492444f;

    public u(int i17, boolean z17, so5.y yVar) {
        this.f492442d = i17;
        this.f492443e = z17;
        this.f492444f = yVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uo5.j jVar = (uo5.j) obj;
        boolean z17 = jVar instanceof uo5.e;
        so5.y yVar = this.f492444f;
        int i17 = this.f492442d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIP.EncoderManager", "on codec " + i17 + " state error " + ((uo5.e) jVar).f511250a);
            if (this.f492443e) {
                yVar.f492464r[i17].f492420b++;
            } else {
                yVar.f492464r[i17].f492419a++;
            }
            yVar.f492464r[i17].f492421c = false;
            yVar.i(i17);
            yVar.f492464r[i17].f492423e = true;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar, uo5.i.f511254a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "configHWEncoder: on codec " + i17 + " state working");
            yVar.f492464r[i17].f492421c = true;
        } else if (jVar instanceof uo5.h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "on codec " + i17 + " state reset");
            so5.n nVar = yVar.f492464r[i17];
            nVar.f492421c = false;
            nVar.f492422d = true;
        } else {
            yVar.f492464r[i17].f492421c = false;
        }
        return jz5.f0.f384359a;
    }
}
