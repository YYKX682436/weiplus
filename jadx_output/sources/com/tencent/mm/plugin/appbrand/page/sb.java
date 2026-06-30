package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class sb extends com.tencent.mm.plugin.appbrand.page.pb {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.page.qb f87090c = new com.tencent.mm.plugin.appbrand.page.qb(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f87091d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f87092e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f87093f;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.e7 f87094b;

    static {
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsruntime.u1.a();
        kotlin.jvm.internal.o.f(a17, "retrieve(...)");
        if (!r26.i0.n(a17, "/", false)) {
            a17 = a17.concat("/");
        }
        f87091d = a17;
        f87092e = new java.lang.String[]{"app-wxss.js", "page-frame.html", "common.app.js", "webview.app.js"};
        f87093f = new java.lang.String[]{"page-frame.js", "common.app.js", "webview.app.js"};
        java.util.LinkedList linkedList = com.tencent.mm.plugin.appbrand.utils.d3.f90406a;
        if (!android.text.TextUtils.isEmpty("//XWEB_SCRIPT:")) {
            java.util.LinkedList linkedList2 = com.tencent.mm.plugin.appbrand.utils.d3.f90406a;
            synchronized (linkedList2) {
                linkedList2.add("//XWEB_SCRIPT:");
            }
        }
        java.lang.String str = com.tencent.mm.plugin.appbrand.jsruntime.u1.a() + "/page";
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.g(str, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.tencent.mm.plugin.appbrand.page.e7 renderer) {
        super(renderer);
        kotlin.jvm.internal.o.g(renderer, "renderer");
        this.f87094b = renderer;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:(13:110|111|112|113|114|116|(1:118)(1:(1:134))|119|121|122|(1:130)(1:125)|126|(1:128)(4:129|75|(3:77|(1:(2:79|(2:82|83)(1:81))(2:86|87))|(1:85))|88))(1:34)|53)|46|47|48|49|50|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03b6, code lost:
    
        r22 = r22;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b7 A[Catch: IOException -> 0x03c3, TRY_LEAVE, TryCatch #5 {IOException -> 0x03c3, blocks: (B:41:0x028b, B:52:0x02ad, B:55:0x02b7), top: B:40:0x028b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e4 A[Catch: IOException -> 0x03b3, TryCatch #4 {IOException -> 0x03b3, blocks: (B:57:0x02dc, B:68:0x02e4, B:70:0x02ec, B:71:0x02f5, B:74:0x0305, B:89:0x0341), top: B:53:0x02b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x037a  */
    @Override // com.tencent.mm.plugin.appbrand.page.pb, com.tencent.mm.plugin.appbrand.page.hb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.sb.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    @Override // com.tencent.mm.plugin.appbrand.page.hb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.sb.b(java.lang.String):java.lang.String");
    }

    public void d(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
    }
}
