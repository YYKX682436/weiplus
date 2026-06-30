package b16;

/* loaded from: classes16.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.l implements yz5.l {
    public u(java.lang.Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(b16.e0.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g p07 = (n16.g) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return b16.e0.w((b16.e0) this.receiver, p07);
    }
}
