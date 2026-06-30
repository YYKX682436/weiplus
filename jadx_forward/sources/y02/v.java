package y02;

/* loaded from: classes9.dex */
public class v extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements y02.u {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f540166d;

    public v() {
        boolean[] zArr = new boolean[4];
        for (int i17 = 0; i17 < 4; i17++) {
            zArr[i17] = false;
        }
        this.f540166d = zArr;
        bw5.h7 h7Var = bw5.h7.m12049xcee59d22()[0];
        new bw5.g7();
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: notifyFieldUpdated */
    public void mo105982x3f27f04a(int i17) {
        synchronized (this) {
            this.f540166d[i17] = false;
        }
    }
}
