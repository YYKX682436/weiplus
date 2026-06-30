package jd0;

@j95.b
/* loaded from: classes8.dex */
public final class c extends i95.w implements kd0.e2 {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 wi(android.content.Context context, p012xc85e97e9.p093xedfae76a.y yVar, yz5.q callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee;
        boolean z17;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.feature.scanner.BoxWebViewPreloadManagerService$fetchBoxWebView$1
                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onDestroy */
                public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                    uy3.z.a(0L);
                }
            });
        }
        uy3.z zVar = uy3.z.f513535a;
        synchronized (uy3.z.f513537c) {
            c12962xa24d9bee = null;
            if (uy3.z.f513536b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee2 = uy3.z.f513536b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12962xa24d9bee2);
                if (!c12962xa24d9bee2.f292909y) {
                    com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee3 = uy3.z.f513536b;
                    uy3.z.f513536b = null;
                    c12962xa24d9bee = c12962xa24d9bee3;
                }
            }
        }
        if (c12962xa24d9bee == null) {
            c12962xa24d9bee = new com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee(context);
            z17 = false;
        } else {
            c12962xa24d9bee.i(context);
            z17 = true;
        }
        callback.mo147xb9724478(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z17));
        uy3.z.b(1, 1500L);
        return c12962xa24d9bee;
    }
}
