package rn;

/* loaded from: classes11.dex */
public class h extends dm.e6 {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f479136v = dm.e6.m124903x3593deb(rn.h.class);

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f479137t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f479138u = new java.util.LinkedList();

    public h() {
        this.f66386xae782d0e = 0;
    }

    public static java.lang.String u0(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = (com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.f66875xa013b0d5, c10329x6f52684a.f145215d);
                jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, c10329x6f52684a.f145216e);
                jSONObject.put(dm.i4.f66874x4c6b1f55, c10329x6f52684a.f145217f);
                jSONArray.put(jSONObject);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomtools.GroupTools", "getToolsJsonStr() Exception:%s", e17.getMessage());
        }
        return jSONArray.toString();
    }

    @Override // dm.e6, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
        java.util.LinkedList linkedList = this.f479137t;
        linkedList.clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66388x66b87861)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.f66388x66b87861);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(jSONArray.getString(i17));
                    com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = new com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a();
                    java.lang.String string = jSONObject.getString(dm.i4.f66875xa013b0d5);
                    if (string == null) {
                        string = "";
                    }
                    c10329x6f52684a.f145215d = string;
                    java.lang.String string2 = jSONObject.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                    if (string2 == null) {
                        string2 = "";
                    }
                    c10329x6f52684a.f145216e = string2;
                    linkedList.add(c10329x6f52684a);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomtools.GroupTools", "parseStickTools() Exception:%s", e17.getMessage());
            }
        }
        java.util.LinkedList linkedList2 = this.f479138u;
        linkedList2.clear();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66387xea681f9d)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(this.f66387xea681f9d);
            int length2 = jSONArray2.length();
            for (int i18 = 0; i18 < length2; i18++) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONArray2.getString(i18));
                com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a2 = new com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a();
                java.lang.String string3 = jSONObject2.getString(dm.i4.f66875xa013b0d5);
                if (string3 == null) {
                    string3 = "";
                }
                c10329x6f52684a2.f145215d = string3;
                java.lang.String string4 = jSONObject2.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                if (string4 == null) {
                    string4 = "";
                }
                c10329x6f52684a2.f145216e = string4;
                c10329x6f52684a2.f145217f = jSONObject2.getLong(dm.i4.f66874x4c6b1f55);
                linkedList2.add(c10329x6f52684a2);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomtools.GroupTools", "parseRecentUseTools() Exception:%s", e18.getMessage());
        }
    }

    /* renamed from: equals */
    public boolean m162748xb2c87fbf(java.lang.Object obj) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((rn.h) obj).f66385x37548063, this.f66385x37548063);
    }

    @Override // dm.e6, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f479136v;
    }

    public void t0(com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a) {
        java.util.LinkedList linkedList = this.f479138u;
        if (linkedList.contains(c10329x6f52684a)) {
            linkedList.remove(c10329x6f52684a);
        }
        linkedList.add(c10329x6f52684a);
        java.util.Collections.sort(linkedList, new rn.g(this));
        if (linkedList.size() > 20) {
            linkedList.remove(linkedList.size() - 1);
        }
        this.f66387xea681f9d = u0(linkedList);
    }

    public boolean v0() {
        return this.f479137t.size() >= 8;
    }
}
