package qc0;

/* loaded from: classes10.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f442963a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f442964b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f442965c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f442966d;

    public p1(yz5.l lVar, yz5.p pVar, yz5.q qVar, yz5.l handleBehaviorStatusCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBehaviorStatusCallback, "handleBehaviorStatusCallback");
        this.f442963a = lVar;
        this.f442964b = pVar;
        this.f442965c = qVar;
        this.f442966d = handleBehaviorStatusCallback;
    }

    /* renamed from: equals */
    public boolean m159796xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.p1)) {
            return false;
        }
        qc0.p1 p1Var = (qc0.p1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442963a, p1Var.f442963a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442964b, p1Var.f442964b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442965c, p1Var.f442965c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442966d, p1Var.f442966d);
    }

    /* renamed from: hashCode */
    public int m159797x8cdac1b() {
        yz5.l lVar = this.f442963a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        yz5.p pVar = this.f442964b;
        int hashCode2 = (hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        yz5.q qVar = this.f442965c;
        return ((hashCode2 + (qVar != null ? qVar.hashCode() : 0)) * 31) + this.f442966d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m159798x9616526c() {
        return "StickerEditorBehaviorCallback(cancelCallback=" + this.f442963a + ", finishErrorCallback=" + this.f442964b + ", finishSuccessCallback=" + this.f442965c + ", handleBehaviorStatusCallback=" + this.f442966d + ')';
    }
}
