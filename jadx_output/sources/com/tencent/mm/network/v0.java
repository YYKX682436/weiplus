package com.tencent.mm.network;

/* loaded from: classes12.dex */
public interface v0 {
    com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy bindCellularStrategy();

    int getEncryptAlgo();

    boolean getIsLongPolling();

    boolean getIsUserCmd();

    int getLongPollingTimeout();

    int getNewDNSBusinessType();

    int getNewExtFlags();

    int getOptions();

    java.lang.String getReqHost();

    o45.zg getReqObj();

    o45.ah getRespObj();

    int getTimeOut();

    byte[] getTransHeader();

    int getType();

    java.lang.String getUri();

    boolean isSingleSession();

    boolean keepAlive();

    void setBindCellularStrategy(com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy eBindCellularStrategy);

    void setConnectionInfo(java.lang.String str);

    void setEncryptAlgo(int i17);

    void setNewDNSBusinessType(int i17);

    void setReqHost(java.lang.String str);

    void setSingleSession(boolean z17);
}
