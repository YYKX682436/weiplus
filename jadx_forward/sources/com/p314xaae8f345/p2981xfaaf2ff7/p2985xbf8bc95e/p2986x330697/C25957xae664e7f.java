package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.MapRenderLayer */
/* loaded from: classes13.dex */
public class C25957xae664e7f extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 {
    public C25957xae664e7f(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        super(context, c25966x7e4576a7);
        if (c25966x7e4576a7 != null) {
            int m99199x350ebba4 = c25966x7e4576a7.m99199x350ebba4();
            if (m99199x350ebba4 > 0) {
                setLeft(0);
                setRight(m99199x350ebba4);
            }
            int m99198x52f9bf09 = c25966x7e4576a7.m99198x52f9bf09();
            if (m99198x52f9bf09 > 0) {
                setTop(0);
                setBottom(m99198x52f9bf09);
            }
        }
        mo99093x57429eec();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: getViewType */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db mo99089xc321a0f5() {
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db.RenderLayer;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01
    /* renamed from: onSurfaceChanged */
    public final void mo99136xd8f18906(java.lang.Object obj, int i17, int i18) {
        if ((obj instanceof android.view.Surface) || (obj instanceof android.graphics.SurfaceTexture) || (obj instanceof android.view.SurfaceHolder)) {
            super.mo99136xd8f18906(obj, i17, i18);
        }
    }
}
