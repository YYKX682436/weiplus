package com.jg;

/* loaded from: classes8.dex */
public enum EType {
    ALL,
    ACTIVITYCHECK,
    PROVIDERCHECK,
    RECEIVERCHECK,
    SERVICESCHECK,
    PERMISSIONCHECK,
    INTENTCHECK,
    SECURERANDOMCHECK,
    JSEXECUTECHECK,
    HTTPSCHECK;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.jg.EType[] valuesCustom() {
        com.jg.EType[] valuesCustom = values();
        int length = valuesCustom.length;
        com.jg.EType[] eTypeArr = new com.jg.EType[length];
        java.lang.System.arraycopy(valuesCustom, 0, eTypeArr, 0, length);
        return eTypeArr;
    }
}
