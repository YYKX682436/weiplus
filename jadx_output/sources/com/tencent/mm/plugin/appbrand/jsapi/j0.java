package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f81319a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f81320b;

    /* renamed from: c, reason: collision with root package name */
    public final jc1.d f81321c;

    public j0(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            this.f81320b = java.lang.String.format(str, objArr);
        } else {
            this.f81320b = str;
        }
    }

    public j0(jc1.d dVar, java.lang.Object... objArr) {
        this.f81321c = dVar;
        this.f81320b = dVar.f298904b;
    }
}
