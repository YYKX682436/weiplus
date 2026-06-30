package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/ecs/gift/ui/EcsGiftExclusiveSelectContactUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-gift_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI */
/* loaded from: classes9.dex */
public final class ActivityC10525x5dea5ff extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final /* synthetic */ int F = 0;
    public java.lang.String C = "";
    public java.util.List D = new java.util.ArrayList();
    public java.lang.String[] E;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        p00.a aVar = new p00.a();
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.D, ",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "listToString(...)");
        aVar.f431881b = c17;
        java.lang.String str = this.C;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar.f431882c = str;
        aVar.f431880a = true;
        return new p00.c(this, null, true, false, aVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.lang.String str = this.C;
        java.util.HashSet d17 = kz5.p1.d(c01.z1.r());
        ((qd0.y0) j1Var).getClass();
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.e5(this, str, 11, false, d17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        boolean z17;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftExclusiveSelectContactUI", "handle item click, position:" + i17 + ", offsetPosition:" + headerViewsCount);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftExclusiveSelectContactUI", "select item is empty, position:" + i17);
            return;
        }
        java.lang.String str = item.f288383s;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftExclusiveSelectContactUI", "select item contactUsername is empty, position:" + i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftExclusiveSelectContactUI", "select item user:" + str + ", select item viewType:" + item.f288365a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = this.C;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str, str2);
        java.util.Iterator it = this.D.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str)) {
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str4 = this.C;
                ((sg3.a) v0Var2).getClass();
                java.lang.String f18 = c01.a2.f(str3, str4);
                if (f18.equals(f17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftExclusiveSelectContactUI", "hasSameDisplayUserName, find same, itemUserName:" + str3 + ", itemDisplayName:" + f18 + ", selectUserName:" + str + ", selectedDisplayName:" + f17);
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            db5.e1.G(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.nef), "", false, new o00.a(this, str));
        } else {
            w7(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        java.lang.String[] strArr = this.E;
        if (strArr != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(strArr);
            if (!(strArr.length == 0)) {
                this.f287980e.m78861xe90b84f5(this.E);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.C = stringExtra;
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.C);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(L0, "getMemberListByChatroomName(...)");
        this.D = L0;
        L0.remove(c01.z1.r());
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void w7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsGiftExclusiveSelectContactUI", "");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", str);
        setResult(-1, intent);
        finish();
    }
}
