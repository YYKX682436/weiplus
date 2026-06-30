package js3;

/* loaded from: classes4.dex */
public class k implements com.p314xaae8f345.mm.p794xb0fa9b5e.j, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f383061d;

    /* renamed from: e, reason: collision with root package name */
    public long f383062e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f383063f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f383064g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f383065h = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f383061d = rVar;
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_XMAIL_SYNC_CONTACT_KEY_LONG_SYNC, 0L);
        this.f383062e = t17;
        gm0.j1.d().g(new ms3.f(t17));
        gm0.j1.d().a(14418, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncMailAddrTask", "search mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ms3.f fVar = (ms3.f) m1Var;
        if (fVar.f412524f != this.f383062e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncMailAddrTask", "not my scene, ignore");
            return;
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = this.f383065h;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = this.f383064g;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList3 = this.f383063f;
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<ks3.x0> linkedList = ((ks3.o1) fVar.f412522d.f152244b.f152233a).f393261d;
            if (!linkedList.isEmpty()) {
                for (ks3.x0 x0Var : linkedList) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(ya.b.f77485x2838ac37, x0Var.f393303d);
                    bundle.putString("item_addr", x0Var.f393304e);
                    arrayList3.add(bundle);
                }
            }
            java.util.LinkedList<ks3.x0> linkedList2 = ((ks3.o1) fVar.f412522d.f152244b.f152233a).f393262e;
            if (!linkedList2.isEmpty()) {
                for (ks3.x0 x0Var2 : linkedList2) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString(ya.b.f77485x2838ac37, x0Var2.f393303d);
                    bundle2.putString("item_addr", x0Var2.f393304e);
                    arrayList2.add(bundle2);
                }
            }
            java.util.LinkedList<ks3.x0> linkedList3 = ((ks3.o1) fVar.f412522d.f152244b.f152233a).f393263f;
            if (!linkedList3.isEmpty()) {
                for (ks3.x0 x0Var3 : linkedList3) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString(ya.b.f77485x2838ac37, x0Var3.f393303d);
                    bundle3.putString("item_addr", x0Var3.f393304e);
                    arrayList.add(bundle3);
                }
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f412522d.f152244b.f152233a;
            if (((ks3.o1) fVar2).f393265h) {
                long j17 = ((ks3.o1) fVar2).f393264g;
                this.f383062e = j17;
                gm0.j1.d().g(new ms3.f(j17));
                return;
            }
        }
        android.os.Bundle bundle4 = new android.os.Bundle();
        bundle4.putInt("err_type", i17);
        bundle4.putInt("err_code", i18);
        bundle4.putString("err_msg", str);
        bundle4.putParcelableArrayList("sync_add_list", arrayList3);
        bundle4.putParcelableArrayList("sync_update_list", arrayList2);
        bundle4.putParcelableArrayList("sync_delete_list", arrayList);
        bundle4.putLong("last_sync_key", this.f383062e);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f383061d;
        if (rVar != null) {
            rVar.a(bundle4);
        }
    }
}
