package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f237806a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f237807b;

    /* renamed from: c, reason: collision with root package name */
    public int f237808c;

    /* renamed from: d, reason: collision with root package name */
    public int f237809d;

    /* renamed from: e, reason: collision with root package name */
    public int f237810e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f237811f;

    public j1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237806a = context;
        this.f237808c = 100;
        this.f237809d = 50;
        this.f237810e = 50;
    }

    public final void a(android.view.View view, int i17, int i18, int i19, boolean z17, int i27, yz5.l lVar) {
        android.view.View findViewById = view.findViewById(i17);
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicVolumeAdjustDialog", "bindRow", "(Landroid/view/View;IIIZILkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicVolumeAdjustDialog", "bindRow", "(Landroid/view/View;IIIZILkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicVolumeAdjustDialog", "bindRow", "(Landroid/view/View;IIIZILkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicVolumeAdjustDialog", "bindRow", "(Landroid/view/View;IIIZILkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.SeekBar seekBar = (android.widget.SeekBar) view.findViewById(i18);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(i19);
        seekBar.setMax(this.f237808c);
        seekBar.setProgress(i27);
        textView.setText(java.lang.String.valueOf(i27));
        seekBar.setOnSeekBarChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f1(textView, i17, lVar));
    }
}
