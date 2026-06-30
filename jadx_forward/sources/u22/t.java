package u22;

/* loaded from: classes10.dex */
public final class t implements u22.c {

    /* renamed from: a, reason: collision with root package name */
    public final u22.s f505561a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f505562b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f505563c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f505564d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f505565e;

    /* renamed from: f, reason: collision with root package name */
    public int f505566f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f505567g;

    public t(u22.s callback, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f505561a = callback;
        this.f505562b = adapter;
        this.f505563c = "MicroMsg.StickerRecommendData";
        this.f505564d = new java.util.LinkedList();
        this.f505566f = 1;
        this.f505567g = true;
    }

    @Override // u22.c
    public void a(int i17, int i18) {
        this.f505562b.m8151xc67946d3(i17, i18);
    }

    @Override // u22.c
    public void b(java.util.List lensList) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensList, "lensList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateData: ");
        sb6.append(lensList.size());
        sb6.append(", ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505563c, sb6.toString());
        java.util.LinkedList lensList2 = this.f505564d;
        lensList2.clear();
        lensList2.addAll(lensList);
        u22.s sVar = this.f505561a;
        a32.a0 a0Var = (a32.a0) sVar;
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensList2, "lensList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = a0Var.f82536a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13394xa8c361b5.f180199d, "update: " + lensList2.size());
        boolean isEmpty = lensList2.isEmpty() ^ true;
        int i18 = -1;
        int i19 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13396xea536474 c13396xea536474 = c13394xa8c361b5.f180200e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c13394xa8c361b5.f180201f;
        if (isEmpty) {
            c1163xf1deaba4.setVisibility(0);
            c13396xea536474.setVisibility(0);
        } else {
            c1163xf1deaba4.setVisibility(8);
            c13396xea536474.setVisibility(8);
            c13394xa8c361b5.f180203h = -1;
            yz5.p selectionCallback = c13394xa8c361b5.getSelectionCallback();
            if (selectionCallback != null) {
                selectionCallback.mo149xb9724478(null, null);
            }
        }
        z22.l lVar = c13394xa8c361b5.f180202g;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerAdapter", "update: " + lensList2.size());
        java.util.ArrayList arrayList = lVar.f551259d;
        arrayList.clear();
        arrayList.addAll(lensList2);
        if (this.f505567g && (!lensList.isEmpty())) {
            if (this.f505565e == null) {
                i17 = this.f505566f;
                this.f505567g = false;
            } else {
                java.util.Iterator it = lensList.iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((t85.d) it.next()).f497989a.f464325d, this.f505565e)) {
                        i18 = i27;
                        break;
                    }
                    i27++;
                }
                if (i18 > 0) {
                    this.f505567g = false;
                    i19 = i18;
                }
                i17 = i19;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b52 = ((a32.a0) sVar).f82536a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13394xa8c361b52.f180199d, "updateSelection, " + i17);
            c13394xa8c361b52.f180201f.post(new a32.z(c13394xa8c361b52, i17));
        }
    }

    @Override // u22.c
    public void c(int i17, int i18) {
        this.f505562b.m8153xd399a4d9(i17, i18);
    }

    @Override // u22.c
    public void d(int i17, int i18) {
        this.f505562b.m8154xdb81fc7f(i17, i18);
    }

    @Override // u22.c
    /* renamed from: onMove */
    public void mo484xc39cb650(int i17, int i18) {
        this.f505562b.m8150x87567217(i17, i18);
    }
}
