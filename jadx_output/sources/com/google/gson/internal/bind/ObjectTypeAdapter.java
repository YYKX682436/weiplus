package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class ObjectTypeAdapter extends com.google.gson.v {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.w f44725b = new com.google.gson.w() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.w
        public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
            if (aVar.f290021a == java.lang.Object.class) {
                return new com.google.gson.internal.bind.ObjectTypeAdapter(iVar);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.i f44726a;

    public ObjectTypeAdapter(com.google.gson.i iVar) {
        this.f44726a = iVar;
    }

    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        int ordinal = bVar.K().ordinal();
        if (ordinal == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            bVar.a();
            while (bVar.l()) {
                arrayList.add(b(bVar));
            }
            bVar.i();
            return arrayList;
        }
        if (ordinal == 2) {
            com.google.gson.internal.c0 c0Var = new com.google.gson.internal.c0();
            bVar.b();
            while (bVar.l()) {
                c0Var.put(bVar.A(), b(bVar));
            }
            bVar.j();
            return c0Var;
        }
        if (ordinal == 5) {
            return bVar.I();
        }
        if (ordinal == 6) {
            return java.lang.Double.valueOf(bVar.w());
        }
        if (ordinal == 7) {
            return java.lang.Boolean.valueOf(bVar.v());
        }
        if (ordinal != 8) {
            throw new java.lang.IllegalStateException();
        }
        bVar.D();
        return null;
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        if (obj == null) {
            dVar.p();
            return;
        }
        java.lang.Class<?> cls = obj.getClass();
        com.google.gson.i iVar = this.f44726a;
        iVar.getClass();
        com.google.gson.v d17 = iVar.d(new ib.a(cls));
        if (!(d17 instanceof com.google.gson.internal.bind.ObjectTypeAdapter)) {
            d17.c(dVar, obj);
        } else {
            dVar.c();
            dVar.j();
        }
    }
}
