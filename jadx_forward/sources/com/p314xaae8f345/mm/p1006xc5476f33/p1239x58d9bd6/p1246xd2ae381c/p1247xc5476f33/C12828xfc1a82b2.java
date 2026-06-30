package com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1246xd2ae381c.p1247xc5476f33;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/audio/flutter/plugin/FlutterBizAudioPlugin;", "Lcom/tencent/pigeon/biz_audio/BizAudioApi;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.audio.flutter.plugin.FlutterBizAudioPlugin */
/* loaded from: classes11.dex */
public final class C12828xfc1a82b2 implements com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f174024d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477
    /* renamed from: addToPreload */
    public void mo53888x81a9936d(java.lang.String url, long j17, long j18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, str, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477
    /* renamed from: addToStar */
    public void mo53889x16d7b6e(byte[] listenItemData, boolean z17, com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.C23333x1a43509d c23333x1a43509d, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            bw5.v70 mo11468x92b714fd = new bw5.v70().mo11468x92b714fd(listenItemData);
            mx.e eVar = new mx.e(new mx.f(this.f174024d));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            eVar.d0(mo11468x92b714fd, z17, null, null, new vm1.y0(callback));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioPlugin", "addToStar Exception=" + e17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477
    /* renamed from: containsInStar */
    public void mo53890xd2657c16(java.util.List listenId, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listenId.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
            c16601x7ed0e40c.f66791xc8a07680 = str;
            c16601x7ed0e40c.f66793x2262335f = 24;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Ri(c16601x7ed0e40c)) {
                arrayList.add(str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioPlugin", "containsInStar check " + arrayList.size());
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList)));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioPlugin", "onAttachedToActivity");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        this.f174024d = mo137508x19263085;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo137508x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477.Companion.m86086x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f174024d;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioPlugin", sb6.toString());
        android.app.Activity activity2 = this.f174024d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity2 : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(this);
        }
        this.f174024d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f174024d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477.Companion.m86086x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f174024d = binding.mo137508x19263085();
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioPlugin", "onStateChanged() event = " + event);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477
    /* renamed from: openUrl */
    public void mo53891xb4b50ac5(com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.C23331x6698a821 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.z0(null), 3, null);
        yw.h1 h1Var = yw.h1.f547865a;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1 c23335x4dbe57d1 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1(info.m86122x74d37ac6(), info.m86130x75298e34(), info.m86126xb588631e(), info.m86127x2e2ce293(), info.m86125x5ae7d1ac(), info.m86129xff358fa2(), info.m86132xb5887639(), info.m86120x7235c680(), info.m86133x6bf53a6c(), info.m86124x80025a04(), info.m86131x7531c8a2(), info.m86118x66e287ae(), info.m86116xca0b430(), info.m86128x8eabbfcf(), info.m86123xcf411f1b(), info.m86117x6b6d78f4(), info.m86121x27681aaa(), info.m86119x6de99b06());
        android.content.Context context = this.f174024d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        h1Var.s(c23335x4dbe57d1, context);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2847x3af021aa.InterfaceC23323x7bb79477
    /* renamed from: removeStar */
    public void mo53892x417a90f6(byte[] listenItemData, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
            try {
                bw5.v70 mo11468x92b714fd = new bw5.v70().mo11468x92b714fd(listenItemData);
                mx.e eVar = new mx.e(new mx.f(this.f174024d));
                java.lang.String m13170xcc16feb8 = mo11468x92b714fd.m13170xcc16feb8();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13170xcc16feb8, "getListenId(...)");
                eVar.e0(m13170xcc16feb8, this.f174024d);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioPlugin", "removeStar Exception=" + e17);
            }
        }
    }
}
