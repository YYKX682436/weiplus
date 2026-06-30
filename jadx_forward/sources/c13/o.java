package c13;

/* loaded from: classes11.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f119423d;

    public o(boolean z17) {
        this.f119423d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback onScreenStateChanged(");
            boolean z17 = this.f119423d;
            sb6.append(z17);
            sb6.append(')');
            c24132x9b57f23e.m89495x7adca3ae(z17, new c13.c(sb6.toString()));
        }
    }
}
