package com.google.gson;

/* loaded from: classes16.dex */
class Gson$FutureTypeAdapter<T> extends com.google.gson.v {

    /* renamed from: a, reason: collision with root package name */
    public com.google.gson.v f44670a;

    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        com.google.gson.v vVar = this.f44670a;
        if (vVar != null) {
            return vVar.b(bVar);
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        com.google.gson.v vVar = this.f44670a;
        if (vVar == null) {
            throw new java.lang.IllegalStateException();
        }
        vVar.c(dVar, obj);
    }
}
