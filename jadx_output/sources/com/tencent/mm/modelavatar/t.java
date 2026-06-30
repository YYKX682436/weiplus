package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class t implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.z f70541d;

    public t(com.tencent.mm.modelavatar.z zVar) {
        this.f70541d = zVar;
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        ((java.util.ArrayList) this.f70541d.f70580b).size();
        ((java.util.ArrayList) this.f70541d.f70580b).size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f70541d.f70580b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f70541d.f70580b).iterator();
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
