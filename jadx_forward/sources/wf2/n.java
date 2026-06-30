package wf2;

/* loaded from: classes10.dex */
public final class n extends if2.b implements if2.e, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f527132m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 f527133n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f527134o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f527135p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        int size = micInfoData.f536056b.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotShareCardController", "#onMicInfoChanged size=" + size);
        this.f527134o = size > 1;
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar;
        a7();
        android.widget.RelativeLayout relativeLayout = this.f527132m;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (z17 && this.f527135p && (ubVar = this.f372632e) != null) {
            ubVar.mo57730x186ef1e2(false);
        }
    }

    public final void a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 abstractC14206xe2e594d5 = this.f527133n;
        if (abstractC14206xe2e594d5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.C14205xa8ca416b c14205xa8ca416b = abstractC14206xe2e594d5.f193151d;
            if (c14205xa8ca416b == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotView");
                throw null;
            }
            c14205xa8ca416b.a();
            android.view.ViewParent parent = abstractC14206xe2e594d5.getParent();
            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) parent).removeView(abstractC14206xe2e594d5);
            }
            this.f527133n = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(4:(1:(9:10|11|12|13|14|15|(1:17)(1:22)|(1:19)|20)(2:37|38))(4:39|40|41|42)|31|24|(2:26|27)(1:28))(9:60|61|62|63|64|65|66|67|(1:69)(1:70))|43|44|(1:46)(1:52)|47|(1:49)(6:50|14|15|(0)(0)|(0)|20)))|86|6|(0)(0)|43|44|(0)(0)|47|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6 A[Catch: all -> 0x003a, Exception -> 0x0101, TryCatch #8 {all -> 0x003a, blocks: (B:12:0x0034, B:15:0x00d2, B:17:0x00d6, B:22:0x00dc, B:24:0x011d), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc A[Catch: all -> 0x003a, Exception -> 0x0101, TRY_LEAVE, TryCatch #8 {all -> 0x003a, blocks: (B:12:0x0034, B:15:0x00d2, B:17:0x00d6, B:22:0x00dc, B:24:0x011d), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[Catch: all -> 0x0051, Exception -> 0x0103, TryCatch #1 {all -> 0x0051, blocks: (B:41:0x004c, B:44:0x00a4, B:46:0x00aa, B:47:0x00ae), top: B:40:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(android.graphics.Bitmap r18, android.graphics.Bitmap r19, android.graphics.Bitmap r20, r45.du1 r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.n.b7(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap, r45.du1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // if2.e
    /* renamed from: onBackPress */
    public boolean mo124227x4ceae47d() {
        android.widget.RelativeLayout relativeLayout = this.f527132m;
        if (!(relativeLayout != null && relativeLayout.getVisibility() == 0)) {
            return false;
        }
        Z6(true);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) T6(com.p314xaae8f345.mm.R.id.fkq, com.p314xaae8f345.mm.R.id.fkp);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            relativeLayout.setOnClickListener(new wf2.k(this));
        } else {
            relativeLayout = null;
        }
        this.f527132m = relativeLayout;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        Z6(false);
        this.f527132m = null;
    }
}
