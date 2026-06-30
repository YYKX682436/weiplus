package un;

/* loaded from: classes.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.w f510858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(un.w wVar) {
        super(1);
        this.f510858d = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        un.w wVar = this.f510858d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = wVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
            abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(wVar.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            abstractActivityC21394xb3d2c0cf.mo78578x8b18f126(wVar.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            int e17 = com.p314xaae8f345.mm.ui.zk.e(wVar.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            if (fp.h.c(23)) {
                abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().Q0(com.p314xaae8f345.mm.ui.uk.c(wVar.m158354x19263085(), com.p314xaae8f345.mm.R.raw.f80008xda567a70, wVar.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), wVar.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b), e17, e17 * 0.5f));
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            java.lang.String str = (java.lang.String) c0Var.f527815b.get(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomApplicantsContactListUIC", "goToContactInfo roomName = " + ((java.lang.String) ((jz5.n) wVar.f510868e).mo141623x754a37bb()) + ", userName = " + str);
            un.w.f510866f.a(wVar.m80379x76847179(), (java.lang.String) ((jz5.n) wVar.f510868e).mo141623x754a37bb(), str, null, null, true, (java.lang.String) ((jz5.n) wVar.f510867d).mo141623x754a37bb());
        }
        return jz5.f0.f384359a;
    }
}
