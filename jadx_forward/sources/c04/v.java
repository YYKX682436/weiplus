package c04;

/* loaded from: classes13.dex */
public final class v implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119227a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a) {
        this.f119227a = c17324xa321818a;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bVar != null ? (java.lang.Boolean) bVar.a(0) : null;
        objArr[1] = bVar != null ? (java.lang.String) bVar.a(1) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanGoodsMaskView", "showCustomView onInterrupt result: %s, %s", objArr);
        if (bVar != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.a(0), java.lang.Boolean.FALSE) : false) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a.A1;
            this.f119227a.w();
        }
    }
}
