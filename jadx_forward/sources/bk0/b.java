package bk0;

/* loaded from: classes13.dex */
public class b extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk0.a f102797a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bk0.a aVar, android.os.Looper looper) {
        super(looper);
        this.f102797a = aVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        final int i17;
        if (message.what == 0) {
            java.lang.Object obj = message.obj;
            if (obj instanceof bk0.c) {
                bk0.c cVar = (bk0.c) obj;
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = cVar.f102799b;
                java.util.ArrayList arrayList = null;
                bk0.a aVar = this.f102797a;
                final java.lang.String str = cVar.f102801d;
                final int i18 = cVar.f102800c;
                if (u3Var == null) {
                    java.util.ArrayList arrayList2 = aVar.f102794b;
                    java.util.Iterator it = arrayList2.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        i17 = cVar.f102798a;
                        if (!hasNext) {
                            break;
                        }
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                        if (weakReference == null || weakReference.get() == null) {
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                            }
                            arrayList.add(weakReference);
                        } else {
                            ((d70.j) weakReference.get()).b(i17, i18, str);
                        }
                    }
                    fs.g.b(d70.k.class, new fs.o(i17, i18, str) { // from class: bk0.a$$a
                        @Override // fs.o
                        public final boolean a(fs.n nVar) {
                            ((zh4.q) ((d70.k) nVar)).getClass();
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_MARK_READ_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.PluginTextStatus", "bradge mark read");
                            return false;
                        }
                    });
                    if (arrayList != null) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            arrayList2.remove((java.lang.ref.WeakReference) it6.next());
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                }
                java.util.ArrayList arrayList3 = aVar.f102794b;
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) it7.next();
                    if (weakReference2 == null || weakReference2.get() == null) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(weakReference2);
                    } else {
                        ((d70.j) weakReference2.get()).a(u3Var, i18, str);
                    }
                }
                java.util.Iterator it8 = ((fs.e) ((fs.c) fs.g.f(d70.k.class)).all()).iterator();
                while (true) {
                    fs.f fVar = (fs.f) it8;
                    if (!fVar.hasNext()) {
                        break;
                    }
                    fs.q qVar = (fs.q) fVar.next();
                    if (fs.g.d(fs.g.f347619c, qVar)) {
                        ((d70.k) ((fs.n) qVar.get())).getClass();
                    }
                }
                if (arrayList != null) {
                    java.util.Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        arrayList3.remove((java.lang.ref.WeakReference) it9.next());
                    }
                    arrayList.clear();
                }
            }
        }
    }
}
