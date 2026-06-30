package s32;

/* loaded from: classes12.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f483991e = {l75.n0.m145250x3fdc6f77(r32.c.f450494v, "HardDeviceRankFollowInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f483992d;

    public a(l75.k0 k0Var) {
        super(k0Var, r32.c.f450494v, "HardDeviceRankFollowInfo", null);
        this.f483992d = k0Var;
        k0Var.A("HardDeviceRankFollowInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankFollowRankIdAppNameIndex ON HardDeviceRankFollowInfo ( rankID, appusername )");
    }

    public r32.c D0(q32.b bVar) {
        r32.c cVar = null;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: param error");
            return null;
        }
        java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? and %s = ? and %s = ? limit 1", "HardDeviceRankFollowInfo", "rankID", dm.i4.f66875xa013b0d5, "appusername");
        java.lang.String[] strArr = new java.lang.String[3];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = bVar.f441459a;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        java.lang.String str2 = bVar.f441461c;
        if (str2 == null) {
            str2 = "";
        }
        strArr[1] = str2;
        java.lang.String str3 = bVar.f441460b;
        strArr[2] = str3 != null ? str3 : "";
        android.database.Cursor f17 = this.f483992d.f(format, strArr, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get no follow in DB");
            return null;
        }
        if (f17.moveToFirst()) {
            cVar = new r32.c();
            cVar.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return cVar;
    }

    public java.util.ArrayList J0() {
        android.database.Cursor f17 = this.f483992d.f(java.lang.String.format("select *, rowid from %s where %s= ? and %s = ? order by rowid asc", "HardDeviceRankFollowInfo", "rankID", "appusername"), new java.lang.String[]{"hardcode_rank_id", "hardcode_app_name"}, 2);
        java.util.ArrayList arrayList = null;
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get follows not in DB");
        } else {
            if (f17.moveToFirst()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                do {
                    r32.c cVar = new r32.c();
                    cVar.mo9015xbf5d97fd(f17);
                    f17.getColumnIndex("rowid");
                    cVar.m161429x9616526c();
                    arrayList2.add(cVar);
                } while (f17.moveToNext());
                arrayList2.size();
                arrayList2.toString();
                arrayList = arrayList2;
            }
            f17.close();
        }
        return arrayList;
    }

    public boolean L0(r32.c cVar) {
        boolean z17 = false;
        iz5.a.g(null, cVar != null);
        r32.c D0 = D0(new q32.b(cVar.f67115xde6292c, cVar.f67114x84a2aa32, cVar.f67118xdec927b));
        if (D0 != null) {
            D0.f67117x2261aaf1 = cVar.f67117x2261aaf1;
            mo9952xce0038c9(D0, "rankID", "appusername", dm.i4.f66875xa013b0d5);
            z17 = true;
        }
        if (z17) {
            return true;
        }
        mo880xb970c2b9(cVar);
        return true;
    }

    public void P0(java.util.List list) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("hardcode_rank_id") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("hardcode_app_name")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: delete follows,params is null");
        } else {
            this.f483992d.mo70514xb06685ab("HardDeviceRankFollowInfo", "rankID=? and appusername=?", new java.lang.String[]{"hardcode_rank_id", "hardcode_app_name"});
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r32.c cVar = (r32.c) it.next();
                cVar.f67115xde6292c = "hardcode_rank_id";
                cVar.f67114x84a2aa32 = "hardcode_app_name";
                L0(cVar);
            }
        }
    }

    public boolean y0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=? and %s=? and %s=? limit 1", "HardDeviceRankFollowInfo", "rankID", "appusername", dm.i4.f66875xa013b0d5);
        java.lang.String[] strArr = new java.lang.String[3];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        strArr[0] = "hardcode_rank_id";
        strArr[1] = "hardcode_app_name";
        if (str == null) {
            str = "";
        }
        strArr[2] = str;
        android.database.Cursor f17 = this.f483992d.f(format, strArr, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: check follow not in DB");
            return false;
        }
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        return moveToFirst;
    }

    public boolean z0(java.lang.String str) {
        r32.c D0 = D0(new q32.b("hardcode_rank_id", "hardcode_app_name", str));
        if (D0 == null) {
            return false;
        }
        mo9951xb06685ab(D0, "rankID", "appusername", dm.i4.f66875xa013b0d5);
        return true;
    }
}
