package e45;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f330904d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f330905e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f330906f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f330907g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f330908h;

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        int indexOf;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.pin.C19702x122ad0c9 c19702x122ad0c9;
        java.util.LinkedList linkedList = this.f330907g;
        if (linkedList != null && linkedList != null) {
            linkedList.size();
        }
        java.util.LinkedList linkedList2 = this.f330907g;
        if (linkedList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FS.AlbumFileUIC", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            java.util.HashSet i17 = t23.p0.i();
            if (i17 == null || i17.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FS.AlbumFileUIC", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FS.AlbumFileUIC", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i17.iterator();
                while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf((abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next())))) {
                    java.lang.Object obj = linkedList2.get(indexOf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC15633xee433078.f219971p, "edit") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC15633xee4330782.f219971p, "edit")) {
                        linkedList2.set(indexOf, abstractC15633xee433078);
                    }
                }
                java.lang.System.currentTimeMillis();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f330904d;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FS.AlbumFileUIC", "null == adapterRef");
            return;
        }
        d45.q qVar = weakReference != null ? (d45.q) weakReference.get() : null;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FS.AlbumFileUIC", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f330906f;
        if (weakReference2 == null || weakReference2 == null || (c19702x122ad0c9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.pin.C19702x122ad0c9) weakReference2.get()) == null || this.f330905e == null) {
            return;
        }
        java.util.LinkedList linkedList3 = this.f330907g;
        if (linkedList3 != null) {
            t23.z1 z1Var = t23.z1.f496846d;
            t23.z1 z1Var2 = t23.z1.f496846d;
            z1Var2.d(linkedList3);
            if (this.f330908h) {
                this.f330908h = false;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c19702x122ad0c9, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                c19702x122ad0c9.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c19702x122ad0c9, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                qVar.f307990g.clear();
                qVar.f307990g.addAll(qVar.y(linkedList3));
                qVar.m8146xced61ae5();
                z1Var2.b(t23.p1.f496780d, 0, linkedList3.size() <= 32 ? linkedList3.size() : 32, qVar.B());
            } else {
                java.util.ArrayList x17 = qVar.x(qVar.f307990g);
                qVar.f307990g = x17;
                int size = x17.size();
                int size2 = linkedList3.size();
                if (size < size2) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330783 : linkedList3.subList(size, size2)) {
                        if (abstractC15633xee4330783 != null) {
                            arrayList2.add(abstractC15633xee4330783);
                        }
                    }
                    qVar.f307990g.addAll(arrayList2);
                    qVar.f307990g = qVar.y(qVar.f307990g);
                    qVar.m8146xced61ae5();
                }
            }
        }
        java.lang.ref.WeakReference weakReference3 = this.f330905e;
        android.app.ProgressDialog progressDialog = weakReference3 != null ? (android.app.ProgressDialog) weakReference3.get() : null;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        progressDialog.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FS.AlbumFileUIC", "[NotifyMediaItemsChanged] cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - e45.h.C));
    }

    /* renamed from: toString */
    public java.lang.String m126947x9616526c() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
