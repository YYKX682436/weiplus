package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.gson.internal.r f44718d;

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.r rVar) {
        this.f44718d = rVar;
    }

    @Override // com.google.gson.w
    public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
        fb.a aVar2 = (fb.a) aVar.f290021a.getAnnotation(fb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f44718d, iVar, aVar, aVar2);
    }

    public com.google.gson.v b(com.google.gson.internal.r rVar, com.google.gson.i iVar, ib.a aVar, fb.a aVar2) {
        com.google.gson.v a17;
        java.lang.Object a18 = rVar.a(new ib.a(aVar2.value())).a();
        if (a18 instanceof com.google.gson.v) {
            a17 = (com.google.gson.v) a18;
        } else {
            if (!(a18 instanceof com.google.gson.w)) {
                throw new java.lang.IllegalArgumentException("Invalid attempt to bind an instance of " + a18.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a17 = ((com.google.gson.w) a18).a(iVar, aVar);
        }
        return (a17 == null || !aVar2.nullSafe()) ? a17 : a17.a();
    }
}
