package c26;

/* loaded from: classes16.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.l implements yz5.l {
    public b(java.lang.Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(c26.f.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String p07 = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return ((c26.f) this.receiver).a(p07);
    }
}
