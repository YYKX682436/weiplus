package bk4;

/* loaded from: classes11.dex */
public abstract class l {
    public static final java.lang.String a(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("size:" + list.size() + '-');
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            pj4.j0 j0Var = (pj4.j0) it.next();
            kotlin.jvm.internal.o.g(j0Var, "<this>");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("jType:");
            sb7.append(j0Var.f355139d);
            sb7.append(" bid:");
            sb7.append(j0Var.f355140e);
            sb7.append(" buf:");
            java.lang.String str = j0Var.f355141f;
            sb7.append(str != null ? str.length() : -1);
            sb7.append(" kbuf:");
            sb7.append(j0Var.f355142g);
            sb6.append(sb7.toString());
            sb6.append(",");
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    public static final java.lang.String b(pj4.b0 b0Var) {
        kotlin.jvm.internal.o.g(b0Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaTyoe:");
        sb6.append(b0Var.f354974f);
        sb6.append(" mediaUrl:");
        sb6.append(b0Var.f354976h);
        sb6.append(" turl:");
        sb6.append(b0Var.f354978m);
        sb6.append(" des:");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.G1(b0Var.f354971J));
        sb6.append(" bid:");
        sb6.append(b0Var.f354989x);
        sb6.append(" rid:");
        sb6.append(b0Var.D);
        sb6.append(" rname:");
        sb6.append(b0Var.C);
        sb6.append(" did:");
        sb6.append(b0Var.G);
        sb6.append(" dname:");
        sb6.append(b0Var.F);
        sb6.append(" topicInfo:");
        pj4.o0 topicInfo = b0Var.f354975g;
        kotlin.jvm.internal.o.f(topicInfo, "topicInfo");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tid:");
        sb7.append(topicInfo.f355213d);
        sb7.append(" sid:");
        sb7.append(wi4.a.d(topicInfo));
        sb7.append(" said:");
        sb7.append(wi4.a.a(topicInfo));
        sb7.append(" sname:");
        sb7.append(wi4.a.e(topicInfo));
        sb7.append(" sicon:");
        sb7.append(wi4.a.c(topicInfo));
        sb7.append(" iconId:");
        sb7.append(topicInfo.f355214e);
        sb7.append(" vinfo:");
        sb7.append(topicInfo.f355217h);
        sb7.append(" jumpinfos:");
        java.util.LinkedList linkedList = topicInfo.f355216g;
        sb7.append(linkedList != null ? a(linkedList) : null);
        sb7.append(" sourceInfos:");
        sb7.append(a(wi4.a.b(topicInfo)));
        sb6.append(sb7.toString());
        sb6.append(" hasBrandInfo:");
        java.lang.String str = b0Var.H;
        sb6.append(!(str == null || r26.n0.N(str)));
        sb6.append(" option:");
        sb6.append(b0Var.f354986u);
        sb6.append(", visibility:");
        sb6.append(b0Var.f354980o);
        sb6.append(", blackUserCount:");
        java.util.LinkedList linkedList2 = b0Var.N;
        sb6.append(linkedList2 != null ? java.lang.Integer.valueOf(linkedList2.size()) : null);
        sb6.append(", blackLabelCount:");
        sb6.append(b0Var.M.size());
        return sb6.toString();
    }
}
