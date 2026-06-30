package i53;

/* loaded from: classes8.dex */
public class w extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f370299d = {l75.n0.m145250x3fdc6f77(i53.u.S, "GameHaowanMedia")};

    public w(l75.k0 k0Var) {
        super(k0Var, i53.u.S, "GameHaowanMedia", null);
    }

    public void y0(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2;
        java.lang.String format = java.lang.String.format("select * from %s where %s in %s", "GameHaowanMedia", dm.i4.f66867x2a5c95c7, r53.f.f(linkedList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchGet, sql: " + format);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(format, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            linkedList2 = null;
        } else {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            while (m145256x1d3f4980.moveToNext()) {
                i53.u uVar = new i53.u();
                uVar.mo9015xbf5d97fd(m145256x1d3f4980);
                linkedList3.add(uVar);
            }
            m145256x1d3f4980.close();
            linkedList2 = linkedList3;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
            p95.a.a(new i53.v(this, linkedList2));
        }
        java.lang.String format2 = java.lang.String.format("delete from %s where %s in %s", "GameHaowanMedia", dm.i4.f66867x2a5c95c7, r53.f.f(linkedList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchDelete, sql: " + format2);
        m145253xb158737d("GameHaowanMedia", format2);
    }

    public i53.u z0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=\"%s\"", "GameHaowanMedia", dm.i4.f66867x2a5c95c7, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "get, sql: " + format);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(format, new java.lang.String[0]);
        i53.u uVar = null;
        if (m145256x1d3f4980 == null) {
            return null;
        }
        if (m145256x1d3f4980.moveToNext()) {
            uVar = new i53.u();
            uVar.mo9015xbf5d97fd(m145256x1d3f4980);
        }
        m145256x1d3f4980.close();
        return uVar;
    }
}
