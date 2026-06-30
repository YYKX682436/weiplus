package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter */
/* loaded from: classes16.dex */
public final class C2766x92f50dd6 extends com.p176xb6135e39.p280x308fcb.v {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126258b = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.p176xb6135e39.p280x308fcb.w
        public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
            if (aVar.f371554a == java.lang.Object.class) {
                return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2766x92f50dd6(iVar);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.i f126259a;

    public C2766x92f50dd6(com.p176xb6135e39.p280x308fcb.i iVar) {
        this.f126259a = iVar;
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
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
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 c0Var = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0();
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

    @Override // com.p176xb6135e39.p280x308fcb.v
    public void c(jb.d dVar, java.lang.Object obj) {
        if (obj == null) {
            dVar.p();
            return;
        }
        java.lang.Class<?> cls = obj.getClass();
        com.p176xb6135e39.p280x308fcb.i iVar = this.f126259a;
        iVar.getClass();
        com.p176xb6135e39.p280x308fcb.v d17 = iVar.d(new ib.a(cls));
        if (!(d17 instanceof com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2766x92f50dd6)) {
            d17.c(dVar, obj);
        } else {
            dVar.c();
            dVar.j();
        }
    }
}
