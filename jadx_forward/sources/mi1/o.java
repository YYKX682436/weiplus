package mi1;

/* loaded from: classes7.dex */
public final class o implements al1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f408183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.v f408184e;

    public o(mi1.v vVar) {
        this.f408184e = vVar;
        int d17 = ((kz5.b) mi1.n.f408164a).d();
        byte[] bArr = new byte[d17];
        for (int i17 = 0; i17 < d17; i17++) {
            bArr[i17] = 0;
        }
        this.f408183d = bArr;
    }

    @Override // al1.i0
    public boolean h(boolean z17, al1.h0 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f408183d[reason.ordinal()] = !z17 ? 1 : 0;
        byte[] bArr = this.f408183d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<this>");
        int i17 = 0;
        for (byte b17 : bArr) {
            i17 += b17;
        }
        boolean z18 = i17 >= 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateCapsuleVisibility(appId:");
        sb6.append(this.f408184e.f408235a.f156336n);
        sb6.append(", expected:");
        sb6.append(z17);
        sb6.append(", reason:");
        sb6.append(reason);
        sb6.append(") result:");
        boolean z19 = !z18;
        sb6.append(z19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandCapsuleBarManager", sb6.toString());
        return z19;
    }
}
