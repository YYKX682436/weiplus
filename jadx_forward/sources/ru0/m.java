package ru0;

/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f481222a = jz5.h.b(ru0.i.f481210d);

    public static final com.p314xaae8f345.mm.vfs.r6 a() {
        return (com.p314xaae8f345.mm.vfs.r6) ((jz5.n) f481222a).mo141623x754a37bb();
    }

    public static final com.p314xaae8f345.mm.vfs.r6 b(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!a().m()) {
            a().J();
        }
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a(), kk.k.g(bytes));
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var;
    }

    public static final java.util.List c(java.lang.String str, java.util.List list, java.lang.String str2, long j17, long j18, float f17) {
        if ((str == null || str.length() == 0) || j18 <= j17) {
            return null;
        }
        java.lang.String e17 = ru0.t.e(str, "");
        if (e17.length() <= ru0.t.c(str2)) {
            r45.le4 le4Var = new r45.le4();
            le4Var.f460912f = e17;
            le4Var.f460913g = str2;
            le4Var.f460910d = 0L;
            le4Var.f460911e = ((float) (j18 - j17)) / f17;
            return kz5.b0.c(le4Var);
        }
        if (list == null) {
            return null;
        }
        ru0.q qVar = new ru0.q(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.qz qzVar = (bw5.qz) obj;
            java.lang.String m12858xfb85ada3 = qzVar.m12858xfb85ada3();
            long j19 = qzVar.f113866e;
            long j27 = qzVar.f113867f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m12858xfb85ada3);
            ru0.n nVar = (!(m12858xfb85ada3.length() > 0) || j27 < j19) ? null : ((java.lang.Boolean) qVar.mo146xb9724478(java.lang.Integer.valueOf(i17))).booleanValue() ? new ru0.n(" ".concat(m12858xfb85ada3), j19, j27) : new ru0.n(m12858xfb85ada3, j19, j27);
            if (nVar != null) {
                arrayList.add(nVar);
            }
            i17 = i18;
        }
        java.util.List<ru0.f> b17 = ru0.t.b(arrayList, str2, e17.length());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (ru0.f fVar : b17) {
            r45.le4 le4Var2 = new r45.le4();
            le4Var2.f460912f = fVar.f481200a;
            le4Var2.f460913g = str2;
            le4Var2.f460910d = fVar.f481201b - j17;
            le4Var2.f460911e = ((float) (fVar.f481202c - r5)) / f17;
            arrayList2.add(le4Var2);
        }
        return arrayList2;
    }

    public static final java.util.List d(org.json.JSONObject jSONObject, java.lang.String str, long j17, long j18, float f17) {
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        if ((optString == null || optString.length() == 0) || j18 <= j17) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String e17 = ru0.t.e(optString, "");
        if (e17.length() <= ru0.t.c(str)) {
            r45.le4 le4Var = new r45.le4();
            le4Var.f460912f = e17;
            le4Var.f460913g = str;
            le4Var.f460910d = 0L;
            le4Var.f460911e = ((float) (j18 - j17)) / f17;
            return kz5.b0.c(le4Var);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("words");
        if (optJSONArray == null) {
            return null;
        }
        java.util.List<ru0.f> b17 = ru0.t.b(ru0.t.a(optJSONArray, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "ms_begin", "ms_end", false), str, e17.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (ru0.f fVar : b17) {
            r45.le4 le4Var2 = new r45.le4();
            le4Var2.f460912f = fVar.f481200a;
            le4Var2.f460913g = str;
            le4Var2.f460910d = fVar.f481201b - j17;
            le4Var2.f460911e = ((float) (fVar.f481202c - r1)) / f17;
            arrayList.add(le4Var2);
        }
        return arrayList;
    }
}
