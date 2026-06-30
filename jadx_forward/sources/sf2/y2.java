package sf2;

/* loaded from: classes5.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488906h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, sf2.d3 d3Var, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488902d = hVar;
        this.f488903e = str;
        this.f488904f = d3Var;
        this.f488905g = str2;
        this.f488906h = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.y2(this.f488902d, interfaceC29045xdcb5ca57, this.f488903e, this.f488904f, this.f488905g, this.f488906h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.y2 y2Var = (sf2.y2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ux1 ux1Var = (r45.ux1) ((xg2.i) this.f488902d).f535926b;
        sf2.d3 d3Var = this.f488904f;
        java.lang.String str = d3Var.f488638o;
        java.lang.String str2 = this.f488903e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvSearchMusicRequest success, realKey ");
            sb6.append(str2);
            sb6.append(", ID ");
            sb6.append(this.f488905g);
            sb6.append(", result continueFlag ");
            sb6.append(ux1Var.f469248f);
            sb6.append(' ');
            java.util.LinkedList play_basic_info_list = ux1Var.f469246d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(play_basic_info_list, "play_basic_info_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(play_basic_info_list, 10));
            java.util.Iterator it = play_basic_info_list.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.ay1) it.next()).f451884e);
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", sb6.toString());
            this.f488906h.f391656d = ux1Var;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "FinderLiveKtvSearchMusicRequest: Search for key:" + str2 + " has outdated. Drop search result and wait for " + d3Var.f488638o + "'s result back");
        }
        return jz5.f0.f384359a;
    }
}
