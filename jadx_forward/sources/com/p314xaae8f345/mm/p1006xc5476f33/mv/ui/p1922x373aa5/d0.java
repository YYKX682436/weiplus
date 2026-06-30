package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f233330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f233331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f233332f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f233333g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f233334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a f233335i;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a) {
        this.f233335i = c16687xe732929a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        int indexOf;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        java.lang.String str;
        java.util.LinkedList linkedList = this.f233333g;
        if (linkedList != null) {
            linkedList.size();
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1;
        java.util.LinkedList linkedList2 = this.f233333g;
        if (linkedList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            java.util.HashSet i18 = t23.p0.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "getEditedMediaItemSet(...)");
            if (i18.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i18.iterator();
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
        java.lang.ref.WeakReference weakReference = this.f233330d;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "null == adapterRef");
            return;
        }
        km3.t tVar = (km3.t) weakReference.get();
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f233332f;
        if (weakReference2 == null || (c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference2.get()) == null || this.f233331e == null) {
            return;
        }
        java.util.LinkedList linkedList3 = this.f233333g;
        if (linkedList3 != null) {
            ((t23.a2) ((t23.q1) i95.n0.c(t23.q1.class))).getClass();
            t23.z1 z1Var = t23.z1.f496846d;
            z1Var.d(linkedList3);
            boolean z17 = this.f233334h;
            java.util.ArrayList arrayList = tVar.f390794e;
            if (z17) {
                this.f233334h = false;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                str = "MicroMsg.Mv.MusicMVCardChooseView";
                yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                arrayList.clear();
                arrayList.addAll(linkedList3);
                tVar.m8146xced61ae5();
                t23.q1 q1Var = (t23.q1) i95.n0.c(t23.q1.class);
                t23.p1 p1Var = t23.p1.f496780d;
                int size = linkedList3.size() <= 32 ? linkedList3.size() : 32;
                int y17 = tVar.y();
                ((t23.a2) q1Var).getClass();
                z1Var.b(p1Var, 0, size, y17);
            } else {
                str = "MicroMsg.Mv.MusicMVCardChooseView";
                int mo1894x7e414b06 = tVar.mo1894x7e414b06();
                java.util.LinkedList linkedList4 = tVar.f390798i;
                int size2 = mo1894x7e414b06 - linkedList4.size();
                int size3 = linkedList3.size();
                if (size2 < size3) {
                    arrayList.addAll(linkedList3.subList(size2, size3));
                    tVar.m8153xd399a4d9(linkedList4.size() + size2, tVar.mo1894x7e414b06());
                }
            }
        } else {
            str = "MicroMsg.Mv.MusicMVCardChooseView";
        }
        java.lang.ref.WeakReference weakReference3 = this.f233331e;
        android.app.ProgressDialog progressDialog = weakReference3 != null ? (android.app.ProgressDialog) weakReference3.get() : null;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[NotifyMediaItemsChanged] cost:%s", java.lang.Long.valueOf(currentTimeMillis - 0));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.c1) this.f233335i.A1).mo152xb9724478();
    }

    /* renamed from: toString */
    public java.lang.String m67390x9616526c() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
