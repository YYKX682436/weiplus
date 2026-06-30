package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class iu {
    private static double[] a(double d17, double d18, int i17) {
        double d19 = d17 + d18;
        double abs = java.lang.Math.abs(d18) / 2.0d;
        double sqrt = java.lang.Math.sqrt((4.0d * abs) / 3.141592653589793d);
        int i18 = i17 >> 1;
        int i19 = i18 << 1;
        double[] dArr = new double[i19];
        int i27 = i18 - 1;
        dArr[i27] = d17 + (d18 / 2.0d);
        dArr[i19 - 1] = d19;
        double d27 = sqrt / i18;
        int i28 = 0;
        while (i28 < i27) {
            int i29 = i28 + 1;
            double d28 = sqrt - (i29 * d27);
            double acos = java.lang.Math.acos(d28 / sqrt);
            double sin = (((acos * abs) * 2.0d) / 3.141592653589793d) - ((d28 * (java.lang.Math.sin(acos) * sqrt)) / 2.0d);
            if (d18 < 0.0d) {
                sin = -sin;
            }
            dArr[i28] = d17 + sin;
            dArr[(i19 - 2) - i28] = d19 - sin;
            i28 = i29;
        }
        return dArr;
    }

    private static double[] b(double d17, double d18, int i17) {
        double d19 = d17 + d18;
        double[] dArr = new double[i17];
        double d27 = i17;
        double d28 = ((d18 * 2.0d) / d27) / d27;
        double d29 = d28 / 2.0d;
        int i18 = i17 - 1;
        dArr[i18] = d19;
        dArr[0] = d17 + d29;
        for (int i19 = 1; i19 < i18; i19++) {
            dArr[i19] = dArr[i19 - 1] + (i19 * d28) + d29;
        }
        return dArr;
    }

    public static double[] a(double d17, double d18) {
        double d19 = d17 + d18;
        double[] dArr = new double[20];
        dArr[9] = (d18 / 2.0d) + d17;
        dArr[19] = d19;
        double d27 = (d18 / 10.0d) / 10.0d;
        double d28 = d27 / 2.0d;
        dArr[0] = d17 + d28;
        dArr[18] = d19 - d28;
        for (int i17 = 1; i17 < 9; i17++) {
            double d29 = (i17 * d27) + d28;
            dArr[i17] = dArr[i17 - 1] + d29;
            dArr[18 - i17] = dArr[19 - i17] - d29;
        }
        return dArr;
    }

    public static <A extends com.tencent.tencentmap.mapsdk.maps.model.Animation> com.tencent.mapsdk.internal.hv a(com.tencent.mapsdk.internal.bn bnVar, A a17) {
        com.tencent.tencentmap.mapsdk.maps.model.Animation animation = null;
        if (bnVar == null || a17 == null) {
            return null;
        }
        if (a17 instanceof com.tencent.mapsdk.internal.hv) {
            return (com.tencent.mapsdk.internal.hv) a17;
        }
        java.lang.Class<?> cls = a17.getClass();
        if (cls == com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation.class) {
            com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation alphaAnimation = (com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation) a17;
            animation = bnVar.createAlphaAnimation(alphaAnimation.mFromAlpha, alphaAnimation.mToAlpha);
        } else if (cls == com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation.class) {
            com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation scaleAnimation = (com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation) a17;
            animation = bnVar.createScaleAnimation(scaleAnimation.mFromX, scaleAnimation.mToX, scaleAnimation.mFromY, scaleAnimation.mToY);
        } else if (cls == com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation.class) {
            animation = bnVar.createEmergeAnimation(((com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation) a17).mStartPoint);
        } else if (cls == com.tencent.tencentmap.mapsdk.maps.model.AnimationSet.class) {
            com.tencent.tencentmap.mapsdk.maps.model.AnimationSet animationSet = (com.tencent.tencentmap.mapsdk.maps.model.AnimationSet) a17;
            com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet createAnimationSet = bnVar.createAnimationSet(animationSet.mShareInterpolator);
            java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.Animation> it = animationSet.mAnimations.iterator();
            while (it.hasNext()) {
                ((com.tencent.mapsdk.internal.hw) createAnimationSet).addAnimation(a(bnVar, it.next()));
            }
            animation = createAnimationSet;
        } else if (cls == com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation.class) {
            com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation rotateAnimation = (com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation) a17;
            animation = bnVar.createRotateAnimation(rotateAnimation.mFromDegree, rotateAnimation.mToDegree, rotateAnimation.mPivoteX, rotateAnimation.mPivoteY, rotateAnimation.mPivoteZ);
        } else if (cls == com.tencent.tencentmap.mapsdk.maps.model.TranslateAnimation.class) {
            animation = bnVar.createTranslateAnimation(((com.tencent.tencentmap.mapsdk.maps.model.TranslateAnimation) a17).mTargetLatLng);
        }
        if (animation != null) {
            animation.setDuration(a17.getDuration());
            animation.setInterpolator(a17.getInterpolator());
            animation.setAnimationListener(a17.getAnimationListener());
        }
        return (com.tencent.mapsdk.internal.hv) animation;
    }
}
