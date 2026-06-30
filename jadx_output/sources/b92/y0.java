package b92;

@j95.b
/* loaded from: classes3.dex */
public final class y0 extends i95.w implements m40.i0 {
    public void Ai(boolean z17, r45.g92 shareObj) {
        kotlin.jvm.internal.o.g(shareObj, "shareObj");
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("share_scene", java.lang.String.valueOf(shareObj.getInteger(44)));
        lVarArr[1] = new jz5.l("liveid", java.lang.String.valueOf(shareObj.getString(0)));
        java.lang.String string = shareObj.getString(2);
        if (string == null) {
            string = "";
        }
        lVarArr[2] = new jz5.l("feedid", string);
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        if (z17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.X2, i17, null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.Z2, i17, null, null, null, null, false, 124, null);
        }
    }

    public void Bi(boolean z17, java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "map");
        if (z17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.Y2, map, null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f327935a3, map, null, null, null, null, false, 124, null);
        }
    }

    public void wi(boolean z17, java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "map");
        if (z17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f328062m, map, null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f327954i, map, null, null, null, null, false, 124, null);
        }
    }
}
