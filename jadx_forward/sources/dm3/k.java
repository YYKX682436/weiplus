package dm3;

/* loaded from: classes10.dex */
public abstract class k {
    public static final void a(r45.hf2 hf2Var, java.lang.String prefix, java.util.Map values) {
        java.lang.Integer h17;
        java.lang.Long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hf2Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        try {
            java.lang.String concat = prefix.concat(".FinderMVSongInfo");
            java.lang.Object obj = (java.lang.String) values.get(concat + ".songName");
            java.lang.Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            hf2Var.set(0, obj);
            java.lang.Object obj3 = (java.lang.String) values.get(concat + ".singer");
            if (obj3 == null) {
                obj3 = "";
            }
            hf2Var.set(1, obj3);
            java.lang.Object obj4 = (java.lang.String) values.get(concat + ".musicDataUrl");
            if (obj4 == null) {
                obj4 = "";
            }
            hf2Var.set(2, obj4);
            java.lang.Object obj5 = (java.lang.String) values.get(concat + ".musicAppId");
            if (obj5 == null) {
                obj5 = "";
            }
            hf2Var.set(3, obj5);
            java.lang.Object obj6 = (java.lang.String) values.get(concat + ".musicWebUrl");
            if (obj6 == null) {
                obj6 = "";
            }
            hf2Var.set(4, obj6);
            java.lang.Object obj7 = (java.lang.String) values.get(concat + ".songId");
            if (obj7 == null) {
                obj7 = "";
            }
            hf2Var.set(5, obj7);
            java.lang.Object obj8 = (java.lang.String) values.get(concat + ".lyric");
            if (obj8 == null) {
                obj8 = "";
            }
            hf2Var.set(6, obj8);
            java.lang.Object obj9 = (java.lang.String) values.get(concat + ".albumName");
            if (obj9 == null) {
                obj9 = "";
            }
            hf2Var.set(7, obj9);
            java.lang.Object obj10 = (java.lang.String) values.get(concat + ".albumUrl");
            if (obj10 == null) {
                obj10 = "";
            }
            hf2Var.set(8, obj10);
            java.lang.Object obj11 = (java.lang.String) values.get(concat + ".genre");
            if (obj11 == null) {
                obj11 = "";
            }
            hf2Var.set(9, obj11);
            java.lang.Object obj12 = (java.lang.String) values.get(concat + ".publicTime");
            if (obj12 == null) {
                obj12 = "";
            }
            hf2Var.set(10, obj12);
            java.lang.String str = (java.lang.String) values.get(concat + ".publicTimeS");
            hf2Var.set(11, java.lang.Long.valueOf((str == null || (j17 = r26.h0.j(str)) == null) ? 0L : j17.longValue()));
            java.lang.Object obj13 = (java.lang.String) values.get(concat + ".extraInfo");
            if (obj13 == null) {
                obj13 = "";
            }
            hf2Var.set(12, obj13);
            java.lang.Object obj14 = (java.lang.String) values.get(concat + ".identification");
            if (obj14 == null) {
                obj14 = "";
            }
            hf2Var.set(13, obj14);
            java.lang.String str2 = (java.lang.String) values.get(concat + ".duration");
            hf2Var.set(14, java.lang.Integer.valueOf((str2 == null || (h17 = r26.h0.h(str2)) == null) ? 0 : h17.intValue()));
            r45.if2 if2Var = new r45.if2();
            java.lang.String str3 = (java.lang.String) values.get(concat + ".musicOperationUrl");
            if (str3 == null) {
                str3 = "";
            }
            if2Var.set(0, str3);
            hf2Var.set(17, if2Var);
            java.lang.Object obj15 = (java.lang.String) values.get(concat + ".mid");
            if (obj15 != null) {
                obj2 = obj15;
            }
            hf2Var.set(18, obj2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMVSongInfo", "parse FinderMVSongInfo from xml fail:" + e17.getLocalizedMessage());
        }
    }

    public static final java.lang.String b(pj4.j0 j0Var, r45.hf2 hf2Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hf2Var != null ? hf2Var.m75945x2fec8307(5) : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("status_");
            sb6.append(j0Var != null ? j0Var.hashCode() : 0);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("status_");
        sb7.append(hf2Var != null ? hf2Var.m75945x2fec8307(5) : null);
        return sb7.toString();
    }
}
