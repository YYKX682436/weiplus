package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* loaded from: classes14.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f147254a;

    /* renamed from: b, reason: collision with root package name */
    public final int f147255b;

    public o(android.view.View view, int i17, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.m mVar) {
        this.f147254a = view;
        this.f147255b = i17;
    }

    /* renamed from: equals */
    public boolean m44247xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o) obj;
        return this.f147255b == oVar.f147255b && this.f147254a.equals(oVar.f147254a);
    }

    /* renamed from: hashCode */
    public int m44248x8cdac1b() {
        return ((this.f147254a.hashCode() + 31) * 31) + this.f147255b;
    }
}
