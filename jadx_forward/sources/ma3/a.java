package ma3;

/* loaded from: classes8.dex */
public final class a implements com.p314xaae8f345.p3210x3857dc.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma3.c f406743a;

    public a(ma3.c cVar) {
        this.f406743a = cVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "xfile on user cancel finish");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "gc_ViewEdgeChanged")) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "gc_onScaleEnd");
            return;
        }
        java.lang.Object obj = hashMap != null ? hashMap.get("gc_ViewIsLeftEdge") : null;
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.Object obj2 = hashMap != null ? hashMap.get("gc_ViewIsRightEdge") : null;
        java.lang.Boolean bool2 = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "ViewEdgeChanged isLeftEdge: " + booleanValue + ", isRightEdge: " + booleanValue2);
        java.lang.String str2 = (booleanValue && booleanValue2) ? com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18 : booleanValue2 ? "left" : booleanValue ? "right" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f406743a.f406745d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("disableSwipeGesture", kz5.c1.i(new jz5.l(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, str2)));
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void c() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnail, "thumbnail");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "xfile onThumbnailLoad " + i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "xfile onPageCountUpdate " + i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void f(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "xfile onViewStatusChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19 + " and scale " + f17 + " and transX " + i27 + " and " + i28);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void h(android.view.MotionEvent motionEvent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f406743a.f406745d;
        if (c28688xe8dbe4c2 != null) {
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("x", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX(0)) : 0);
            lVarArr[1] = new jz5.l("y", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getY(0)) : 0);
            c28688xe8dbe4c2.m138438xd8c5c779("onSingleTap", kz5.c1.i(lVarArr));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "xfile onSingleTap, %s", java.lang.String.valueOf(motionEvent));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void i() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    /* renamed from: onDoubleTap */
    public void mo56908xce1d2af3(android.view.MotionEvent motionEvent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f406743a.f406745d;
        if (c28688xe8dbe4c2 != null) {
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("x", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX(0)) : 0);
            lVarArr[1] = new jz5.l("y", motionEvent != null ? java.lang.Float.valueOf(motionEvent.getY(0)) : 0);
            c28688xe8dbe4c2.m138438xd8c5c779("onDoubleTap", kz5.c1.i(lVarArr));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "xfile onSingleTap, %s", java.lang.String.valueOf(motionEvent));
    }
}
