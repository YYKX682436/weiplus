package mx0;

/* loaded from: classes5.dex */
public final class ea extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.ja f413502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(mx0.ja jaVar) {
        super(0);
        this.f413502d = jaVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean m40092xb9aa8b5f;
        int Ni;
        int i17 = ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) this.f413502d.f413611g).M1;
        if (60 == i17 || 61 == i17) {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_record_template_red_packet_preload_limit, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "redPacketPreloadLimit:" + Ni);
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (!r75.d.f474792f) {
                m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
            } else if (r75.d.f474790d == -100) {
                int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
                r75.d.f474790d = m40067xab9ed241;
                m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
            } else {
                ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
                m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
            }
            if (m40092xb9aa8b5f) {
                Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_record_template_preload_wifi_limit, 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "wifiPreloadLimit: " + Ni);
            } else {
                Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_record_template_preload_mobile_limit, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "4gPreloadLimit: " + Ni);
            }
        }
        return java.lang.Integer.valueOf(Ni);
    }
}
