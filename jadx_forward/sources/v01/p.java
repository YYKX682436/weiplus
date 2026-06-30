package v01;

/* loaded from: classes11.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 f513749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f513750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6, boolean z17) {
        super(0);
        this.f513749d = c11118xe5a619d6;
        this.f513750e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6.f152398q;
        com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6 = this.f513749d;
        if (!c11118xe5a619d6.u0()) {
            if (!this.f513750e) {
                c11118xe5a619d6.z0(false);
            } else if (c11118xe5a619d6.mo7438x76847179() != null) {
                if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                    em.e eVar = c11118xe5a619d6.f152401p;
                    if (eVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                        throw null;
                    }
                    if (eVar.f335782e == null) {
                        eVar.f335782e = (android.widget.TextView) eVar.f335778a.findViewById(com.p314xaae8f345.mm.R.id.uvm);
                    }
                    android.widget.TextView textView = eVar.f335782e;
                    android.content.Context mo7438x76847179 = c11118xe5a619d6.mo7438x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
                    textView.setText(mo7438x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572759nh1));
                }
                em.e eVar2 = c11118xe5a619d6.f152401p;
                if (eVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                if (eVar2.f335782e == null) {
                    eVar2.f335782e = (android.widget.TextView) eVar2.f335778a.findViewById(com.p314xaae8f345.mm.R.id.uvm);
                }
                com.p314xaae8f345.mm.ui.bk.r0(eVar2.f335782e.getPaint(), 0.8f);
                em.e eVar3 = c11118xe5a619d6.f152401p;
                if (eVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                if (eVar3.f335787j == null) {
                    eVar3.f335787j = (android.widget.TextView) eVar3.f335778a.findViewById(com.p314xaae8f345.mm.R.id.vpk);
                }
                com.p314xaae8f345.mm.ui.bk.r0(eVar3.f335787j.getPaint(), 0.8f);
                em.e eVar4 = c11118xe5a619d6.f152401p;
                if (eVar4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                android.widget.RelativeLayout d17 = eVar4.d();
                d17.setVisibility(0);
                d17.setOnClickListener(new v01.d(c11118xe5a619d6));
                em.e eVar5 = c11118xe5a619d6.f152401p;
                if (eVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                android.widget.RelativeLayout h17 = eVar5.h();
                h17.setVisibility(0);
                h17.setOnClickListener(new v01.e(c11118xe5a619d6));
                em.e eVar6 = c11118xe5a619d6.f152401p;
                if (eVar6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                eVar6.f().setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
