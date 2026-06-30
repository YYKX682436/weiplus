package fz4;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f348826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz4.g f348827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f348828f;

    public a(java.util.ArrayList arrayList, fz4.g gVar, yz5.l lVar) {
        this.f348826d = arrayList;
        this.f348827e = gVar;
        this.f348828f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f348828f;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f348826d.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                fz4.g gVar = this.f348827e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j a17 = fz4.g.a(gVar, str);
                if (a17 != null) {
                    arrayList.add(a17);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addImagesAsync complete, results: " + arrayList.size());
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            lVar.mo146xb9724478(arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeNoteAsyncMediaProcessor", e17, "addImagesAsync error", new java.lang.Object[0]);
            lVar.mo146xb9724478(null);
        }
    }
}
