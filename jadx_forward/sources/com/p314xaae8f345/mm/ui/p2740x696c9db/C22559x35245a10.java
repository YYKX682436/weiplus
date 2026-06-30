package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.TestTimeForChatting */
/* loaded from: classes11.dex */
public class C22559x35245a10 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22601x66cbd65e {

    /* renamed from: d, reason: collision with root package name */
    public int f291794d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.od f291795e;

    /* renamed from: f, reason: collision with root package name */
    public int f291796f;

    /* renamed from: g, reason: collision with root package name */
    public int f291797g;

    public C22559x35245a10(android.content.Context context) {
        super(context);
        this.f291794d = 0;
        this.f291796f = 0;
        this.f291797g = 0;
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestTimeForChatting", "klem frameCount:%d", java.lang.Integer.valueOf(this.f291794d));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11198, java.lang.Integer.valueOf(this.f291794d));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22601x66cbd65e, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        this.f291794d++;
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TestTimeForChatting", th6, "dispatchDraw", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(9);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(25);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(24);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(20);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(18);
        if (this.f291795e != null) {
            post(new com.p314xaae8f345.mm.ui.p2740x696c9db.md(this));
        }
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestTimeForChatting", "start chatting response time: %dms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 0));
        this.f291794d = 0;
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        rect.toString();
        rect.bottom += this.f291796f;
        rect.right += this.f291797g;
        return super.fitSystemWindows(rect);
    }

    /* renamed from: setOndispatchDraw */
    public void m81107xd394853f(com.p314xaae8f345.mm.ui.p2740x696c9db.od odVar) {
        this.f291795e = odVar;
    }

    public C22559x35245a10(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291794d = 0;
        this.f291796f = 0;
        this.f291797g = 0;
    }
}
