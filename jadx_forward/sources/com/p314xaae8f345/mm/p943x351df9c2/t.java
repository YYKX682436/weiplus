package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class t implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.z f152074d;

    public t(com.p314xaae8f345.mm.p943x351df9c2.z zVar) {
        this.f152074d = zVar;
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        ((java.util.ArrayList) this.f152074d.f152113b).size();
        ((java.util.ArrayList) this.f152074d.f152113b).size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f152074d.f152113b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f152074d.f152113b).iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference != null) {
                    kv.e0 e0Var = (kv.e0) weakReference.get();
                    if (e0Var != null) {
                        arrayList.add(e0Var);
                    } else {
                        it.remove();
                    }
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((kv.e0) it6.next()).U(str);
        }
    }
}
