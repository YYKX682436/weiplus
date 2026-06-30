package we1;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we1.h f526740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e f526741e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e, we1.h hVar) {
        this.f526741e = c12264x3a069b1e;
        this.f526740d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f526741e.f165119r) {
            int i17 = 0;
            while (true) {
                if (i17 >= ((java.util.LinkedList) this.f526741e.f165119r).size()) {
                    break;
                }
                if (((we1.a) this.f526740d).f526735h <= ((we1.a) ((we1.h) ((java.util.LinkedList) this.f526741e.f165119r).get(i17))).f526735h) {
                    ((java.util.LinkedList) this.f526741e.f165119r).add(i17, this.f526740d);
                    break;
                }
                i17++;
            }
        }
    }
}
