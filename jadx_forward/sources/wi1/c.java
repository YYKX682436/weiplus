package wi1;

/* loaded from: classes5.dex */
public class c implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 f527686d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905) {
        this.f527686d = c12545x36e72905;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905 = this.f527686d;
        c12545x36e72905.f168950o--;
        c12545x36e72905.f168944f.setText(c12545x36e72905.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572180a30, java.lang.Integer.valueOf(c12545x36e72905.f168950o)));
        if (c12545x36e72905.f168950o != 0) {
            return true;
        }
        c12545x36e72905.f168951p.d();
        c12545x36e72905.f168950o = c12545x36e72905.f168949n;
        c12545x36e72905.f168945g.setVisibility(0);
        c12545x36e72905.f168944f.setVisibility(8);
        return true;
    }
}
