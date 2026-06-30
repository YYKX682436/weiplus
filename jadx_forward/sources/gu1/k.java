package gu1;

/* loaded from: classes15.dex */
public class k extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f357425o;

    /* renamed from: p, reason: collision with root package name */
    public tt1.k f357426p;

    /* renamed from: q, reason: collision with root package name */
    public int f357427q;

    /* renamed from: r, reason: collision with root package name */
    public long f357428r;

    /* renamed from: s, reason: collision with root package name */
    public long f357429s;

    public k(android.content.Context context) {
        super(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd());
        this.f357425o = 0;
        this.f357427q = -1;
        this.f357428r = 0L;
        this.f357429s = 0L;
        r(true);
        this.f357426p = new gu1.u(context, this);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd c13039x2a59e0bd = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) obj;
        if (c13039x2a59e0bd == null) {
            c13039x2a59e0bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd();
        }
        if (cursor.isClosed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardAdatper", "cursor is closed!");
        } else {
            c13039x2a59e0bd.mo9015xbf5d97fd(cursor);
        }
        return c13039x2a59e0bd;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f357426p.a(i17, view, viewGroup, (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) getItem(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        java.lang.String str;
        android.database.Cursor B;
        this.f357428r = java.lang.System.currentTimeMillis();
        if (this.f357427q == -1) {
            fu1.i nj6 = xt1.t0.nj();
            nj6.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ShareCardInfo");
            sb6.append(" where (status=0 OR status=5)");
            sb6.append(" order by status asc , share_time desc");
            B = nj6.f348378d.B(sb6.toString(), null);
        } else {
            fu1.i nj7 = xt1.t0.nj();
            int i17 = this.f357427q;
            nj7.getClass();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" where ( status=0) ");
            if (i17 == 1) {
                sb7.append(" AND  (");
                sb7.append(nj7.z0(1));
                sb7.append(" categoryType= '10' ) ");
            } else if (i17 == 2) {
                sb7.append(" AND ( (");
                sb7.append(nj7.z0(1));
                sb7.append(" categoryType= '10' )  OR (");
                sb7.append(nj7.z0(2));
                sb7.append(" categoryType= '0' )  )");
            } else if (i17 != 3) {
                if (i17 == 4) {
                    sb7.append(" AND 1 != 1 ");
                }
                str = "";
                B = nj7.f348378d.B("select * from ShareCardInfo" + sb7.toString() + str, null);
            } else {
                sb7.append(" AND  (");
                sb7.append(nj7.z0(2));
                sb7.append(" categoryType= '0' ) ");
            }
            str = " order by categoryType desc , itemIndex asc";
            B = nj7.f348378d.B("select * from ShareCardInfo" + sb7.toString() + str, null);
        }
        if (B != null) {
            this.f357425o = B.getCount();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardAdatper", "resetCursor showType %s, card count:%s", java.lang.Integer.valueOf(this.f357427q), java.lang.Integer.valueOf(this.f357425o));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardAdatper", "resetCursor cursor is null, showType %s", java.lang.Integer.valueOf(this.f357427q));
        }
        s(B);
        this.f357429s = java.lang.System.currentTimeMillis();
        notifyDataSetChanged();
    }
}
