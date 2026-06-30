package ud2;

/* loaded from: classes10.dex */
public final class p extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public int f508179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f508180e;

    public p(ud2.c0 c0Var) {
        this.f508180e = c0Var;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        ud2.c0 c0Var = this.f508180e;
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(c0Var.f508123a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(this.f508179d);
        sb6.append(", netQuality:");
        sb6.append(m40067xab9ed241);
        sb6.append(", isPlaying:");
        mn0.b0 b0Var = c0Var.f508131i;
        boolean z17 = false;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            z17 = true;
        }
        sb6.append(z17);
        java.lang.System.out.print((java.lang.Object) sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (((mn0.y) r0).b(false) == true) goto L12;
     */
    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15376x8cd414a7(int r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.p.mo15376x8cd414a7(int, android.os.Bundle):void");
    }
}
