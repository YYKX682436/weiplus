package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.UrlRequestBase */
/* loaded from: classes13.dex */
public abstract class AbstractC29629x1bdcd131 extends org.p3343x72743996.net.AbstractC29512x37ecfd48 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74815x7118e671 = false;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.UrlRequestBase$StatusValues */
    /* loaded from: classes6.dex */
    public @interface StatusValues {
    }

    /* renamed from: convertLoadState */
    public static int m154262x10eead8(int i17) {
        switch (i17) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
            default:
                throw new java.lang.IllegalArgumentException("No request status found.");
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
        }
    }

    /* renamed from: addHeader */
    public abstract void mo154179xec6c8a8e(java.lang.String str, java.lang.String str2);

    /* renamed from: setHttpMethod */
    public abstract void mo154183x492a458b(java.lang.String str);

    /* renamed from: setUploadDataProvider */
    public abstract void mo154186xc9755c5e(org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c, java.util.concurrent.Executor executor);
}
