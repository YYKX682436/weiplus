package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.TextureMapView */
/* loaded from: classes13.dex */
public class C25970x8657f0a6 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 {
    public C25970x8657f0a6(android.content.Context context) {
        this(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: getViewType */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db mo99089xc321a0f5() {
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db.TextureView;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            return mapViewProxy.mo36640xebeef5eb();
        }
        return true;
    }

    /* renamed from: setOpaque */
    public void m99267x1c0e5b23(boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36653x1c0e5b23(z17);
        }
    }

    public C25970x8657f0a6(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        super(context, c25966x7e4576a7);
    }

    public C25970x8657f0a6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C25970x8657f0a6(android.content.Context context, android.util.AttributeSet attributeSet, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        this(context, attributeSet, 0, c25966x7e4576a7);
    }

    public C25970x8657f0a6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public C25970x8657f0a6(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        super(context, attributeSet, i17, c25966x7e4576a7);
    }
}
