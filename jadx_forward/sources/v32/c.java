package v32;

/* loaded from: classes13.dex */
public class c extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f514625e = {l75.n0.m145250x3fdc6f77(v32.b.f514624x1, "HardDeviceInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f514626d;

    public c(l75.k0 k0Var) {
        super(k0Var, v32.b.f514624x1, "HardDeviceInfo", null);
        this.f514626d = k0Var;
        k0Var.A("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceUsernameIndex ON HardDeviceInfo ( brandName )");
        k0Var.A("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceMacIndex ON HardDeviceInfo ( mac )");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r2 = new v32.b();
        r2.mo9015xbf5d97fd(r1);
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r1.moveToNext() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList D0() {
        /*
            r3 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "select * from HardDeviceInfo where mac > 0 and connProto like '3'"
            android.database.Cursor r1 = r3.m145256x1d3f4980(r2, r1)
            if (r1 != 0) goto L19
            java.lang.String r1 = "MicroMsg.exdevice.HardDeviceInfoStorage"
            java.lang.String r2 = "get cursor is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)
            return r0
        L19:
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L30
        L1f:
            v32.b r2 = new v32.b
            r2.<init>()
            r2.mo9015xbf5d97fd(r1)
            r0.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L1f
        L30:
            r1.close()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v32.c.D0():java.util.LinkedList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r11.moveToFirst() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1 = new v32.b();
        r1.mo9015xbf5d97fd(r11);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r11.moveToNext() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList J0(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            if (r0 == 0) goto Lf
            java.lang.String r11 = "MicroMsg.exdevice.HardDeviceInfoStorage"
            java.lang.String r0 = "The given brandName is null or nil."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r11, r0)
            r11 = 0
            return r11
        Lf:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            l75.k0 r1 = r10.f514626d
            java.lang.String r2 = "HardDeviceInfo"
            r3 = 0
            java.lang.String r4 = "brandName=?"
            java.lang.String[] r5 = new java.lang.String[]{r11}
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 2
            android.database.Cursor r11 = r1.D(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L2a
            return r0
        L2a:
            boolean r1 = r11.moveToFirst()
            if (r1 == 0) goto L41
        L30:
            v32.b r1 = new v32.b
            r1.<init>()
            r1.mo9015xbf5d97fd(r11)
            r0.add(r1)
            boolean r1 = r11.moveToNext()
            if (r1 != 0) goto L30
        L41:
            r11.close()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v32.c.J0(java.lang.String):java.util.LinkedList");
    }

    public v32.b L0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.HardDeviceInfoStorage", "deviceType(%s) or deviceId(%s) is null or nil.", str2, str);
            return null;
        }
        android.database.Cursor D = this.f514626d.D("HardDeviceInfo", null, "deviceType=? and deviceID=?", new java.lang.String[]{str2, str}, null, null, null, 2);
        if (D == null) {
            return null;
        }
        if (!D.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceType:%s and deviceId:%s", str2, str);
            D.close();
            return null;
        }
        v32.b bVar = new v32.b();
        bVar.mo9015xbf5d97fd(D);
        D.close();
        return bVar;
    }

    public v32.b P0(java.lang.String str) {
        android.database.Cursor D;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (D = this.f514626d.D("HardDeviceInfo", null, "deviceID=?", new java.lang.String[]{str}, null, null, null, 2)) == null) {
            return null;
        }
        if (D.moveToFirst()) {
            v32.b bVar = new v32.b();
            bVar.mo9015xbf5d97fd(D);
            D.close();
            return bVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceId:" + str);
        D.close();
        return null;
    }

    public v32.b W0(long j17) {
        android.database.Cursor E = this.f514626d.E("HardDeviceInfo", null, "mac=?", new java.lang.String[]{j17 + ""}, null, null, null);
        v32.b bVar = null;
        if (E == null) {
            return null;
        }
        if (E.moveToFirst()) {
            bVar = new v32.b();
            bVar.mo9015xbf5d97fd(E);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + j17);
        }
        E.close();
        return bVar;
    }

    public v32.b b1(java.lang.String str) {
        android.database.Cursor D;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (D = this.f514626d.D("HardDeviceInfo", null, "mac=?", new java.lang.String[]{str}, null, null, null, 2)) == null) {
            return null;
        }
        if (D.moveToFirst()) {
            v32.b bVar = new v32.b();
            bVar.mo9015xbf5d97fd(D);
            D.close();
            return bVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + str);
        D.close();
        return null;
    }

    public v32.b d1(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.HardDeviceInfoStorage", "brandName(%s) or deviceId(%s) is null or nil.", str, str2);
            return null;
        }
        android.database.Cursor D = this.f514626d.D("HardDeviceInfo", null, "brandName=? and deviceID=?", new java.lang.String[]{str, str2}, null, null, null, 2);
        if (D == null) {
            return null;
        }
        if (D.moveToFirst()) {
            v32.b bVar = new v32.b();
            bVar.mo9015xbf5d97fd(D);
            D.close();
            return bVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with brandName:" + str);
        D.close();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r5.equals("0") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1.moveToNext() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r2 = new v32.b();
        r2.mo9015xbf5d97fd(r1);
        r3 = r2.C;
        r4 = r2.f318640z;
        r5 = r2.D;
        r6 = r2.f66602x6bae49ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r5.equals("1") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List f1() {
        /*
            r8 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.database.Cursor r1 = r8.mo78085xb5882a6b()
            if (r1 == 0) goto L52
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L52
        L11:
            v32.b r2 = new v32.b
            r2.<init>()
            r2.mo9015xbf5d97fd(r1)
            java.lang.String r3 = r2.C
            java.lang.String r4 = r2.f318640z
            java.lang.String r5 = r2.D
            java.lang.String r6 = r2.f66602x6bae49ad
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r7 != 0) goto L4c
            java.lang.String r7 = "1"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L4c
            java.lang.String r7 = "0"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L4c
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r5 != 0) goto L4c
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 != 0) goto L4c
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r3 != 0) goto L4c
            r0.add(r2)
        L4c:
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L11
        L52:
            if (r1 == 0) goto L57
            r1.close()
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v32.c.f1():java.util.List");
    }

    public int i1(v32.b bVar) {
        int i17 = 0;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.HardDeviceInfoStorage", "harddevice is null.");
            return 0;
        }
        android.content.ContentValues mo9763xeb27878e = bVar.mo9763xeb27878e();
        if (mo9763xeb27878e.size() > 0) {
            i17 = this.f514626d.p("HardDeviceInfo", mo9763xeb27878e, "deviceID = ? and deviceType = ? ", new java.lang.String[]{bVar.f66606x5fdff396, bVar.f66607xe7b73b15});
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.HardDeviceInfoStorage", "update: deviceId = %s, deviceType = %s, ret = %s ", bVar.f66606x5fdff396, bVar.f66607xe7b73b15, java.lang.Integer.valueOf(i17));
        return i17;
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        v32.b bVar = (v32.b) f0Var;
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f66602x6bae49ad) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f66606x5fdff396)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.HardDeviceInfoStorage", "wrong argument");
        } else {
            r0 = this.f514626d.m("HardDeviceInfo", v32.b.f514624x1.f398486b, bVar.mo9763xeb27878e()) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.HardDeviceInfoStorage", "replace: brandName=%s, deviceId=%s, ret=%s ", bVar.f66602x6bae49ad, bVar.f66606x5fdff396, java.lang.Boolean.valueOf(r0));
        }
        return r0;
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (this.f514626d.mo70514xb06685ab("HardDeviceInfo", "deviceID=? and deviceType=? ", new java.lang.String[]{str, str2}) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo fail, deviceId = %s", str);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo ok, deviceId = %s", str);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (r5 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r3.contains("wxmsg_music") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r3.contains("wxmsg_poi") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r3.contains("wxmsg_image") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r3.contains("wxmsg_file") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r3.contains("wxmsg_video") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r3.contains("wxmsg_url") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r1.moveToNext() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r2 = new v32.b();
        r2.mo9015xbf5d97fd(r1);
        r3 = r2.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.HardDeviceInfoStorage", "Ability is null or nil.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List z0() {
        /*
            r6 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.database.Cursor r1 = r6.mo78085xb5882a6b()
            if (r1 == 0) goto L6e
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L6e
        L11:
            v32.b r2 = new v32.b
            r2.<init>()
            r2.mo9015xbf5d97fd(r1)
            java.lang.String r3 = r2.H
            if (r3 == 0) goto L68
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            r5 = 0
            if (r4 == 0) goto L2c
            java.lang.String r3 = "MicroMsg.exdevice.HardDeviceInfoStorage"
            java.lang.String r4 = "Ability is null or nil."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4)
            goto L63
        L2c:
            java.lang.String r4 = "wxmsg_music"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L62
            java.lang.String r4 = "wxmsg_poi"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L62
            java.lang.String r4 = "wxmsg_image"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L62
            java.lang.String r4 = "wxmsg_file"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L62
            java.lang.String r4 = "wxmsg_video"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L62
            java.lang.String r4 = "wxmsg_url"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L63
        L62:
            r5 = 1
        L63:
            if (r5 == 0) goto L68
            r0.add(r2)
        L68:
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L11
        L6e:
            if (r1 == 0) goto L73
            r1.close()
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v32.c.z0():java.util.List");
    }
}
