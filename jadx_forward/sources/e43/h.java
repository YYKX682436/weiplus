package e43;

/* loaded from: classes12.dex */
public class h implements u33.j {
    public void a(boolean z17, int i17, java.lang.String str, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImgUtil", "onFinish, success = %b, errCode = %d, mediaId = %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6214xaceee53b c6214xaceee53b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6214xaceee53b();
        am.k00 k00Var = c6214xaceee53b.f136464g;
        k00Var.f88642a = str;
        k00Var.f88643b = z17;
        java.util.Map map = e43.g.f330895a;
        s33.k kVar = (s33.k) ((java.util.HashMap) map).get(str);
        if (kVar != null) {
            ((java.util.HashMap) map).put(str, kVar);
        }
        if (hVar == null || kVar == null) {
            return;
        }
        k00Var.f88644c = hVar.f69502xf11df5f5;
        k00Var.f88645d = hVar.f69522xf9dbbe9c;
        k00Var.f88646e = kVar.f484051b;
        k00Var.f88647f = kVar.f484052c;
        c6214xaceee53b.e();
    }
}
