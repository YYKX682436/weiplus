package wt1;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f530799a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f530800b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f530801c;

    public f0() {
        wt1.f0 f0Var;
        this.f530801c = 0;
        android.database.Cursor mo78085xb5882a6b = xt1.t0.Vi().mo78085xb5882a6b();
        if (mo78085xb5882a6b == null || mo78085xb5882a6b.getCount() <= 0) {
            f0Var = this;
        } else {
            mo78085xb5882a6b.moveToFirst();
            int columnIndex = mo78085xb5882a6b.getColumnIndex("card_type");
            int columnIndex2 = mo78085xb5882a6b.getColumnIndex(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            int columnIndex3 = mo78085xb5882a6b.getColumnIndex("description");
            int columnIndex4 = mo78085xb5882a6b.getColumnIndex("logo_url");
            int columnIndex5 = mo78085xb5882a6b.getColumnIndex("time");
            int columnIndex6 = mo78085xb5882a6b.getColumnIndex("card_id");
            int columnIndex7 = mo78085xb5882a6b.getColumnIndex("card_tp_id");
            int columnIndex8 = mo78085xb5882a6b.getColumnIndex("msg_id");
            int columnIndex9 = mo78085xb5882a6b.getColumnIndex("msg_type");
            int columnIndex10 = mo78085xb5882a6b.getColumnIndex("jump_type");
            int columnIndex11 = mo78085xb5882a6b.getColumnIndex("url");
            int columnIndex12 = mo78085xb5882a6b.getColumnIndex("buttonData");
            int columnIndex13 = mo78085xb5882a6b.getColumnIndex("operData");
            int columnIndex14 = mo78085xb5882a6b.getColumnIndex("report_scene");
            int columnIndex15 = mo78085xb5882a6b.getColumnIndex("read_state");
            while (!mo78085xb5882a6b.isAfterLast()) {
                int i17 = columnIndex15;
                xt1.k kVar = new xt1.k();
                int i18 = columnIndex14;
                kVar.f68123x8c036204 = mo78085xb5882a6b.getInt(columnIndex);
                kVar.f68137x29dd02d3 = mo78085xb5882a6b.getString(columnIndex2);
                kVar.f68125x4f4dc37 = mo78085xb5882a6b.getString(columnIndex3);
                kVar.f68129x96a1f680 = mo78085xb5882a6b.getString(columnIndex4);
                kVar.f68136x2261f6f2 = mo78085xb5882a6b.getInt(columnIndex5);
                kVar.f68121x95970a65 = mo78085xb5882a6b.getString(columnIndex6);
                kVar.f68122xf4648834 = mo78085xb5882a6b.getString(columnIndex7);
                kVar.f68130x6583d7e = mo78085xb5882a6b.getString(columnIndex8);
                kVar.f68131xd14432dd = mo78085xb5882a6b.getInt(columnIndex9);
                kVar.f68127xc374eba6 = mo78085xb5882a6b.getInt(columnIndex10);
                kVar.f68139x4b6e88aa = mo78085xb5882a6b.getString(columnIndex11);
                kVar.f68120xce7ed661 = mo78085xb5882a6b.getBlob(columnIndex12);
                kVar.f68133xffdfbcbd = mo78085xb5882a6b.getBlob(columnIndex13);
                kVar.f68135x4487c8e6 = mo78085xb5882a6b.getInt(i18);
                kVar.f68134xafc3ad0d = mo78085xb5882a6b.getInt(i17);
                mo78085xb5882a6b.moveToNext();
                this.f530800b.add(kVar);
                columnIndex14 = i18;
                columnIndex = columnIndex;
                columnIndex15 = i17;
            }
            f0Var = this;
        }
        if (mo78085xb5882a6b != null) {
            mo78085xb5882a6b.close();
        }
        java.lang.Object l17 = gm0.j1.u().c().l(139268, null);
        f0Var.f530801c = l17 == null ? 0 : ((java.lang.Integer) l17).intValue();
    }

    public static void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMsgManager", "clearRedDotAndWording()");
        s75.d.b(new wt1.d0(), "clearRedDotAndWording");
    }

    public boolean b(java.lang.String str) {
        xt1.k kVar;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.List list = this.f530800b;
        if (list != null && !android.text.TextUtils.isEmpty(str)) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i17 >= arrayList.size()) {
                    break;
                }
                kVar = (xt1.k) arrayList.get(i17);
                if (str.equals(kVar.f68130x6583d7e)) {
                    break;
                }
                i17++;
            }
        }
        kVar = null;
        if (kVar == null) {
            return false;
        }
        ((java.util.ArrayList) list).remove(kVar);
        c(kVar);
        return true;
    }

    public final boolean c(xt1.k kVar) {
        if (kVar == null) {
            return false;
        }
        boolean mo9951xb06685ab = xt1.t0.Vi().mo9951xb06685ab(kVar, new java.lang.String[0]);
        if (!mo9951xb06685ab) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardMsgManager", "delete CardMsgInfo failed! id:" + kVar.f68130x6583d7e);
        }
        return mo9951xb06685ab;
    }

    public void d() {
        this.f530801c = 0;
        gm0.j1.u().c().w(139268, java.lang.Integer.valueOf(this.f530801c));
    }

    public final void e(xt1.k kVar) {
        if (kVar == null || xt1.t0.Vi().mo880xb970c2b9(kVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardMsgManager", "insert CardMsgInfo failed! id:" + kVar.f68130x6583d7e);
    }

    public void f(wt1.e0 e0Var) {
        wt1.e0 e0Var2;
        if (this.f530799a == null || e0Var == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f530799a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f530799a.get(i17);
            if (weakReference != null && (e0Var2 = (wt1.e0) weakReference.get()) != null && e0Var2.equals(e0Var)) {
                this.f530799a.remove(weakReference);
                return;
            }
        }
    }
}
