package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public abstract class a extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f233832d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f233833e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f233834f;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f233837i;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 f233841p;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f233845t;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f233835g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f233836h = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public boolean f233842q = true;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f233843r = "";

    /* renamed from: s, reason: collision with root package name */
    public int f233844s = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f233838m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f233839n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f233840o = new java.util.HashMap();

    public a(android.content.Context context, android.view.View.OnClickListener onClickListener, java.lang.String str, boolean z17) {
        this.f233832d = false;
        this.f233833e = "";
        this.f233837i = null;
        this.f233834f = context;
        this.f233845t = onClickListener;
        this.f233833e = str;
        this.f233832d = z17;
        this.f233837i = new java.util.ArrayList();
    }

    public static java.lang.String f(java.util.List list) {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.du5 du5Var = (r45.du5) list.get(i17);
            if (du5Var != null && (str = du5Var.f454289d) != null && !str.equals("") && !du5Var.f454289d.toLowerCase().equals("null")) {
                stringBuffer.append(du5Var.f454289d);
                if (i17 < list.size() - 1) {
                    stringBuffer.append("·");
                }
            }
        }
        return stringBuffer.toString();
    }

    public void a(dn3.i iVar, int i17) {
        java.util.HashSet hashSet = this.f233836h;
        if (hashSet.contains(iVar.f323540b)) {
            return;
        }
        java.util.ArrayList arrayList = this.f233835g;
        if (i17 <= arrayList.size()) {
            arrayList.add(i17, iVar);
            hashSet.add(iVar.f323540b);
            ((java.util.HashMap) this.f233840o).put(iVar.f323540b, this.f233841p);
        }
    }

    public void c() {
        this.f233835g.clear();
        this.f233836h.clear();
        ((java.util.HashMap) this.f233839n).clear();
        ((java.util.HashMap) this.f233838m).clear();
        ((java.util.HashMap) this.f233840o).clear();
        this.f233844s = 0;
        notifyDataSetChanged();
    }

    public boolean d() {
        java.util.Iterator it = this.f233837i.iterator();
        while (it.hasNext()) {
            if (g((com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935) it.next()) > 0) {
                return true;
            }
        }
        return this.f233842q && g(this.f233841p) > 0;
    }

    public int g(com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc00935) {
        java.util.Map map = this.f233839n;
        if (((java.util.HashMap) map).containsKey(c20989xcfc00935)) {
            return ((java.lang.Integer) ((java.util.HashMap) map).get(c20989xcfc00935)).intValue();
        }
        return 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f233835g.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    public int h(java.lang.String str) {
        java.util.Iterator it = this.f233835g.iterator();
        int i17 = -1;
        while (it.hasNext()) {
            i17++;
            if (((dn3.i) it.next()).f323540b.equals(str)) {
                break;
            }
        }
        return i17;
    }

    @Override // android.widget.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public dn3.i getItem(int i17) {
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f233835g;
            if (i17 < arrayList.size()) {
                return (dn3.i) arrayList.get(i17);
            }
        }
        return new dn3.i("", new r45.c64());
    }

    public void k(com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc00935, int i17, r45.cu5 cu5Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc009352;
        float f17 = c20989xcfc00935.f273942d;
        if (cu5Var != null) {
            int i18 = cu5Var.f453372d;
        }
        if (this.f233837i.contains(c20989xcfc00935) || ((c20989xcfc009352 = this.f233841p) != null && c20989xcfc009352.m77683xb2c87fbf(c20989xcfc00935))) {
            ((java.util.HashMap) this.f233839n).put(c20989xcfc00935, java.lang.Integer.valueOf(i17));
            ((java.util.HashMap) this.f233838m).put(c20989xcfc00935, cu5Var);
        }
    }
}
