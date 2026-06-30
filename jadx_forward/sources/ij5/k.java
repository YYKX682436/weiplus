package ij5;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f373311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ij5.t tVar) {
        super(1);
        this.f373311d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            state.A = true;
            ij5.t tVar = this.f373311d;
            java.lang.String str = (java.lang.String) ((jz5.n) tVar.f373334f).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "access$getSelectShowHeadDisplay(...)");
            state.B = str;
            java.lang.String str2 = (java.lang.String) ((jz5.n) tVar.f373333e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "access$getChatroomSessionWord(...)");
            state.C = str2;
            state.f527853p.addAll((java.util.HashSet) ((jz5.n) tVar.f373338m).mo141623x754a37bb());
        }
        return jz5.f0.f384359a;
    }
}
