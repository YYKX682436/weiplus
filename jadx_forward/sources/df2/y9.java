package df2;

/* loaded from: classes3.dex */
public final class y9 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313385m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313385m = "Finder.LifeCycleLogController";
    }

    @Override // if2.e
    public void T2(boolean z17, int i17) {
        V6(this.f313385m, "keyboardChange show:" + z17 + ", height:" + i17);
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        V6(this.f313385m, "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
    }

    @Override // if2.e
    /* renamed from: onBackPress */
    public boolean mo124227x4ceae47d() {
        V6(this.f313385m, "onBackPress");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onFloatMode */
    public void mo14866x804e7f00() {
        V6(this.f313385m, "onFloatMode");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        V6(this.f313385m, "onLiveActivate");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        V6(this.f313385m, "onLiveDeactivate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        V6(this.f313385m, "onLiveEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLivePause */
    public void mo14861x3972754b() {
        V6(this.f313385m, "onLivePause");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveResume */
    public void mo14862xf87d6378() {
        V6(this.f313385m, "onLiveResume");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        V6(this.f313385m, "onLiveStart");
    }

    @Override // if2.e
    /* renamed from: onNewIntent */
    public void mo57867xc944513d(android.content.Intent intent) {
        V6(this.f313385m, "onNewIntent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onNormalMode */
    public void mo14868x7c41fe69() {
        V6(this.f313385m, "onNormalMode");
    }

    @Override // if2.e
    /* renamed from: onSwipeBack */
    public boolean mo124289x59cfc822() {
        V6(this.f313385m, "onSwipeBack");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        V6(this.f313385m, "onViewMount pluginLayout:" + pluginLayout.hashCode());
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        V6(this.f313385m, "onViewUnmount pluginLayout:" + pluginLayout.hashCode());
    }

    @Override // if2.e
    /* renamed from: pause */
    public void mo124180x65825f6() {
        V6(this.f313385m, "pause");
    }

    @Override // if2.e
    /* renamed from: resume */
    public void mo57157xc84dc82d() {
        V6(this.f313385m, "resume");
    }
}
