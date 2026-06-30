package qp1;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qp1.g0 f447255a = new qp1.g0();

    /* renamed from: b, reason: collision with root package name */
    public static qp1.c f447256b;

    public static final void a(android.view.View view) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator updateListener;
        if (view == null || (animate = view.animate()) == null || (listener = animate.setListener(null)) == null || (updateListener = listener.setUpdateListener(null)) == null) {
            return;
        }
        updateListener.cancel();
    }

    public static final int c(int i17, int i18, int i19, int i27, yz5.l isValidPosY) {
        int i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isValidPosY, "isValidPosY");
        if (i19 > i17) {
            int i29 = i18 + i17;
            if (i29 <= i19) {
                return i19;
            }
            if (((java.lang.Boolean) isValidPosY.mo146xb9724478(java.lang.Integer.valueOf(i29))).booleanValue()) {
                return i29;
            }
            i28 = i17 - i27;
        } else {
            if (i19 + i27 <= i17) {
                return i19;
            }
            int i37 = i17 - i27;
            if (((java.lang.Boolean) isValidPosY.mo146xb9724478(java.lang.Integer.valueOf(i37))).booleanValue()) {
                return i37;
            }
            i28 = i17 + i18;
        }
        return i28;
    }

    public static final void e(android.view.View view, int i17, int i18) {
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        } else {
            layoutParams = null;
        }
        view.setLayoutParams(layoutParams);
    }

    public final android.view.View b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view instanceof sp1.b) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
            android.view.View b17 = b(childAt);
            if (b17 != null) {
                return b17;
            }
        }
        return null;
    }

    public final int d(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.R.raw.f80613x1123974e;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.R.raw.f80477x7898ed47;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.R.raw.f79120x221c404a;
        }
        if (i17 == 4) {
            return com.p314xaae8f345.mm.R.raw.f79390xb2255653;
        }
        if (i17 == 55) {
            return com.p314xaae8f345.mm.R.raw.f78559xeb2825e8;
        }
        if (i17 == 57) {
            return com.p314xaae8f345.mm.R.raw.f81003x40b817d9;
        }
        switch (i17) {
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                return com.p314xaae8f345.mm.R.raw.f78764x17ab9cb1;
            case 50:
                return com.p314xaae8f345.mm.R.raw.f81157xf44dbecb;
            case 51:
                return com.p314xaae8f345.mm.R.raw.f80862x137353c3;
            default:
                return com.p314xaae8f345.mm.R.raw.f80477x7898ed47;
        }
    }
}
