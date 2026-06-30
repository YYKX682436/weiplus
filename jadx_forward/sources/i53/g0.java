package i53;

/* loaded from: classes8.dex */
public class g0 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f370111d = {l75.n0.m145250x3fdc6f77(i53.x.L, "GameHaowanPublishEdition")};

    public g0(l75.k0 k0Var) {
        super(k0Var, i53.x.L, "GameHaowanPublishEdition", null);
    }

    public i53.x D0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=\"%s\"", "GameHaowanPublishEdition", "taskId", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "query, sql : %s", format);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(format, new java.lang.String[0]);
        i53.x xVar = null;
        if (m145256x1d3f4980 == null) {
            return null;
        }
        if (m145256x1d3f4980.moveToNext()) {
            xVar = new i53.x();
            xVar.mo9015xbf5d97fd(m145256x1d3f4980);
        }
        m145256x1d3f4980.close();
        return xVar;
    }

    public java.util.LinkedList J0(int i17) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=%d", "GameHaowanPublishEdition", "publishState", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryAllPublish: %s", format);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(format, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (m145256x1d3f4980.moveToNext()) {
            i53.x xVar = new i53.x();
            xVar.mo9015xbf5d97fd(m145256x1d3f4980);
            linkedList.add(xVar);
        }
        m145256x1d3f4980.close();
        return linkedList;
    }

    public boolean L0(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanPublishEdition", "uploadState", java.lang.Integer.valueOf(i17), "taskId", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMediaUploadState, sql : %s", format);
        return m145253xb158737d("GameHaowanPublishEdition", format);
    }

    public boolean P0(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanPublishEdition", "mixState", java.lang.Integer.valueOf(i17), "taskId", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMixState, sql : %s", format);
        return m145253xb158737d("GameHaowanPublishEdition", format);
    }

    public boolean W0(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanPublishEdition", "publishState", java.lang.Integer.valueOf(i17), "taskId", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updatePublishState, sql : %s", format);
        return m145253xb158737d("GameHaowanPublishEdition", format);
    }

    public void y0(java.util.LinkedList linkedList) {
        java.util.LinkedList z07 = z0(linkedList);
        if (z07 != null) {
            java.util.Iterator it = z07.iterator();
            while (it.hasNext()) {
                i53.x xVar = (i53.x) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xVar.f67208xae33d3df)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().y0(r53.f.G(xVar.f67208xae33d3df));
                }
            }
            java.lang.String format = java.lang.String.format("delete from %s where %s in %s", "GameHaowanPublishEdition", "taskId", r53.f.f(linkedList));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchDelete, sql : %s", format);
            m145253xb158737d("GameHaowanPublishEdition", format);
        }
    }

    public java.util.LinkedList z0(java.util.LinkedList linkedList) {
        java.lang.String format = java.lang.String.format("select * from %s where %s in %s", "GameHaowanPublishEdition", "taskId", r53.f.f(linkedList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchQuery, sql : %s", format);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(format, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        while (m145256x1d3f4980.moveToNext()) {
            i53.x xVar = new i53.x();
            xVar.mo9015xbf5d97fd(m145256x1d3f4980);
            linkedList2.add(xVar);
        }
        m145256x1d3f4980.close();
        return linkedList2;
    }
}
