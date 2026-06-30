package ok4;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ok4.e f427543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, ok4.e eVar) {
        super(0);
        this.f427542d = str;
        this.f427543e = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 c6749x237baa80;
        java.util.HashMap hashMap = ok4.u.f427575b;
        java.lang.String str = this.f427542d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 c6749x237baa802 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80) hashMap.get(str);
        ok4.e eVar = this.f427543e;
        if (c6749x237baa802 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "SnsVideoDownloadReporter to report " + str + ", >> " + c6749x237baa802.n() + ' ' + eVar + ' ' + java.lang.Thread.currentThread().getName());
            if (c6749x237baa802.F <= 0 && c6749x237baa802.H <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "struct is no to download, " + str);
                hashMap.remove(str);
                return jz5.f0.f384359a;
            }
            c6749x237baa802.k();
            c6749x237baa80 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80) hashMap.remove(str);
        } else {
            c6749x237baa80 = null;
        }
        if (c6749x237baa80 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "report >> " + str + " >> is no have struct, " + eVar);
        }
        return jz5.f0.f384359a;
    }
}
