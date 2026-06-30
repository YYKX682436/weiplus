package i72;

/* loaded from: classes4.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e f370971d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e c13529xca5dc69e) {
        this.f370971d = c13529xca5dc69e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e c13529xca5dc69e = this.f370971d;
        int i17 = c13529xca5dc69e.f181673i;
        if (i17 > 30) {
            c13529xca5dc69e.f181668d.e();
        } else {
            c13529xca5dc69e.f181673i = i17 + 1;
            c13529xca5dc69e.invalidate();
        }
    }
}
