package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@db5.a(m123858x6ac9171 = 128)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC15086x1d5b7f69 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int keyCode = event.getKeyCode();
        if (keyCode != 24) {
            if (keyCode == 25 && event.getAction() == 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5549xe5c7d69b c5549xe5c7d69b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5549xe5c7d69b();
                c5549xe5c7d69b.f135872g.f89426a = 25;
                c5549xe5c7d69b.e();
            }
        } else if (event.getAction() == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5549xe5c7d69b c5549xe5c7d69b2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5549xe5c7d69b();
            c5549xe5c7d69b2.f135872g.f89426a = 24;
            c5549xe5c7d69b2.e();
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f210344m = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.mb.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.j6.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.jb.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.z6.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.g7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.e7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.i7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.b7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.i6.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.d7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.b9.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.w9.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.v5.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.fb.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.u5.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.w8.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.o7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.y6.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.g8.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.c7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.s5.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.j7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.f7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.t7.class)));
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(iz2.b.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.m9.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.l9.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.d9.class)));
        set.add(or2.f.class);
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.q7.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.f6.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.q5.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.f8.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.ua.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.pb.class)));
    }
}
