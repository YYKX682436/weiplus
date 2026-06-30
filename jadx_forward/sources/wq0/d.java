package wq0;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d f530031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.e0 f530032e;

    public d(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d, hq0.e0 e0Var) {
        this.f530031d = c10867x3e50a04d;
        this.f530032e = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = this.f530031d;
        fq0.x frameSet = c10867x3e50a04d.getFrameSet();
        sb6.append(frameSet != null ? frameSet.m130018x8cdac1b() : 0);
        sb6.append(" notify bind:");
        sb6.append(this.f530032e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclViewContainer", sb6.toString());
        fq0.x frameSet2 = c10867x3e50a04d.getFrameSet();
        if (frameSet2 != null) {
            frameSet2.b();
        }
    }
}
