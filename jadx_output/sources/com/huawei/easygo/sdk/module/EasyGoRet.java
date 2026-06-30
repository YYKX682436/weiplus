package com.huawei.easygo.sdk.module;

/* loaded from: classes13.dex */
public class EasyGoRet {
    public int code;
    public android.os.Bundle result;

    public EasyGoRet(com.huawei.easygo.module.EasyGoRet easyGoRet) {
        this.code = 0;
        this.result = new android.os.Bundle();
        if (easyGoRet != null) {
            this.code = easyGoRet.code;
            this.result = easyGoRet.result;
        }
    }

    public EasyGoRet(int i17, android.os.Bundle bundle) {
        this.code = 0;
        new android.os.Bundle();
        this.code = i17;
        this.result = bundle;
    }
}
