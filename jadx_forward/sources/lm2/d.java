package lm2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.pn f400912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.pn pnVar) {
        super(1);
        this.f400912d = pnVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.pn pnVar = (r45.pn) obj;
        r45.pn pnVar2 = this.f400912d;
        return java.lang.Boolean.valueOf((pnVar != null && (pnVar.f464737d > pnVar2.f464737d ? 1 : (pnVar.f464737d == pnVar2.f464737d ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pnVar.f464739f, pnVar2.f464739f));
    }
}
