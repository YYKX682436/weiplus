package dv4;

/* loaded from: classes.dex */
public class l extends dv4.a {

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f325547c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f325548d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f325549e;

    public l(java.lang.String str, java.util.List list) {
        super(str, Integer.MAX_VALUE);
        this.f325548d = list;
    }

    @Override // dv4.a
    public void a(java.util.List list) {
        this.f325547c = list;
        if (list != null) {
            java.util.List list2 = this.f325548d;
            java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
            java.util.Iterator it = this.f325547c.iterator();
            while (it.hasNext()) {
                p13.y yVar = (p13.y) it.next();
                int indexOf = list2.indexOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true).d1());
                if (indexOf >= 0) {
                    if (indexOf < arrayList.size()) {
                        arrayList.add(indexOf, yVar);
                    } else {
                        arrayList.add(yVar);
                    }
                    it.remove();
                }
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f325547c.add(0, (p13.y) arrayList.get(size));
            }
        }
        this.f325549e = true;
    }

    public void b(p13.y yVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, org.json.JSONObject jSONObject) {
        java.lang.String str = yVar.f432723h;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<em class=\\\"highlight\\\">");
        java.lang.String str2 = this.f325530a;
        sb6.append(str2);
        sb6.append("</em>");
        java.lang.String replaceFirst = str.replaceFirst(str2, sb6.toString());
        int i17 = yVar.f432718c;
        if (i17 != 1) {
            if (i17 == 15) {
                replaceFirst = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l57) + replaceFirst;
            } else if (i17 != 4 && i17 != 5) {
                replaceFirst = "";
            }
        }
        try {
            jSONObject.put("displayText", replaceFirst);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("JsapiFtsMatchContact", e17, "", new java.lang.Object[0]);
        }
    }
}
