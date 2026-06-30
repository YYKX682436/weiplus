package v21;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5702x5ea31af6 c5702x5ea31af6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5702x5ea31af6) abstractC20979x809547d1;
        if (c5702x5ea31af6 == null) {
            return false;
        }
        am.oj ojVar = c5702x5ea31af6.f136024g;
        java.lang.String str = ojVar.f89080g;
        try {
            if (str.endsWith(".tmp")) {
                str = str.substring(0, str.lastIndexOf(".tmp"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaInfoRptEventIListener", "media info event path[%s, %s]", str, ojVar.f89080g);
            }
        } catch (java.lang.Exception unused) {
        }
        gm0.j1.e().j(new t21.g2(str, ojVar.f89081h, ojVar.f89074a, ojVar.f89075b, ojVar.f89076c, ojVar.f89077d, ojVar.f89082i, ojVar.f89078e, ojVar.f89079f, ojVar.f89083j, ojVar.f89084k, ojVar.f89085l));
        return false;
    }
}
