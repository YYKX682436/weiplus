package pj3;

/* loaded from: classes7.dex */
public class d extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f436468d = {l75.n0.m145250x3fdc6f77(pj3.c.f436467z, "MultiTalkMember"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkMember  on MultiTalkMember  (  wxGroupId )"};

    public d(l75.k0 k0Var) {
        super(k0Var, pj3.c.f436467z, "MultiTalkMember", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a6, code lost:
    
        if (r15 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList D0(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.MultiTalk.storage.MultiTalkMemberStorage"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '"
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r15 = "'"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            android.database.Cursor r15 = r14.m145256x1d3f4980(r15, r2)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L21:
            if (r15 == 0) goto La6
            boolean r3 = r15.moveToNext()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r3 == 0) goto La6
            pj3.c r3 = new pj3.c     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r4 = r15.getInt(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.f66663x693749da = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r4 = 1
            java.lang.String r5 = r15.getString(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.f66666xacb0c0d4 = r5     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r5 = 2
            java.lang.String r6 = r15.getString(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.f66665xdde069b = r6     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r6 = 3
            java.lang.String r7 = r15.getString(r6)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.f66661x922cf104 = r7     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r7 = 4
            long r8 = r15.getLong(r7)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.f66662xf70d5efa = r8     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r8 = 5
            int r9 = r15.getInt(r8)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.f66664x10a0fed7 = r9     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r9 = 6
            long r10 = r15.getLong(r9)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.f66660xac3be4e = r10     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r10 = "getMultiTalkMemberList get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d"
            r11 = 7
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r12 = r3.f66663x693749da     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r1] = r12     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r12 = r3.f66666xacb0c0d4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r4] = r12     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r4 = r3.f66665xdde069b     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r5] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r4 = r3.f66661x922cf104     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r6] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r4 = r3.f66662xf70d5efa     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r7] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r4 = r3.f66664x10a0fed7     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r8] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r4 = r3.f66660xac3be4e     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r9] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10, r11)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r2.add(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L21
        L97:
            r0 = move-exception
            goto La2
        L99:
            r1 = move-exception
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L97
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L97
            goto La8
        La2:
            r15.close()
            throw r0
        La6:
            if (r15 == 0) goto Lab
        La8:
            r15.close()
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pj3.d.D0(java.lang.String):java.util.LinkedList");
    }

    public boolean J0(pj3.c cVar) {
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "save. MultiTalkMember is null!");
            return false;
        }
        java.lang.String str = cVar.f66665xdde069b;
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select * from MultiTalkMember where userName = '" + str + "' and wxGroupId = '" + cVar.f66666xacb0c0d4 + "'", new java.lang.String[0]);
        try {
            if (m145256x1d3f4980.getCount() == 0) {
                boolean mo880xb970c2b9 = mo880xb970c2b9(cVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "insert ret " + mo880xb970c2b9 + " for userName = " + str);
                return mo880xb970c2b9;
            }
            boolean mo9952xce0038c9 = mo9952xce0038c9(cVar, new java.lang.String[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "update ret " + mo9952xce0038c9 + " for userName = " + str);
            return mo9952xce0038c9;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", e17.toString());
            return false;
        } finally {
            m145256x1d3f4980.close();
        }
    }

    public boolean d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + str);
        try {
            super.m145253xb158737d("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + str + "\"");
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + str);
            return false;
        }
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + str + ",member = " + str2);
        try {
            super.m145253xb158737d("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + str + "\" and userName = \"" + str2 + "\"");
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + str + ",member = " + str2);
            return false;
        }
    }

    public pj3.c z0(java.lang.String str, java.lang.String str2) {
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + str + "' and userName ='" + str2 + "'", new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            try {
                try {
                    if (m145256x1d3f4980.moveToNext()) {
                        pj3.c cVar = new pj3.c();
                        cVar.f66663x693749da = m145256x1d3f4980.getInt(0);
                        cVar.f66666xacb0c0d4 = m145256x1d3f4980.getString(1);
                        cVar.f66665xdde069b = m145256x1d3f4980.getString(2);
                        cVar.f66661x922cf104 = m145256x1d3f4980.getString(3);
                        cVar.f66662xf70d5efa = m145256x1d3f4980.getLong(4);
                        cVar.f66664x10a0fed7 = m145256x1d3f4980.getInt(5);
                        cVar.f66660xac3be4e = m145256x1d3f4980.getLong(6);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMember get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", java.lang.Long.valueOf(cVar.f66663x693749da), cVar.f66666xacb0c0d4, cVar.f66665xdde069b, cVar.f66661x922cf104, java.lang.Long.valueOf(cVar.f66662xf70d5efa), java.lang.Integer.valueOf(cVar.f66664x10a0fed7), java.lang.Long.valueOf(cVar.f66660xac3be4e));
                        return cVar;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", e17.toString());
                }
            } finally {
                m145256x1d3f4980.close();
            }
        }
        if (m145256x1d3f4980 == null) {
            return null;
        }
        return null;
    }
}
