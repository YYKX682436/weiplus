package px2;

/* loaded from: classes2.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f440443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c f440444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(float f17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c, in5.s0 s0Var) {
        super(0);
        this.f440443d = f17;
        this.f440444e = c15413x7c45044c;
        this.f440445f = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17 = this.f440443d;
        boolean z17 = f17 == 1.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c = this.f440444e;
        if (z17) {
            ow2.h hVar = c15413x7c45044c.W;
            if (hVar != null) {
                hVar.f(this.f440445f, true);
            }
        } else {
            ow2.h hVar2 = c15413x7c45044c.W;
            if (hVar2 != null) {
                hVar2.h(f17);
            }
        }
        return jz5.f0.f384359a;
    }
}
