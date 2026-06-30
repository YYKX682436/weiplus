package em1;

/* loaded from: classes7.dex */
public class e extends android.util.SparseArray {
    public e(em1.d dVar, int i17) {
        super(i17);
    }

    @Override // android.util.SparseArray
    public synchronized void clear() {
        super.clear();
    }

    @Override // android.util.SparseArray
    public java.lang.Object get(int i17, java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e eVar;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e eVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e) obj;
        synchronized (this) {
            eVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e) super.get(i17, eVar2);
        }
        return eVar;
    }

    @Override // android.util.SparseArray
    public void put(int i17, java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e eVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e) obj;
        synchronized (this) {
            super.put(i17, eVar);
        }
    }

    @Override // android.util.SparseArray
    public synchronized void remove(int i17) {
        super.remove(i17);
    }
}
