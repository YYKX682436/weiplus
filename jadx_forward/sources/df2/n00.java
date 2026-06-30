package df2;

/* loaded from: classes3.dex */
public final class n00 extends if2.b implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f312359m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312360n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312359m = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if ((r4 != null && r4.X()) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.n00.Z6():void");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        Z6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorForegroundServiceController", "onAppBackground: " + str);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorForegroundServiceController", "unBindForegroundServiceIfNeed, isBindForegroundService:" + this.f312360n);
        if (this.f312360n) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.ServiceC10843xdb060879.class);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(intent);
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AnchorForegroundServiceController", e17, "unBind foreground service error: %s", e17.getMessage());
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorForegroundServiceController", "unBindForegroundServiceIfNeed res: " + z17);
            if (z17) {
                this.f312360n = false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorForegroundServiceController", "onAppForeground: " + str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.content.Context context = pluginLayout.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String name = activity != null ? activity.getClass().getName() : null;
        if (name == null) {
            name = "";
        }
        this.f312359m = name;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorForegroundServiceController", "bind actName: " + this.f312359m);
    }
}
