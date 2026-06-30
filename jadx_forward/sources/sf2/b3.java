package sf2;

/* loaded from: classes5.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488593h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, sf2.d3 d3Var, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488589d = hVar;
        this.f488590e = str;
        this.f488591f = d3Var;
        this.f488592g = str2;
        this.f488593h = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.b3(this.f488589d, interfaceC29045xdcb5ca57, this.f488590e, this.f488591f, this.f488592g, this.f488593h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.b3 b3Var = (sf2.b3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.wx1 wx1Var = (r45.wx1) ((xg2.i) this.f488589d).f535926b;
        sf2.d3 d3Var = this.f488591f;
        java.lang.String str = d3Var.f488637n;
        java.lang.String str2 = this.f488590e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvSearchMusicSmartBoxRequest success, content ");
            sb6.append(str2);
            sb6.append(", ID ");
            sb6.append(this.f488592g);
            sb6.append(", ");
            java.util.LinkedList<r45.hy1> item_list = wx1Var.f471085d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item_list, "item_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(item_list, 10));
            for (r45.hy1 hy1Var : item_list) {
                arrayList.add(hy1Var.f458086f + ' ' + hy1Var.f458087g);
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", sb6.toString());
            this.f488593h.f391656d = wx1Var;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "FinderLiveKtvSearchMusicSmartBoxRequest: Search for:" + str2 + " has outdated. Drop search result and wait for " + d3Var.f488637n + "'s result back");
        }
        return jz5.f0.f384359a;
    }
}
