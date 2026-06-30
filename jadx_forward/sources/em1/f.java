package em1;

/* loaded from: classes7.dex */
public class f extends android.util.SparseArray {
    public f(em1.d dVar, int i17) {
        super(i17);
    }

    @Override // android.util.SparseArray
    public synchronized void clear() {
        super.clear();
    }

    @Override // android.util.SparseArray
    public java.lang.Object get(int i17, java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2) obj;
        synchronized (this) {
            n2Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2) super.get(i17, n2Var2);
        }
        return n2Var;
    }

    @Override // android.util.SparseArray
    public void put(int i17, java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2) obj;
        synchronized (this) {
            super.put(i17, n2Var);
        }
    }

    @Override // android.util.SparseArray
    public synchronized void remove(int i17) {
        super.remove(i17);
    }
}
