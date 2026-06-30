package vr3;

/* loaded from: classes11.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 f521184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7) {
        super(1);
        this.f521184d = c16893x570516c7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList<r45.e6> cacheMsgs = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheMsgs, "cacheMsgs");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7 = this.f521184d;
        if (c16893x570516c7.f235813h) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (r45.e6 e6Var : cacheMsgs) {
                arrayList.add(new vr3.h(e6Var.f454571d, c16893x570516c7.a(e6Var.f454572e.f455564d)));
            }
            c16893x570516c7.f235821s.mo523x53d8522f(new vr3.g(arrayList));
        }
        return jz5.f0.f384359a;
    }
}
