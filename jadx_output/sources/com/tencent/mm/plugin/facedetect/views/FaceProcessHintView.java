package com.tencent.mm.plugin.facedetect.views;

/* loaded from: classes3.dex */
public class FaceProcessHintView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.model.b0 f100148d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Animation f100149e;

    public FaceProcessHintView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setCurrentProcessing(int i17) {
        android.widget.TextView textView = (android.widget.TextView) getChildAt(i17).findViewById(com.tencent.mm.R.id.f484003co2);
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        textView.setBackgroundResource(com.tencent.mm.R.drawable.f481442ta);
    }

    public void setDataAndInvalidate(com.tencent.mm.plugin.facedetect.model.b0 b0Var) {
        this.f100148d = b0Var;
        if (b0Var == null || b0Var.f99995b <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceProcessHintView", "hy: model invalid");
            return;
        }
        removeAllViews();
        int i17 = 0;
        while (i17 < this.f100148d.f99995b) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aah, (android.view.ViewGroup) null, false);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            i17++;
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484003co2)).setText("" + i17);
            addView(inflate, layoutParams);
        }
        android.view.View findViewById = getChildAt(getChildCount() - 1).findViewById(com.tencent.mm.R.id.dob);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceProcessHintView", "setDataAndInvalidate", "(Lcom/tencent/mm/plugin/facedetect/model/FaceDetectProcessModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/facedetect/views/FaceProcessHintView", "setDataAndInvalidate", "(Lcom/tencent/mm/plugin/facedetect/model/FaceDetectProcessModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setCurrentProcessing(0);
        invalidate();
    }

    public FaceProcessHintView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f100148d = null;
        this.f100149e = null;
        setOrientation(0);
        setMinimumHeight(com.tencent.mm.sdk.platformtools.j.d(getContext(), 36.0f));
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477776b5);
        this.f100149e = loadAnimation;
        loadAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
    }
}
