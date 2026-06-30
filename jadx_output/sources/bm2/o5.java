package bm2;

/* loaded from: classes11.dex */
public final class o5 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f22189n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f22190o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f22191p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f22192q;

    /* renamed from: r, reason: collision with root package name */
    public android.database.Cursor f22193r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f22194s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, java.util.List forbidChosenContactList, java.util.List outChosenContactList, boolean z19, java.util.List allowSelectContactList) {
        super(mMBaseSelectContactUI, list, z17, true);
        kotlin.jvm.internal.o.g(forbidChosenContactList, "forbidChosenContactList");
        kotlin.jvm.internal.o.g(outChosenContactList, "outChosenContactList");
        kotlin.jvm.internal.o.g(allowSelectContactList, "allowSelectContactList");
        this.f22189n = forbidChosenContactList;
        this.f22190o = outChosenContactList;
        this.f22191p = z19;
        this.f22192q = allowSelectContactList;
        this.f22194s = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveMultiChatRoomAdapter", "create!");
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f22194s).size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f22194s).get(i17);
        com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
        if (L == null) {
            L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
        }
        bm2.r5 r5Var = new bm2.r5(i17);
        r5Var.f(L);
        r5Var.f206836e = this.f207078f;
        if (kz5.n0.O(this.f22189n, str) || kz5.n0.O(this.f22190o, str)) {
            r5Var.F = true;
        }
        return r5Var;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveMultiChatRoomAdapter", "resetData");
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f206588m;
        l75.e0 e0Var = pp.a.f357364e2;
        this.f22193r = Di.C(1, list, null, this.f206587i, "");
        h();
        android.database.Cursor cursor = this.f22193r;
        if (cursor != null) {
            while (cursor.moveToNext()) {
                java.lang.String string = cursor.getString(cursor.getColumnIndex(dm.i4.COL_USERNAME));
                java.util.List list2 = this.f22194s;
                if (!list2.contains(string)) {
                    kotlin.jvm.internal.o.d(string);
                    boolean z17 = false;
                    if (!this.f22191p || this.f22192q.contains(string)) {
                        java.lang.String[] HELPER = c01.e2.f37132p;
                        kotlin.jvm.internal.o.f(HELPER, "HELPER");
                        int length = HELPER.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 < length) {
                                if (kotlin.jvm.internal.o.b(string, HELPER[i17])) {
                                    break;
                                } else {
                                    i17++;
                                }
                            } else if (!com.tencent.mm.storage.z3.q4(string) && !com.tencent.mm.storage.z3.p4(string) && !com.tencent.mm.storage.z3.m4(string)) {
                                z17 = !c01.e2.G(string);
                            }
                        }
                    }
                    if (z17) {
                        list2.add(string);
                    }
                }
            }
        }
    }
}
