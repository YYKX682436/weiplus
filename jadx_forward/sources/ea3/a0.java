package ea3;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f332129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f332130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f332131f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f332132g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f332133h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f332134i = false;

    public a0(ea3.r rVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        int indexOf;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        java.lang.String str;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.LinkedList linkedList = this.f332132g;
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "[NotifyMediaItemsChanged], size %d", objArr);
        java.util.LinkedList linkedList2 = this.f332132g;
        if (linkedList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppAlbumViewImpl", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            java.util.HashSet i17 = t23.p0.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getEditedMediaItemSet(...)");
            if (i17.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i17.iterator();
                while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf((abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next())))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) linkedList2.get(indexOf);
                    if (abstractC15633xee4330782 != null && "edit".equals(abstractC15633xee433078.f219971p) && !"edit".equals(abstractC15633xee4330782.f219971p)) {
                        linkedList2.set(indexOf, abstractC15633xee433078);
                    }
                }
                java.lang.System.currentTimeMillis();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f332129d;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppAlbumViewImpl", "null == adapterRef");
            return;
        }
        ea3.n nVar = (ea3.n) weakReference.get();
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppAlbumViewImpl", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f332130e;
        if (weakReference2 == null || (c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference2.get()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "isSwitchAlbum: %s needClearSelected：%b.", java.lang.Boolean.valueOf(this.f332133h), java.lang.Boolean.valueOf(this.f332134i));
        if (this.f332133h) {
            this.f332133h = false;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            str = "MicroMsg.LiteAppAlbumViewImpl";
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            if (this.f332134i) {
                java.util.LinkedList linkedList3 = this.f332132g;
                nVar.f332162f.clear();
                nVar.f332163g.clear();
                nVar.f332162f.addAll(linkedList3);
                nVar.m8146xced61ae5();
                java.util.ArrayList arrayList2 = nVar.f332163g;
                java.lang.ref.WeakReference weakReference3 = this.f332131f;
                if (weakReference3 != null && weakReference3.get() != null) {
                    ((ea3.p) this.f332131f.get()).n(arrayList2);
                }
            } else {
                java.util.LinkedList linkedList4 = this.f332132g;
                java.util.ArrayList arrayList3 = nVar.f332162f;
                arrayList3.clear();
                arrayList3.addAll(linkedList4);
                nVar.m8146xced61ae5();
                ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
                t23.p0.m().addAll(nVar.f332163g);
            }
        } else {
            str = "MicroMsg.LiteAppAlbumViewImpl";
            java.util.LinkedList linkedList5 = this.f332132g;
            int mo1894x7e414b06 = (nVar.mo1894x7e414b06() - nVar.y()) - nVar.f332168o.size();
            int size = linkedList5.size();
            if (mo1894x7e414b06 < size) {
                nVar.f332162f.addAll(linkedList5.subList(mo1894x7e414b06, size));
                nVar.m8153xd399a4d9(nVar.y() + mo1894x7e414b06, nVar.mo1894x7e414b06());
            }
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[NotifyMediaItemsChanged] adapter set data, cost %s ms", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - uptimeMillis));
        if (((ea3.p) this.f332131f.get()).f332189o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "needOnAlbumChangeNotify!");
            ((ea3.p) this.f332131f.get()).f332189o = false;
            ea3.p pVar = (ea3.p) this.f332131f.get();
            pVar.getClass();
            ((ku5.t0) ku5.t0.f394148d).h(new ea3.r(pVar), "liteappphotoalbum_onalbumchanged");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[NotifyMediaItemsChanged] finish");
    }

    /* renamed from: toString */
    public java.lang.String m127213x9616526c() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
