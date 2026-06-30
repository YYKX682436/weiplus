package kw2;

/* loaded from: classes15.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.e f394563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw2.g f394564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f394567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw2.h f394568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kw2.e eVar, kw2.g gVar, java.lang.String str, kw2.y yVar, boolean z17, kw2.h hVar) {
        super(0);
        this.f394563d = eVar;
        this.f394564e = gVar;
        this.f394565f = str;
        this.f394566g = yVar;
        this.f394567h = z17;
        this.f394568i = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        kw2.e eVar = this.f394563d;
        eVar.C = true;
        long j18 = eVar.f394497j;
        kw2.g gVar = this.f394564e;
        dn.h hVar = gVar.f394549d;
        kw2.d dVar = kw2.e.V;
        so2.i3 i3Var = gVar.f394548c;
        kw2.y yVar = this.f394566g;
        java.lang.String str = this.f394565f;
        if (hVar != null) {
            dVar.e(eVar, hVar);
            kw2.e eVar2 = eVar.S;
            dn.h hVar2 = gVar.f394549d;
            if (eVar2 != null) {
                eVar.G = i3Var != null ? i3Var.f68968x799e9d9e : 0L;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
                long j19 = hVar2.f69548xe026fea1;
                j17 = j18;
                long j27 = eVar.G - eVar.F;
                long j28 = j19 - j27;
                if (j27 < 0 || j28 < 0) {
                    kw2.e eVar3 = eVar.S;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar3);
                    eVar3.f394497j = 0L;
                    eVar.f394497j = j19;
                    kw2.e eVar4 = eVar.S;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar4);
                    eVar4.N = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem segment invalid trp:" + j19 + '-' + j28 + '-' + j27 + "  " + eVar.Q + ' ' + str);
                } else {
                    kw2.e eVar5 = eVar.S;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar5);
                    eVar5.N = true;
                    kw2.e eVar6 = eVar.S;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar6);
                    eVar6.f394497j = j28;
                    eVar.f394497j = j27;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem segment valid trp:" + j19 + '-' + j28 + '-' + j27 + "  " + eVar.Q + ' ' + str);
                }
            } else {
                j17 = j18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + eVar.Q + ' ' + str);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
            yVar.c(hVar2.f69548xe026fea1);
        } else {
            j17 = j18;
            if (i3Var != null) {
                dVar.d(eVar, i3Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + eVar.Q + ' ' + str + " updateFromMediaCacheOnStop from " + eVar.f394497j);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + eVar.Q + ' ' + str + " invalid state.");
            }
        }
        boolean z17 = this.f394567h;
        if (j17 > 0) {
            eVar.f394497j += j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#onDownloaderStop " + z17 + ' ' + eVar.Q + ' ' + str + " beforeItemSize:" + j17 + ' ' + eVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#onDownloaderStop " + z17 + ' ' + eVar.Q + ' ' + str + ' ' + eVar);
        }
        if (z17) {
            kw2.y.a(yVar, eVar.f394509v, this.f394568i, "handleOnPlayItemClose#" + str);
        }
        return jz5.f0.f384359a;
    }
}
