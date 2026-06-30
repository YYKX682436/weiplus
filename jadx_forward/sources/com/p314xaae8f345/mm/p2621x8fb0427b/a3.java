package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class a3 extends dm.x1 {

    /* renamed from: e2, reason: collision with root package name */
    public static final l75.e0 f275275e2 = dm.x1.m125677x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.a3.class);

    /* renamed from: a2, reason: collision with root package name */
    public final mo.a f275276a2;

    /* renamed from: b2, reason: collision with root package name */
    public mo.a f275277b2;

    /* renamed from: c2, reason: collision with root package name */
    public java.util.List f275278c2;

    /* renamed from: d2, reason: collision with root package name */
    public final java.util.Map f275279d2;

    public a3() {
        mo.a aVar = new mo.a();
        this.f275276a2 = aVar;
        this.f275277b2 = aVar;
        this.f275278c2 = new java.util.LinkedList();
        this.f275279d2 = new java.util.concurrent.ConcurrentHashMap();
    }

    public static int T0(java.lang.String str) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        } catch (java.lang.Exception unused) {
            if (str == null) {
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMember", "parserInt error ".concat(str));
            return 0;
        }
    }

    public static java.util.List a1(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return linkedList;
        }
        for (java.lang.String str2 : str.split(";")) {
            linkedList.add(str2);
        }
        return linkedList;
    }

    public java.util.List A0() {
        java.util.List list = this.f275278c2;
        if (list == null || list.size() == 0) {
            this.f275278c2 = a1(this.f69099x6941929d);
        }
        return this.f275278c2;
    }

    public int D0() {
        if (I0(this.f275277b2)) {
            t0();
        }
        return this.f275277b2.f411778m;
    }

    public mo.a F0() {
        if (I0(this.f275277b2)) {
            t0();
        }
        return this.f275277b2;
    }

    public boolean G0(java.lang.String str) {
        mo.b v07 = v0(str);
        return (v07 == null || (v07.f411782f & 2048) == 0) ? false : true;
    }

    public final boolean I0(mo.a aVar) {
        return this.f275276a2.mo75928xcd1e8d8() == aVar.mo75928xcd1e8d8();
    }

    public boolean J0() {
        int i17 = this.f69102x22419ccf;
        return i17 == 3 || i17 == 4;
    }

    public boolean L0(java.lang.String str) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f69107x5be1edb3) && this.f69107x5be1edb3.equals(str);
    }

    public boolean P0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f69107x5be1edb3)) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        if (((rv1.f) gm0.j1.s(rv1.f.class)) != null) {
            return (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).b(this.f69088x37548063) && G0(r17)) || this.f69107x5be1edb3.equals(r17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMember", "service is null");
        return false;
    }

    public boolean Q0() {
        if (I0(this.f275277b2)) {
            t0();
        }
        mo.a aVar = this.f275277b2;
        return aVar.f411778m < aVar.f411779n;
    }

    public void R0(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.Map map;
        if (I0(this.f275277b2)) {
            t0();
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f275279d2;
            if (!hasNext) {
                break;
            }
            r45.wy wyVar = (r45.wy) it.next();
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(wyVar.f471098d)) {
                mo.b bVar = (mo.b) ((java.util.concurrent.ConcurrentHashMap) map).get(wyVar.f471098d);
                bVar.f411781e = wyVar.f471100f;
                bVar.f411782f = wyVar.f471103i;
                bVar.f411783g = wyVar.f471104m;
            } else if (list2 != null && list2.contains(wyVar.f471098d)) {
                mo.b bVar2 = new mo.b();
                java.lang.String str2 = wyVar.f471098d;
                bVar2.f411780d = str2;
                bVar2.f411783g = wyVar.f471104m;
                bVar2.f411782f = wyVar.f471103i;
                bVar2.f411781e = wyVar.f471100f;
                ((java.util.concurrent.ConcurrentHashMap) map).put(str2, bVar2);
            }
        }
        this.f275277b2.f411772d.clear();
        for (java.lang.String str3 : ((java.util.concurrent.ConcurrentHashMap) map).keySet()) {
            if (list2 == null || list2.contains(str3)) {
                mo.b bVar3 = (mo.b) ((java.util.concurrent.ConcurrentHashMap) map).get(str3);
                if (list3 != null) {
                    if (list3.contains(str3)) {
                        bVar3.f411782f |= 2048;
                    } else {
                        bVar3.f411782f &= -2049;
                    }
                }
                this.f275277b2.f411772d.add(bVar3);
            }
        }
        Z0(str, this.f275277b2, false);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 U0(java.util.List list) {
        java.lang.String str = "";
        if (list != null && list.size() != 0) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                str = str + ((java.lang.String) list.get(i17));
                if (i17 < list.size() - 1) {
                    str = str + ";";
                }
            }
        }
        this.f69099x6941929d = str;
        return this;
    }

    public void W0(int i17) {
        if (I0(this.f275277b2)) {
            t0();
        }
        mo.a aVar = this.f275277b2;
        aVar.f411778m = i17;
        try {
            this.f69105x137594aa = aVar.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMember", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 Y0(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        mo.a aVar = new mo.a();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            int indexOf = str2.indexOf(60);
            if (indexOf > 0) {
                str2 = str2.substring(indexOf);
            }
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "RoomData", null);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMember", "parse RoomData failed");
                aVar = null;
            } else {
                int i17 = 0;
                while (true) {
                    try {
                        mo.b bVar = new mo.b();
                        if (i17 == 0) {
                            str3 = ".RoomData.Member.$UserName";
                            str4 = ".RoomData.Member.DisplayName";
                            str5 = ".RoomData.Member.Flag";
                        } else if (i17 != 0) {
                            str3 = ".RoomData.Member" + i17 + ".$UserName";
                            str4 = ".RoomData.Member" + i17 + ".DisplayName";
                            str5 = ".RoomData.Member" + i17 + ".Flag";
                        } else {
                            str3 = null;
                            str4 = null;
                            str5 = null;
                        }
                        java.lang.String str7 = (java.lang.String) d17.get(str3);
                        str6 = "";
                        if (str7 == null) {
                            str7 = "";
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                            break;
                        }
                        bVar.f411780d = str7;
                        java.lang.String str8 = (java.lang.String) d17.get(str4);
                        if (str8 != null) {
                            str6 = str8;
                        }
                        bVar.f411781e = str6;
                        bVar.f411782f = T0((java.lang.String) d17.get(str5));
                        aVar.f411772d.add(bVar);
                        i17++;
                    } catch (java.lang.Exception unused) {
                    }
                }
                aVar.f411774f = T0((java.lang.String) d17.get(".RoomData.Type"));
                aVar.f411775g = T0((java.lang.String) d17.get(".RoomData.Status"));
                aVar.f411776h = T0((java.lang.String) d17.get(".RoomData.MaxCount"));
                java.lang.String str9 = (java.lang.String) d17.get(".RoomData.ExtInfo.Upgrader");
                if (str9 != null) {
                    str6 = str9;
                }
                aVar.f411777i = str6;
            }
        }
        Z0(str, aVar, false);
        return this;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 Z0(java.lang.String str, mo.a aVar, boolean z17) {
        int i17;
        this.f69100x16a12ec = java.lang.System.currentTimeMillis();
        if (!z17) {
            java.util.Iterator it = aVar.f411772d.iterator();
            mo.b bVar = null;
            while (it.hasNext()) {
                mo.b bVar2 = (mo.b) it.next();
                java.lang.String str2 = bVar2.f411780d;
                if (str2 != null && str2.equals(str)) {
                    bVar = bVar2;
                }
            }
            if (bVar != null) {
                this.f69109x43482a3c = bVar.f411781e;
                i17 = bVar.f411782f;
                this.f69096x75b86ab7 = i17 & 1;
            } else {
                i17 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomMember", "displayName[%s] roomFlag[%d] flag[%d]", this.f69109x43482a3c, java.lang.Integer.valueOf(this.f69086x7ba563ee), java.lang.Integer.valueOf(i17));
            int i18 = (i17 & 2) | (aVar.f411773e & (-3));
            aVar.f411773e = i18;
            this.f69086x7ba563ee = i18;
        }
        try {
            this.f69105x137594aa = aVar.mo14344x5f01b1f6();
            this.f275277b2 = aVar;
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMember", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        u0(aVar);
        return this;
    }

    @Override // dm.x1, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
    }

    @Override // dm.x1, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f275275e2;
    }

    public final void t0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f69105x137594aa)) {
            return;
        }
        try {
            this.f275277b2 = (mo.a) new mo.a().mo11468x92b714fd(this.f69105x137594aa);
        } catch (java.lang.Exception unused) {
            this.f275277b2 = new mo.a();
        }
        u0(this.f275277b2);
    }

    public final void u0(mo.a aVar) {
        java.lang.String str;
        if (this.f69105x137594aa == null) {
            aVar = new mo.a();
        }
        java.util.Iterator it = aVar.f411772d.iterator();
        while (it.hasNext()) {
            mo.b bVar = (mo.b) it.next();
            if (bVar != null && (str = bVar.f411780d) != null) {
                ((java.util.concurrent.ConcurrentHashMap) this.f275279d2).put(str, bVar);
            }
        }
    }

    public mo.b v0(java.lang.String str) {
        java.util.Map map = this.f275279d2;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMember", "getChatroomData hashMap is null!");
            return null;
        }
        if (((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
            t0();
        }
        return (mo.b) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
    }

    public int w0() {
        if (I0(this.f275277b2)) {
            t0();
        }
        return this.f275277b2.f411776h;
    }

    public int y0() {
        if (I0(this.f275277b2)) {
            t0();
        }
        return this.f275277b2.f411774f;
    }

    public java.lang.String z0(java.lang.String str) {
        mo.b v07 = v0(str);
        if (v07 == null) {
            return "";
        }
        java.lang.String str2 = v07.f411781e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }
}
