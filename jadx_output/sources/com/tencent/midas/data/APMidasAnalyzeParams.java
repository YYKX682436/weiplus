package com.tencent.midas.data;

/* loaded from: classes13.dex */
public class APMidasAnalyzeParams {

    /* loaded from: classes13.dex */
    public static class SingletonHolder {
        private static com.tencent.midas.data.APMidasAnalyzeParams instance = new com.tencent.midas.data.APMidasAnalyzeParams();

        private SingletonHolder() {
        }
    }

    private void AnalyzeCommParams(com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        try {
            com.tencent.midas.data.APPluginDataInterface singleton = com.tencent.midas.data.APPluginDataInterface.singleton();
            singleton.setOfferId(aPMidasBaseRequest.offerId);
            singleton.setOpenId(aPMidasBaseRequest.openId);
            singleton.setOpenKey(aPMidasBaseRequest.openKey);
            singleton.setSessionId(aPMidasBaseRequest.sessionId);
            singleton.setSessionType(aPMidasBaseRequest.sessionType);
            singleton.setPf(aPMidasBaseRequest.f53140pf);
            singleton.setPfKey(aPMidasBaseRequest.pfKey);
            singleton.setZoneId(aPMidasBaseRequest.zoneId);
            singleton.setDiscountUrl(aPMidasBaseRequest.mpInfo.discountUrl);
            singleton.setReserv(aPMidasBaseRequest.reserv);
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("AnalyzeCommParams", e17.toString());
        }
    }

    public static com.tencent.midas.data.APMidasAnalyzeParams getInstance() {
        return com.tencent.midas.data.APMidasAnalyzeParams.SingletonHolder.instance;
    }

    public void AnalyzeParams(com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        if (aPMidasBaseRequest != null) {
            AnalyzeCommParams(aPMidasBaseRequest);
            setSaveType(aPMidasBaseRequest);
        }
    }

    public void setSaveType(com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        com.tencent.midas.data.APPluginDataInterface singleton = com.tencent.midas.data.APPluginDataInterface.singleton();
        try {
            if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasGameRequest) {
                if (aPMidasBaseRequest.acctType.equals("qb")) {
                    singleton.setSaveType(3);
                } else {
                    singleton.setSaveType(0);
                }
            } else if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasGoodsRequest) {
                singleton.setSaveType(1);
            } else if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasMonthRequest) {
                singleton.setSaveType(4);
            } else if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasSubscribeRequest) {
                singleton.setSaveType(5);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("setSaveType", e17.toString());
        }
    }
}
