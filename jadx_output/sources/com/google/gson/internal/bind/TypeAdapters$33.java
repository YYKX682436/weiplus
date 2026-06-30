package com.google.gson.internal.bind;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class TypeAdapters$33 implements com.google.gson.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f44745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f44746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.v f44747f;

    public TypeAdapters$33(java.lang.Class cls, java.lang.Class cls2, com.google.gson.v vVar) {
        this.f44745d = cls;
        this.f44746e = cls2;
        this.f44747f = vVar;
    }

    @Override // com.google.gson.w
    public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
        java.lang.Class cls = aVar.f290021a;
        if (cls == this.f44745d || cls == this.f44746e) {
            return this.f44747f;
        }
        return null;
    }

    public java.lang.String toString() {
        return "Factory[type=" + this.f44746e.getName() + "+" + this.f44745d.getName() + ",adapter=" + this.f44747f + "]";
    }
}
