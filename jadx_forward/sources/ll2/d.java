package ll2;

/* loaded from: classes3.dex */
public final class d implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f400665d;

    public d(yz5.l lVar) {
        this.f400665d = lVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.vs2 vs2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        ll2.e eVar = ll2.e.f400666a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive notification path ");
        sb6.append(aVar.f186864e);
        sb6.append(", show = ");
        sb6.append(aVar.f186860a);
        sb6.append(", group id = ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = aVar.f186862c;
        sb6.append((jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null) ? null : vs2Var.f470033u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", sb6.toString());
        this.f400665d.mo146xb9724478(aVar);
    }
}
