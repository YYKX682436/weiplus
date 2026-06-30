package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes10.dex */
public final class j3 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 f147875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f147876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f147877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f147878d;

    public j3(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, yz5.l lVar) {
        this.f147875a = c4Var;
        this.f147876b = h0Var;
        this.f147877c = z17;
        this.f147878d = lVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = this.f147875a;
        java.lang.String str = c4Var.f147740d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download emoji image for single emoticon path: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f147876b;
        sb6.append(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).mo42933xb5885648());
        sb6.append(", isSuccess: ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.l lVar = this.f147878d;
        java.lang.String str2 = "";
        if (z17) {
            if (this.f147877c) {
                str2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).T();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getDecryptPath(...)");
            } else {
                java.lang.String Bi = c4Var.Bi((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d);
                if (Bi.length() == 0) {
                    lVar.mo146xb9724478("");
                    return;
                }
                str2 = Bi;
            }
        }
        lVar.mo146xb9724478(str2);
    }
}
