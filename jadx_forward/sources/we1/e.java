package we1;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f526742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e f526743e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e, java.util.List list) {
        this.f526743e = c12264x3a069b1e;
        this.f526742d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f526743e.f165118q) {
            ((java.util.LinkedList) this.f526743e.f165118q).addAll(this.f526742d);
        }
        synchronized (this.f526743e.f165119r) {
            ((java.util.LinkedList) this.f526743e.f165119r).addAll(this.f526742d);
        }
        this.f526743e.postInvalidate();
    }
}
