package kh2;

/* loaded from: classes10.dex */
public final class a implements com.tme.p3259xc83515e4.p3262x153e1c29.InterfaceC28060xcb9eebab {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kh2.l f389518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ om2.u f389519b;

    public a(kh2.l lVar, om2.u uVar) {
        this.f389518a = lVar;
        this.f389519b = uVar;
    }

    @Override // com.tme.p3259xc83515e4.p3262x153e1c29.InterfaceC28060xcb9eebab
    /* renamed from: scoreResultCallback */
    public void mo122185x73c502b4(com.tme.p3259xc83515e4.p3262x153e1c29.C28071xbb06e52f c28071xbb06e52f, float f17) {
        com.tme.p3259xc83515e4.p3262x153e1c29.C28062xb6ba3b6e m122285x8c1b7f21;
        com.tme.p3259xc83515e4.p3262x153e1c29.C28062xb6ba3b6e m122288x9795056b;
        com.tme.p3259xc83515e4.p3262x153e1c29.C28062xb6ba3b6e m122285x8c1b7f212;
        com.tme.p3259xc83515e4.p3262x153e1c29.C28062xb6ba3b6e m122288x9795056b2;
        kh2.l lVar = this.f389518a;
        long j17 = lVar.f389550n;
        if (j17 >= 0) {
            long j18 = lVar.f389551o;
            if (j18 > 0 && (f17 < ((float) j17) || f17 > ((float) j18))) {
                return;
            }
        }
        lVar.f389552p++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f389537a, "KTVScore sentenceCount: " + lVar.f389552p);
        lVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getScoreResult pYin: ");
        com.tme.p3259xc83515e4.p3262x153e1c29.C28062xb6ba3b6e c28062xb6ba3b6e = null;
        sb6.append((c28071xbb06e52f == null || (m122288x9795056b2 = c28071xbb06e52f.m122288x9795056b()) == null) ? null : java.lang.Integer.valueOf(m122288x9795056b2.m122211xc38495a4()));
        sb6.append(" acf: ");
        sb6.append((c28071xbb06e52f == null || (m122285x8c1b7f212 = c28071xbb06e52f.m122285x8c1b7f21()) == null) ? null : java.lang.Integer.valueOf(m122285x8c1b7f212.m122211xc38495a4()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f389537a, sb6.toString());
        if (((c28071xbb06e52f == null || (m122288x9795056b = c28071xbb06e52f.m122288x9795056b()) == null) ? 0 : m122288x9795056b.m122211xc38495a4()) > ((c28071xbb06e52f == null || (m122285x8c1b7f21 = c28071xbb06e52f.m122285x8c1b7f21()) == null) ? 0 : m122285x8c1b7f21.m122211xc38495a4())) {
            if (c28071xbb06e52f != null) {
                c28062xb6ba3b6e = c28071xbb06e52f.m122288x9795056b();
            }
        } else if (c28071xbb06e52f != null) {
            c28062xb6ba3b6e = c28071xbb06e52f.m122285x8c1b7f21();
        }
        int m122209x7520e4dc = c28062xb6ba3b6e != null ? c28062xb6ba3b6e.m122209x7520e4dc() : 0;
        int m122211xc38495a4 = c28062xb6ba3b6e != null ? c28062xb6ba3b6e.m122211xc38495a4() : 0;
        float f18 = m122211xc38495a4 / lVar.f389552p;
        jh2.a aVar = lVar.f389538b;
        if (aVar != null) {
            aVar.v1(this.f389519b.f427916a, m122209x7520e4dc, m122211xc38495a4, f18, c28071xbb06e52f != null ? c28071xbb06e52f.m122289xde39a479() : 0, f17);
        }
    }
}
