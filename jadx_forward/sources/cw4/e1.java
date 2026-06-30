package cw4;

/* loaded from: classes8.dex */
public final class e1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd f305747d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd) {
        this.f305747d = c19231x33dc2abd;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public final void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "liveDataMerger -> " + obj);
        boolean z17 = obj instanceof cw4.y;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = this.f305747d;
        if (z17) {
            android.content.Context mo122967x76847179 = c19231x33dc2abd.f263274d.mo122967x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo122967x76847179);
            if (obj != cw4.y.f305833e && obj != cw4.y.f305835g) {
                if (c19231x33dc2abd.c().f305786v.mo3195x754a37bb() == cw4.y.f305834f) {
                    db5.e1.C(mo122967x76847179, mo122967x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6t), null, mo122967x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyh), mo122967x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyg), true, new cw4.h1(c19231x33dc2abd), null);
                    return;
                } else {
                    db5.e1.s(mo122967x76847179, mo122967x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6v), "");
                    return;
                }
            }
            c19231x33dc2abd.h(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd.a(c19231x33dc2abd);
    }
}
