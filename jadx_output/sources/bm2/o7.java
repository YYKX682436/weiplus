package bm2;

/* loaded from: classes11.dex */
public final class o7 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f22205n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f22206o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(com.tencent.mm.ui.contact.MMBaseSelectContactUI selectContactUI, java.util.List list, boolean z17, boolean z18) {
        super(selectContactUI, list, z17, z18);
        kotlin.jvm.internal.o.g(selectContactUI, "selectContactUI");
        this.f22205n = new java.util.ArrayList();
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22205n.size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        java.lang.Object obj = this.f22205n.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
        if (L == null) {
            L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
        }
        bm2.r5 r5Var = new bm2.r5(i17);
        r5Var.f(L);
        r5Var.f206836e = this.f207078f;
        return r5Var;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRoomAdapter", "resetData");
        android.database.Cursor cursor = this.f22206o;
        if (cursor != null) {
            if (cursor != null) {
                cursor.close();
            }
            this.f22206o = null;
        }
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f206588m;
        l75.e0 e0Var = pp.a.f357364e2;
        android.database.Cursor C = Di.C(5, list, null, this.f206587i, "");
        this.f22206o = C;
        if (C != null) {
            while (C.moveToNext()) {
                java.lang.String string = C.getString(C.getColumnIndex(dm.i4.COL_USERNAME));
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.util.ArrayList arrayList = this.f22205n;
                if (!arrayList.contains(string)) {
                    arrayList.add(string);
                }
            }
            C.close();
        }
    }
}
