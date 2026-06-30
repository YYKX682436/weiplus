package df5;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.l f313661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f313663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f313664g;

    public i(df5.l lVar, int i17, java.util.List list, java.util.List list2) {
        this.f313661d = lVar;
        this.f313662e = i17;
        this.f313663f = list;
        this.f313664g = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m124337x4265fb69;
        df5.l lVar = this.f313661d;
        m124337x4265fb69 = lVar.m124337x4265fb69();
        if (m124337x4265fb69 <= 0 || m124337x4265fb69 == this.f313662e) {
            return;
        }
        java.util.List b17 = lVar.b(this.f313663f, m124337x4265fb69);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, this.f313664g)) {
            return;
        }
        lVar.removeAllViews();
        ((java.util.LinkedHashMap) lVar.f313692o).clear();
        ((java.util.ArrayList) lVar.f313693p).clear();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            lVar.addView(lVar.c((java.util.List) it.next()));
        }
    }
}
