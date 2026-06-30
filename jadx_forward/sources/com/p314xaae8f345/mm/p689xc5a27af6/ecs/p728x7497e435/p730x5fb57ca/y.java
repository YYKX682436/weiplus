package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f147338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double[] f147339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double[] f147340c;

    public y(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var, boolean z17, double[] dArr, double[] dArr2) {
        this.f147338a = z17;
        this.f147339b = dArr;
        this.f147340c = dArr2;
    }

    public void a(double d17, double d18) {
        boolean z17 = this.f147338a;
        double[] dArr = this.f147339b;
        double d19 = z17 ? 1.0d : 1.0d / (((dArr[3] * d17) + (dArr[7] * d18)) + dArr[15]);
        double d27 = ((dArr[0] * d17) + (dArr[4] * d18) + dArr[12]) * d19;
        double d28 = ((dArr[1] * d17) + (dArr[5] * d18) + dArr[13]) * d19;
        double[] dArr2 = this.f147340c;
        if (d27 < dArr2[0]) {
            dArr2[0] = d27;
        } else if (d27 > dArr2[1]) {
            dArr2[1] = d27;
        }
        if (d28 < dArr2[2]) {
            dArr2[2] = d28;
        } else if (d28 > dArr2[3]) {
            dArr2[3] = d28;
        }
    }
}
