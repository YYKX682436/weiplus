package we1;

/* loaded from: classes13.dex */
public class f implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f526744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e f526745e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e, int i17) {
        this.f526745e = c12264x3a069b1e;
        this.f526744d = i17;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "DanmuView-seekToPlayTime";
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f526745e.f165118q) {
            for (int size = ((java.util.LinkedList) this.f526745e.f165119r).size() - 1; size >= 0; size--) {
                we1.h hVar = (we1.h) ((java.util.LinkedList) this.f526745e.f165119r).get(size);
                if (((we1.a) hVar).f526735h < this.f526744d) {
                    break;
                }
                ((java.util.LinkedList) this.f526745e.f165118q).addFirst(hVar);
            }
        }
        this.f526745e.g();
    }
}
