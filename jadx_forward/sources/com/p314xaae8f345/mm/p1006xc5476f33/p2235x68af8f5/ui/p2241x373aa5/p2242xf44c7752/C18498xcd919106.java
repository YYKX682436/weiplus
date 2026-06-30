package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPlayTextureView;", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView */
/* loaded from: classes15.dex */
public final class C18498xcd919106 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 {
    public C18498xcd919106(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        m75834xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        super.G(surfaceTexture);
        this.f272993w.q(mo69307x9746038c(), mo69286x51e8b0a());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void b(double d17) {
        if (this.f272987q) {
            a(d17, true);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f272981h, hashCode() + " error seekTo " + this.f272987q + ' ', new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, android.view.View
    public void onMeasure(int i17, int i18) {
        m75834xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
        int i19 = this.f272986p;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.DEFAULT;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 o8Var = this.f272980J;
        if (i19 == 90 || i19 == 270) {
            if (this.f272984n > this.f272985o) {
                o8Var.d(e1Var);
            }
        } else if (this.f272985o > this.f272984n) {
            o8Var.d(e1Var);
        }
        super.onMeasure(i17, i18);
    }

    public C18498xcd919106(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        m75834xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
    }

    public C18498xcd919106(android.content.Context context) {
        super(context, null);
        m75834xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
    }
}
