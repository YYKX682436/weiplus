package xu3;

/* loaded from: classes5.dex */
public final class c implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.AbstractC17055xfd8ec9b6 f538787d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.AbstractC17055xfd8ec9b6 abstractC17055xfd8ec9b6) {
        this.f538787d = abstractC17055xfd8ec9b6;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.AbstractC17055xfd8ec9b6 abstractC17055xfd8ec9b6 = this.f538787d;
        xu3.b bVar = (xu3.b) kz5.n0.a0(abstractC17055xfd8ec9b6.f237634d, i17);
        if (bVar != null) {
            boolean z17 = bVar.f538786f;
            boolean z18 = false;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = bVar.f538784d;
            if (z17) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null && c19788xd7cfd73e.m76613x7f025288() == 2) {
                    z18 = true;
                }
                if (z18) {
                    db5.t7.m(abstractC17055xfd8ec9b6.getContext(), i65.a.r(abstractC17055xfd8ec9b6.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574824jm2));
                    return;
                } else {
                    db5.t7.m(abstractC17055xfd8ec9b6.getContext(), i65.a.r(abstractC17055xfd8ec9b6.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574825jm3));
                    return;
                }
            }
            if (bVar.f538785e) {
                return;
            }
            xu3.b bVar2 = (xu3.b) kz5.n0.a0(abstractC17055xfd8ec9b6.f237634d, abstractC17055xfd8ec9b6.f237635e);
            if (bVar2 != null) {
                bVar2.f538785e = false;
            }
            bVar.f538785e = true;
            adapter.m8148xed6e4d18(abstractC17055xfd8ec9b6.f237635e, 1);
            adapter.m8148xed6e4d18(i17, 1);
            abstractC17055xfd8ec9b6.f237635e = i17;
            yz5.q onFinderVideoSelectListener = abstractC17055xfd8ec9b6.getOnFinderVideoSelectListener();
            if (onFinderVideoSelectListener != null) {
                onFinderVideoSelectListener.mo147xb9724478(abstractC17055xfd8ec9b6, java.lang.Integer.valueOf(i17), c19792x256d2725);
            }
        }
    }
}
