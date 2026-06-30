package o45;

/* loaded from: classes12.dex */
public abstract class bh {
    public static r45.he a(o45.zg zgVar) {
        r45.he heVar = new r45.he();
        heVar.f457613g = zgVar.m150607xeb61b2d7();
        heVar.f457615i = zgVar.m150615xc9c28268();
        heVar.f457611e = zgVar.m150617xb5887524();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(zgVar.m150608xbdf72767().getBytes());
        heVar.f457612f = b17;
        if (b17.f273689a.length >= 16) {
            b17.f(16);
            heVar.f457612f = b17;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b18 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(zgVar.m150609x1cd0bea6().getBytes());
        heVar.f457614h = b18;
        if (b18.f273689a.length >= 132) {
            b18.f(132);
            heVar.f457614h = b18;
        }
        try {
            heVar.f457610d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.a(new java.lang.String("\u0000"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMBase", e17.getLocalizedMessage());
        }
        return heVar;
    }

    public static void b(o45.ah ahVar, r45.ie ieVar) {
        r45.du5 du5Var = ieVar.f458493e;
        if (du5Var != null) {
            ahVar.m150583xb2146de(du5Var.f454289d);
        } else {
            ahVar.m150583xb2146de("");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMBase", "ErrMsg is Null!!!!!!");
        }
    }
}
