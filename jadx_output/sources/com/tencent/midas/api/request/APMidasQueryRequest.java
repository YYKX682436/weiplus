package com.tencent.midas.api.request;

/* loaded from: classes13.dex */
public class APMidasQueryRequest extends com.tencent.midas.api.request.APMidasBaseRequest {
    public static java.lang.String NET_REQ_TRANSACTION = "transaction";
    public java.lang.String beginTime;
    public java.lang.String cmdCode;
    public java.lang.String crossApp;
    public java.lang.String endTime;
    public java.lang.String isRetTotalCnt;
    public java.lang.String orderBy;
    public java.lang.String pageNum;
    public java.lang.String pageSize;
    public java.lang.String searchType;
    public java.lang.String subCmdCode;
    public java.lang.String type;

    public java.lang.String getBeginTime() {
        return this.beginTime;
    }

    public java.lang.String getCmdCode() {
        return this.cmdCode;
    }

    public java.lang.String getCrossApp() {
        return this.crossApp;
    }

    public java.lang.String getEndTime() {
        return this.endTime;
    }

    public java.lang.String getIsRetTotalCnt() {
        return this.isRetTotalCnt;
    }

    public java.lang.String getOrderBy() {
        return this.orderBy;
    }

    public java.lang.String getPageNum() {
        return this.pageNum;
    }

    public java.lang.String getPageSize() {
        return this.pageSize;
    }

    public java.lang.String getSearchType() {
        return this.searchType;
    }

    public java.lang.String getSubCmdCode() {
        return this.subCmdCode;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setBeginTime(java.lang.String str) {
        this.beginTime = str;
    }

    public void setCmdCode(java.lang.String str) {
        this.cmdCode = str;
    }

    public void setCrossApp(java.lang.String str) {
        this.crossApp = str;
    }

    public void setEndTime(java.lang.String str) {
        this.endTime = str;
    }

    public void setIsRetTotalCnt(java.lang.String str) {
        this.isRetTotalCnt = str;
    }

    public void setOrderBy(java.lang.String str) {
        this.orderBy = str;
    }

    public void setPageNum(java.lang.String str) {
        this.pageNum = str;
    }

    public void setPageSize(java.lang.String str) {
        this.pageSize = str;
    }

    public void setSearchType(java.lang.String str) {
        this.searchType = str;
    }

    public void setSubCmdCode(java.lang.String str) {
        this.subCmdCode = str;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }
}
