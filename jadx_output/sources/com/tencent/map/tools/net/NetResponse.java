package com.tencent.map.tools.net;

/* loaded from: classes13.dex */
public class NetResponse {
    public java.lang.String contentEncoding;
    public int contentLength;
    public byte[] data;
    public java.io.InputStream dataStream;
    public byte[] errorData;
    public java.lang.Exception exception;
    public long mRequestId;
    public java.lang.String requestUrl;
    private java.util.List<com.tencent.map.tools.net.processor.Processor> respProcessorSet;
    public int statusCode;
    public int errorCode = -1;
    public java.lang.String charset = "GBK";
    public final java.util.Map<java.lang.String, java.lang.String> respHeads = new java.util.HashMap();

    public NetResponse() {
    }

    public boolean available() {
        if (this.errorCode == 0 && this.statusCode == 200) {
            return true;
        }
        byte[] bArr = this.data;
        return bArr != null && bArr.length > 0;
    }

    public void clone(com.tencent.map.tools.net.NetResponse netResponse) {
        if (netResponse != null) {
            this.errorCode = netResponse.errorCode;
            this.statusCode = netResponse.statusCode;
            this.data = netResponse.data;
            this.charset = netResponse.charset;
            this.exception = netResponse.exception;
            this.errorData = netResponse.errorData;
        }
    }

    public void exception(java.lang.Exception exc) {
        this.exception = exc;
        if (exc instanceof com.tencent.map.tools.net.exception.NetErrorException) {
            com.tencent.map.tools.net.exception.NetErrorException netErrorException = (com.tencent.map.tools.net.exception.NetErrorException) exc;
            this.errorCode = netErrorException.errorCode;
            this.statusCode = netErrorException.statusCode;
        }
    }

    public java.lang.String getData() {
        byte[] bArr = this.data;
        return bArr != null ? new java.lang.String(bArr) : "";
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getErrorMessage() {
        byte[] bArr = this.errorData;
        if (bArr != null) {
            return new java.lang.String(bArr);
        }
        java.lang.Exception exc = this.exception;
        return exc != null ? exc.getMessage() : "";
    }

    public java.lang.String getHeaderField(java.lang.String str) {
        return this.respHeads.get(str);
    }

    public java.io.InputStream getInputStream() {
        return this.dataStream;
    }

    public java.util.List<com.tencent.map.tools.net.processor.Processor> getProcessors() {
        return this.respProcessorSet;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public java.lang.String toHumanString() {
        if (this.data != null) {
            return "[DATA] " + (this.data.length / 1024.0f) + "KB " + new java.lang.String(this.data, java.nio.charset.Charset.forName(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        }
        if (this.errorData == null) {
            return "";
        }
        java.lang.Exception exc = this.exception;
        if (exc != null) {
            exc.getClass();
        }
        return "[ERROR] ".concat(new java.lang.String(this.errorData));
    }

    public java.lang.String toString() {
        try {
            byte[] bArr = this.data;
            return bArr != null ? new java.lang.String(bArr, this.charset) : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public NetResponse(com.tencent.map.tools.net.NetRequest netRequest) {
        this.mRequestId = netRequest.mRequestId;
        this.respProcessorSet = netRequest.processors;
        this.requestUrl = netRequest.url;
    }
}
