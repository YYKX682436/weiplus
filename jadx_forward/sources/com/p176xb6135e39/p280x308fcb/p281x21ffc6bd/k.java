package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes13.dex */
public class k implements com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Constructor f126352a;

    public k(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar, java.lang.reflect.Constructor constructor) {
        this.f126352a = constructor;
    }

    @Override // com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0
    public java.lang.Object a() {
        java.lang.reflect.Constructor constructor = this.f126352a;
        try {
            return constructor.newInstance(null);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.AssertionError(e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Failed to invoke " + constructor + " with no args", e18);
        } catch (java.lang.reflect.InvocationTargetException e19) {
            throw new java.lang.RuntimeException("Failed to invoke " + constructor + " with no args", e19.getTargetException());
        }
    }
}
