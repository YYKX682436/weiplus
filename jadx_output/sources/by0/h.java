package by0;

/* loaded from: classes.dex */
public abstract class h {
    public static final r45.ze2 a(com.tencent.mm.modelgeo.Addr addr) {
        kotlin.jvm.internal.o.g(addr, "<this>");
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(7, addr.f71213f);
        ze2Var.set(9, addr.f71212e);
        ze2Var.set(2, addr.f71214g);
        ze2Var.set(8, addr.f71216i);
        ze2Var.set(3, addr.c());
        ze2Var.set(4, addr.f71211d);
        return ze2Var;
    }

    public static final com.tencent.maas.moviecomposing.segments.GeographicInfo b(r45.ze2 ze2Var) {
        return ze2Var == null ? new com.tencent.maas.moviecomposing.segments.GeographicInfo("", "", "", "", "编辑地点", "") : new com.tencent.maas.moviecomposing.segments.GeographicInfo(ze2Var.getString(7), ze2Var.getString(9), ze2Var.getString(2), ze2Var.getString(8), ze2Var.getString(3), ze2Var.getString(4));
    }
}
