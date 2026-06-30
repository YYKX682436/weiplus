package b32;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 f99167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 c13403xae7eeb92) {
        super(2);
        this.f99167d = c13403xae7eeb92;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 c13403xae7eeb92 = this.f99167d;
        if (c13403xae7eeb92.f180289d) {
            c13403xae7eeb92.G.f106450g.set(m17);
            c13403xae7eeb92.invalidate();
        }
        return jz5.f0.f384359a;
    }
}
