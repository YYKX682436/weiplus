package h34;

/* loaded from: classes11.dex */
public abstract class v {
    public static b21.r a(r45.eh4 eh4Var) {
        if (eh4Var == null) {
            return null;
        }
        try {
            b21.r rVar = new b21.r();
            rVar.f98891t = "wx5aa333606550dfd5";
            rVar.f98878d = 4;
            rVar.f98879e = java.lang.String.valueOf(eh4Var.f455015e);
            rVar.f98880f = eh4Var.f455031x;
            rVar.f98883i = eh4Var.f455019i;
            rVar.f98888q = eh4Var.f455029v;
            rVar.f98881g = eh4Var.f455017g;
            rVar.f98882h = eh4Var.f455018h;
            rVar.f98887p = eh4Var.f455028u;
            java.lang.String str = eh4Var.f455024q;
            rVar.f98885n = str;
            rVar.f98886o = str;
            rVar.P = eh4Var.f455016f;
            java.lang.String str2 = eh4Var.f455021n;
            if (str2 == null) {
                str2 = "";
            }
            rVar.f98884m = str2;
            java.lang.String str3 = eh4Var.f455022o;
            if (str3 == null) {
                str3 = "";
            }
            rVar.f98895x = str3;
            rVar.T = true;
            return rVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShakeMusicLogic", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
            return null;
        }
    }

    public static b21.r b(byte[] bArr, long j17) {
        if (bArr != null && bArr.length > 0) {
            try {
                r45.t36 t36Var = (r45.t36) new r45.t36().mo11468x92b714fd(bArr);
                b21.r rVar = new b21.r();
                rVar.f98878d = 4;
                rVar.f98879e = java.lang.String.valueOf(t36Var.f467632e);
                rVar.f98880f = t36Var.f467633f;
                rVar.f98883i = x51.j1.f(t36Var.f467636i);
                java.lang.String f17 = x51.j1.f(t36Var.f467637m);
                rVar.f98884m = f17;
                rVar.f98889r = i34.d.b(f17);
                rVar.f98888q = x51.j1.f(t36Var.f467641q);
                rVar.f98881g = x51.j1.f(t36Var.f467634g);
                rVar.f98882h = x51.j1.f(t36Var.f467635h);
                rVar.f98887p = x51.j1.f(t36Var.f467640p);
                rVar.f98885n = x51.j1.f(t36Var.f467638n);
                rVar.f98886o = x51.j1.f(t36Var.f467639o);
                return rVar;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShakeMusicLogic", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
            }
        }
        return null;
    }

    public static java.lang.String c() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMusicLogic", "getSaveDirPath: acc stg has not set uin");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("shakemusic/");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(sb6.toString());
        if (!r6Var.m() || !r6Var.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMusicLogic", "storage dir[%s] not perpare, try to create it", r6Var.o());
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, ".nomedia");
        if (!r6Var2.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMusicLogic", "no media file[%s] not exists, try to create it", r6Var.o());
            try {
                r6Var2.k();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShakeMusicLogic", e17, "", new java.lang.Object[0]);
            }
        }
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMusicLogic", "create storage dir fail");
            return null;
        }
        return r6Var.o() + "/";
    }
}
