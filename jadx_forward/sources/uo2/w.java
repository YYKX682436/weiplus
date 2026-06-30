package uo2;

/* loaded from: classes2.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 f511178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f511179e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530, android.content.Context context) {
        this.f511178d = c14493xfdc11530;
        this.f511179e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = this.f511178d;
        com.p314xaae8f345.mm.ui.xj xjVar = new com.p314xaae8f345.mm.ui.xj(c14493xfdc11530);
        int f17 = i65.a.f(this.f511179e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        android.graphics.Rect rect = new android.graphics.Rect();
        c14493xfdc11530.getHitRect(rect);
        int i17 = -f17;
        rect.inset(i17, i17);
        xjVar.a(new com.p314xaae8f345.mm.ui.yj(rect, c14493xfdc11530));
    }
}
