package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class n1 extends com.tencent.mm.plugin.appbrand.utils.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90516a;

    public n1(java.lang.String str) {
        this.f90516a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.o1, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i(this.f90516a, "dummy invoke method(%s) args(%s)", method.getName(), u46.a.c(objArr, "NULL"));
        return super.invoke(obj, method, objArr);
    }
}
