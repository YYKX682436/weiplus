package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfe */
/* loaded from: classes16.dex */
public final class C2214x394bff extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzaij */
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> f6601x6f02202 = new java.util.concurrent.atomic.AtomicReference<>();

    /* renamed from: zzaik */
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> f6602x6f02203 = new java.util.concurrent.atomic.AtomicReference<>();

    /* renamed from: zzail */
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> f6603x6f02204 = new java.util.concurrent.atomic.AtomicReference<>();

    public C2214x394bff(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
    }

    /* renamed from: zzil */
    private final boolean m19100x394c63() {
        return this.f6815x6f02155.mo18976x394c1e().m19107x492678c7(3);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    public final java.lang.String zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2199x394beb c2199x394beb) {
        if (c2199x394beb == null) {
            return null;
        }
        if (!m19100x394c63()) {
            return c2199x394beb.m19072x9616526c();
        }
        return "Event{appId='" + c2199x394beb.f6515x394db5 + "', name='" + m19101x394b88(c2199x394beb.f6510x337a8b) + "', params=" + zzb(c2199x394beb.f6514x6f021ac) + "}";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    public final java.lang.String zzb(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m19100x394c63()) {
            return bundle.toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : bundle.keySet()) {
            sb6.append(sb6.length() != 0 ? ", " : "Bundle[{");
            sb6.append(m19102x394b89(str));
            sb6.append("=");
            sb6.append(bundle.get(str));
        }
        sb6.append("}]");
        return sb6.toString();
    }

    /* renamed from: zzbj */
    public final java.lang.String m19101x394b88(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !m19100x394c63() ? str : zza(str, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Event.f7357x6f02157, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Event.f7356x6f02156, f6601x6f02202);
    }

    /* renamed from: zzbk */
    public final java.lang.String m19102x394b89(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !m19100x394c63() ? str : zza(str, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7362x6f0215e, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7361x6f02158, f6602x6f02203);
    }

    /* renamed from: zzbl */
    public final java.lang.String m19103x394b8a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!m19100x394c63()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zza(str, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.UserProperty.f7365x6f02160, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.UserProperty.f7364x6f0215f, f6603x6f02204);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return super.mo18962x394b92();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfr */
    public final /* bridge */ /* synthetic */ void mo18963x394c0c() {
        super.mo18963x394c0c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfs */
    public final /* bridge */ /* synthetic */ void mo18964x394c0d() {
        super.mo18964x394c0d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzft */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2178x394bd1 mo18965x394c0e() {
        return super.mo18965x394c0e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfu */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 mo18966x394c0f() {
        return super.mo18966x394c0f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfv */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2211x394bfc mo18967x394c10() {
        return super.mo18967x394c10();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2198x394bea mo18968x394c11() {
        return super.mo18968x394c11();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfx */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 mo18969x394c12() {
        return super.mo18969x394c12();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfy */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d mo18970x394c13() {
        return super.mo18970x394c13();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfz */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd mo18971x394c14() {
        return super.mo18971x394c14();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzga */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff mo18972x394c1a() {
        return super.mo18972x394c1a();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgb */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo18973x394c1b() {
        return super.mo18973x394c1b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgc */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c() {
        return super.mo18974x394c1c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzgd */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 mo18975x394c1d() {
        return super.mo18975x394c1d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzge */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e() {
        return super.mo18976x394c1e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgf */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo18977x394c1f() {
        return super.mo18977x394c1f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgg */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo18978x394c20() {
        return super.mo18978x394c20();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzhf */
    public final boolean mo19069x394c3e() {
        return false;
    }

    private final java.lang.String zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed) {
        if (c2201x394bed == null) {
            return null;
        }
        return !m19100x394c63() ? c2201x394bed.m19080x9616526c() : zzb(c2201x394bed.m19082x394c5d());
    }

    public final java.lang.String zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a) {
        if (c2344x394c9a == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\nevent_filter {\n");
        zza(sb6, 0, "filter_id", c2344x394c9a.f7046x6f0231f);
        zza(sb6, 0, "event_name", m19101x394b88(c2344x394c9a.f7047x6f02320));
        zza(sb6, 1, "event_count_filter", c2344x394c9a.f7050x6f02323);
        sb6.append("  filters {\n");
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b : c2344x394c9a.f7048x6f02321) {
            zza(sb6, 2, c2345x394c9b);
        }
        zza(sb6, 1);
        sb6.append("}\n}\n");
        return sb6.toString();
    }

    public final java.lang.String zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d) {
        if (c2347x394c9d == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\nproperty_filter {\n");
        zza(sb6, 0, "filter_id", c2347x394c9d.f7062x6f0231f);
        zza(sb6, 0, "property_name", m19103x394b8a(c2347x394c9d.f7063x6f02334));
        zza(sb6, 1, c2347x394c9d.f7064x6f02335);
        sb6.append("}\n");
        return sb6.toString();
    }

    public final java.lang.String zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0) {
        if (c2204x394bf0 == null) {
            return null;
        }
        if (!m19100x394c63()) {
            return c2204x394bf0.m19084x9616526c();
        }
        return "origin=" + c2204x394bf0.f6531xc3e1af26 + ",name=" + m19101x394b88(c2204x394bf0.f6530x337a8b) + ",params=" + zzb(c2204x394bf0.f6532x6f021ac);
    }

    public final java.lang.String zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca5) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr;
        int i17;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr2;
        int i18;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff c2214x394bff = this;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\nbatch {\n");
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr3 = c2355x394ca5.f7100x6f02353;
        if (c2356x394ca6Arr3 != null) {
            int length = c2356x394ca6Arr3.length;
            int i19 = 0;
            while (i19 < length) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6 = c2356x394ca6Arr3[i19];
                if (c2356x394ca6 != null) {
                    zza(sb6, 1);
                    sb6.append("bundle {\n");
                    zza(sb6, 1, "protocol_version", c2356x394ca6.f7108x6f02355);
                    zza(sb6, 1, "platform", c2356x394ca6.f7116x6f0235d);
                    zza(sb6, 1, "gmp_version", c2356x394ca6.f7120x6f02361);
                    zza(sb6, 1, "uploading_gmp_version", c2356x394ca6.f7121x6f02362);
                    zza(sb6, 1, "config_version", c2356x394ca6.f7132x6f02372);
                    zza(sb6, 1, "gmp_app_id", c2356x394ca6.f7103x6f0216a);
                    zza(sb6, 1, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2356x394ca6.f7138x394db5);
                    zza(sb6, 1, "app_version", c2356x394ca6.f7137x394db4);
                    zza(sb6, 1, "app_version_major", c2356x394ca6.f7128x6f0236e);
                    zza(sb6, 1, "firebase_instance_id", c2356x394ca6.f7104x6f0216c);
                    zza(sb6, 1, "dev_cert_hash", c2356x394ca6.f7124x6f02365);
                    zza(sb6, 1, "app_store", c2356x394ca6.f7105x6f02171);
                    zza(sb6, 1, "upload_timestamp_millis", c2356x394ca6.f7111x6f02358);
                    zza(sb6, 1, "start_timestamp_millis", c2356x394ca6.f7112x6f02359);
                    zza(sb6, 1, "end_timestamp_millis", c2356x394ca6.f7113x6f0235a);
                    zza(sb6, 1, "previous_bundle_start_timestamp_millis", c2356x394ca6.f7114x6f0235b);
                    zza(sb6, 1, "previous_bundle_end_timestamp_millis", c2356x394ca6.f7115x6f0235c);
                    zza(sb6, 1, "app_instance_id", c2356x394ca6.f7102x6f02169);
                    zza(sb6, 1, "resettable_device_id", c2356x394ca6.f7122x6f02363);
                    zza(sb6, 1, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, c2356x394ca6.f7131x6f02371);
                    zza(sb6, 1, "limited_ad_tracking", c2356x394ca6.f7123x6f02364);
                    zza(sb6, 1, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52919x5302ea51, c2356x394ca6.f7117x6f0235e);
                    zza(sb6, 1, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52909x9bfe27d4, c2356x394ca6.f7118x6f0235f);
                    zza(sb6, 1, "user_default_language", c2356x394ca6.f7107x6f021a9);
                    zza(sb6, 1, "time_zone_offset_minutes", c2356x394ca6.f7119x6f02360);
                    zza(sb6, 1, "bundle_sequential_index", c2356x394ca6.f7125x6f02366);
                    zza(sb6, 1, "service_upload", c2356x394ca6.f7126x6f02367);
                    zza(sb6, 1, "health_monitor", c2356x394ca6.f7106x6f02187);
                    java.lang.Long l17 = c2356x394ca6.f7133x6f02373;
                    if (l17 != null && l17.longValue() != 0) {
                        zza(sb6, 1, "android_id", c2356x394ca6.f7133x6f02373);
                    }
                    java.lang.Integer num = c2356x394ca6.f7136x6f02376;
                    if (num != null) {
                        zza(sb6, 1, "retry_counter", num);
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[] c2358x394ca8Arr = c2356x394ca6.f7110x6f02357;
                    int i27 = 2;
                    if (c2358x394ca8Arr != null) {
                        int length2 = c2358x394ca8Arr.length;
                        int i28 = 0;
                        while (i28 < length2) {
                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8 c2358x394ca8 = c2358x394ca8Arr[i28];
                            if (c2358x394ca8 != null) {
                                zza(sb6, i27);
                                sb6.append("user_property {\n");
                                c2356x394ca6Arr2 = c2356x394ca6Arr3;
                                i18 = length;
                                zza(sb6, 2, "set_timestamp_millis", c2358x394ca8.f7147x6f0237a);
                                zza(sb6, 2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2214x394bff.m19103x394b8a(c2358x394ca8.f7142x337a8b));
                                zza(sb6, 2, "string_value", c2358x394ca8.f7143x6f0221d);
                                zza(sb6, 2, "int_value", c2358x394ca8.f7146x6f02352);
                                zza(sb6, 2, "double_value", c2358x394ca8.f7145x6f02312);
                                zza(sb6, 2);
                                sb6.append("}\n");
                            } else {
                                c2356x394ca6Arr2 = c2356x394ca6Arr3;
                                i18 = length;
                            }
                            i28++;
                            c2356x394ca6Arr3 = c2356x394ca6Arr2;
                            length = i18;
                            i27 = 2;
                        }
                    }
                    c2356x394ca6Arr = c2356x394ca6Arr3;
                    i17 = length;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2[] c2352x394ca2Arr = c2356x394ca6.f7127x6f0236d;
                    if (c2352x394ca2Arr != null) {
                        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2 c2352x394ca2 : c2352x394ca2Arr) {
                            if (c2352x394ca2 != null) {
                                zza(sb6, 2);
                                sb6.append("audience_membership {\n");
                                zza(sb6, 2, "audience_id", c2352x394ca2.f7084x6f0231b);
                                zza(sb6, 2, "new_audience", c2352x394ca2.f7087x6f02347);
                                zza(sb6, 2, "current_data", c2352x394ca2.f7085x6f02345);
                                zza(sb6, 2, "previous_data", c2352x394ca2.f7086x6f02346);
                                zza(sb6, 2);
                                sb6.append("}\n");
                            }
                        }
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3[] c2353x394ca3Arr = c2356x394ca6.f7109x6f02356;
                    if (c2353x394ca3Arr != null) {
                        int length3 = c2353x394ca3Arr.length;
                        int i29 = 0;
                        while (i29 < length3) {
                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3 = c2353x394ca3Arr[i29];
                            if (c2353x394ca3 != null) {
                                zza(sb6, 2);
                                sb6.append("event {\n");
                                zza(sb6, 2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2214x394bff.m19101x394b88(c2353x394ca3.f7090x337a8b));
                                zza(sb6, 2, "timestamp_millis", c2353x394ca3.f7092x6f0234f);
                                zza(sb6, 2, "previous_timestamp_millis", c2353x394ca3.f7093x6f02350);
                                zza(sb6, 2, "count", c2353x394ca3.f7089x5a7510f);
                                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr = c2353x394ca3.f7091x6f0234e;
                                if (c2354x394ca4Arr != null) {
                                    int length4 = c2354x394ca4Arr.length;
                                    int i37 = 0;
                                    while (i37 < length4) {
                                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 = c2354x394ca4Arr[i37];
                                        if (c2354x394ca4 != null) {
                                            zza(sb6, 3);
                                            sb6.append("param {\n");
                                            zza(sb6, 3, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2214x394bff.m19102x394b89(c2354x394ca4.f7095x337a8b));
                                            zza(sb6, 3, "string_value", c2354x394ca4.f7096x6f0221d);
                                            zza(sb6, 3, "int_value", c2354x394ca4.f7099x6f02352);
                                            zza(sb6, 3, "double_value", c2354x394ca4.f7098x6f02312);
                                            zza(sb6, 3);
                                            sb6.append("}\n");
                                        }
                                        i37++;
                                        c2214x394bff = this;
                                    }
                                }
                                zza(sb6, 2);
                                sb6.append("}\n");
                            }
                            i29++;
                            c2214x394bff = this;
                        }
                    }
                    zza(sb6, 1);
                    sb6.append("}\n");
                } else {
                    c2356x394ca6Arr = c2356x394ca6Arr3;
                    i17 = length;
                }
                i19++;
                c2214x394bff = this;
                c2356x394ca6Arr3 = c2356x394ca6Arr;
                length = i17;
            }
        }
        sb6.append("}\n");
        return sb6.toString();
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.concurrent.atomic.AtomicReference<java.lang.String[]> atomicReference) {
        java.lang.String str2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr2);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(atomicReference);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(strArr.length == strArr2.length);
        for (int i17 = 0; i17 < strArr.length; i17++) {
            if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(str, strArr[i17])) {
                synchronized (atomicReference) {
                    java.lang.String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new java.lang.String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i17] == null) {
                        strArr3[i17] = strArr2[i17] + "(" + strArr[i17] + ")";
                    }
                    str2 = strArr3[i17];
                }
                return str2;
            }
        }
        return str;
    }

    private static void zza(java.lang.StringBuilder sb6, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append("  ");
        }
    }

    private final void zza(java.lang.StringBuilder sb6, int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b) {
        java.lang.String str;
        if (c2345x394c9b == null) {
            return;
        }
        zza(sb6, i17);
        sb6.append("filter {\n");
        zza(sb6, i17, "complement", c2345x394c9b.f7054x6f02327);
        zza(sb6, i17, "param_name", m19102x394b89(c2345x394c9b.f7055x6f02328));
        int i18 = i17 + 1;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e c2348x394c9e = c2345x394c9b.f7052x6f02325;
        if (c2348x394c9e != null) {
            zza(sb6, i18);
            sb6.append("string_filter");
            sb6.append(" {\n");
            java.lang.Integer num = c2348x394c9e.f7065x6f02336;
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str = "REGEXP";
                        break;
                    case 2:
                        str = "BEGINS_WITH";
                        break;
                    case 3:
                        str = "ENDS_WITH";
                        break;
                    case 4:
                        str = "PARTIAL";
                        break;
                    case 5:
                        str = "EXACT";
                        break;
                    case 6:
                        str = "IN_LIST";
                        break;
                    default:
                        str = "UNKNOWN_MATCH_TYPE";
                        break;
                }
                zza(sb6, i18, "match_type", str);
            }
            zza(sb6, i18, "expression", c2348x394c9e.f7066x6f02337);
            zza(sb6, i18, "case_sensitive", c2348x394c9e.f7067x6f02338);
            if (c2348x394c9e.f7068x6f02339.length > 0) {
                zza(sb6, i18 + 1);
                sb6.append("expression_list {\n");
                for (java.lang.String str2 : c2348x394c9e.f7068x6f02339) {
                    zza(sb6, i18 + 2);
                    sb6.append(str2);
                    sb6.append("\n");
                }
                sb6.append("}\n");
            }
            zza(sb6, i18);
            sb6.append("}\n");
        }
        zza(sb6, i18, "number_filter", c2345x394c9b.f7053x6f02326);
        zza(sb6, i17);
        sb6.append("}\n");
    }

    private final void zza(java.lang.StringBuilder sb6, int i17, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c) {
        if (c2346x394c9c == null) {
            return;
        }
        zza(sb6, i17);
        sb6.append(str);
        sb6.append(" {\n");
        java.lang.Integer num = c2346x394c9c.f7056x6f02329;
        if (num != null) {
            int intValue = num.intValue();
            zza(sb6, i17, "comparison_type", intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? "UNKNOWN_COMPARISON_TYPE" : "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
        }
        zza(sb6, i17, "match_as_float", c2346x394c9c.f7057x6f0232f);
        zza(sb6, i17, "comparison_value", c2346x394c9c.f7058x6f02330);
        zza(sb6, i17, "min_comparison_value", c2346x394c9c.f7059x6f02331);
        zza(sb6, i17, "max_comparison_value", c2346x394c9c.f7060x6f02332);
        zza(sb6, i17);
        sb6.append("}\n");
    }

    private static void zza(java.lang.StringBuilder sb6, int i17, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca7) {
        if (c2357x394ca7 == null) {
            return;
        }
        zza(sb6, 3);
        sb6.append(str);
        sb6.append(" {\n");
        int i18 = 0;
        if (c2357x394ca7.f7140x6f02378 != null) {
            zza(sb6, 4);
            sb6.append("results: ");
            long[] jArr = c2357x394ca7.f7140x6f02378;
            int length = jArr.length;
            int i19 = 0;
            int i27 = 0;
            while (i19 < length) {
                java.lang.Long valueOf = java.lang.Long.valueOf(jArr[i19]);
                int i28 = i27 + 1;
                if (i27 != 0) {
                    sb6.append(", ");
                }
                sb6.append(valueOf);
                i19++;
                i27 = i28;
            }
            sb6.append('\n');
        }
        if (c2357x394ca7.f7139x6f02377 != null) {
            zza(sb6, 4);
            sb6.append("status: ");
            long[] jArr2 = c2357x394ca7.f7139x6f02377;
            int length2 = jArr2.length;
            int i29 = 0;
            while (i18 < length2) {
                java.lang.Long valueOf2 = java.lang.Long.valueOf(jArr2[i18]);
                int i37 = i29 + 1;
                if (i29 != 0) {
                    sb6.append(", ");
                }
                sb6.append(valueOf2);
                i18++;
                i29 = i37;
            }
            sb6.append('\n');
        }
        zza(sb6, 3);
        sb6.append("}\n");
    }

    private static void zza(java.lang.StringBuilder sb6, int i17, java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb6, i17 + 1);
        sb6.append(str);
        sb6.append(": ");
        sb6.append(obj);
        sb6.append('\n');
    }
}
