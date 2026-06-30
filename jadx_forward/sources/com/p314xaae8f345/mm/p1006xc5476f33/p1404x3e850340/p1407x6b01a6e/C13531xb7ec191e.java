package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceProcessHintView */
/* loaded from: classes3.dex */
public class C13531xb7ec191e extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0 f181681d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Animation f181682e;

    public C13531xb7ec191e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: setCurrentProcessing */
    private void m55286x8042992a(int i17) {
        android.widget.TextView textView = (android.widget.TextView) getChildAt(i17).findViewById(com.p314xaae8f345.mm.R.id.f565536co2);
        textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562975ta);
    }

    /* renamed from: setDataAndInvalidate */
    public void m55287x86717ea6(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0 b0Var) {
        this.f181681d = b0Var;
        if (b0Var == null || b0Var.f181528b <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceProcessHintView", "hy: model invalid");
            return;
        }
        removeAllViews();
        int i17 = 0;
        while (i17 < this.f181681d.f181528b) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aah, (android.view.ViewGroup) null, false);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            i17++;
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565536co2)).setText("" + i17);
            addView(inflate, layoutParams);
        }
        android.view.View findViewById = getChildAt(getChildCount() - 1).findViewById(com.p314xaae8f345.mm.R.id.dob);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceProcessHintView", "setDataAndInvalidate", "(Lcom/tencent/mm/plugin/facedetect/model/FaceDetectProcessModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/facedetect/views/FaceProcessHintView", "setDataAndInvalidate", "(Lcom/tencent/mm/plugin/facedetect/model/FaceDetectProcessModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m55286x8042992a(0);
        invalidate();
    }

    public C13531xb7ec191e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f181681d = null;
        this.f181682e = null;
        setOrientation(0);
        setMinimumHeight(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 36.0f));
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559309b5);
        this.f181682e = loadAnimation;
        loadAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
    }
}
