package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/media/view/MediaGalleryVideoSeekBar;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation;", "", "getLayoutId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar */
/* loaded from: classes3.dex */
public class C16494x7edfff8e extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19740xe82b0b7f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16494x7edfff8e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void E(boolean z17) {
        android.view.View view = this.f244005e;
        float f17 = z17 ? 0.35f : 1.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/view/MediaGalleryVideoSeekBar", "disableOperation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/media/view/MediaGalleryVideoSeekBar", "disableOperation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f244005e.setEnabled(!z17);
        this.f244005e.setClickable(!z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19740xe82b0b7f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19738x1379dd9c, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ejs;
    }
}
