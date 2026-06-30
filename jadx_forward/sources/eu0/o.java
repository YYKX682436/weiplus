package eu0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338260a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f338261b;

    public o(java.lang.String finderTabContextId, java.lang.String finderContextId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderTabContextId, "finderTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContextId, "finderContextId");
        this.f338260a = finderTabContextId;
        this.f338261b = finderContextId;
    }

    /* renamed from: equals */
    public boolean m128196xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0.o)) {
            return false;
        }
        eu0.o oVar = (eu0.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338260a, oVar.f338260a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338261b, oVar.f338261b);
    }

    /* renamed from: hashCode */
    public int m128197x8cdac1b() {
        return (this.f338260a.hashCode() * 31) + this.f338261b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m128198x9616526c() {
        return "ComposingCreationRawInfos: finderTabContextId=" + this.f338260a + ", finderContextId=" + this.f338261b;
    }
}
