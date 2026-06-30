package rv0;

/* loaded from: classes5.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(ex0.a0 a0Var) {
        super(0);
        this.f481672d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D;
        java.util.Iterator it = ((java.util.ArrayList) this.f481672d.f338630g.f338710e).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = ((ex0.r) it.next()).f338700a;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a3 != null && (D = c4181x2248e1a3.D()) != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.L0(c4181x2248e1a3, D);
            }
        }
        return jz5.f0.f384359a;
    }
}
