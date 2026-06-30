package d04;

/* loaded from: classes8.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f307095a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 f307096b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f307097c;

    /* renamed from: d, reason: collision with root package name */
    public int f307098d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f307099e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f307100f;

    public y2(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f307095a = context;
        this.f307097c = new java.util.ArrayList();
        this.f307098d = -1;
        d04.v2[] v2VarArr = new d04.v2[3];
        java.lang.String string = context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.i99 : com.p314xaae8f345.mm.R.C30867xcad56011.i9f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        v2VarArr[0] = new d04.v2(1, string);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        v2VarArr[1] = new d04.v2(12, string2);
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        v2VarArr[2] = new d04.v2(3, string3);
        this.f307099e = kz5.c0.d(v2VarArr);
        this.f307100f = new java.util.HashMap();
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanScrollTabController", "setAccessibilityAvailable :" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b0 = this.f307096b;
        if (c17336x6a4658b0 != null) {
            c17336x6a4658b0.m68759xfadac10f(z17 ? 0 : 4);
        }
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanScrollTabController", "setEnableSwitchTab enable: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b0 = this.f307096b;
        if (c17336x6a4658b0 != null) {
            c17336x6a4658b0.m68754xf911bcbc(z17);
        }
    }

    public final void c(int i17, int i18) {
        java.lang.Integer num = (java.lang.Integer) this.f307100f.get(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanScrollTabController", "setSelectedTab tabId: %d, index: %s, tabSelectedAction: %d", java.lang.Integer.valueOf(i17), num, java.lang.Integer.valueOf(i18));
        if (num != null) {
            this.f307098d = num.intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b0 = this.f307096b;
            if (c17336x6a4658b0 != null) {
                c17336x6a4658b0.h(num.intValue(), i18);
            }
        }
    }
}
