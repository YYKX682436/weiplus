package uv0;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(uv0.u uVar) {
        super(1);
        this.f512873d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D;
        float floatValue = ((java.lang.Number) obj).floatValue();
        uv0.u uVar = this.f512873d;
        uVar.J();
        uv0.i iVar = uVar.U;
        if (iVar != null) {
            uv0.h hVar = (uv0.h) iVar;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = hVar.f512868c.f338700a;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a3 != null && (D = c4181x2248e1a3.D()) != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.G0(c4181x2248e1a3, floatValue, D);
            }
            hVar.f512867b.p7().c7();
        }
        uVar.K = floatValue;
        uv0.u.O(uVar, floatValue);
        return jz5.f0.f384359a;
    }
}
