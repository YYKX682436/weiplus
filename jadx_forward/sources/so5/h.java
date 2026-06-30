package so5;

/* loaded from: classes14.dex */
public final class h implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f492374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so5.m f492375e;

    public h(int i17, so5.m mVar) {
        this.f492374d = i17;
        this.f492375e = mVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uo5.j jVar = (uo5.j) obj;
        boolean z17 = jVar instanceof uo5.e;
        int i17 = this.f492374d;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decoder ");
            sb6.append(i17);
            sb6.append(" error ");
            uo5.e eVar = (uo5.e) jVar;
            sb6.append(eVar.f511250a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIP.DecoderManager", sb6.toString());
            so5.m mVar = this.f492375e;
            so5.d dVar = (so5.d) mVar.f492414n.get(i17);
            if (dVar != null) {
                dVar.a();
            }
            mVar.f492414n.remove(i17);
            android.util.SparseArray sparseArray = mVar.f492415o;
            if (sparseArray.indexOfKey(i17) < 0) {
                sparseArray.put(i17, new so5.c(0, 1, null));
            }
            ((so5.c) sparseArray.get(i17)).f492332a++;
            p3325xe03a0797.p3326xc267989b.v2.b(interfaceC29045xdcb5ca57.mo48699x76847179(), new java.util.concurrent.CancellationException("mid " + i17 + ' ' + eVar.f511250a));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIP.DecoderManager", "decoder " + i17 + " state change " + jVar);
        }
        return jz5.f0.f384359a;
    }
}
