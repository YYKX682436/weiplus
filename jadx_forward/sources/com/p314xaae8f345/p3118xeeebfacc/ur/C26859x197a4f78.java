package com.p314xaae8f345.p3118xeeebfacc.ur;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/unit_rc/ur/ProfileConfigCpp;", "", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.tencent.unit_rc.ur.ProfileConfigCpp */
/* loaded from: classes15.dex */
public class C26859x197a4f78 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p3118xeeebfacc.ur.C26859x197a4f78.Companion INSTANCE = new com.p314xaae8f345.p3118xeeebfacc.ur.C26859x197a4f78.Companion(null);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007J$\u0010\u000e\u001a\u00020\b2\u001a\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007¨\u0006\u0012"}, d2 = {"Lcom/tencent/unit_rc/ur/ProfileConfigCpp$Companion;", "", "", "reportCount", "maxReportCount", "reportInterval", "minReportProfileInterval", "maxReportLength", "Ljz5/f0;", "setReportConfig", "Lkotlin/Function1;", "", "", "reportFunc", "setReportFunc", "report", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.tencent.unit_rc.ur.ProfileConfigCpp$Companion, reason: from kotlin metadata */
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: setReportConfig$default */
        public static /* synthetic */ void m106110x90fa28b5(com.p314xaae8f345.p3118xeeebfacc.ur.C26859x197a4f78.Companion companion, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj) {
            if ((i29 & 1) != 0) {
                i17 = 10000;
            }
            if ((i29 & 2) != 0) {
                i18 = 10000000;
            }
            int i37 = i18;
            if ((i29 & 4) != 0) {
                i19 = 7200;
            }
            int i38 = i19;
            if ((i29 & 8) != 0) {
                i27 = 1800;
            }
            int i39 = i27;
            if ((i29 & 16) != 0) {
                i28 = 6656;
            }
            companion.m106112x9f9c9b18(i17, i37, i38, i39, i28);
        }

        /* renamed from: report */
        public final void m106111xc84c5534() {
            p3380x6a61f93.p3385xf51700ea.C30576x21b361c4.m170021x21b3857a();
        }

        /* renamed from: setReportConfig */
        public final void m106112x9f9c9b18(int i17, int i18, int i19, int i27, int i28) {
            p3380x6a61f93.p3385xf51700ea.C30576x21b361c4.m170020x21b32640(i17, i18, i19, i27, i28);
        }

        /* renamed from: setReportFunc */
        public final void m106113x8f7d381a(yz5.l lVar) {
            p3380x6a61f93.p3385xf51700ea.C30576x21b361c4.m170022x21b91655(com.p314xaae8f345.p3118xeeebfacc.ur.C26852xbf94a5ef.INSTANCE.m106093x3b1599b7(lVar));
        }
    }

    /* renamed from: report */
    public static final void m106107xc84c5534() {
        INSTANCE.m106111xc84c5534();
    }

    /* renamed from: setReportConfig */
    public static final void m106108x9f9c9b18(int i17, int i18, int i19, int i27, int i28) {
        INSTANCE.m106112x9f9c9b18(i17, i18, i19, i27, i28);
    }

    /* renamed from: setReportFunc */
    public static final void m106109x8f7d381a(yz5.l lVar) {
        INSTANCE.m106113x8f7d381a(lVar);
    }
}
