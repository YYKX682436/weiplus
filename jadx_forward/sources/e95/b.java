package e95;

/* loaded from: classes12.dex */
public abstract class b extends android.database.sqlite.SQLiteClosable {

    /* renamed from: d, reason: collision with root package name */
    public android.util.SparseArray f331928d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f331929e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f331930f;

    /* renamed from: g, reason: collision with root package name */
    public e95.a f331931g;

    public b(boolean z17) {
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CursorDataWindow", "clearData");
        this.f331928d.clear();
        this.f331929e.clear();
    }

    public boolean b(int i17) {
        return this.f331928d.indexOfKey(i17) > -1;
    }

    public abstract e95.a c();

    public int f() {
        return this.f331928d.size();
    }

    /* renamed from: getItem */
    public e95.a m127199xfb80e389(int i17) {
        if (!b(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CursorDataWindow", "newcursor cursor getItem error: pos " + i17 + " loaded num :" + this.f331928d.size());
            return null;
        }
        java.lang.Object obj = this.f331928d.get(i17);
        java.util.HashMap hashMap = this.f331929e;
        e95.a aVar = (e95.a) hashMap.get(obj);
        if (aVar != null) {
            return aVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CursorDataWindow", "get data null %s", obj);
        java.util.ArrayList arrayList = this.f331930f;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.ArrayList i18 = i(this.f331930f);
            if (i18 != null) {
                for (int i19 = 0; i19 < i18.size(); i19++) {
                    e95.a aVar2 = (e95.a) i18.get(i19);
                    if (aVar2 != null) {
                        hashMap.put(aVar2.mo78017xb5884f29(), aVar2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CursorDataWindow", "newcursor obj is null");
                    }
                }
            }
            this.f331930f.clear();
        }
        e95.a aVar3 = (e95.a) hashMap.get(obj);
        if (aVar3 != null) {
            return aVar3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CursorDataWindow", "newcursor error obj : " + obj + "pos:" + i17);
        return aVar3;
    }

    public abstract java.util.ArrayList i(java.util.ArrayList arrayList);

    public void j(int i17, int i18) {
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CursorDataWindow", "newcursor rowEnd with error %d rowNum : %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            this.f331928d.remove(i17);
            return;
        }
        e95.a aVar = this.f331931g;
        if (aVar != null) {
            java.lang.Object mo78017xb5884f29 = aVar.mo78017xb5884f29();
            this.f331929e.put(mo78017xb5884f29, this.f331931g);
            this.f331928d.put(i17, mo78017xb5884f29);
        }
    }

    public boolean n0(java.lang.Object obj) {
        boolean z17 = obj instanceof java.lang.Object[];
        java.util.HashMap hashMap = this.f331929e;
        if (z17) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr.length == 1) {
                return hashMap != null && hashMap.containsKey(objArr[0]);
            }
        }
        return hashMap != null && hashMap.containsKey(obj);
    }

    @Override // android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        a();
    }

    public boolean t(java.lang.Object obj, e95.a aVar) {
        boolean z17;
        java.util.HashMap hashMap = this.f331929e;
        if (aVar != null) {
            java.util.Objects.toString(obj);
            aVar.toString();
            hashMap.put(obj, aVar);
            return false;
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            for (java.lang.Object obj2 : objArr) {
                hashMap.remove(obj2);
            }
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            int i17 = 0;
            for (int i18 = 0; i18 < this.f331928d.size(); i18++) {
                int keyAt = this.f331928d.keyAt(i18);
                java.lang.Object valueAt = this.f331928d.valueAt(i18);
                int length = objArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 >= length) {
                        z17 = true;
                        break;
                    }
                    if (objArr[i19].equals(valueAt)) {
                        i17++;
                        z17 = false;
                        break;
                    }
                    i19++;
                }
                if (z17) {
                    sparseArray.put(keyAt - i17, valueAt);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CursorDataWindow", "newcursor delete index : " + i18 + " obj : " + valueAt);
                }
            }
            if (this.f331928d.size() != sparseArray.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CursorDataWindow", "newcursor oldposition size :" + this.f331928d.size() + " newposistion Size : " + sparseArray.size());
            }
            this.f331928d = sparseArray;
        } else {
            if (this.f331930f == null) {
                this.f331930f = new java.util.ArrayList();
            }
            if (!this.f331930f.contains(obj)) {
                this.f331930f.add(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CursorDataWindow", "newcursor cursor clearData : " + obj);
            }
            hashMap.remove(obj);
        }
        return false;
    }
}
