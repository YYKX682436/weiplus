package com.p314xaae8f345.p3200xd0d7bedf.api;

/* renamed from: com.tencent.wework.api.WWAPIFactory */
/* loaded from: classes13.dex */
public abstract class AbstractC27778x5479f090 {
    static {
        new java.util.HashSet<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIFactory.1
            {
                add("com.tencent.mm");
                add("com.tencent.wemeet.app");
            }
        };
    }

    public static com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71 a(android.content.Context context) {
        return android.text.TextUtils.equals(context.getPackageName(), "com.tencent.mm") ? new com.p314xaae8f345.p3200xd0d7bedf.api.C27780x5936d731(context) : (android.text.TextUtils.equals(context.getPackageName(), "com.tencent.wemeet.app") || android.text.TextUtils.equals(context.getPackageName(), "com.tencent.voov")) ? new com.p314xaae8f345.p3200xd0d7bedf.api.C27781xad86881(context) : new com.p314xaae8f345.p3200xd0d7bedf.api.C27779xabe8405a(context);
    }
}
