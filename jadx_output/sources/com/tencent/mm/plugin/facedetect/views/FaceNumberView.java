package com.tencent.mm.plugin.facedetect.views;

/* loaded from: classes4.dex */
public class FaceNumberView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f100142d;

    /* renamed from: e, reason: collision with root package name */
    public int f100143e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f100144f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.views.FaceNumberItemView[] f100145g;

    /* renamed from: h, reason: collision with root package name */
    public int f100146h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f100147i;

    public FaceNumberView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a(java.lang.String str) {
        this.f100142d = str;
        int i17 = 0;
        if (str != null) {
            this.f100143e = str.length();
        } else {
            this.f100143e = 0;
        }
        com.tencent.mm.plugin.facedetect.views.FaceNumberItemView[] faceNumberItemViewArr = this.f100145g;
        if (faceNumberItemViewArr == null || faceNumberItemViewArr.length <= 0) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f100142d)) {
            while (i17 < this.f100145g.length) {
                java.lang.String str2 = "";
                if (this.f100143e > i17) {
                    str2 = this.f100142d.charAt(i17) + "";
                    if (this.f100143e == i17 + 1) {
                        com.tencent.mm.plugin.facedetect.views.FaceNumberItemView faceNumberItemView = this.f100145g[i17];
                        faceNumberItemView.f100135d.e();
                        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new i72.u(faceNumberItemView.f100141m), true);
                        faceNumberItemView.f100135d = b4Var;
                        b4Var.c(0L, 29L);
                    } else {
                        this.f100145g[i17].f100135d.e();
                        com.tencent.mm.plugin.facedetect.views.FaceNumberItemView faceNumberItemView2 = this.f100145g[i17];
                        faceNumberItemView2.f100140i = 30;
                        faceNumberItemView2.invalidate();
                    }
                }
                b(this.f100145g[i17], str2);
                i17++;
            }
            return;
        }
        while (true) {
            com.tencent.mm.plugin.facedetect.views.FaceNumberItemView[] faceNumberItemViewArr2 = this.f100145g;
            if (i17 >= faceNumberItemViewArr2.length) {
                return;
            }
            b(faceNumberItemViewArr2[i17], "point");
            i17++;
        }
    }

    public final void b(com.tencent.mm.plugin.facedetect.views.FaceNumberItemView faceNumberItemView, java.lang.String str) {
        if (faceNumberItemView == null) {
            return;
        }
        if (str.equals("0")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.c1y);
            return;
        }
        if (str.equals("1")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.c1z);
            return;
        }
        if (str.equals("2")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.f481435c20);
            return;
        }
        if (str.equals("3")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.f481436c21);
            return;
        }
        if (str.equals("4")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.f481437c22);
            return;
        }
        if (str.equals("5")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.f481438c23);
            return;
        }
        if (str.equals("6")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.f481439c24);
            return;
        }
        if (str.equals("7")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.f481440c25);
            return;
        }
        if (str.equals("8")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.f481441c26);
        } else if (str.equals("9")) {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.c27);
        } else {
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.c28);
        }
    }

    public void setNumberLengthAndInflate(int i17) {
        int dimensionPixelSize;
        int i18;
        if (i17 > 12) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed max length: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed min length: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i17 == this.f100146h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Facing.MMPwdInputView", "hy: already correct length. quit");
            a(null);
            return;
        }
        this.f100144f.removeAllViews();
        this.f100146h = i17;
        this.f100145g = new com.tencent.mm.plugin.facedetect.views.FaceNumberItemView[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            com.tencent.mm.plugin.facedetect.views.FaceNumberItemView faceNumberItemView = (com.tencent.mm.plugin.facedetect.views.FaceNumberItemView) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.aaf, null);
            faceNumberItemView.setImageResource(com.tencent.mm.R.drawable.c28);
            if (i19 == 0) {
                dimensionPixelSize = (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480404wz) + i65.a.b(getContext(), 48)) / 2;
                i18 = 3;
            } else if (i19 == i17 - 1) {
                dimensionPixelSize = (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480404wz) + i65.a.b(getContext(), 48)) / 2;
                i18 = 5;
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480404wz);
                i18 = 17;
            }
            faceNumberItemView.setGravity(i18);
            this.f100145g[i19] = faceNumberItemView;
            this.f100144f.addView(faceNumberItemView, new android.view.ViewGroup.LayoutParams(dimensionPixelSize, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480403wy)));
        }
    }

    public FaceNumberView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f100142d = null;
        this.f100145g = null;
        this.f100146h = 0;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.aae, null);
        this.f100144f = viewGroup;
        addView(viewGroup);
        this.f100147i = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477843d1);
    }
}
