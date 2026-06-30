package r16;

/* loaded from: classes16.dex */
public final class y extends f26.b2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r16.z f450216i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, boolean z18, r16.z zVar, g26.j jVar, g26.l lVar) {
        super(z17, z18, true, zVar, jVar, lVar);
        this.f450216i = zVar;
    }

    @Override // f26.b2
    public boolean b(i26.i subType, i26.i superType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superType, "superType");
        if (!(subType instanceof f26.o0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (superType instanceof f26.o0) {
            return ((java.lang.Boolean) this.f450216i.f450221e.mo149xb9724478(subType, superType)).booleanValue();
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }
}
