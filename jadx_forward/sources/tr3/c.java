package tr3;

/* loaded from: classes11.dex */
public abstract class c {
    public static java.lang.String a(r45.km kmVar) {
        r45.lm lmVar;
        if (kmVar == null || (lmVar = kmVar.f460348d) == null || lmVar.f461122g == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it = kmVar.f460348d.f461122g.iterator();
        while (it.hasNext()) {
            r45.mm mmVar = (r45.mm) it.next();
            sb6.append(mmVar.f462168d + "#" + mmVar.f462171g + ";");
            java.util.LinkedList linkedList = mmVar.f462173i;
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.mm mmVar2 = (r45.mm) it6.next();
                    sb6.append(mmVar2.f462168d + "#" + mmVar2.f462171g + ";");
                }
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    public static java.lang.String b(r45.gl glVar) {
        if (glVar == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it = glVar.f456856d.iterator();
        while (it.hasNext()) {
            r45.s5 s5Var = (r45.s5) it.next();
            r45.y5 y5Var = s5Var.f467042d;
            if (y5Var != null) {
                long j17 = y5Var.f472323d;
                r45.p5 p5Var = s5Var.f467047i;
                if (p5Var == null) {
                    sb6.append(j17);
                    sb6.append(";");
                } else {
                    java.util.LinkedList linkedList = p5Var.f464287e;
                    if (linkedList != null) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            r45.o5 o5Var = (r45.o5) it6.next();
                            sb6.append(j17);
                            sb6.append("#");
                            sb6.append(o5Var.f463449g);
                            sb6.append(";");
                        }
                    }
                }
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    public static void c(java.lang.String str, int i17, int i18, int i19, long j17, long j18, int i27, int i28, int i29, int i37, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.content.Intent intent, int i38) {
        long j19 = j17 / 1000;
        long j27 = j18 / 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10298, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), str2, str3, str4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a), str5, str6, str7, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("Contact_Sub_Scene", 0) : 0), java.lang.Integer.valueOf(i38));
    }
}
