package rp;

/* loaded from: classes12.dex */
public class c implements com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback {

    /* renamed from: b, reason: collision with root package name */
    public static android.os.ParcelFileDescriptor f479860b;

    /* renamed from: a, reason: collision with root package name */
    public volatile rp.g f479861a = null;

    public c(rp.a aVar) {
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84131x316510(new android.os.ParcelFileDescriptor[]{f479860b}, 1871, 0);
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84140xde4f266e();
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84128xa1b443bf("Client Version: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84128xa1b443bf("Base Version: " + lp0.a.f401782c);
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84127x6d0510c(this);
    }

    @Override // com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback
    /* renamed from: onCrashDumped */
    public boolean mo84142x49fed8bb(int i17, java.lang.String str, java.lang.String str2) {
        if (this.f479861a != null) {
            rp.f fVar = new rp.f();
            fVar.f479862a = 0;
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            fVar.f479863b = "isolated process cannot read crash dump file.";
            this.f479861a.a(fVar);
        }
        return false;
    }
}
