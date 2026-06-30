package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class q7 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public boolean f289554o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 f289555p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 f289556q;

    /* renamed from: r, reason: collision with root package name */
    public final hb5.m f289557r;

    /* renamed from: s, reason: collision with root package name */
    public final android.database.DataSetObserver f289558s;

    public q7(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7());
        this.f289554o = false;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m7 m7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m7(this);
        this.f289558s = m7Var;
        r(false);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4(context, str, y9Var);
        this.f289556q = b4Var;
        b4Var.registerDataSetObserver(m7Var);
        java.lang.String d17 = r01.q3.cj().d1(str);
        hb5.m mVar = new hb5.m(context, y9Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? str : d17);
        this.f289557r = mVar;
        mVar.registerDataSetObserver(m7Var);
        r01.q3.aj().add(mVar);
        r01.q3.aj().f483405e.a(mVar, mVar.f361754o.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.b bVar;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7) obj;
        if (p7Var == null) {
            p7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7();
        }
        p7Var.f289497b = this.f289555p.f().getPosition();
        try {
            p7Var.f289498c = null;
            hb5.m mVar = this.f289557r;
            bVar = p7Var.f289499d;
            if (bVar == null) {
                mVar.getClass();
                bVar = new s01.b();
                mVar.C = bVar.f69064xa6206081;
            }
            bVar.f69064xa6206081 = mVar.C;
            bVar.mo9015xbf5d97fd(cursor);
            p7Var.f289499d = bVar;
        } catch (java.lang.Throwable unused) {
            p7Var.f289499d = null;
        }
        if (bVar.f69064xa6206081 > 0) {
            p7Var.f289496a = 0;
            return p7Var;
        }
        p7Var.f289499d = null;
        try {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var = this.f289556q;
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = p7Var.f289498c;
            b4Var.getClass();
            if (l4Var == null) {
                l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            }
            l4Var.o1("");
            l4Var.p1("");
            l4Var.mo9015xbf5d97fd(cursor);
            p7Var.f289498c = l4Var;
            p7Var.f289496a = 1;
        } catch (java.lang.Throwable unused2) {
            p7Var.f289498c = null;
        }
        return p7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = this.f289555p;
        return y7Var != null ? y7Var.getCount() : super.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 item = getItem(i17);
        if (item == null) {
            return 0;
        }
        return item.f289496a;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 item = getItem(i17);
        int i18 = item.f289496a;
        int i19 = 1;
        while (i18 != 1) {
            try {
                if (i18 == 0) {
                    return this.f289557r.getView(item.f289497b, view, viewGroup);
                }
            } catch (java.lang.ClassCastException unused) {
                if (view != null) {
                    view = null;
                }
            }
            int i27 = i19 - 1;
            if (i19 <= 0) {
                return null;
            }
            i19 = i27;
        }
        return this.f289556q.getView(item.f289497b, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        if (this.f289554o) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x7.ASC, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s7());
            this.f289555p = y7Var;
            s(y7Var);
        } else {
            this.f289554o = true;
            q();
            this.f289554o = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        this.f289556q.q();
        this.f289557r.q();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x7.DESC, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n7(this), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o7(this));
        this.f289555p = y7Var;
        s(y7Var);
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 getItem(int i17) {
        hb5.m mVar = this.f289557r;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var = this.f289556q;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7) super.getItem(i17);
        if (p7Var != null) {
            return p7Var;
        }
        try {
            int count = b4Var.getCount();
            int count2 = mVar.getCount();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var = this.f289555p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MergeBizChatConversationAdapter", "getItem NULL, position=%d, size=%d, cursor.size=[%d, %d], window=[%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(count2), java.lang.Integer.valueOf(this.f289555p.f289803m), java.lang.Integer.valueOf(y7Var.f289803m + y7Var.f289804n.size()));
            if (count > 0 && i17 < count) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var2 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7();
                try {
                    p7Var2.f289496a = 1;
                    int max = java.lang.Math.max(0, i17);
                    p7Var2.f289497b = max;
                    p7Var2.f289498c = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) b4Var.getItem(max);
                    p7Var = p7Var2;
                } catch (java.lang.Throwable unused) {
                    return p7Var2;
                }
            }
            int i18 = i17 - count;
            if (p7Var != null || count2 <= 0 || i18 >= count2) {
                return p7Var;
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var3 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7();
            try {
                p7Var3.f289496a = 0;
                int max2 = java.lang.Math.max(0, i18);
                p7Var3.f289497b = max2;
                p7Var3.f289499d = (s01.b) mVar.getItem(max2);
            } catch (java.lang.Throwable unused2) {
            }
            return p7Var3;
        } catch (java.lang.Throwable unused3) {
            return p7Var;
        }
    }
}
