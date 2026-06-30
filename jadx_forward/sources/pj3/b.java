package pj3;

/* loaded from: classes13.dex */
public class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f436466d = {l75.n0.m145250x3fdc6f77(p21.j.F, "MultiTalkInfo"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkInfo_key  on MultiTalkInfo  (  wxGroupId )"};

    static {
        new pj3.a();
    }

    public b(l75.k0 k0Var) {
        super(k0Var, p21.j.F, "MultiTalkInfo", null);
    }

    public boolean d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete id = %s", str);
        try {
            super.m145253xb158737d("MultiTalkInfo", "delete from MultiTalkInfo where wxGroupId = \"" + str + "\"");
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete fail for wxGroupId = " + str);
            return false;
        }
    }

    public p21.j y0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTaklInfo for wxGroupId = %s", str);
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select wxGroupId, groupId, roomId, roomKey, routeId, inviteUserName,memberCount,createTime,state,ilinkRoomId from MultiTalkInfo where wxGroupId = '" + str + "'", new java.lang.String[0]);
        try {
            if (m145256x1d3f4980 != null) {
                try {
                    if (m145256x1d3f4980.moveToNext()) {
                        p21.j jVar = new p21.j();
                        jVar.f66530xacb0c0d4 = m145256x1d3f4980.getString(0);
                        jVar.f66522x861009b5 = m145256x1d3f4980.getString(1);
                        jVar.f66526xeabee3b = m145256x1d3f4980.getInt(2);
                        jVar.f66527xc6d1e13f = m145256x1d3f4980.getLong(3);
                        jVar.f66528xc729faff = m145256x1d3f4980.getInt(4);
                        jVar.f66524x922cf104 = m145256x1d3f4980.getString(5);
                        jVar.f66525xbcb1bed0 = m145256x1d3f4980.getInt(6);
                        jVar.f66521xac3be4e = m145256x1d3f4980.getLong(7);
                        jVar.f66529x29d3a50c = m145256x1d3f4980.getInt(8);
                        jVar.f66523xadd3a154 = m145256x1d3f4980.getLong(9);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d,inviteUser=%s,memberCount=%d, createTime=%d,field_state=%d, ilinkroomid=%d", jVar.f66530xacb0c0d4, jVar.f66522x861009b5, java.lang.Integer.valueOf(jVar.f66526xeabee3b), java.lang.Long.valueOf(jVar.f66527xc6d1e13f), java.lang.Integer.valueOf(jVar.f66528xc729faff), jVar.f66524x922cf104, java.lang.Integer.valueOf(jVar.f66525xbcb1bed0), java.lang.Long.valueOf(jVar.f66521xac3be4e), java.lang.Integer.valueOf(jVar.f66529x29d3a50c), java.lang.Long.valueOf(jVar.f66523xadd3a154));
                        return jVar;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo error! " + e17.toString());
                    m145256x1d3f4980.close();
                    return null;
                }
            }
            return m145256x1d3f4980 != null ? null : null;
        } finally {
            m145256x1d3f4980.close();
        }
    }
}
