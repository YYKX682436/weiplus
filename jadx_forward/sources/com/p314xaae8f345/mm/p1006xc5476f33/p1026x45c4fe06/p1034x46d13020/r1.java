package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public final class r1 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.s0 f158082d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j1(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List Ca(int i17, int i18) {
        return wi(i17, i18, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    /* renamed from: getCount */
    public int mo49730x7444f759() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k1.class);
        if (c10754x630c9a2 == null) {
            return 0;
        }
        return c10754x630c9a2.f149937d;
    }

    @Override // l75.l0
    /* renamed from: remove */
    public void mo49775xc84af884(l75.q0 q0Var) {
        this.f158082d.mo49775xc84af884(q0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List t0(int i17) {
        return Ca(i17, Integer.MAX_VALUE);
    }

    public final java.util.List wi(int i17, int i18, long j17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("count", i17);
        bundle.putInt("versionType", i18);
        bundle.putLong("maxUpdateTime", j17);
        android.os.Parcel parcel = (android.os.Parcel) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l1.class);
        if (parcel == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        parcel.readTypedList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4.f33506x681a0c0c);
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public boolean x0(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11713x87e645df(str, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q1.class);
        if (c10750x9556b48c == null) {
            return false;
        }
        return c10750x9556b48c.f149933d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List ze(long j17, int i17) {
        return wi(i17, Integer.MAX_VALUE, j17);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        this.f158082d.add(q0Var, looper);
    }
}
