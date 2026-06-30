package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nb extends android.widget.TextView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f50488a;

    public nb(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        super(context);
        if (this.f50488a || tencentMapContext == null) {
            return;
        }
        this.f50488a = true;
        setTypeface(tencentMapContext.getTypeface() == null ? android.graphics.Typeface.DEFAULT : tencentMapContext.getTypeface());
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        if (this.f50488a || tencentMapContext == null) {
            return;
        }
        this.f50488a = true;
        setTypeface(tencentMapContext.getTypeface() == null ? android.graphics.Typeface.DEFAULT : tencentMapContext.getTypeface());
    }
}
