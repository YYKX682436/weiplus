package zc3;

/* loaded from: classes7.dex */
public final class l implements zc3.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552956a;

    /* renamed from: b, reason: collision with root package name */
    public iq0.c f552957b;

    public l(java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        this.f552956a = bizName;
    }

    @Override // zc3.c
    public void a() {
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        java.lang.String str = this.f552956a;
        jc3.s0 s0Var = jc3.s0.f380517d;
        int i17 = s26.a.f483901f;
        ((nq0.p) tVar).Vi(new iq0.i(str, s0Var, s26.c.e(3000, s26.d.f483904f), null, null, null, 0.0d, null, null, 504, null));
    }

    @Override // zc3.c
    public void b(zq0.a container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        if (this.f552957b == null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
            iq0.c de6 = gq0.t.de(tVar, new zc3.k(this, container), null, 2, null);
            gq0.t.bh(tVar, de6, null, 2, null);
            this.f552957b = de6;
        }
    }

    @Override // zc3.c
    /* renamed from: show */
    public void mo178669x35dafd() {
        iq0.c cVar = this.f552957b;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).bj(cVar, "var mainCount = 0;\nvar canvas = new mb.ScreenCanvas();\ncanvas.width = 1260;\ncanvas.height = 1503;\nvar ctx = canvas.getContext('2d');\nlet unit = 5;\nlet blockWidth = 200;\nlet blockHeight = 200;\nvar x = 0;\nvar y = 0;\nvar advanceX = unit;\nvar advanceY = unit;\nvar mainCount = 1;\nmb.JSBridge.on('log', (arg) => console.log(JSON.stringify(arg)));\nvar mainLoop = function() {\n    mainCount++;\n    ctx.fillStyle = 'red';\n    ctx.clearRect(0, 0, canvas.width, canvas.height);\n    ctx.fillRect(x, y, blockWidth, blockHeight);\n    x += advanceX;\n    y += advanceY;\n    if (x + blockWidth >= canvas.width) {\n      advanceX = -unit;\n    }\n    if (x <= 0) {\n      advanceX = unit;\n    }\n    if (y + blockHeight >= canvas.height) {\n      advanceY = -unit;\n    }\n    if (y <= 0) {\n      advanceY = unit;\n    }\n    requestAnimationFrame(mainLoop);\n};mainLoop()", zc3.h.f552951d);
        }
    }

    @Override // zc3.c
    /* renamed from: stop */
    public void mo178670x360802() {
        iq0.c cVar = this.f552957b;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
            this.f552957b = null;
        }
    }
}
