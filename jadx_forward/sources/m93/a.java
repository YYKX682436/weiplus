package m93;

/* loaded from: classes8.dex */
public class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m93.h f406545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.r83 f406546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f406547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m93.i f406548d;

    public a(m93.i iVar, m93.h hVar, r45.r83 r83Var, boolean z17) {
        this.f406548d = iVar;
        this.f406545a = hVar;
        this.f406546b = r83Var;
        this.f406547c = z17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        int i19;
        boolean z17;
        m93.a aVar = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.LiteAppGetA8Key", "errType:%d errCode:%d ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        boolean z18 = fVar instanceof r45.s83;
        m93.h hVar = aVar.f406545a;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteApp.LiteAppGetA8Key", "getA8Key call back resp is null");
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        r45.s83 s83Var = (r45.s83) fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.LiteAppGetA8Key", "fullurl:" + s83Var.f467078d);
        java.lang.String str2 = s83Var.f467078d;
        if (str2 == null) {
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        int indexOf = str2.indexOf("?");
        if (indexOf < 0 || (i19 = indexOf + 1) >= s83Var.f467078d.length()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteApp.LiteAppGetA8Key", "paramPos invalid");
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        java.lang.String substring = s83Var.f467078d.substring(i19);
        int indexOf2 = substring.indexOf("#");
        int i27 = 0;
        if (indexOf2 >= 0) {
            substring = substring.substring(0, indexOf2);
        }
        java.lang.String[] split = substring.split("&");
        if (split == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteApp.LiteAppGetA8Key", "params invalid");
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        m93.g gVar = new m93.g(aVar.f406548d);
        gVar.f406566b = aVar.f406546b.f466161y;
        int length = split.length;
        int i28 = 0;
        while (true) {
            z17 = aVar.f406547c;
            if (i28 >= length) {
                break;
            }
            java.lang.String str3 = split[i28];
            int indexOf3 = str3.indexOf(61);
            if (indexOf3 >= 0) {
                java.lang.String trim = str3.substring(i27, indexOf3).trim();
                ((java.util.HashMap) gVar.f406568d).put(trim, str3.substring(indexOf3 + 1).trim());
                if (z17 || (!trim.equals("uin") && !trim.equals("exportKey") && !trim.equals("exportkey") && !trim.equals("wx_header"))) {
                    if (gVar.f406565a == null) {
                        gVar.f406565a = str3;
                    } else {
                        gVar.f406565a += "&" + str3;
                    }
                }
            } else if (gVar.f406565a == null) {
                gVar.f406565a = str3;
            } else {
                gVar.f406565a += "&" + str3;
            }
            i28++;
            aVar = this;
            i27 = 0;
        }
        java.util.Iterator it = s83Var.f467095x.iterator();
        while (it.hasNext()) {
            r45.rx3 rx3Var = (r45.rx3) it.next();
            if (z17 || (!rx3Var.f466805d.equals("uin") && !rx3Var.f466805d.equals("exportKey") && !rx3Var.f466805d.equals("exportkey") && !rx3Var.f466805d.equals("wx_header"))) {
                ((java.util.HashMap) gVar.f406567c).put(rx3Var.f466805d, rx3Var.f466806e);
            }
        }
        if (hVar != null) {
            hVar.b(gVar);
        }
    }
}
