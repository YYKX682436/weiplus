package e33;

/* loaded from: classes10.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f328987d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f328988e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f328989f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f328990g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f328991h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f328992i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f328993m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f328994n = false;

    public s1(e33.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        int indexOf;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14;
        android.os.SystemClock.uptimeMillis();
        java.util.LinkedList linkedList = this.f328991h;
        if (linkedList != null) {
            linkedList.size();
        }
        java.util.LinkedList linkedList2 = this.f328991h;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.f220042t2;
        if (linkedList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumPreviewUI", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            java.util.HashSet i18 = t23.p0.i();
            if (i18 == null || i18.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i18.iterator();
                while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf((abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next())))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) linkedList2.get(indexOf);
                    if (abstractC15633xee4330782 != null && abstractC15633xee433078.f219971p.equals("edit") && !abstractC15633xee4330782.f219971p.equals("edit")) {
                        linkedList2.set(indexOf, abstractC15633xee433078);
                    }
                }
                java.lang.System.currentTimeMillis();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f328987d;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlbumPreviewUI", "null == adapterRef");
            return;
        }
        e33.b0 b0Var = (e33.b0) weakReference.get();
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlbumPreviewUI", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f328990g;
        if (weakReference2 == null || (c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference2.get()) == null) {
            return;
        }
        t23.z1 z1Var = t23.z1.f496846d;
        z1Var.d(this.f328991h);
        boolean z17 = this.f328994n;
        java.util.ArrayList arrayList = b0Var.f328663f;
        if (z17) {
            this.f328994n = false;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            java.util.LinkedList linkedList3 = this.f328991h;
            arrayList.clear();
            arrayList.addAll(linkedList3);
            b0Var.m8146xced61ae5();
            z1Var.b(t23.p1.f496780d, 0, this.f328991h.size() <= 32 ? this.f328991h.size() : 32, b0Var.I());
        } else {
            java.util.LinkedList linkedList4 = this.f328991h;
            int mo1894x7e414b06 = (b0Var.mo1894x7e414b06() - b0Var.z()) - b0Var.f328673s.size();
            int size = linkedList4.size();
            if (mo1894x7e414b06 < size) {
                arrayList.addAll(linkedList4.subList(mo1894x7e414b06, size));
                b0Var.m8153xd399a4d9(b0Var.z() + mo1894x7e414b06, b0Var.mo1894x7e414b06());
            }
        }
        android.os.SystemClock.uptimeMillis();
        java.lang.ref.WeakReference weakReference3 = this.f328988e;
        if (weakReference3 == null) {
            return;
        }
        android.app.ProgressDialog progressDialog = (android.app.ProgressDialog) weakReference3.get();
        android.content.Context context = c1163xf1deaba4.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        i33.b1 b1Var = (i33.b1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(i33.b1.class);
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "[NotifyMediaItemsChanged] cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.f220041s2));
            if (b1Var != null && b1Var.f369698m > 0) {
                b1Var.f369695g.A += java.lang.System.currentTimeMillis() - b1Var.f369698m;
                b1Var.f369698m = 0L;
            }
        }
        java.lang.ref.WeakReference weakReference4 = this.f328993m;
        if (weakReference4 != null && (c15655x4db85b14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14) weakReference4.get()) != null) {
            c15655x4db85b14.m63714xa2cb4a63(this.f328991h.size());
        }
        if (this.f328989f == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f328992i) || (textView = (android.widget.TextView) this.f328989f.get()) == null) {
            return;
        }
        java.lang.String B = b0Var.B(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) c1163xf1deaba4.getLayoutManager()).w());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(B) || !B.equals("album_business_bubble_media_by_coordinate")) {
            return;
        }
        textView.setVisibility(0);
        textView.setText(this.f328992i.concat("附近的照片和视频"));
        textView.postDelayed(new e33.r1(this, textView), 2000L);
    }

    /* renamed from: toString */
    public java.lang.String m126863x9616526c() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
