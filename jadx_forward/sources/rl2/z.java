package rl2;

/* loaded from: classes4.dex */
public abstract class z extends be2.k {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f478755d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f478756e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f478757f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l75.k0 db6, java.lang.String table) {
        super(db6, ce2.o.f122320r, table, dm.l7.f319816h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.e0 e0Var = ce2.o.f122320r;
        this.f478755d = db6;
        this.f478756e = table;
        this.f478757f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(100);
    }

    public java.util.List D0() {
        java.util.Collection m77806xcee59d22 = this.f478757f.m77806xcee59d22();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77806xcee59d22, "values(...)");
        java.util.Collection collection = m77806xcee59d22;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((ce2.o) it.next());
        }
        return arrayList;
    }

    public void J0() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478757f;
        boolean isEmpty = r2Var.p().isEmpty();
        java.lang.String str = this.f478756e;
        if (isEmpty) {
            android.database.Cursor f17 = this.f478755d.f("SELECT * FROM " + str, null, 2);
            while (f17.moveToNext()) {
                ce2.o oVar = new ce2.o();
                oVar.mo9015xbf5d97fd(f17);
                r2Var.put(oVar.f67342xc8a07680, oVar);
            }
            f17.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initResource: " + c01.z1.r() + ", isEmpty:" + isEmpty + ", cache size:" + r2Var.m77804x35e001());
    }

    public void L0() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478757f;
        java.util.Set p17 = r2Var.p();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "entrySet(...)");
        java.util.Iterator it = p17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String str = this.f478756e;
            if (!hasNext) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "saveResource finish size:" + r2Var.m77804x35e001() + '!');
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
            java.lang.Object value = entry.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            ce2.o oVar = (ce2.o) value;
            l75.k0 k0Var = this.f478755d;
            android.database.Cursor f17 = k0Var.f("SELECT * FROM " + str + " where " + str + ".id=" + ((java.lang.String) key), null, 2);
            boolean moveToNext = f17.moveToNext();
            boolean z17 = !moveToNext;
            f17.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "saveCache " + oVar.f67342xc8a07680 + ',' + oVar.f67343x4b6e68b9 + ",needReplace:" + moveToNext + ", needInsert:" + z17 + ", result:" + (moveToNext ? mo11260x413cb2b4(oVar) : z17 && k0Var.l(str, dm.i4.f66865x76d1ec5a, oVar.mo9763xeb27878e()) > 0));
        }
    }

    @Override // be2.k
    public void y0(java.lang.String id6, java.lang.String path, java.lang.String md52) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478757f;
        ce2.o oVar = new ce2.o();
        oVar.f67342xc8a07680 = id6;
        oVar.f67344x2260084a = path;
        oVar.f67343x4b6e68b9 = md52;
        r2Var.put(id6, oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f478756e, "insertResource id:" + id6 + ",path:" + path + ",md5:" + md52 + ",cache size:" + r2Var.m77804x35e001());
    }

    @Override // be2.k
    public ce2.o z0(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478757f;
        ce2.o oVar = (ce2.o) r2Var.get(id6);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectResource id:");
        sb6.append(id6);
        sb6.append(",resource:");
        sb6.append(oVar != null ? oVar.f67343x4b6e68b9 : null);
        sb6.append(",cache size:");
        sb6.append(r2Var.m77804x35e001());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f478756e, sb6.toString());
        return oVar;
    }
}
