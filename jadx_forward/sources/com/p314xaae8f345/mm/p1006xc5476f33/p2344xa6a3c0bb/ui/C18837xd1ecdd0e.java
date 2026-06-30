package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView */
/* loaded from: classes15.dex */
public class C18837xd1ecdd0e extends android.widget.RelativeLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f257714h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f257715d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f257716e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f257717f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.h f257718g;

    public C18837xd1ecdd0e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f257715d = null;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570882c81, this);
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p6i)).getPaint());
        this.f257715d = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.f567686kd2);
        this.f257716e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567685kd1);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567687kd3);
        this.f257717f = button;
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e.f257714h;
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e c18837xd1ecdd0e = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e.this;
                c18837xd1ecdd0e.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c18837xd1ecdd0e, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c18837xd1ecdd0e, array2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.h hVar = c18837xd1ecdd0e.f257718g;
                if (hVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11390, 5);
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.F;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.r) hVar).f257805a.b7();
                }
                yj0.a.h(c18837xd1ecdd0e, "com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(c18837xd1ecdd0e, "com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    /* renamed from: setOnClickRetryCallback */
    public void m72721xda0cc226(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.h hVar) {
        this.f257718g = hVar;
    }
}
