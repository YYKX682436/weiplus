package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfe extends com.google.android.gms.internal.measurement.zzhh {
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> zzaij = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> zzaik = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> zzail = new java.util.concurrent.atomic.AtomicReference<>();

    public zzfe(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
    }

    private final boolean zzil() {
        return this.zzacw.zzge().isLoggable(3);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public final java.lang.String zza(com.google.android.gms.internal.measurement.zzep zzepVar) {
        if (zzepVar == null) {
            return null;
        }
        if (!zzil()) {
            return zzepVar.toString();
        }
        return "Event{appId='" + zzepVar.zzti + "', name='" + zzbj(zzepVar.name) + "', params=" + zzb(zzepVar.zzafq) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final java.lang.String zzb(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!zzil()) {
            return bundle.toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : bundle.keySet()) {
            sb6.append(sb6.length() != 0 ? ", " : "Bundle[{");
            sb6.append(zzbk(str));
            sb6.append("=");
            sb6.append(bundle.get(str));
        }
        sb6.append("}]");
        return sb6.toString();
    }

    public final java.lang.String zzbj(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !zzil() ? str : zza(str, com.google.android.gms.measurement.AppMeasurement.Event.zzacy, com.google.android.gms.measurement.AppMeasurement.Event.zzacx, zzaij);
    }

    public final java.lang.String zzbk(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !zzil() ? str : zza(str, com.google.android.gms.measurement.AppMeasurement.Param.zzada, com.google.android.gms.measurement.AppMeasurement.Param.zzacz, zzaik);
    }

    public final java.lang.String zzbl(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!zzil()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zza(str, com.google.android.gms.measurement.AppMeasurement.UserProperty.zzadc, com.google.android.gms.measurement.AppMeasurement.UserProperty.zzadb, zzail);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return false;
    }

    private final java.lang.String zzb(com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (zzerVar == null) {
            return null;
        }
        return !zzil() ? zzerVar.toString() : zzb(zzerVar.zzif());
    }

    public final java.lang.String zza(com.google.android.gms.internal.measurement.zzke zzkeVar) {
        if (zzkeVar == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\nevent_filter {\n");
        zza(sb6, 0, "filter_id", zzkeVar.zzarp);
        zza(sb6, 0, "event_name", zzbj(zzkeVar.zzarq));
        zza(sb6, 1, "event_count_filter", zzkeVar.zzart);
        sb6.append("  filters {\n");
        for (com.google.android.gms.internal.measurement.zzkf zzkfVar : zzkeVar.zzarr) {
            zza(sb6, 2, zzkfVar);
        }
        zza(sb6, 1);
        sb6.append("}\n}\n");
        return sb6.toString();
    }

    public final java.lang.String zza(com.google.android.gms.internal.measurement.zzkh zzkhVar) {
        if (zzkhVar == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\nproperty_filter {\n");
        zza(sb6, 0, "filter_id", zzkhVar.zzarp);
        zza(sb6, 0, "property_name", zzbl(zzkhVar.zzasf));
        zza(sb6, 1, zzkhVar.zzasg);
        sb6.append("}\n");
        return sb6.toString();
    }

    public final java.lang.String zzb(com.google.android.gms.internal.measurement.zzeu zzeuVar) {
        if (zzeuVar == null) {
            return null;
        }
        if (!zzil()) {
            return zzeuVar.toString();
        }
        return "origin=" + zzeuVar.origin + ",name=" + zzbj(zzeuVar.name) + ",params=" + zzb(zzeuVar.zzafq);
    }

    public final java.lang.String zza(com.google.android.gms.internal.measurement.zzkp zzkpVar) {
        com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr;
        int i17;
        com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr2;
        int i18;
        com.google.android.gms.internal.measurement.zzfe zzfeVar = this;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\nbatch {\n");
        com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr3 = zzkpVar.zzatf;
        if (zzkqVarArr3 != null) {
            int length = zzkqVarArr3.length;
            int i19 = 0;
            while (i19 < length) {
                com.google.android.gms.internal.measurement.zzkq zzkqVar = zzkqVarArr3[i19];
                if (zzkqVar != null) {
                    zza(sb6, 1);
                    sb6.append("bundle {\n");
                    zza(sb6, 1, "protocol_version", zzkqVar.zzath);
                    zza(sb6, 1, "platform", zzkqVar.zzatp);
                    zza(sb6, 1, "gmp_version", zzkqVar.zzatt);
                    zza(sb6, 1, "uploading_gmp_version", zzkqVar.zzatu);
                    zza(sb6, 1, "config_version", zzkqVar.zzauf);
                    zza(sb6, 1, "gmp_app_id", zzkqVar.zzadm);
                    zza(sb6, 1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzkqVar.zzti);
                    zza(sb6, 1, "app_version", zzkqVar.zzth);
                    zza(sb6, 1, "app_version_major", zzkqVar.zzaub);
                    zza(sb6, 1, "firebase_instance_id", zzkqVar.zzado);
                    zza(sb6, 1, "dev_cert_hash", zzkqVar.zzatx);
                    zza(sb6, 1, "app_store", zzkqVar.zzadt);
                    zza(sb6, 1, "upload_timestamp_millis", zzkqVar.zzatk);
                    zza(sb6, 1, "start_timestamp_millis", zzkqVar.zzatl);
                    zza(sb6, 1, "end_timestamp_millis", zzkqVar.zzatm);
                    zza(sb6, 1, "previous_bundle_start_timestamp_millis", zzkqVar.zzatn);
                    zza(sb6, 1, "previous_bundle_end_timestamp_millis", zzkqVar.zzato);
                    zza(sb6, 1, "app_instance_id", zzkqVar.zzadl);
                    zza(sb6, 1, "resettable_device_id", zzkqVar.zzatv);
                    zza(sb6, 1, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, zzkqVar.zzaue);
                    zza(sb6, 1, "limited_ad_tracking", zzkqVar.zzatw);
                    zza(sb6, 1, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_OS_VERSION, zzkqVar.zzatq);
                    zza(sb6, 1, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_MODEL, zzkqVar.zzatr);
                    zza(sb6, 1, "user_default_language", zzkqVar.zzafn);
                    zza(sb6, 1, "time_zone_offset_minutes", zzkqVar.zzats);
                    zza(sb6, 1, "bundle_sequential_index", zzkqVar.zzaty);
                    zza(sb6, 1, "service_upload", zzkqVar.zzatz);
                    zza(sb6, 1, "health_monitor", zzkqVar.zzaek);
                    java.lang.Long l17 = zzkqVar.zzaug;
                    if (l17 != null && l17.longValue() != 0) {
                        zza(sb6, 1, "android_id", zzkqVar.zzaug);
                    }
                    java.lang.Integer num = zzkqVar.zzauj;
                    if (num != null) {
                        zza(sb6, 1, "retry_counter", num);
                    }
                    com.google.android.gms.internal.measurement.zzks[] zzksVarArr = zzkqVar.zzatj;
                    int i27 = 2;
                    if (zzksVarArr != null) {
                        int length2 = zzksVarArr.length;
                        int i28 = 0;
                        while (i28 < length2) {
                            com.google.android.gms.internal.measurement.zzks zzksVar = zzksVarArr[i28];
                            if (zzksVar != null) {
                                zza(sb6, i27);
                                sb6.append("user_property {\n");
                                zzkqVarArr2 = zzkqVarArr3;
                                i18 = length;
                                zza(sb6, 2, "set_timestamp_millis", zzksVar.zzaun);
                                zza(sb6, 2, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzfeVar.zzbl(zzksVar.name));
                                zza(sb6, 2, "string_value", zzksVar.zzajf);
                                zza(sb6, 2, "int_value", zzksVar.zzate);
                                zza(sb6, 2, "double_value", zzksVar.zzarc);
                                zza(sb6, 2);
                                sb6.append("}\n");
                            } else {
                                zzkqVarArr2 = zzkqVarArr3;
                                i18 = length;
                            }
                            i28++;
                            zzkqVarArr3 = zzkqVarArr2;
                            length = i18;
                            i27 = 2;
                        }
                    }
                    zzkqVarArr = zzkqVarArr3;
                    i17 = length;
                    com.google.android.gms.internal.measurement.zzkm[] zzkmVarArr = zzkqVar.zzaua;
                    if (zzkmVarArr != null) {
                        for (com.google.android.gms.internal.measurement.zzkm zzkmVar : zzkmVarArr) {
                            if (zzkmVar != null) {
                                zza(sb6, 2);
                                sb6.append("audience_membership {\n");
                                zza(sb6, 2, "audience_id", zzkmVar.zzarl);
                                zza(sb6, 2, "new_audience", zzkmVar.zzasy);
                                zza(sb6, 2, "current_data", zzkmVar.zzasw);
                                zza(sb6, 2, "previous_data", zzkmVar.zzasx);
                                zza(sb6, 2);
                                sb6.append("}\n");
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.zzkn[] zzknVarArr = zzkqVar.zzati;
                    if (zzknVarArr != null) {
                        int length3 = zzknVarArr.length;
                        int i29 = 0;
                        while (i29 < length3) {
                            com.google.android.gms.internal.measurement.zzkn zzknVar = zzknVarArr[i29];
                            if (zzknVar != null) {
                                zza(sb6, 2);
                                sb6.append("event {\n");
                                zza(sb6, 2, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzfeVar.zzbj(zzknVar.name));
                                zza(sb6, 2, "timestamp_millis", zzknVar.zzatb);
                                zza(sb6, 2, "previous_timestamp_millis", zzknVar.zzatc);
                                zza(sb6, 2, "count", zzknVar.count);
                                com.google.android.gms.internal.measurement.zzko[] zzkoVarArr = zzknVar.zzata;
                                if (zzkoVarArr != null) {
                                    int length4 = zzkoVarArr.length;
                                    int i37 = 0;
                                    while (i37 < length4) {
                                        com.google.android.gms.internal.measurement.zzko zzkoVar = zzkoVarArr[i37];
                                        if (zzkoVar != null) {
                                            zza(sb6, 3);
                                            sb6.append("param {\n");
                                            zza(sb6, 3, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzfeVar.zzbk(zzkoVar.name));
                                            zza(sb6, 3, "string_value", zzkoVar.zzajf);
                                            zza(sb6, 3, "int_value", zzkoVar.zzate);
                                            zza(sb6, 3, "double_value", zzkoVar.zzarc);
                                            zza(sb6, 3);
                                            sb6.append("}\n");
                                        }
                                        i37++;
                                        zzfeVar = this;
                                    }
                                }
                                zza(sb6, 2);
                                sb6.append("}\n");
                            }
                            i29++;
                            zzfeVar = this;
                        }
                    }
                    zza(sb6, 1);
                    sb6.append("}\n");
                } else {
                    zzkqVarArr = zzkqVarArr3;
                    i17 = length;
                }
                i19++;
                zzfeVar = this;
                zzkqVarArr3 = zzkqVarArr;
                length = i17;
            }
        }
        sb6.append("}\n");
        return sb6.toString();
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.concurrent.atomic.AtomicReference<java.lang.String[]> atomicReference) {
        java.lang.String str2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(atomicReference);
        com.google.android.gms.common.internal.Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i17 = 0; i17 < strArr.length; i17++) {
            if (com.google.android.gms.internal.measurement.zzka.zzs(str, strArr[i17])) {
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

    private final void zza(java.lang.StringBuilder sb6, int i17, com.google.android.gms.internal.measurement.zzkf zzkfVar) {
        java.lang.String str;
        if (zzkfVar == null) {
            return;
        }
        zza(sb6, i17);
        sb6.append("filter {\n");
        zza(sb6, i17, "complement", zzkfVar.zzarx);
        zza(sb6, i17, "param_name", zzbk(zzkfVar.zzary));
        int i18 = i17 + 1;
        com.google.android.gms.internal.measurement.zzki zzkiVar = zzkfVar.zzarv;
        if (zzkiVar != null) {
            zza(sb6, i18);
            sb6.append("string_filter");
            sb6.append(" {\n");
            java.lang.Integer num = zzkiVar.zzash;
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
            zza(sb6, i18, "expression", zzkiVar.zzasi);
            zza(sb6, i18, "case_sensitive", zzkiVar.zzasj);
            if (zzkiVar.zzask.length > 0) {
                zza(sb6, i18 + 1);
                sb6.append("expression_list {\n");
                for (java.lang.String str2 : zzkiVar.zzask) {
                    zza(sb6, i18 + 2);
                    sb6.append(str2);
                    sb6.append("\n");
                }
                sb6.append("}\n");
            }
            zza(sb6, i18);
            sb6.append("}\n");
        }
        zza(sb6, i18, "number_filter", zzkfVar.zzarw);
        zza(sb6, i17);
        sb6.append("}\n");
    }

    private final void zza(java.lang.StringBuilder sb6, int i17, java.lang.String str, com.google.android.gms.internal.measurement.zzkg zzkgVar) {
        if (zzkgVar == null) {
            return;
        }
        zza(sb6, i17);
        sb6.append(str);
        sb6.append(" {\n");
        java.lang.Integer num = zzkgVar.zzarz;
        if (num != null) {
            int intValue = num.intValue();
            zza(sb6, i17, "comparison_type", intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? "UNKNOWN_COMPARISON_TYPE" : "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
        }
        zza(sb6, i17, "match_as_float", zzkgVar.zzasa);
        zza(sb6, i17, "comparison_value", zzkgVar.zzasb);
        zza(sb6, i17, "min_comparison_value", zzkgVar.zzasc);
        zza(sb6, i17, "max_comparison_value", zzkgVar.zzasd);
        zza(sb6, i17);
        sb6.append("}\n");
    }

    private static void zza(java.lang.StringBuilder sb6, int i17, java.lang.String str, com.google.android.gms.internal.measurement.zzkr zzkrVar) {
        if (zzkrVar == null) {
            return;
        }
        zza(sb6, 3);
        sb6.append(str);
        sb6.append(" {\n");
        int i18 = 0;
        if (zzkrVar.zzaul != null) {
            zza(sb6, 4);
            sb6.append("results: ");
            long[] jArr = zzkrVar.zzaul;
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
        if (zzkrVar.zzauk != null) {
            zza(sb6, 4);
            sb6.append("status: ");
            long[] jArr2 = zzkrVar.zzauk;
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
