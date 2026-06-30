package f26;

/* loaded from: classes16.dex */
public final class h1 extends f26.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f340702c;

    public h1(java.util.List list) {
        this.f340702c = list;
    }

    @Override // f26.f2
    public f26.l2 g(f26.c2 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!this.f340702c.contains(key)) {
            return null;
        }
        o06.j i17 = key.i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return f26.z2.l((o06.e2) i17);
    }
}
