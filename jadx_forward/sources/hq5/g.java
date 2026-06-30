package hq5;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.i f364763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hq5.i iVar) {
        super(1);
        this.f364763d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        eq5.h hVar;
        eq5.h hVar2;
        j75.f Q6;
        eq5.h hVar3;
        java.lang.String str;
        eq5.h state = (eq5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        eq5.c cVar = (eq5.c) state.a(eq5.c.class);
        hq5.i iVar = this.f364763d;
        if (cVar != null && (Q6 = iVar.Q6()) != null && (hVar3 = (eq5.h) Q6.mo140437x75286adb()) != null && (str = hVar3.f337449g) != null) {
            int f17 = i65.a.f(iVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            gk0.k kVar = new gk0.k(f17, f17);
            kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            kVar.f353966d = 0.1f;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.p314xaae8f345.mm.ui.C21405x85fc1ce0 a17 = iVar.V6().a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getAvatarIv(...)");
            ((h83.g) n0Var).wi(a17, str, kVar);
        }
        eq5.i iVar2 = (eq5.i) state.a(eq5.i.class);
        if (iVar2 != null) {
            iVar.V6().a().setVisibility(8);
            boolean z17 = false;
            iVar.V6().b().setVisibility(0);
            em.f4 V6 = iVar.V6();
            if (V6.f335854f == null) {
                V6.f335854f = (android.widget.ProgressBar) V6.f335849a.findViewById(com.p314xaae8f345.mm.R.id.vfw);
            }
            V6.f335854f.setVisibility(8);
            iVar.V6().c().setVisibility(8);
            switch (iVar2.f337455b) {
                case 1:
                case 2:
                    iVar.V6().a().setVisibility(0);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqq, iVar.U6()));
                    em.f4 V62 = iVar.V6();
                    if (V62.f335854f == null) {
                        V62.f335854f = (android.widget.ProgressBar) V62.f335849a.findViewById(com.p314xaae8f345.mm.R.id.vfw);
                    }
                    V62.f335854f.setVisibility(0);
                    iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqo));
                    break;
                case 3:
                case 4:
                    iVar.V6().c().s(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsj, iVar.U6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 5:
                    iVar.V6().a().setVisibility(0);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nye, iVar.U6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 6:
                    iVar.V6().a().setVisibility(0);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqm, iVar.U6()));
                    iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzh));
                    break;
                case 7:
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyo, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 8:
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxt, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 9:
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyr, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 10:
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxp, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 11:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().c().s(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nz8));
                    j75.f Q62 = iVar.Q6();
                    if (Q62 != null && (hVar = (eq5.h) Q62.mo140437x75286adb()) != null && hVar.f337454o) {
                        z17 = true;
                    }
                    if (!z17) {
                        iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nz9));
                        break;
                    } else {
                        iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsz));
                        break;
                    }
                    break;
                case 12:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().c().s(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyx));
                    j75.f Q63 = iVar.Q6();
                    if (Q63 != null && (hVar2 = (eq5.h) Q63.mo140437x75286adb()) != null && hVar2.f337454o) {
                        z17 = true;
                    }
                    if (!z17) {
                        iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573527nz2));
                        break;
                    } else {
                        iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsv));
                        break;
                    }
                    break;
                case 13:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyi));
                    iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyh));
                    iVar.V6().c().s(com.p314xaae8f345.mm.R.raw.f80922x6741306, com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24);
                    break;
                case 14:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsj, iVar.U6()));
                    iVar.V6().b().setVisibility(8);
                    iVar.V6().c().s(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
                    break;
                case 15:
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nt8, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 16:
                    iVar.V6().c().s(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsj, iVar.U6()));
                    iVar.V6().b().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyg));
                    break;
                case 17:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().c().s(com.p314xaae8f345.mm.R.raw.f80390xa5480ade, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84);
                    iVar.V6().d().setText(iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nms));
                    iVar.V6().b().setVisibility(8);
                    break;
            }
        }
        return jz5.f0.f384359a;
    }
}
