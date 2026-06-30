package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class l8 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f288542n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f288543o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.SparseArray f288544p;

    /* renamed from: q, reason: collision with root package name */
    public android.database.Cursor f288545q;

    public l8(java.lang.String str, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, com.p314xaae8f345.mm.ui.p2690x38b72420.k8 k8Var) {
        super((com.p314xaae8f345.mm.ui.p2690x38b72420.l4) abstractActivityC22312xbd689c47, list, false, z17, false);
        this.f288543o = null;
        this.f288544p = null;
        this.f288542n = str;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f288545q.getCount() + this.f288543o.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (this.f288544p.indexOfKey(i17) >= 0) {
            java.lang.String str = (java.lang.String) this.f288544p.get(i17);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = str;
            return n0Var;
        }
        int i18 = 0;
        int i19 = i17;
        while (i18 <= this.f288544p.size()) {
            if (this.f288544p.indexOfKey(i19) >= 0) {
                i18++;
            }
            i19--;
            if (i19 < 0) {
                break;
            }
        }
        int i27 = i17 - i18;
        if (!this.f288545q.moveToPosition(i27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMSelectContactAdapter", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f288545q);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
        uVar.f(z3Var);
        uVar.f288369e = this.f288611f;
        uVar.f288372h = this.f288612g;
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMSelectContactAdapter", "finish!");
        android.database.Cursor cursor = this.f288545q;
        if (cursor != null) {
            cursor.close();
            this.f288545q = null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return this.f288544p.indexOfKey(dVar.f288366b + 1) >= 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String str) {
        if (str.equals("↑")) {
            return 0;
        }
        java.util.HashMap hashMap = this.f288543o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) this.f288543o.get(str)).intValue() + this.f288609d.O3().getHeaderViewsCount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r1.moveToNext() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        r1.close();
        r1 = c01.d9.b().q();
        r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        r6 = r13.f288121m;
        r0.add(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) r1).R(r6, r4, r2));
        r1 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).f276604d.f("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId  and OpenIMWordingInfo.language='zh_CN'  where (type & 1!=0) and type & 32=0   and type & 8=0 and username like '%@openim' and username != 'appbrandcustomerservicemsg' and username != 'notifymessage' and username != 'weibo' and username != 'pc_share' and username != 'officialaccounts' and username != 'voicevoipapp' and username != 'cardpackage' and username != 'qqfriend' and username != 'helper_entry' and username != 'medianote' and username != 'shakeapp' and username != 'topstoryapp' and username != 'qmessage' and username != 'voipapp' and username != 'qqsync' and username != 'qqmail' and username != 'blogapp' and username != 'lbsapp' and username != 'readerapp' and username != 'feedsapp' and username != 'newsapp' and username != 'floatbottle' and username != 'fmessage' and username != 'tmessage' and username != 'weixin' and username != 'facebookapp' and username != 'meishiapp' and username != 'masssendapp' and username != 'voiceinputapp' and username != 'filehelper' and username != 'linkedinplugin' group by rcontact.openImAppid", null, 4);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (r1.moveToFirst() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        r9 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        r9.mo9015xbf5d97fd(r1);
        r4.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        if (r1.moveToNext() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        r1.close();
        r1 = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q();
        r1 = r1.f276604d.f((r1.g("select count(*)  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", r6, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), r2) + "group by OpenIMWordingInfo.wording ") + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ", null, 4);
        r10 = new int[r1.getCount()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:
    
        if (r1.moveToFirst() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f9, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fa, code lost:
    
        r10[r11] = r1.getInt(0);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if (r1.moveToNext() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        r1.close();
        r1 = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q();
        r1 = r1.f276604d.f((r1.g("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", r6, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), r2) + "group by OpenIMWordingInfo.wording ") + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ", null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0149, code lost:
    
        if (r1.moveToFirst() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x014b, code lost:
    
        r2 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014d, code lost:
    
        r6 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        r6.mo9015xbf5d97fd(r1);
        r6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(r3, r6.G0());
        r13.f288543o.put(r6, java.lang.Integer.valueOf(r2));
        r13.f288544p.put(r2, r6);
        r2 = (r2 + 1) + r10[r4];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0180, code lost:
    
        if (r1.moveToNext() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0182, code lost:
    
        r1.close();
        r13.f288543o.toString();
        r13.f288545q = new android.database.MergeCursor((android.database.Cursor[]) r0.toArray(new android.database.Cursor[0]));
        notifyDataSetChanged();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x019c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r1.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        r4 = r1.getString(0);
     */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.l8.s():void");
    }
}
