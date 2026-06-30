package hw;

/* loaded from: classes7.dex */
public final class d0 {
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final hw.e0 a(java.lang.String jsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        try {
            cl0.g gVar = new cl0.g(jsonStr);
            return new hw.e0(gVar.mo15073xfb822ef2("disconnect_as_crash_frequency_threshold_in_microseconds"), gVar.mo15072xb58848b9("max_crash_limit_before_close_feature"), gVar.mo15073xfb822ef2("recover_feature_switch_after_in_seconds"));
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicEcsTLBaseFeatureService", e17, "hy: json parse failed!! use default config, ori json is ".concat(jsonStr), new java.lang.Object[0]);
            return a("\n            {\"disconnect_as_crash_frequency_threshold_in_microseconds\": 30000,\n            \"max_crash_limit_before_close_feature\": 3,\n            \"recover_feature_switch_after_in_seconds\": 86400}\n        ");
        }
    }
}
