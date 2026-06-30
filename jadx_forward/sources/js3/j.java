package js3;

/* loaded from: classes4.dex */
public class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.j, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383059d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f383060e;

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SearchMailAddrTask", "search mail  %s", c10756x2a5d7b2d.f149939d);
        this.f383060e = rVar;
        java.lang.String str = c10756x2a5d7b2d.f149939d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.f383059d = str;
        gm0.j1.d().g(new ms3.d(str));
        gm0.j1.d().a(11016, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList<ks3.x0> linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SearchMailAddrTask", "search mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ms3.d dVar = (ms3.d) m1Var;
        dVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = dVar.f412518f;
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.equals(this.f383059d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SearchMailAddrTask", "not my scene, ignore");
            return;
        }
        gm0.j1.d().q(11016, this);
        if (this.f383060e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_type", i17);
            bundle.putInt("err_code", i18);
            bundle.putString("err_msg", str);
            bundle.putString("search_text", this.f383059d);
            if (i17 == 0 && i18 == 0 && (linkedList = ((ks3.j1) dVar.f412516d.f152244b.f152233a).f393235d) != null && !linkedList.isEmpty()) {
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                for (ks3.x0 x0Var : linkedList) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString(ya.b.f77485x2838ac37, x0Var.f393303d);
                    bundle2.putString("item_addr", x0Var.f393304e);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("search_addr_list", arrayList);
            }
            this.f383060e.a(bundle);
        }
    }
}
