package mq0;

@j95.b
/* loaded from: classes7.dex */
public final class v0 extends i95.w implements mq0.e0 {
    public void Ai(java.lang.String jsapiName, int i17, java.lang.String str, java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapiName, "jsapiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        if (((je3.i) i95.n0.c(je3.i.class)).Ii(0.001f)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6723x76ef38fb c6723x76ef38fb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6723x76ef38fb();
            mq0.u0[] u0VarArr = mq0.u0.f412155d;
            c6723x76ef38fb.f140608d = c6723x76ef38fb.b("bizType", "jsapiError", true);
            c6723x76ef38fb.f140609e = c6723x76ef38fb.b("type", jsapiName, true);
            c6723x76ef38fb.f140610f = c6723x76ef38fb.b("subType", java.lang.String.valueOf(i17), true);
            c6723x76ef38fb.f140615k = c6723x76ef38fb.b("extInfoStr1", str, true);
            c6723x76ef38fb.f140612h = c6723x76ef38fb.b("bizName", bizName, true);
            c6723x76ef38fb.k();
            c6723x76ef38fb.n();
        }
    }

    public void wi(java.lang.String type, java.lang.String subType, java.lang.String sessionId, java.lang.String bizName, java.lang.String frameSetRootPath, java.lang.String frameSetName, java.lang.String... extInfoStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetRootPath, "frameSetRootPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoStr, "extInfoStr");
        if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi(bizName)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6723x76ef38fb c6723x76ef38fb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6723x76ef38fb();
            mq0.u0[] u0VarArr = mq0.u0.f412155d;
            c6723x76ef38fb.f140608d = c6723x76ef38fb.b("bizType", "startupCover", true);
            c6723x76ef38fb.f140609e = c6723x76ef38fb.b("type", type, true);
            c6723x76ef38fb.f140610f = c6723x76ef38fb.b("subType", subType, true);
            c6723x76ef38fb.f140611g = c6723x76ef38fb.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, sessionId, true);
            c6723x76ef38fb.f140612h = c6723x76ef38fb.b("bizName", bizName, true);
            c6723x76ef38fb.f140613i = c6723x76ef38fb.b("frameSetRootPath", frameSetRootPath, true);
            c6723x76ef38fb.f140614j = c6723x76ef38fb.b("frameSetName", frameSetName, true);
            if (!(extInfoStr.length == 0)) {
                c6723x76ef38fb.f140615k = c6723x76ef38fb.b("extInfoStr1", extInfoStr[0], true);
            }
            if (extInfoStr.length > 1) {
                c6723x76ef38fb.f140616l = c6723x76ef38fb.b("extInfoStr2", extInfoStr[1], true);
            }
            if (extInfoStr.length > 2) {
                c6723x76ef38fb.f140617m = c6723x76ef38fb.b("extInfoStr3", extInfoStr[2], true);
            }
            c6723x76ef38fb.k();
            c6723x76ef38fb.n();
        }
    }
}
