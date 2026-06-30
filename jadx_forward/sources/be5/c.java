package be5;

/* loaded from: classes9.dex */
public final class c implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368 f101097d;

    public c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368 c21858x72911368) {
        this.f101097d = c21858x72911368;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ae5.n nVar = (ae5.n) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe >> ");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368 c21858x72911368 = this.f101097d;
        sb6.append(c21858x72911368.f284214n);
        sb6.append(", searchState: ");
        sb6.append(nVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiNormalResultFragment", sb6.toString());
        ee5.t2 s07 = c21858x72911368.s0();
        java.util.ArrayList arrayList = s07 != null ? s07.f333587m : null;
        if (nVar == ae5.n.f85967f) {
            c21858x72911368.r0(arrayList);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c21858x72911368.f284216p;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(8);
        }
        android.widget.TextView textView = c21858x72911368.f284217q;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
