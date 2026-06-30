package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f147916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f147917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f147919g;

    public m3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, boolean z17, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f147916d = f4Var;
        this.f147917e = z17;
        this.f147918f = context;
        this.f147919g = c21053xdbf1e5f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f147916d.dismiss();
        if (this.f147917e) {
            o22.i.c(this.f147918f, 6, this.f147919g.mo42933xb5885648(), "");
        }
    }
}
