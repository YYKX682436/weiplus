package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public abstract class z9 extends android.widget.BaseAdapter implements l75.q0, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f294140d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f294141e;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.y9 f294144h;

    /* renamed from: f, reason: collision with root package name */
    public android.database.Cursor f294142f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f294143g = null;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f294146m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f294147n = new com.p314xaae8f345.mm.ui.x9(this);

    /* renamed from: i, reason: collision with root package name */
    public int f294145i = -1;

    public z9(android.content.Context context, java.lang.Object obj) {
        this.f294140d = obj;
        this.f294141e = context;
    }

    public void c() {
        java.util.Map map = this.f294143g;
        if (map != null) {
            map.clear();
        }
        android.database.Cursor cursor = this.f294142f;
        if (cursor != null) {
            cursor.close();
        }
        this.f294145i = -1;
    }

    public abstract java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor);

    public final void f() {
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.a(this);
        }
        c();
        q();
        com.p314xaae8f345.mm.ui.y9 y9Var2 = this.f294144h;
        if (y9Var2 != null) {
            y9Var2.b(this);
        }
    }

    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        mo735xb0dfc7d8((java.lang.String) obj, null);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f294145i < 0) {
            this.f294145i = j().getCount();
        }
        return this.f294145i + m();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (p(i17)) {
            return n();
        }
        java.util.Map map = this.f294143g;
        if (map != null) {
            java.lang.Object obj = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (obj != null) {
                return obj;
            }
        }
        if (i17 < 0 || !j().moveToPosition(i17)) {
            return null;
        }
        if (this.f294143g == null) {
            return d(this.f294140d, j());
        }
        java.lang.Object d17 = d(null, j());
        ((java.util.HashMap) this.f294143g).put(java.lang.Integer.valueOf(i17), d17);
        return d17;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    public void h(java.lang.Object obj) {
        notifyDataSetChanged();
    }

    public android.database.Cursor j() {
        android.database.Cursor cursor = this.f294142f;
        if (cursor == null || cursor.isClosed()) {
            o();
            iz5.a.d(null, this.f294142f);
        }
        return this.f294142f;
    }

    public java.lang.Object k(int i17, java.lang.Object obj) {
        if (p(i17)) {
            return n();
        }
        if (i17 < 0 || !j().moveToPosition(i17)) {
            return null;
        }
        return d(obj, j());
    }

    public int l() {
        if (this.f294145i < 0) {
            this.f294145i = j().getCount();
        }
        return this.f294145i;
    }

    public int m() {
        return 0;
    }

    public java.lang.Object n() {
        return this.f294140d;
    }

    public abstract void o();

    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        f();
    }

    public boolean p(int i17) {
        int i18 = this.f294145i;
        return i17 >= i18 && i17 < i18 + m();
    }

    public abstract void q();

    public void r(boolean z17) {
        if (z17) {
            if (this.f294143g == null) {
                this.f294143g = new java.util.HashMap();
            }
        } else {
            java.util.Map map = this.f294143g;
            if (map != null) {
                map.clear();
                this.f294143g = null;
            }
        }
    }

    public void s(android.database.Cursor cursor) {
        this.f294142f = cursor;
        this.f294145i = -1;
    }
}
