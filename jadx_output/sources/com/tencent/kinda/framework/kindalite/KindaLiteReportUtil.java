package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteReportUtil;", "", "Lcom/tencent/kinda/framework/kindalite/KindaLiteReportData35075;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "mergeData", "", "value", "replaceComma", "", "buildReportArray35075", "(Lcom/tencent/kinda/framework/kindalite/KindaLiteReportData35075;)[Ljava/lang/String;", "Ljz5/f0;", "setGlobalData", "buildReportString35075", "report35075", "", "LOG_ID_35075", "I", "globalData", "Lcom/tencent/kinda/framework/kindalite/KindaLiteReportData35075;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class KindaLiteReportUtil {
    public static final com.tencent.kinda.framework.kindalite.KindaLiteReportUtil INSTANCE = new com.tencent.kinda.framework.kindalite.KindaLiteReportUtil();
    private static final int LOG_ID_35075 = 35075;
    private static volatile com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 globalData;

    private KindaLiteReportUtil() {
    }

    private final java.lang.String[] buildReportArray35075(com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 data) {
        com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 mergeData = mergeData(data);
        java.lang.String[] strArr = new java.lang.String[31];
        strArr[0] = replaceComma(mergeData.getUuid());
        strArr[1] = java.lang.String.valueOf(mergeData.getReportType());
        strArr[2] = java.lang.String.valueOf(mergeData.getUsecase());
        strArr[3] = java.lang.String.valueOf(mergeData.getScene());
        strArr[4] = java.lang.String.valueOf(mergeData.getDuration());
        strArr[5] = java.lang.String.valueOf(mergeData.isReg());
        strArr[6] = replaceComma(mergeData.getTransactionid());
        strArr[7] = replaceComma(mergeData.getReqKey());
        strArr[8] = java.lang.String.valueOf(mergeData.getPrice());
        strArr[9] = java.lang.String.valueOf(mergeData.getChannel());
        strArr[10] = java.lang.String.valueOf(mergeData.getReportComponent());
        strArr[11] = java.lang.String.valueOf(mergeData.getReportAction());
        strArr[12] = java.lang.String.valueOf(mergeData.getReportActionResult());
        strArr[13] = java.lang.String.valueOf(mergeData.getRouteType());
        strArr[14] = java.lang.String.valueOf(mergeData.getPageDidBackType());
        strArr[15] = java.lang.String.valueOf(mergeData.getCmdType());
        strArr[16] = java.lang.String.valueOf(mergeData.getCmdId());
        strArr[17] = replaceComma(mergeData.getAppId());
        strArr[18] = replaceComma(mergeData.getCurrentRoute());
        strArr[19] = "";
        strArr[20] = replaceComma(mergeData.getLiteappVersion());
        strArr[21] = replaceComma(mergeData.getBaseLibVersion());
        strArr[22] = replaceComma(mergeData.getRouteInfo());
        java.lang.String extraString = mergeData.getExtraString();
        if (extraString.length() == 0) {
            extraString = "";
        }
        strArr[23] = replaceComma(extraString);
        strArr[24] = java.lang.String.valueOf(mergeData.getExtraNumber());
        java.lang.String valueString = mergeData.getValueString();
        if (valueString.length() == 0) {
            valueString = "";
        }
        strArr[25] = replaceComma(valueString);
        java.lang.String usecaseUrl = mergeData.getUsecaseUrl();
        strArr[26] = usecaseUrl.length() == 0 ? "" : usecaseUrl;
        strArr[27] = java.lang.String.valueOf(mergeData.getSequence());
        strArr[28] = java.lang.String.valueOf(mergeData.getLocalTime());
        strArr[29] = replaceComma(mergeData.getEnv());
        strArr[30] = replaceComma(mergeData.getUatId());
        return strArr;
    }

    public static /* synthetic */ java.lang.String buildReportString35075$default(com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil, com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075, int i17, java.lang.Object obj) {
        com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil2;
        com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData350752;
        if ((i17 & 1) != 0) {
            kindaLiteReportData350752 = new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(null, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, null, null, 0, 0L, null, null, Integer.MAX_VALUE, null);
            kindaLiteReportUtil2 = kindaLiteReportUtil;
        } else {
            kindaLiteReportUtil2 = kindaLiteReportUtil;
            kindaLiteReportData350752 = kindaLiteReportData35075;
        }
        return kindaLiteReportUtil2.buildReportString35075(kindaLiteReportData350752);
    }

    private final com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 mergeData(com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 data) {
        com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075 = globalData;
        if (kindaLiteReportData35075 == null) {
            return data;
        }
        return data.copy(data.getUuid().length() == 0 ? kindaLiteReportData35075.getUuid() : data.getUuid(), data.getReportType() == 0 ? kindaLiteReportData35075.getReportType() : data.getReportType(), data.getUsecase() == 0 ? kindaLiteReportData35075.getUsecase() : data.getUsecase(), data.getScene() == 0 ? kindaLiteReportData35075.getScene() : data.getScene(), data.getDuration() == 0 ? kindaLiteReportData35075.getDuration() : data.getDuration(), data.isReg() == 0 ? kindaLiteReportData35075.isReg() : data.isReg(), data.getTransactionid().length() == 0 ? kindaLiteReportData35075.getTransactionid() : data.getTransactionid(), data.getReqKey().length() == 0 ? kindaLiteReportData35075.getReqKey() : data.getReqKey(), data.getPrice() == 0 ? kindaLiteReportData35075.getPrice() : data.getPrice(), data.getChannel() == 0 ? kindaLiteReportData35075.getChannel() : data.getChannel(), data.getReportComponent() == 0 ? kindaLiteReportData35075.getReportComponent() : data.getReportComponent(), data.getReportAction() == 0 ? kindaLiteReportData35075.getReportAction() : data.getReportAction(), data.getReportActionResult() == 0 ? kindaLiteReportData35075.getReportActionResult() : data.getReportActionResult(), data.getRouteType() == 0 ? kindaLiteReportData35075.getRouteType() : data.getRouteType(), data.getPageDidBackType() == 0 ? kindaLiteReportData35075.getPageDidBackType() : data.getPageDidBackType(), data.getCmdType() == 0 ? kindaLiteReportData35075.getCmdType() : data.getCmdType(), data.getCmdId() == 0 ? kindaLiteReportData35075.getCmdId() : data.getCmdId(), data.getAppId().length() == 0 ? kindaLiteReportData35075.getAppId() : data.getAppId(), data.getCurrentRoute().length() == 0 ? kindaLiteReportData35075.getCurrentRoute() : data.getCurrentRoute(), data.getQuery().length() == 0 ? kindaLiteReportData35075.getQuery() : data.getQuery(), data.getLiteappVersion().length() == 0 ? kindaLiteReportData35075.getLiteappVersion() : data.getLiteappVersion(), data.getBaseLibVersion().length() == 0 ? kindaLiteReportData35075.getBaseLibVersion() : data.getBaseLibVersion(), data.getRouteInfo().length() == 0 ? kindaLiteReportData35075.getRouteInfo() : data.getRouteInfo(), data.getExtraString().length() == 0 ? kindaLiteReportData35075.getExtraString() : data.getExtraString(), data.getExtraNumber() == 0 ? kindaLiteReportData35075.getExtraNumber() : data.getExtraNumber(), data.getValueString().length() == 0 ? kindaLiteReportData35075.getValueString() : data.getValueString(), data.getUsecaseUrl().length() == 0 ? kindaLiteReportData35075.getUsecaseUrl() : data.getUsecaseUrl(), 0, java.lang.System.currentTimeMillis(), com.tencent.mm.sdk.platformtools.s9.f192976d ? "993" : "idc", data.getUatId().length() == 0 ? kindaLiteReportData35075.getUatId() : data.getUatId());
    }

    private final java.lang.String replaceComma(java.lang.String value) {
        if (value == null) {
            value = "";
        }
        return r26.i0.t(value, ",", "", false);
    }

    public static /* synthetic */ void report35075$default(com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil, com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075, int i17, java.lang.Object obj) {
        com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil2;
        com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData350752;
        if ((i17 & 1) != 0) {
            kindaLiteReportData350752 = new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(null, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, null, null, 0, 0L, null, null, Integer.MAX_VALUE, null);
            kindaLiteReportUtil2 = kindaLiteReportUtil;
        } else {
            kindaLiteReportUtil2 = kindaLiteReportUtil;
            kindaLiteReportData350752 = kindaLiteReportData35075;
        }
        kindaLiteReportUtil2.report35075(kindaLiteReportData350752);
    }

    public final java.lang.String buildReportString35075(com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 data) {
        kotlin.jvm.internal.o.g(data, "data");
        return kz5.z.d0(buildReportArray35075(data), ",", null, null, 0, null, null, 62, null);
    }

    public final void report35075(com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(LOG_ID_35075, buildReportString35075(data));
    }

    public final void setGlobalData(com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 data) {
        com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 copy;
        kotlin.jvm.internal.o.g(data, "data");
        synchronized (this) {
            com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075 = globalData;
            if (kindaLiteReportData35075 == null) {
                kindaLiteReportData35075 = new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(null, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, null, null, 0, 0L, null, null, Integer.MAX_VALUE, null);
            }
            com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData350752 = kindaLiteReportData35075;
            boolean z17 = true;
            java.lang.String uuid = data.getUuid().length() > 0 ? data.getUuid() : kindaLiteReportData350752.getUuid();
            int reportType = data.getReportType() != 0 ? data.getReportType() : kindaLiteReportData350752.getReportType();
            int usecase = data.getUsecase() != 0 ? data.getUsecase() : kindaLiteReportData350752.getUsecase();
            int scene = data.getScene() != 0 ? data.getScene() : kindaLiteReportData350752.getScene();
            int duration = data.getDuration() != 0 ? data.getDuration() : kindaLiteReportData350752.getDuration();
            int isReg = data.isReg() != 0 ? data.isReg() : kindaLiteReportData350752.isReg();
            java.lang.String transactionid = data.getTransactionid().length() > 0 ? data.getTransactionid() : kindaLiteReportData350752.getTransactionid();
            java.lang.String reqKey = data.getReqKey().length() > 0 ? data.getReqKey() : kindaLiteReportData350752.getReqKey();
            int price = data.getPrice() != 0 ? data.getPrice() : kindaLiteReportData350752.getPrice();
            int channel = data.getChannel() != 0 ? data.getChannel() : kindaLiteReportData350752.getChannel();
            int reportComponent = data.getReportComponent() != 0 ? data.getReportComponent() : kindaLiteReportData350752.getReportComponent();
            int reportAction = data.getReportAction() != 0 ? data.getReportAction() : kindaLiteReportData350752.getReportAction();
            int reportActionResult = data.getReportActionResult() != 0 ? data.getReportActionResult() : kindaLiteReportData350752.getReportActionResult();
            int routeType = data.getRouteType() != 0 ? data.getRouteType() : kindaLiteReportData350752.getRouteType();
            int pageDidBackType = data.getPageDidBackType() != 0 ? data.getPageDidBackType() : kindaLiteReportData350752.getPageDidBackType();
            int cmdType = data.getCmdType() != 0 ? data.getCmdType() : kindaLiteReportData350752.getCmdType();
            int cmdId = data.getCmdId() != 0 ? data.getCmdId() : kindaLiteReportData350752.getCmdId();
            java.lang.String appId = data.getAppId().length() > 0 ? data.getAppId() : kindaLiteReportData350752.getAppId();
            java.lang.String currentRoute = data.getCurrentRoute().length() > 0 ? data.getCurrentRoute() : kindaLiteReportData350752.getCurrentRoute();
            java.lang.String query = data.getQuery().length() > 0 ? data.getQuery() : kindaLiteReportData350752.getQuery();
            java.lang.String liteappVersion = data.getLiteappVersion().length() > 0 ? data.getLiteappVersion() : kindaLiteReportData350752.getLiteappVersion();
            java.lang.String baseLibVersion = data.getBaseLibVersion().length() > 0 ? data.getBaseLibVersion() : kindaLiteReportData350752.getBaseLibVersion();
            java.lang.String routeInfo = data.getRouteInfo().length() > 0 ? data.getRouteInfo() : kindaLiteReportData350752.getRouteInfo();
            java.lang.String extraString = data.getExtraString().length() > 0 ? data.getExtraString() : kindaLiteReportData350752.getExtraString();
            int extraNumber = data.getExtraNumber() != 0 ? data.getExtraNumber() : kindaLiteReportData350752.getExtraNumber();
            java.lang.String valueString = data.getValueString().length() > 0 ? data.getValueString() : kindaLiteReportData350752.getValueString();
            if (data.getUsecaseUrl().length() <= 0) {
                z17 = false;
            }
            copy = kindaLiteReportData350752.copy((r50 & 1) != 0 ? kindaLiteReportData350752.uuid : uuid, (r50 & 2) != 0 ? kindaLiteReportData350752.reportType : reportType, (r50 & 4) != 0 ? kindaLiteReportData350752.usecase : usecase, (r50 & 8) != 0 ? kindaLiteReportData350752.scene : scene, (r50 & 16) != 0 ? kindaLiteReportData350752.duration : duration, (r50 & 32) != 0 ? kindaLiteReportData350752.isReg : isReg, (r50 & 64) != 0 ? kindaLiteReportData350752.transactionid : transactionid, (r50 & 128) != 0 ? kindaLiteReportData350752.reqKey : reqKey, (r50 & 256) != 0 ? kindaLiteReportData350752.price : price, (r50 & 512) != 0 ? kindaLiteReportData350752.channel : channel, (r50 & 1024) != 0 ? kindaLiteReportData350752.reportComponent : reportComponent, (r50 & 2048) != 0 ? kindaLiteReportData350752.reportAction : reportAction, (r50 & 4096) != 0 ? kindaLiteReportData350752.reportActionResult : reportActionResult, (r50 & 8192) != 0 ? kindaLiteReportData350752.routeType : routeType, (r50 & 16384) != 0 ? kindaLiteReportData350752.pageDidBackType : pageDidBackType, (r50 & 32768) != 0 ? kindaLiteReportData350752.cmdType : cmdType, (r50 & 65536) != 0 ? kindaLiteReportData350752.cmdId : cmdId, (r50 & 131072) != 0 ? kindaLiteReportData350752.appId : appId, (r50 & 262144) != 0 ? kindaLiteReportData350752.currentRoute : currentRoute, (r50 & 524288) != 0 ? kindaLiteReportData350752.query : query, (r50 & 1048576) != 0 ? kindaLiteReportData350752.liteappVersion : liteappVersion, (r50 & 2097152) != 0 ? kindaLiteReportData350752.baseLibVersion : baseLibVersion, (r50 & 4194304) != 0 ? kindaLiteReportData350752.routeInfo : routeInfo, (r50 & 8388608) != 0 ? kindaLiteReportData350752.extraString : extraString, (r50 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? kindaLiteReportData350752.extraNumber : extraNumber, (r50 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? kindaLiteReportData350752.valueString : valueString, (r50 & 67108864) != 0 ? kindaLiteReportData350752.usecaseUrl : z17 ? data.getUsecaseUrl() : kindaLiteReportData350752.getUsecaseUrl(), (r50 & 134217728) != 0 ? kindaLiteReportData350752.sequence : 0, (r50 & 268435456) != 0 ? kindaLiteReportData350752.localTime : 0L, (r50 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? kindaLiteReportData350752.env : null, (r50 & 1073741824) != 0 ? kindaLiteReportData350752.uatId : null);
            globalData = copy;
        }
    }
}
