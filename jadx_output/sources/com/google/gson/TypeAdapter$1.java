package com.google.gson;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class TypeAdapter$1 extends com.google.gson.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.v f44671a;

    public TypeAdapter$1(com.google.gson.v vVar) {
        this.f44671a = vVar;
    }

    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        if (bVar.K() != jb.c.NULL) {
            return this.f44671a.b(bVar);
        }
        bVar.D();
        return null;
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        if (obj == null) {
            dVar.p();
        } else {
            this.f44671a.c(dVar, obj);
        }
    }
}
