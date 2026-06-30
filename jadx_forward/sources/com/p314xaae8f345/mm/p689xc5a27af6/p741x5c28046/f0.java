package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes12.dex */
public class f0 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.g5 f147788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f147789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0 f147790c;

    public f0(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0 b0Var, com.p314xaae8f345.mm.p2621x8fb0427b.g5 g5Var, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f147790c = b0Var;
        this.f147788a = g5Var;
        this.f147789b = c21053xdbf1e5f4;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0 b0Var = this.f147790c;
        b0Var.aj(this.f147788a);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5 q5Var = b0Var.f147709n;
        if (q5Var != null) {
            q5Var.a(z17, this.f147789b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "doCDNDownloadScene callback is null");
        }
    }
}
