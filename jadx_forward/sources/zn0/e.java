package zn0;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn0.i f555864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig f555865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, zn0.i iVar, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig tRTCTranscodingConfig) {
        super(2);
        this.f555863d = str;
        this.f555864e = iVar;
        this.f555865f = tRTCTranscodingConfig;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List configList = (java.util.List) obj;
        java.util.LinkedList userList = (java.util.LinkedList) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configList, "configList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userList, "userList");
        int i17 = 0;
        for (java.lang.Object obj3 : configList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            zn0.v vVar = (zn0.v) obj3;
            vVar.f555944i = this.f555863d;
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) kz5.n0.a0(userList, vVar.f555946n - 1);
            if (tRTCMixUser != null) {
                java.lang.String str = vVar.f555939d;
                tRTCMixUser.f57070xce2b2e46 = str;
                tRTCMixUser.f57069xb8c992da = vVar.f555940e;
                tRTCMixUser.f57065x968497be = true;
                zn0.g0 i19 = this.f555864e.f555885b.i(str, 0);
                if (i19 != null) {
                    tRTCMixUser.f57065x968497be = i19.f555881c;
                }
                this.f555865f.f57150xbef7910c.add(tRTCMixUser);
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
