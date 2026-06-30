package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class TreeTypeAdapter<T> extends com.google.gson.v {

    /* renamed from: a, reason: collision with root package name */
    public com.google.gson.v f44738a;

    /* loaded from: classes16.dex */
    public static final class SingleTypeFactory implements com.google.gson.w {
        @Override // com.google.gson.w
        public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
            java.lang.Class cls = aVar.f290021a;
            throw null;
        }
    }

    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        com.google.gson.v vVar = this.f44738a;
        if (vVar != null) {
            return vVar.b(bVar);
        }
        throw null;
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        com.google.gson.v vVar = this.f44738a;
        if (vVar == null) {
            throw null;
        }
        vVar.c(dVar, obj);
    }
}
