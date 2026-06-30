package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.XWebDebugListPreference */
/* loaded from: classes13.dex */
public class C27831x1967bfd0 extends p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839 implements qx5.m {

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.String f301788y0;

    public C27831x1967bfd0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.p3222x9cba06de.R.C27878x6ba0728b.f61418x81f55412);
        this.f301788y0 = obtainStyledAttributes.getString(com.p314xaae8f345.p3222x9cba06de.R.C27878x6ba0728b.f61419x71e5e286);
        obtainStyledAttributes.recycle();
    }

    @Override // qx5.m
    public qx5.a a(qx5.l lVar, java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(ya.b.f77502x92235c1b, 3);
        bundle.putString("command", "http://debugxweb.qq.com/?" + this.f301788y0 + "=" + obj);
        return by5.d1.b(bundle, lVar);
    }

    @Override // qx5.m
    public qx5.a b(qx5.l lVar) {
        return null;
    }

    @Override // qx5.m
    public java.lang.String h() {
        return this.f301788y0;
    }
}
