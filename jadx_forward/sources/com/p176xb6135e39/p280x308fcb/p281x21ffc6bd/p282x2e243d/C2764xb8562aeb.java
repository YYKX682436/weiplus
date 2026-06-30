package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* renamed from: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory */
/* loaded from: classes16.dex */
public final class C2764xb8562aeb implements com.p176xb6135e39.p280x308fcb.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r f126251d;

    public C2764xb8562aeb(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar) {
        this.f126251d = rVar;
    }

    @Override // com.p176xb6135e39.p280x308fcb.w
    public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
        fb.a aVar2 = (fb.a) aVar.f371554a.getAnnotation(fb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f126251d, iVar, aVar, aVar2);
    }

    public com.p176xb6135e39.p280x308fcb.v b(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar, com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar, fb.a aVar2) {
        com.p176xb6135e39.p280x308fcb.v a17;
        java.lang.Object a18 = rVar.a(new ib.a(aVar2.m129289x6ac9171())).a();
        if (a18 instanceof com.p176xb6135e39.p280x308fcb.v) {
            a17 = (com.p176xb6135e39.p280x308fcb.v) a18;
        } else {
            if (!(a18 instanceof com.p176xb6135e39.p280x308fcb.w)) {
                throw new java.lang.IllegalArgumentException("Invalid attempt to bind an instance of " + a18.getClass().getName() + " as a @JsonAdapter for " + aVar.m135005x9616526c() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a17 = ((com.p176xb6135e39.p280x308fcb.w) a18).a(iVar, aVar);
        }
        return (a17 == null || !aVar2.m129288x8e5eddb4()) ? a17 : a17.a();
    }
}
