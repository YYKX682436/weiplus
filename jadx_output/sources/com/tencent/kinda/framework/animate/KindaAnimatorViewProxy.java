package com.tencent.kinda.framework.animate;

@java.lang.Deprecated
/* loaded from: classes15.dex */
public class KindaAnimatorViewProxy implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String TAG = "MicroMsg.Kinda.KindaAnimatorViewProxy";
    private com.tencent.kinda.framework.widget.base.MMKView target = null;
    private static com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.LongEvaluator defaultLongEvaluator = new com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.LongEvaluator();
    private static com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.DoubleEvaluator defaultDoubleEvaluator = new com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.DoubleEvaluator();
    private static com.tencent.kinda.framework.animate.ArgbEvaluator defaultArgbEvaluator = new com.tencent.kinda.framework.animate.ArgbEvaluator();

    /* loaded from: classes13.dex */
    public static class DoubleEvaluator implements android.animation.TypeEvaluator<java.lang.Number> {
        @Override // android.animation.TypeEvaluator
        public java.lang.Number evaluate(float f17, java.lang.Number number, java.lang.Number number2) {
            double doubleValue = number.doubleValue();
            return java.lang.Double.valueOf(doubleValue + (f17 * (number2.doubleValue() - doubleValue)));
        }
    }

    /* loaded from: classes13.dex */
    public static class LongEvaluator implements android.animation.TypeEvaluator<java.lang.Number> {
        @Override // android.animation.TypeEvaluator
        public java.lang.Number evaluate(float f17, java.lang.Number number, java.lang.Number number2) {
            long longValue = number.longValue();
            return java.lang.Long.valueOf(((float) longValue) + (f17 * ((float) (number2.longValue() - longValue))));
        }
    }

    private android.animation.ValueAnimator buildAnimator(final java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.Object obj) {
        if (obj.getClass().equals(java.lang.Integer.class)) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((java.lang.Integer) method2.invoke(this.target, new java.lang.Object[0])).intValue(), ((java.lang.Integer) obj).intValue());
            ofInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    try {
                        method.invoke(com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.this.target, java.lang.Integer.valueOf(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue()));
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            ofInt.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
            return ofInt;
        }
        if (obj.getClass().equals(java.lang.Long.class)) {
            if (method.getName().equals(nd1.s0.NAME)) {
                android.animation.ValueAnimator.ofObject(defaultArgbEvaluator, java.lang.Integer.valueOf((int) ((java.lang.Long) method2.invoke(this.target, new java.lang.Object[0])).longValue()), java.lang.Integer.valueOf((int) ((java.lang.Long) obj).longValue())).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        try {
                            method.invoke(com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.this.target, java.lang.Long.valueOf(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue()));
                        } catch (java.lang.Exception unused) {
                        }
                    }
                });
                return null;
            }
            android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(defaultLongEvaluator, (java.lang.Long) method2.invoke(this.target, new java.lang.Object[0]), (java.lang.Long) obj);
            ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    try {
                        method.invoke(com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.this.target, java.lang.Long.valueOf(((java.lang.Long) valueAnimator.getAnimatedValue()).longValue()));
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            ofObject.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
            return ofObject;
        }
        if (obj.getClass().equals(java.lang.Float.class)) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(((java.lang.Float) method2.invoke(this.target, new java.lang.Object[0])).floatValue(), ((java.lang.Float) obj).floatValue());
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    try {
                        method.invoke(com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.this.target, java.lang.Float.valueOf(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()));
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
            return ofFloat;
        }
        if (!obj.getClass().equals(java.lang.Double.class)) {
            return null;
        }
        android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(defaultDoubleEvaluator, (java.lang.Double) method2.invoke(this.target, new java.lang.Object[0]), (java.lang.Double) obj);
        ofObject2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                try {
                    method.invoke(com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.this.target, java.lang.Double.valueOf(((java.lang.Double) valueAnimator.getAnimatedValue()).doubleValue()));
                } catch (java.lang.Exception unused) {
                }
            }
        });
        ofObject2.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        return ofObject2;
    }

    private boolean checkHasPrimitiveTypeParams(java.lang.Object[] objArr) {
        if (objArr != null && objArr.length > 0 && objArr.length == 1) {
            java.lang.Object obj = objArr[0];
            if (obj.getClass().isPrimitive() || obj.getClass().equals(java.lang.Integer.class) || obj.getClass().equals(java.lang.Long.class) || obj.getClass().equals(java.lang.Float.class) || obj.getClass().equals(java.lang.Double.class)) {
                return true;
            }
        }
        return false;
    }

    private java.lang.reflect.Method getterMethod(java.lang.Class cls, java.lang.String str) {
        for (java.lang.reflect.Method method : cls.getMethods()) {
            if (method.getName().startsWith("get") && method.getName().toLowerCase().endsWith(str.toLowerCase())) {
                return method;
            }
        }
        return null;
    }

    private java.lang.String propName(java.lang.reflect.Method method) {
        if (method == null || !method.getName().startsWith("set")) {
            return null;
        }
        return method.getName().substring(3);
    }

    public static com.tencent.kinda.gen.KView unWrapRealObj(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.Proxy) {
            try {
                java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
                if (invocationHandler instanceof com.tencent.kinda.framework.animate.KindaAnimatorViewProxy) {
                    return ((com.tencent.kinda.framework.animate.KindaAnimatorViewProxy) invocationHandler).target;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "unWrapRealObj %s", e17.getMessage());
            }
        }
        if (obj instanceof com.tencent.kinda.gen.KView) {
            return (com.tencent.kinda.gen.KView) obj;
        }
        return null;
    }

    public static java.lang.Object unwrapProxyObject(java.lang.Object obj) {
        if (!(obj instanceof java.lang.reflect.Proxy)) {
            return obj;
        }
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
            return invocationHandler instanceof com.tencent.kinda.framework.animate.KindaAnimatorViewProxy ? ((com.tencent.kinda.framework.animate.KindaAnimatorViewProxy) invocationHandler).target : obj;
        } catch (java.lang.Exception unused) {
            return obj;
        }
    }

    private java.lang.Object[] unwrapProxyParams(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length];
        int i17 = 0;
        for (java.lang.Object obj : objArr) {
            objArr2[i17] = obj;
            if (obj instanceof java.lang.reflect.Proxy) {
                try {
                    java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
                    if (invocationHandler instanceof com.tencent.kinda.framework.animate.KindaAnimatorViewProxy) {
                        objArr2[i17] = ((com.tencent.kinda.framework.animate.KindaAnimatorViewProxy) invocationHandler).target;
                    }
                } catch (java.lang.Exception unused) {
                    objArr2[i17] = obj;
                }
            }
            i17++;
        }
        return objArr2;
    }

    public com.tencent.kinda.framework.widget.base.MMKView getTarget() {
        return this.target;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String propName;
        java.lang.reflect.Method method2;
        android.animation.ValueAnimator buildAnimator;
        try {
            if (!com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate() || !method.getName().startsWith("set") || !checkHasPrimitiveTypeParams(objArr) || method.getReturnType() != java.lang.Void.TYPE || (propName = propName(method)) == null || propName.length() <= 0 || (method2 = getterMethod(this.target.getClass(), propName)) == null || (buildAnimator = buildAnimator(method, method2, objArr[0])) == null) {
                return method.invoke(this.target, unwrapProxyParams(objArr));
            }
            com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(buildAnimator);
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "invoke %s error: %s %s", method.getName(), e17.getMessage(), this.target);
            return null;
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "invoke %s error: %s %s", method.getName(), e18.getMessage(), this.target);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e19, "invoke %s error: %s %s", method.getName(), e19.getMessage(), this.target);
            return null;
        }
    }

    public void setTarget(com.tencent.kinda.framework.widget.base.MMKView mMKView) {
        this.target = mMKView;
    }
}
