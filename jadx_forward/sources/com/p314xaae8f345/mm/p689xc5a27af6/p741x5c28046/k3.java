package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes10.dex */
public final class k3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f147888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 f147889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f147891g;

    public k3(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var, android.content.Context context, yz5.l lVar) {
        this.f147888d = interfaceC4987x84e327cb;
        this.f147889e = c4Var;
        this.f147890f = context;
        this.f147891g = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String mo42930x4f4a97c4 = this.f147888d.mo42930x4f4a97c4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42930x4f4a97c4, "getGroupId(...)");
        qk.c0 c0Var = new qk.c0(mo42930x4f4a97c4);
        c0Var.f445731g = 20;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f147889e.f147740d, "emoticon liteapp service not found");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(this.f147890f, c0Var);
        }
        dialogInterface.cancel();
        this.f147891g.mo146xb9724478(1);
    }
}
