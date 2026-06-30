package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider */
/* loaded from: classes13.dex */
public abstract class AbstractC26074xe626c11a extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26094xf8f651ae {

    /* renamed from: mProviderName */
    private java.lang.String f49663x7e97ad29;

    /* renamed from: mProviderVersion */
    private int f49664x63137d7a;

    public AbstractC26074xe626c11a(java.lang.String str, int i17) {
        this.f49663x7e97ad29 = str;
        this.f49664x63137d7a = i17;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("图源名不能为空");
        }
    }

    /* renamed from: getLogo */
    public abstract android.graphics.Bitmap mo36975xfb822e21(boolean z17);

    /* renamed from: getProviderName */
    public final java.lang.String m99822x47f52692() {
        return this.f49663x7e97ad29;
    }

    /* renamed from: getProviderVersion */
    public final int m99823x77c71f71() {
        return this.f49664x63137d7a;
    }

    /* renamed from: onDayNightChange */
    public boolean m99824x476ca46b(boolean z17) {
        return false;
    }

    /* renamed from: onLanguageChange */
    public boolean mo36976x48658e7(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m99825x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OverSeaProvider{mProviderName='");
        stringBuffer.append(this.f49663x7e97ad29);
        stringBuffer.append("', mProviderVersion=");
        stringBuffer.append(this.f49664x63137d7a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
