package sp2;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f492796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(int i17) {
        super(1);
        this.f492796d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        return java.lang.Boolean.valueOf(lVar != null && ((java.lang.Number) lVar.f384366d).intValue() == this.f492796d);
    }
}
