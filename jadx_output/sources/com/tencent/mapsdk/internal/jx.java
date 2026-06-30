package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class jx<D extends com.tencent.mapsdk.internal.jz> extends com.tencent.mapsdk.internal.kg<D> implements com.tencent.mapsdk.internal.jw<D> {
    @Override // com.tencent.mapsdk.internal.jw
    public final com.tencent.mapsdk.internal.jw<D> a() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void b(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Long>() { // from class: com.tencent.mapsdk.internal.jx.5
            private java.lang.Long a() {
                return java.lang.Long.valueOf(com.tencent.mapsdk.internal.jx.this.k());
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return java.lang.Long.valueOf(com.tencent.mapsdk.internal.jx.this.k());
            }
        }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(0L)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void c(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Long>() { // from class: com.tencent.mapsdk.internal.jx.6
            private java.lang.Long a() {
                return java.lang.Long.valueOf(com.tencent.mapsdk.internal.jx.this.l());
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return java.lang.Long.valueOf(com.tencent.mapsdk.internal.jx.this.l());
            }
        }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(0L)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void d(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Long>() { // from class: com.tencent.mapsdk.internal.jx.7
            private java.lang.Long a() {
                return java.lang.Long.valueOf(com.tencent.mapsdk.internal.jx.this.e());
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return java.lang.Long.valueOf(com.tencent.mapsdk.internal.jx.this.e());
            }
        }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(0L)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(final java.lang.String str, final D d17, com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.jx.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean call() {
                com.tencent.mapsdk.internal.jx.this.b(str, (java.lang.String) d17);
                return java.lang.Boolean.TRUE;
            }
        }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(java.lang.Boolean.FALSE)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(final java.lang.String str, final java.lang.Class<D> cls, com.tencent.mapsdk.internal.jw.a<D> aVar) {
        try {
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<D>() { // from class: com.tencent.mapsdk.internal.jx.2
                private D a() {
                    return (D) com.tencent.mapsdk.internal.jx.this.b(str, cls);
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.tencent.mapsdk.internal.jx.this.b(str, cls);
                }
            }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(cls.newInstance())).b(aVar);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.Error("The " + cls.getSimpleName() + " must have a empty construct. #" + e17.getMessage(), e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.Error("The " + cls.getSimpleName() + " must have a empty construct. #" + e18.getMessage(), e18);
        }
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(final java.lang.String str, com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.jx.3
            private java.lang.Boolean a() {
                return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.jx.this.b(str));
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.jx.this.b(str));
            }
        }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(java.lang.Boolean.FALSE)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.jx.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean call() {
                com.tencent.mapsdk.internal.jx.this.j();
                return java.lang.Boolean.TRUE;
            }
        }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(java.lang.Boolean.FALSE)).b(aVar);
    }
}
