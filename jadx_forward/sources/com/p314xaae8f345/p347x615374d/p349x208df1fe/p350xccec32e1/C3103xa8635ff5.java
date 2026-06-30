package com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1;

@java.lang.Deprecated
/* renamed from: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy */
/* loaded from: classes15.dex */
public class C3103xa8635ff5 implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String TAG = "MicroMsg.Kinda.KindaAnimatorViewProxy";

    /* renamed from: target */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 f11828xcb7e7191 = null;

    /* renamed from: defaultLongEvaluator */
    private static com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.LongEvaluator f11827xe5c91852 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.LongEvaluator();

    /* renamed from: defaultDoubleEvaluator */
    private static com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.DoubleEvaluator f11826x663cbedd = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.DoubleEvaluator();

    /* renamed from: defaultArgbEvaluator */
    private static com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3101xae48ca3 f11825xe58ca802 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3101xae48ca3();

    /* renamed from: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy$DoubleEvaluator */
    /* loaded from: classes13.dex */
    public static class DoubleEvaluator implements android.animation.TypeEvaluator<java.lang.Number> {
        @Override // android.animation.TypeEvaluator
        public java.lang.Number evaluate(float f17, java.lang.Number number, java.lang.Number number2) {
            double doubleValue = number.doubleValue();
            return java.lang.Double.valueOf(doubleValue + (f17 * (number2.doubleValue() - doubleValue)));
        }
    }

    /* renamed from: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy$LongEvaluator */
    /* loaded from: classes13.dex */
    public static class LongEvaluator implements android.animation.TypeEvaluator<java.lang.Number> {
        @Override // android.animation.TypeEvaluator
        public java.lang.Number evaluate(float f17, java.lang.Number number, java.lang.Number number2) {
            long longValue = number.longValue();
            return java.lang.Long.valueOf(((float) longValue) + (f17 * ((float) (number2.longValue() - longValue))));
        }
    }

    /* renamed from: buildAnimator */
    private android.animation.ValueAnimator m24880xb2520775(final java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.Object obj) {
        if (obj.getClass().equals(java.lang.Integer.class)) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((java.lang.Integer) method2.invoke(this.f11828xcb7e7191, new java.lang.Object[0])).intValue(), ((java.lang.Integer) obj).intValue());
            ofInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    try {
                        method.invoke(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.this.f11828xcb7e7191, java.lang.Integer.valueOf(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue()));
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            ofInt.setDuration(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24903x5bde7395());
            return ofInt;
        }
        if (obj.getClass().equals(java.lang.Long.class)) {
            if (method.getName().equals(nd1.s0.f72974x24728b)) {
                android.animation.ValueAnimator.ofObject(f11825xe58ca802, java.lang.Integer.valueOf((int) ((java.lang.Long) method2.invoke(this.f11828xcb7e7191, new java.lang.Object[0])).longValue()), java.lang.Integer.valueOf((int) ((java.lang.Long) obj).longValue())).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        try {
                            method.invoke(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.this.f11828xcb7e7191, java.lang.Long.valueOf(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue()));
                        } catch (java.lang.Exception unused) {
                        }
                    }
                });
                return null;
            }
            android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(f11827xe5c91852, (java.lang.Long) method2.invoke(this.f11828xcb7e7191, new java.lang.Object[0]), (java.lang.Long) obj);
            ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    try {
                        method.invoke(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.this.f11828xcb7e7191, java.lang.Long.valueOf(((java.lang.Long) valueAnimator.getAnimatedValue()).longValue()));
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            ofObject.setDuration(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24903x5bde7395());
            return ofObject;
        }
        if (obj.getClass().equals(java.lang.Float.class)) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(((java.lang.Float) method2.invoke(this.f11828xcb7e7191, new java.lang.Object[0])).floatValue(), ((java.lang.Float) obj).floatValue());
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    try {
                        method.invoke(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.this.f11828xcb7e7191, java.lang.Float.valueOf(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()));
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            ofFloat.setDuration(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24903x5bde7395());
            return ofFloat;
        }
        if (!obj.getClass().equals(java.lang.Double.class)) {
            return null;
        }
        android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(f11826x663cbedd, (java.lang.Double) method2.invoke(this.f11828xcb7e7191, new java.lang.Object[0]), (java.lang.Double) obj);
        ofObject2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                try {
                    method.invoke(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.this.f11828xcb7e7191, java.lang.Double.valueOf(((java.lang.Double) valueAnimator.getAnimatedValue()).doubleValue()));
                } catch (java.lang.Exception unused) {
                }
            }
        });
        ofObject2.setDuration(com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24903x5bde7395());
        return ofObject2;
    }

    /* renamed from: checkHasPrimitiveTypeParams */
    private boolean m24881x8e7b5bd5(java.lang.Object[] objArr) {
        if (objArr != null && objArr.length > 0 && objArr.length == 1) {
            java.lang.Object obj = objArr[0];
            if (obj.getClass().isPrimitive() || obj.getClass().equals(java.lang.Integer.class) || obj.getClass().equals(java.lang.Long.class) || obj.getClass().equals(java.lang.Float.class) || obj.getClass().equals(java.lang.Double.class)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getterMethod */
    private java.lang.reflect.Method m24882xca8571cc(java.lang.Class cls, java.lang.String str) {
        for (java.lang.reflect.Method method : cls.getMethods()) {
            if (method.getName().startsWith("get") && method.getName().toLowerCase().endsWith(str.toLowerCase())) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: propName */
    private java.lang.String m24883xc4c3288e(java.lang.reflect.Method method) {
        if (method == null || !method.getName().startsWith("set")) {
            return null;
        }
        return method.getName().substring(3);
    }

    /* renamed from: unWrapRealObj */
    public static com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 m24884xf6b77e76(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.Proxy) {
            try {
                java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
                if (invocationHandler instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5) {
                    return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5) invocationHandler).f11828xcb7e7191;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "unWrapRealObj %s", e17.getMessage());
            }
        }
        if (obj instanceof com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190) {
            return (com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190) obj;
        }
        return null;
    }

    /* renamed from: unwrapProxyObject */
    public static java.lang.Object m24885xba0cc0ea(java.lang.Object obj) {
        if (!(obj instanceof java.lang.reflect.Proxy)) {
            return obj;
        }
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
            return invocationHandler instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5 ? ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5) invocationHandler).f11828xcb7e7191 : obj;
        } catch (java.lang.Exception unused) {
            return obj;
        }
    }

    /* renamed from: unwrapProxyParams */
    private java.lang.Object[] m24886xbbb71731(java.lang.Object[] objArr) {
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
                    if (invocationHandler instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5) {
                        objArr2[i17] = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5) invocationHandler).f11828xcb7e7191;
                    }
                } catch (java.lang.Exception unused) {
                    objArr2[i17] = obj;
                }
            }
            i17++;
        }
        return objArr2;
    }

    /* renamed from: getTarget */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 m24887x30959487() {
        return this.f11828xcb7e7191;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String m24883xc4c3288e;
        java.lang.reflect.Method m24882xca8571cc;
        android.animation.ValueAnimator m24880xb2520775;
        try {
            if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7() || !method.getName().startsWith("set") || !m24881x8e7b5bd5(objArr) || method.getReturnType() != java.lang.Void.TYPE || (m24883xc4c3288e = m24883xc4c3288e(method)) == null || m24883xc4c3288e.length() <= 0 || (m24882xca8571cc = m24882xca8571cc(this.f11828xcb7e7191.getClass(), m24883xc4c3288e)) == null || (m24880xb2520775 = m24880xb2520775(method, m24882xca8571cc, objArr[0])) == null) {
                return method.invoke(this.f11828xcb7e7191, m24886xbbb71731(objArr));
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24902x9687d6a8(m24880xb2520775);
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "invoke %s error: %s %s", method.getName(), e17.getMessage(), this.f11828xcb7e7191);
            return null;
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "invoke %s error: %s %s", method.getName(), e18.getMessage(), this.f11828xcb7e7191);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e19, "invoke %s error: %s %s", method.getName(), e19.getMessage(), this.f11828xcb7e7191);
            return null;
        }
    }

    /* renamed from: setTarget */
    public void m24888x23cac893(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0) {
        this.f11828xcb7e7191 = c3352x70ee8bf0;
    }
}
