package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public long f231051b;

    /* renamed from: c, reason: collision with root package name */
    public long f231052c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f231053d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f231054e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f231055f;

    /* renamed from: g, reason: collision with root package name */
    public long f231056g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f231057h;

    /* renamed from: l, reason: collision with root package name */
    public wu5.c f231061l;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f231058i = new java.util.ArrayList(10);

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f231059j = new java.util.ArrayList(10);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f231060k = new java.util.ArrayList(2);

    /* renamed from: m, reason: collision with root package name */
    public final wu5.j f231062m = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a0(this);

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f231050a = new java.util.ArrayList(10);

    public synchronized java.util.ArrayList a() {
        return (java.util.ArrayList) this.f231050a.clone();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w b(java.lang.String str) {
        java.util.ArrayList arrayList = this.f231050a;
        if (arrayList == null || str == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it.next();
            if (wVar != null && wVar.f231375c.equals(str)) {
                return wVar;
            }
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x c(java.lang.String str) {
        java.util.ArrayList arrayList = this.f231058i;
        if (arrayList == null || str == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x) it.next();
            if (xVar != null && xVar.f231384a.equals(str)) {
                return xVar;
            }
        }
        return null;
    }

    public java.lang.String d(int i17) {
        java.util.ArrayList arrayList = this.f231050a;
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it.next();
            if (wVar != null && i17 == wVar.f231373a) {
                return wVar.f231375c;
            }
        }
        return null;
    }

    public void e() {
        this.f231059j.clear();
        this.f231050a.clear();
        this.f231060k.clear();
        this.f231058i.clear();
        this.f231051b = 0L;
        this.f231052c = 0L;
        this.f231053d = null;
        this.f231054e = null;
        this.f231055f = null;
        synchronized (this.f231060k) {
            this.f231060k.clear();
        }
        wu5.c cVar = this.f231061l;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    public void f(java.lang.String str, java.lang.String str2, int i17) {
        java.util.ArrayList arrayList;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || (arrayList = this.f231058i) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x) it.next();
            if (xVar != null && xVar.f231385b.equals(str)) {
                if (!xVar.f231384a.equals(str2) && xVar.f231386c <= i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkMemberMgr", "add member cache, username:%s, openid old %s new %s", str, xVar.f231384a, str2);
                    xVar.f231384a = str2;
                }
                int i18 = xVar.f231386c;
                if (i18 < i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkMemberMgr", "member cache, username:%s, reliable old %d new %d", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                    xVar.f231386c = i17;
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x xVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x();
        xVar2.f231385b = str;
        xVar2.f231384a = str2;
        xVar2.f231386c = i17;
        arrayList.add(xVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkMemberMgr", "add member cache, username:%s, openid %s, reliable %d", str, str2, java.lang.Integer.valueOf(i17));
    }

    public void g(int i17, int i18) {
        java.util.ArrayList arrayList = this.f231050a;
        if (arrayList == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it.next();
            if (wVar != null && wVar.f231373a == i17) {
                wVar.f231378f = i18;
            }
        }
    }
}
