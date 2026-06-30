package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.ViewUtils */
/* loaded from: classes13.dex */
public class C1935x1922e4ec {
    private C1935x1922e4ec() {
    }

    /* renamed from: getXmlAttributeString */
    public static java.lang.String m18243x4194caac(java.lang.String str, java.lang.String str2, android.content.Context context, android.util.AttributeSet attributeSet, boolean z17, boolean z18, java.lang.String str3) {
        java.lang.String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !attributeValue.startsWith("@string/") || !z17) {
            return attributeValue;
        }
        java.lang.String substring = attributeValue.substring(8);
        java.lang.String packageName = context.getPackageName();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        try {
            context.getResources().getValue(packageName + ":string/" + substring, typedValue, true);
        } catch (android.content.res.Resources.NotFoundException unused) {
        }
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            return charSequence.toString();
        }
        typedValue.toString();
        return attributeValue;
    }
}
