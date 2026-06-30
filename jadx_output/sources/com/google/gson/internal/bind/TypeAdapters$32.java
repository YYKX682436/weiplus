package com.google.gson.internal.bind;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class TypeAdapters$32 implements com.google.gson.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f44743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.v f44744e;

    public TypeAdapters$32(java.lang.Class cls, com.google.gson.v vVar) {
        this.f44743d = cls;
        this.f44744e = vVar;
    }

    @Override // com.google.gson.w
    public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
        if (aVar.f290021a == this.f44743d) {
            return this.f44744e;
        }
        return null;
    }

    public java.lang.String toString() {
        return "Factory[type=" + this.f44743d.getName() + ",adapter=" + this.f44744e + "]";
    }
}
