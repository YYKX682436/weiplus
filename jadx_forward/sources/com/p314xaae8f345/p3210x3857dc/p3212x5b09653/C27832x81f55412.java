package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.XWebDebugPreference */
/* loaded from: classes13.dex */
public class C27832x81f55412 extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb implements qx5.m {
    public final java.lang.String R;

    public C27832x81f55412(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.p3222x9cba06de.R.C27878x6ba0728b.f61418x81f55412);
        this.R = obtainStyledAttributes.getString(com.p314xaae8f345.p3222x9cba06de.R.C27878x6ba0728b.f61419x71e5e286);
        obtainStyledAttributes.recycle();
    }

    @Override // qx5.m
    public qx5.a a(qx5.l lVar, java.lang.Object obj) {
        return null;
    }

    @Override // qx5.m
    public qx5.a b(qx5.l lVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(ya.b.f77502x92235c1b, 3);
        bundle.putString("command", "http://debugxweb.qq.com/?" + this.R);
        return by5.d1.b(bundle, lVar);
    }

    @Override // qx5.m
    public java.lang.String h() {
        return this.R;
    }
}
